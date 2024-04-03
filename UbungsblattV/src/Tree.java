public class Tree {

    public  int height;
    public  int levels = 3;


    public  Tree(int height){
        this.height = height;



    }
    public  Tree(int height, int levels){
        this.height = height;
        this.levels = levels;


    }

    public int getHeight() {
        return height;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public  String  createTree(){
         height = 5;
        for (int i = 0; i < height; i++) {
            //Leerzeichen ausgeben
            for (int j = 0; j <  height - i - 1;  j++){
                System.out.print(" ");
            }
            // Sterne ausgeben
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Zeilenumbruch
        }

        return createTree();
    }



}
