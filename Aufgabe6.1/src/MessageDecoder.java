public class MessageDecoder {


    private String[] message = {"0 0 1 0 0", "1 1 1 1 0", "1 0 1 1 0"};


    public MessageDecoder(final String[] message) { // methode bekommt zeile ubergabe
        this.message = message;

    }

    public int getXCoordinate() {
        String bits = new String();


        for (final String str : this.message) {
            int oneCounter = 0;
            int zeroCounter = 0;

            for (int j = 0; j < str.length(); ) {
                if (str.charAt(j) == 0) {
                    zeroCounter++;
                } else {
                    oneCounter++;

                }
                bits += oneCounter >= zeroCounter ? 1 : 0;


            }

        }
        Integer integer = null;
        return integer.parseInt(bits, 2);

    }
}
