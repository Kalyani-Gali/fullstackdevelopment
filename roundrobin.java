import java.util.*;
public class roundrobin{
    public static void main(String[]args)
    {
       List<String>teams=new ArrayList<>();
       teams.add("Team 1");
       teams.add("Team 2");
       teams.add("Team 3");
       teams.add("Team 4");
       teams.add("Team 5");
       Collections.shuffle(teams);
       List<String>MorningTeams=teams.subList(0,2);
       List<String>EveningTeams=teams.subList(2,5);
       System.out.println("Morning Session Matches:");
       for(int i=0;i<MorningTeams.size();i++)
       {
        System.out.println(MorningTeams.get(i)+"vs"+MorningTeams.get((i+1)%MorningTeams.size()));
       }
       System.out.println("Evening Session Matches:");
       for(int i=0;i<EveningTeams.size();i++)
       {
        System.out.println(EveningTeams.get(i)+"vs"+EveningTeams.get((i+1)%EveningTeams.size()));
       }


       
    }
}