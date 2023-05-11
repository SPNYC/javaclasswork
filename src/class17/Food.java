package class17;

public class Food {
    String name="Pasta";
    void printFood(){
        String name="Burger"; //Java always prefers local variables
        System.out.println(this.name);//this makes it executed
        System.out.println(name);
    }

    public static void main(String[] args) {
        Food food=new Food();
        food.printFood();
    }
}
