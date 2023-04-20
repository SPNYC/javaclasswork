package class10.Homework;

public class D2Countries {
    public static void main(String[] args) {

        /*
        Create 2D array of countries: north america countries, south america countries, europe countries,
        asian countries, african countries.
        Then print all values from that array using 2 different loops and
        calculate how many total countries been stored.
         */
        String[][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Brazil","Chile","Peru"},
                {"Spain","Italy","France"},
                {"China", "Thailand", "Japan"},
                {"Egypt", "Tunisia", "South Africa"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        for (String[] country : countries) {
            for (String c : country) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            sum += countries[i].length;
        }
        System.out.println("Total numbers of countries: " + sum);
    }
}
