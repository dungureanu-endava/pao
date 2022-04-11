package ro.unibuc.practice.lab08.repair;

public class Main {

    public static void main(String[] args) {
        Rig customerRig = DataBuilder.buildRig();

        RepairService service = new RepairService(DataBuilder.buildSpareParts());
        Rig updatedRig = service.repair(customerRig);

        // TODO: Display new rig structure
    }

}
