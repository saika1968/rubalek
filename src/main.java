public class Main {
    public static void main(String[] args) {
        int balanse = 777;
        int depositamount = 1300;
        int bonus = depositAmount/100;
        if (depositamount > 1000){
            bonus = depositAmount/100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
