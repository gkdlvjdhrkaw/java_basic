package day20.collection.map.song;

public class Mo {

    String Singer;
    String Music;

    public Mo() {
    }

    public Mo(String singer, String music) {
        Singer = singer;
        Music = music;
    }

    @Override
    public String toString() {
        return "mo{" +
                "Singer='" + Singer + '\'' +
                ", Music='" + Music + '\'' +
                '}';
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getMusic() {
        return Music;
    }

    public void setMusic(String music) {
        Music = music;
    }
}
