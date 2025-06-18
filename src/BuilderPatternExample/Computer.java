package BuilderPatternExample;

public class Computer {
    // Required and optional parts
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String os;

    // Private constructor: only Builder can create it
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.os = builder.os;
    }

    // Print configuration
    public void showSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + os);
        System.out.println("-----");
    }

    // Static Nested Builder Class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String os;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        // Final build method
        public Computer build() {
            return new Computer(this);
        }
    }
}