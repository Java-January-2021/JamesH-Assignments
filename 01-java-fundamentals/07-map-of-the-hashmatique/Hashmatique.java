import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Check it", "Bow chicka wow wow!");
        trackList.put("Bro Bro", "Yo yo my bro bro!");
        trackList.put("one too", "many hit singles I write, but im not yet known. I rappin' on the code no microphone!");
        trackList.put("Ninja style", "I type the keys like a shadow in the dark.");
        System.out.println(trackList.get("Check it"));
        for (String key : trackList.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
    }
}
