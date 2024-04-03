public class Sleigh {
    private Present[] presents = new Present[0];
    private int maximumSize;

    //Konstruktor
    public Sleigh (int maximumSize) {
        this.maximumSize = maximumSize;
    }

    public Present[] getPresents () {
        return presents;
    }

    public void putPresent(Present present) {
        if(present.getSize() > maximumSize) {
            System.out.println("Dieses Geschenk ist zu groß für den Schlitten.");
        } else {
            Present[] presents1 = new Present[presents.length + 1];
            for (int i = 0; i < presents.length; i++) {
                presents1[i] = presents[i];
            }
            presents1[presents1.length - 1] = present;
            presents = presents1;
        }
    }
    public void deliver() {
        System.out.println("Der Schlitten verlässt das Verteilzentrum des Weihnachtsmanns und wird nun " + presents.length + " Geschenke mit einer Maximalgröße von " + maximumSize + " an viele glückliche Kinder ausliefern.");
    }

    public int getSize() {
        return this.maximumSize;
    }
}