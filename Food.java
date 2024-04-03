import java.net.SocketTimeoutException;

public class Food {

    float amount = 50.0f;

    FoodType type;

        public Food(float amount, FoodType type){

            this.amount = amount;
            this.type = type;


        }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public FoodType getType() {
        return type;

        }




}
