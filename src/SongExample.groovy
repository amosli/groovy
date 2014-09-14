import org.junit.Test

/**
 * Created by amosli on 14-9-14.
 */
class SongExample {
    static void main(args) {

        def song = new Song(name:"love",artist:"lady gaga",genre: "Pop")

        println song;
        def sng2 = new Song(name:"Kung Fu Fighting", genre:"Disco")

        def sng3 = new Song()
        sng3.name = "Funkytown"
        sng3.artist = "Lipps Inc."
        sng3.setGenre("Disco")

        assert sng3.getArtist() == "Lipps Inc."

        sng3.setGenre "Disco"
        println sng3.toString();

    }

    @Test
    public void test(){

        def sng2 = new Song(name:"Kung Fu Fighting", genre:"Disco")

        println sng2.getArtist();

    }

}
