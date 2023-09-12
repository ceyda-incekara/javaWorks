import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fixture {
    List<String> teamList = new LinkedList<>();

    public void ligFixturePrint(){
        if (teamList.size() % 2 == 1){
            teamList.add("Bay");
        }
        if (!teamList.isEmpty()){
            System.out.println("TAKIMLAR\n");
            for (String sayi : teamList){
                System.out.println("-" + sayi);
            }
        }else {
            System.out.println("Kayıtlı takım bulunmamaktadır.");
        }
        System.out.println();
        round();
    }

    public void round(){
        List<String> teamListWeek = new LinkedList<>();
        int rount = 2 * (teamList.size() - 1);

        List<String> teamListBacup = new LinkedList<>(teamList);
        int value = (teamList.size() / 2);

        for (int i = 1; i < (rount / 2) + 1; i++){
            for (int k = 0; k <= value + 2; k += 2) {
                teamListWeek.add(teamListBacup.get(k) + " " + teamListBacup.get(k + 1));
            }
            teamListBacup.add(1, teamListBacup.get(value));
            teamListBacup.add(value, teamListBacup.get(teamListBacup.size() - 1));
            teamListBacup.remove(teamListBacup.size() - 1);
            teamListBacup.remove(teamListBacup.size() - 2);
        }
        for (int i = rount / 2 + 2; i <= rount + 1; i++) {
            for (int k = 0; k <= value + 2; k += 2) {
                teamListWeek.add(teamListBacup.get(k + 1) + " " + teamListBacup.get(k));
            }
            teamListBacup.add(1, teamListBacup.get(value));
            teamListBacup.add(value, teamListBacup.get(teamListBacup.size() - 1));
            teamListBacup.remove(teamListBacup.size() - 1);
            teamListBacup.remove(teamListBacup.size() - 2);
        }

        int count = 0;
        int num;
        for (int i = 1; i <= rount; i++) {

            System.out.println("-----------------------------------\nRound " + i);

            List<String> bacup = new LinkedList<>();

            for (int n = count; n < count + value; n++) {
                bacup.add(teamListWeek.get(n));
            }
            for (int m = 0; m < value; m++) {
                num = new Random().nextInt(bacup.size());
                System.out.println(bacup.get(num));
                bacup.remove(num);
            }
            count += value;
        }
    }
}
