package labreport3;

import java.util.Scanner;



public class LabReport3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1
//        Money a = new Money();
//        Money b = new Money(50000);
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//        b.addMoney(a);
//        System.out.println(b.getAmount());
//        int[]arr = {10512,12034,45934,53757,12309};
//        int[]arr2 = {40512,14034,45936,53722,12390};
//        Money c = new Money(arr);
//        Money d = new Money(arr2);
//        c.addMoney(d);
//        System.out.println(c.toString());
        
        //Q2
        String[] title = {"BBB", "DDD", "AAA", "EEE", "CCC"};
        String[] filename = {"BBB.mp3", "DDD.mp3", "AAA.mp3", "EEE.mp3", "CCC.mp3"};
        String[] singer = {"bbb", "ddd", "aaa", "aaa", "ccc"};
        double[]duration = {3.12,4.35,2.48,3.37,4.06};
        int[]year = {2002,2003,2008,2012,2021};
        Song song = new Song(title, filename, singer, duration, year);
               
//        song.playSong();    /// BBB
//        song.previousSong();    /// CCC
//        song.playSong();
//        song.previousSong();    /// EEE
//        song.playSong();
//        song.nextSong();    /// CCC
//        song.nextSong();    /// BBB
//        song.nextSong();    /// DDD
//        song.playSong();
        
//        song.sortTitle();
//        song.sortDuration();
        
        
        System.out.print("Enter a song title: ");
        String songTitle = sc.nextLine();
        song.searchTitle(songTitle);
        
        System.out.print("Enter a singer name: ");
        String singerName = sc.nextLine();
        song.searchSinger(singerName);
        
        
        
    }
    
}
