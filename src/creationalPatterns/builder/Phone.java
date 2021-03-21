package creationalPatterns.builder;

public class Phone {
    private String os;
    private String processor;
    private String screenSize;
    private int battery;
    private int camera;

    private Phone(PhoneBuilder builder) {
        this.os = builder.os;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.battery = builder.battery;
        this.camera = builder.camera;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", camera=" + camera +
                '}';
    }

    public static class PhoneBuilder {
        private String os;
        private String processor;
        private String screenSize;
        private int battery;
        private int camera;

        public PhoneBuilder(String os, String processor) {
            this.os = os;
            this.processor = processor;

        }

        public PhoneBuilder addOs(String os) {
            this.os = os;
            return this;
        }

        public PhoneBuilder addProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public PhoneBuilder addScreenSize(String screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public PhoneBuilder addBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public PhoneBuilder addCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}