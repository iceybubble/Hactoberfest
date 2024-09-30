import java.util.*;
class Player{

int no_of_players;
String name_of_captin;

void experience(int dy,int cy){
int ex=cy-dy;
System.out.println("Player experience is "+ex);
}
}
class cricket_player extends Player{
int team1;
int team2;
}
class football_player extends Player {
int team1;
int team2;
}
class hockey_player extends Player{
int team1;
int team2;
}

class Playermain{
public static void main(String[] args){

cricket_player c =new cricket_player();
Scanner sc=new Scanner(System.in);
int nc,dy,cy;
String namec;
System.out.println("Enter the no.of players in cricket team :");
c.no_of_players=sc.nextInt();
sc.nextLine();
System.out.println("Enter the name of captin :");
c.name_of_captin=sc.nextLine();
System.out.println("Enter the score of team1 :");
c.team1=sc.nextInt();
System.out.println("Enter the score of team2 :");
c.team2=sc.nextInt();

football_player f=new football_player();
int nf,dyf,cyf;
String namef;
System.out.println("Enter the no.of players in football team :");
f.no_of_players=sc.nextInt();
sc.nextLine();
System.out.println("Enter the name of captin :");
f.name_of_captin=sc.nextLine();
System.out.println("Enter the score of team1 :");
f.team1=sc.nextInt();
System.out.println("Enter the score of team2 :");
f.team2=sc.nextInt();

hockey_player h=new hockey_player();

int nh,dyh,cyh;
String nameh;
System.out.println("Enter the no.of players in hockey team :");
h.no_of_players=sc.nextInt();
sc.nextLine();
System.out.println("Enter the name of captin :");
h.name_of_captin=sc.nextLine();
System.out.println("Enter the score of team1 :");
h.team1=sc.nextInt();
System.out.println("Enter the score of team2 :");
h.team2=sc.nextInt();
}
}
