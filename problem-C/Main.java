import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name:  ");
        String name = s.nextLine();

        System.out.print("Age:  ");
        int age = s.nextInt();

        System.out.print("Hobby:  ");
        String hobby = s.next();

        System.out.print("Enter you favourite sport  ");
        String sport = s.next();



        SportAndHobbyImpl sportAndHobby = new SportAndHobbyImpl();
        sportAndHobby.setNaame(name);
        sportAndHobby.setAge(age);
        sportAndHobby.setMyHobby(hobby);
        sportAndHobby.setMyFavoriteSport(sport);
        int cost = sportAndHobby.howMuchItCostToPlayThisSport();
        System.out.println(sportAndHobby);





    }
}
