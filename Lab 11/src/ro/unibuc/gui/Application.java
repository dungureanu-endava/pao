package ro.unibuc.gui;

import ro.unibuc.gui.frame.MainFrame;
import ro.unibuc.gui.service.SiteService;

public class Application {

    public static void main(String[] args) {
        // load();
        run();
        // clean();
    }

    public static void load() {
        System.out.println("Loading data");
        SiteService service = new SiteService();

        service.setup();
        service.loadData();
    }

    public static void run() {
        System.out.println("Running application");
        new MainFrame().setVisible(true);
    }

    public static void clean() {
        System.out.println("Cleaning data");
        SiteService service = new SiteService();

        service.clean();
    }
}
