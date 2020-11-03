public class main {
    public static void main(String[] args) {
        int balanse = 777;
        int depositamount = 1300;
        int bonus = depositamount/100;
        if (depositamount > 1000){
            bonus = depositamount/100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
