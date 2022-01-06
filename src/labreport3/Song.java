package labreport3;

public class Song {
    private String[]title;
    private String[]filename;
    private String[]singer;
    private int[]duration;
    private int[]year;
    private int currentSong = 0; 

    public Song(String[] title, String[] filename, String[] singer, int[] duration, int[] year) {
        if(title.length<20){
            this.title = title;
            this.filename = filename;
            this.singer = singer;
            this.duration = duration;
            this.year = year;
        } else
            System.out.println("Maximum 20 songs only can be stored.");      
    }
    
    public void sortTitle(){
        for(int pass=0; pass<title.length; pass++){
            for(int i=0; i<title.length-1; i++){
                if(title[i].compareTo(title[i+1]) > 0){
                    String hold = title[i];
                    title[i] = title[i+1];
                    title[i+1] = hold;
                    hold = filename[i];
                    filename[i] = filename[i+1];
                    filename[i+1] = hold;
                    hold = singer[i];
                    singer[i] = singer[i+1];
                    singer[i+1] = hold;
                    int temp = duration[i];
                    duration[i] = duration[i+1];
                    duration[i+1] = temp;
                    temp = year[i];
                    year[i] = year[i+1];
                    year[i+1] = temp;      
                }
            }
        }
    }
    
    public void sortDuration(){
        for(int pass=0; pass<title.length; pass++){
            for(int i=0; i<title.length-1; i++){
                if(duration[i]> duration[i+1]){
                    int temp = duration[i];
                    duration[i] = duration[i+1];
                    duration[i+1] = temp;  
                    String hold = title[i];
                    title[i] = title[i+1];
                    title[i+1] = hold;
                    hold = singer[i];
                    singer[i] = singer[i+1];
                    singer[i+1] = hold;
                    hold = filename[i];
                    filename[i] = filename[i+1];
                    filename[i+1] = hold;
                    hold = singer[i];
                    singer[i] = singer[i+1];
                    singer[i+1] = hold;
                    temp = year[i];
                    year[i] = year[i+1];
                    year[i+1] = temp;    
                }
            }
        }
    }
    
    public void searchTitle(String title){
        int songIndex=0;
        int count= 0;
        for(String songTitle : this.title){
            if(songTitle.equals(title)){
                System.out.println(toString(songIndex));
                count++;
            }
            songIndex++;
        }
        if(count==0)
            System.out.printf("No results found for \"%s\"\n",title);
    }
    
    public void searchSinger(String singer){
        int songIndex=0;
        int count= 0;
        for(String singerName : this.singer){
            if(singerName.equals(singer)){
                System.out.println(toString(songIndex));
                count++;
            }
            songIndex++;
        }
        if(count==0)
            System.out.printf("No results found for \"%s\"\n", singer);
    }

    
    public void playSong(){
        System.out.println(toString(currentSong));
    }
    
    public void nextSong(){
        currentSong++;
        if(currentSong>=title.length){
            currentSong -= title.length;
        }
    }
    
    public void previousSong(){
        currentSong--;
        if(currentSong<0){
            currentSong +=title.length;
        }
    }

    public String toString(int i) {
        String str = String.format("Song: %s\n", title[i]);
        str += String.format("File name: %s\n", filename[i]);
        str += String.format("Singer: %s\n", singer[i]);
        str += String.format("Duration: %d\n", duration[i]);
        str += String.format("Year: %d\n", year[i]);
        return str;
    }
//
//    public String[] getTitle() {
//        return title;
//    }
//
//    public String[] getSinger() {
//        return singer;
//    }
//
//    public String[] getFilename() {
//        return filename;
//    }
//
//    public int[] getDuration() {
//        return duration;
//    }
//
//    public int[] getYear() {
//        return year;
//    } 
    
    
    
}

    