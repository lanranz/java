import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PersonalRecommender {

   private Map<String, LinkedList<String>> likes = new HashMap<>();

    public void addLikes(String name, LinkedList<String> project) {
        likes.put(name, project);
    }

    public boolean likesBoth(String name, String project1, String project2) {
        List<String> list = likes.get(name);
        if (list == null) {
            throw new UnknownPersonException();
        }
        return list.contains(project1) && list.contains(project2);
    }
}
