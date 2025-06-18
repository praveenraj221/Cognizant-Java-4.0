package BuilderPatternExample;

public class BuilderMain {
    public static void main(String[] args) {
        // Build a basic computer
        Computer basicComputer = new Computer.Builder()
                .setCpu("Intel i3")
                .setRam("4GB")
                .setStorage("256GB SSD")
                .setOs("Windows 10")
                .build();

        System.out.println("Basic Computer Specs:");
        basicComputer.showSpecs();

        // Build a gaming computer
        Computer gamingComputer = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setOs("Windows 11 Pro")
                .build();

        System.out.println("Gaming Computer Specs:");
        gamingComputer.showSpecs();
    }
}