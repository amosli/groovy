/**
 * Created by amosli on 14-9-14.
 */
class Song {

    def name;
    def artist;
    def genre

    String toString(){
        "${name}, ${artist}, ${genre}"
    }

    def getArtist(){
        artist?.toUpperCase();
    }

}
