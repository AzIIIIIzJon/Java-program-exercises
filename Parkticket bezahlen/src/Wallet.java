public class Wallet {

    int[] coinValues = {200, 100, 50, 20, 10};


    int [] availableCoins = new int[5];

    int [] Ticket = new int[5];

    public Wallet( int [] availableCoins  ) {
        this.availableCoins = availableCoins;
    }

    public int[] getTicket() {
        return Ticket;
    }

    public int[] getAvailableCoins() {
        return availableCoins;
    }


    int[] payTicket(Ticket t) {

        int []  Ticket = new int[5];


        int[] payCoins = new int[5];

        int CoinsHave;
        for (int i = 0; i < availableCoins.length; i++) {
            CoinsHave += coinValues[i] * availableCoins[i];
        }



        if (CoinsHave >= t.getPrice()){
         while(){
             Ticket [i] +=  availableCoins[i] - Ticket[i] ;

        }


        return payCoins;
    }


}
