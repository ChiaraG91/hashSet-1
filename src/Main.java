import java.util.HashSet;

public class Main {

    public static void main(String[] args){

        set1();
    }

    public static void set1(){
        HashSet<String> sport = new HashSet<String>();
        sport.add("Calcio");
        sport.add("Basket");
        sport.add("Tennis");
        sport.add("Football");
        sport.add("Baseball");

        System.out.println(sport.size());
        System.out.println(sport.toString());


    }


}
