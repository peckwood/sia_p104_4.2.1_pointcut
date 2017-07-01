package concert.parameterized_advice;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {

  private String title;
  private String artist;
  private List<String> tracks;

  public BlankDisc(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }

  public void playTrack(int trackIndex){
	  System.out.println("Playing " + title + " by " + artist);
	  System.out.println("playing track "+ tracks.get(trackIndex));
  }

@Override
public String toString() {
	return "BlankDisc [title=" + title + ", artist=" + artist + ", tracks=" + tracks + "]";
}

  
}