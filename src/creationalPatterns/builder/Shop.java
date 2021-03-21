package creationalPatterns.builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder("Android", "Snapdragon 845")
                .addScreenSize("324567890")
                .addBattery(2000)
                .addCamera(4567)
                .build();
        System.out.println(phone);
    }
}
