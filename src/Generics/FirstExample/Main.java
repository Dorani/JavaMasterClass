package Generics.FirstExample;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer seif = new SoccerPlayer("Seif");

        // Team Object for Football players using generics:
        Team<FootballPlayer> jets = new Team<>("Rich Block USA");
        jets.addPlayer(joe);

        //Now this doesn't work anymore because the compiler is reading that pat and joe don't meet the criteria
        //jets.addPlayer(pat);
        //jets.addPlayer(seif);

        //Render object:
        System.out.println(jets.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Yankees");
        baseballTeam.addPlayer(pat);


        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(seif);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(jets, 3, 8);

        jets.matchResult(fremantle, 2, 1);
        jets.matchResult(hawthorn, 1, 1);


        System.out.println("Rankings");
        System.out.println(jets.getName() + ": " + jets.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());


        //Testing out comparisons:
        System.out.println(jets.compareTo(melbourne));
        System.out.println(jets.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(jets));
        System.out.println(melbourne.compareTo(fremantle));

        //Sort the list by using the static Sort method of the Collections class
//        ArrayList<Team> teams;
//        Collections.sort(teams);

    }
}
