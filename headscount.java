
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("rounds.csv"));
        StringBuilder sb = new StringBuilder();
        int c=0;
        int c1=0;
        ArrayList<ArrayList<String>> a = new ArrayList<>();
        Random r = new Random();
        for (int j = 0; j < 3; j++) {
            sb.append("\r\n");
            sb.append("player1");
            sb.append(",");
            sb.append("player2");
            sb.append("\r\n");
    
            ArrayList<String> t1 = new ArrayList<>();
            ArrayList<String> t2 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                int p = r.nextInt(2);
                if (p == 0) {
                    t1.add("heads");
                    t2.add("tails");
                } else {
                    t1.add("tails");
                    t2.add("heads");
                }
            }
            int k = t1.stream().filter(x -> x.equals("heads")).collect(Collectors.toList()).size();
            int l= t2.stream().filter(x -> x.equals("heads")).collect(Collectors.toList()).size();
            for (int i = 0; i <= 9; i++) {
                sb.append("Round " + (i + 1));
                sb.append(",");
                sb.append(t1.get(i));
                sb.append(",");
                sb.append(t2.get(i));
                sb.append("\r\n");

            }
            String winner="";
            if (k != l) {
                winner = (k > l) ? "player1" : "player2";
                sb.append(winner);
            } else {
                sb.append("draw");
            }
            if(winner.equals("Team1")){
                c++;
            }
            else{
                c1++;
            }
            
            a.add(t1);
            a.add(t2);
        }
        if(c>c1){
            pw.append("player1 is declared as winner");
        }
        else{
            pw.append("player 2 is declred as winner");
        }
        pw.write(sb.toString());
        pw.close();
    }
}
