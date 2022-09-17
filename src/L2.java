import java.util.*;

public class L2 {
    Map<String, String> m = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String s = "tinyurl.com/" + longUrl.hashCode();
        m.put(longUrl, s);
        m.put(s, longUrl);
        return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return m.get(hashCode());
    }

}
