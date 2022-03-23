package tcsIrc;
import java.util.*;
/*
 1
ABC
srk
1.6
2
bcd
salman
2.3
3
xyz
amir
9.6
4
pqr
srk
67.8
srk
 */
public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Song[] song = new Song[4];
		for(int i=0;i<song.length;i++) {
			int songId = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String artist = sc.nextLine();
			double duration = sc.nextDouble();
			sc.nextLine();
			song[i] = new Song(songId,title,artist,duration);
		}
		String target = sc.nextLine();
		double totalDur = findSongDurationForArtist(song, target);
		if(totalDur>0) {
			System.out.printf("%.2f\n",totalDur);
		}else {
			System.out.println("There are no songs with given artist");
		}
		Song[] res = getSongInAscendingOrder(song,target);
		if(res!=null) {
			for(int i=0;i<res.length;i++) {
				System.out.println("Song Id : "+ res[i].getSongId() + "  Song title : " + res[i].getTitle());
			}
		}else {
			System.out.println("There are no songs with given artist");
		}
	}

	public static double findSongDurationForArtist(Song[] song,String a) {
		double sum = 0;
		for(int i=0;i<song.length;i++) {
			if(song[i].getArtist().equalsIgnoreCase(a)) {
				double duration = song[i].getDuration();
				sum += duration;
			}
		
		}
	 return sum;
	}
	public static Song[] getSongInAscendingOrder(Song[] song , String a) {
		int count=0;
		for(int i=0;i<song.length;i++) {
			if(song[i].getArtist().equalsIgnoreCase(a)) {
				count++;
			}
		}
		Song[] obj = new Song[count];
		int j=0;
		for(int i=0;i<song.length;i++) {
			if(song[i].getArtist().equalsIgnoreCase(a)) {
				obj[j++] = song[i];
			}
		}
		if(obj.length >0 ) {
			Song temp;
			for(int i=0;i<obj.length;i++) {
				for(int k=i+1;k<obj.length;k++) {
					if(obj[i].getDuration()>obj[k].getDuration()) {
					temp = obj[i];
					obj[i] = obj[k];
					obj[k] = temp;
					}
				}
			}
		}else {
			return null;
		}
		return obj;
	}
}
