import java.util.Random;

public class ChristmasSleighOrganisor {

    public static Present grabNextPresent() {
        Random randomSize = new Random();
        int size = randomSize.nextInt(1, 11);

        return new Present(size);
    }

    public static void main(String[] args) {

        Sleigh sleighSmall = new Sleigh(3);
        Sleigh sleighMedium = new Sleigh(6);
        Sleigh sleighLarge = new Sleigh(10);

        for(int i = 0; i < 100; i++) {
            Present geschenk = grabNextPresent();
            if(geschenk.getSize() <= sleighSmall.getSize()) {
                sleighSmall.putPresent(geschenk);
            } else if(geschenk.getSize() <= sleighMedium.getSize()) {
                sleighMedium.putPresent(geschenk);
            } else if(geschenk.getSize() <= sleighLarge.getSize()) {
                sleighLarge.putPresent(geschenk);
            }
        }

        sleighSmall.deliver();
        sleighMedium.deliver();
        sleighLarge.deliver();
    }
}