package handsOn7;
import java.util.*;

public class MyClass {
	 public static void main(String[] args) {
		
		 	Scanner sc = new Scanner(System.in); 
			Player[] player = new Player[4];
			 for(int i=0;i<player.length;i++) {
				 int playerId = sc.nextInt();
				 sc.nextLine();
				 String playerName = sc.nextLine();
				 int iccRank = sc.nextInt();
				 int noOfMatchesPlayed = sc.nextInt();
				 int totalRunsScored = sc.nextInt();
				 player[i] = new Player(playerId,playerName,iccRank,noOfMatchesPlayed,totalRunsScored);
			 }
			 int target = sc.nextInt();
			 sc.close();
			
		//code to call required method
		double[] avgScores = findAverageScoreOfPlayers(player,target);
	
		//code to calculate Grade and display the results
			if(avgScores.length>0) {
				 for(int i=0;i<avgScores.length;i++) {
						double avgScore = avgScores[i];
						if(avgScore>=80) {
							System.out.println("Grade A Player");
						}else if(avgScore>50 || avgScore<=79) {
							System.out.println("Grade B Player");
						}else {
							System.out.println("Grade C Player");
						}
					}
			}
	}
	 public static double[] findAverageScoreOfPlayers(Player[] player,int target)
	 {
		 int count=0;
		 for(int i=0;i<player.length;i++) {
			 if(player[i].getNoOfMatchesPlayes()>target) {
				 count++;
			 }
		 }
		 double[] avgScore = new double[count];
		 int j=0;
		 for(int i=0;i<player.length;i++) {
			 if(player[i].getNoOfMatchesPlayes()>target) {
				int totalMatches = player[i].getNoOfMatchesPlayes();
				int totalScore = player[i].getTotalRunsScored();
				double temp = totalScore/totalMatches;
				avgScore[j++] = temp;
			 }
		 }
		 return avgScore;
	 }
}

class Player{
	int playerId;
	String playerName;
	int iccRank;
	int noOfMatchesPlayes;
	int totalRunsScored;
	
	public Player(int pId, String pName, int pRank, int pM, int pRun) {
		this.playerId = pId;
		this.playerName = pName;
		this.iccRank = pRank;
		this.noOfMatchesPlayes = pM;
		this.totalRunsScored = pRun;
	}

	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getIccRank() {
		return iccRank;
	}
	public void setIccRank(int iccRank) {
		this.iccRank = iccRank;
	}
	public int getNoOfMatchesPlayes() {
		return noOfMatchesPlayes;
	}
	public void setNoOfMatchesPlayes(int noOfMatchesPlayes) {
		this.noOfMatchesPlayes = noOfMatchesPlayes;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
}

/*
 
 Create a Class Player with below attributes:

playerId - int
playerName - String
iccRank - int
noOfMatchesPlayed - int
totalRunsScored - int

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - findAverageScoreOfPlayers in Solution class.

This method will take an int parameter named target along with the other parameter as array of

Player objects. 
The method will calculate the average runrate of the player based on totalRunsScored and

noOfMatchesPlayed and return the same in a double array where the noOfMatchesPlayed attribute

is greater than or equal to the int parameter target passed.

This method should be called from the main method and display the Grade of the players.

If the averageRunRate is greater than or equal to 80 then it should print "Grade A Player". If

the averageRunRate is between 50 to 79 then it should print "Grade B Player", else it should

print "Grade C Player" .

Before calling this method(findAverageScoreOfPlayers) in the main method, use Scanner object to

read values for four Player objects referring the attributes in the above sequence. 
then, read the value for noOfMatchesPlayed parameter. 
Next call the method findAverageScoreOfPlayers, write the logic to display the Grade(in the main method) and display the result. 

Consider below sample input and output:

Input:
100
Sachin
1
102
13000
101
Shewag
2
110
10000
102
Dhoni
3
80
7500
104
Kholi
4
70
7000
100

Output:
Grade A Player
Grade A Player
*/