package class10.Homework;

public class D2GrocceryList {
    public static void main(String[] args) {
        /*
        Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
         */
        String[][] groceryList = {
                {"Potatoes", "Garlic", "Onion"},
                {"Grapes","Banana","Apples"},
                {"Milk","Sour cream","Yogurt"},
                {"Cookies","Pie","Cake"}
        };
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] list : groceryList) {
            for (String string : list) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}
