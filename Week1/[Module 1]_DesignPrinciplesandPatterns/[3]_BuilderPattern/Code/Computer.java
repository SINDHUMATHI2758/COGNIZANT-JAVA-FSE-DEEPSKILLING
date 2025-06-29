public class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String graphicsCard;
    private final String operatingSystem;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    public String toString() {
        return "CPU: " + CPU + "\nRAM: " + RAM + "\nStorage: " + storage +
                "\nGraphics Card: " + graphicsCard + "\nOS: " + operatingSystem;
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;
        private final String storage;
        private final String graphicsCard;
        private final String operatingSystem;

        public Builder(String CPU, String RAM, String storage, String graphicsCard, String operatingSystem) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
            this.graphicsCard = graphicsCard;
            this.operatingSystem = operatingSystem;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
