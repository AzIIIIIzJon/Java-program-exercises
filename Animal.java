public class  Animal {
    AnimalType type;
    String name;
    float size;

    public Animal(AnimalType type, String name, float size) {

        this.name = name;
        this.size = size;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public AnimalType getType() {
        return type;
    }



    public void eat (Food food) {
        if (getType() == AnimalType.LION && food.type != FoodType.MEAT  ) {
            System.out.println("" +
            );

        }


    }

}