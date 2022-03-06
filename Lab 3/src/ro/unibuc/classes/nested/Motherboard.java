package ro.unibuc.classes.nested;

public class Motherboard {

    private String motherboardType;

    public Motherboard(String motherboardType) {
        this.motherboardType = motherboardType;
    }

    private String getMotherboardType() {
        return this.motherboardType;
    }

    class RandomAccessMemory {

        private Integer allocatedMemory;

        public void setAllocatedMemory(Integer memory) {
            if (memory > getMaxCapacity()) {
                throw new RuntimeException("Maximum memory capacity exited!");
            }

            allocatedMemory = memory;
        }

        public Integer getAllocatedMemory() {
            return allocatedMemory;
        }

        private Integer getMaxCapacity() {
            switch (Motherboard.this.getMotherboardType()) {
                case "AMD":
                    return 4096;
                case "Intel":
                    return 2048;
                default:
                    return 1024;
            }
        }

    }

}

class TestMotherboard {

    public static void main(String[] args) {
        Motherboard amdMotherboard = new Motherboard("AMD");
        Motherboard.RandomAccessMemory ram = amdMotherboard.new RandomAccessMemory();
        ram.setAllocatedMemory(8192);
    }

}
