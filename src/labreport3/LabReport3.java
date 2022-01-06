package labreport3;

import java.util.Scanner;

public class LabReport3 {
    
    public static void main(String[] args) {
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
        int[]duration = {202,215,183,197,266};
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
        
        song.sortTitle();
        song.sortDuration();
        
        song.searchTitle("CCC");
//        song.searchSinger("ggg");
        
        
        
    }
    
}
