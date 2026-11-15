// LIST :
//        list is a data structure that lets you store ordered collections by keeping insertion order and allows duplicate values to be held

// what does it do?
//                  - stores items in a sequence
//                  - lets you access by index
//                  - supports duplicates when order matters

//------------------------------------------------------------------------------------------------------------------------

// SET : 
//       collection of unique values. Duplicates are ignored

// what does it do?
//                  - enforces uniqueness
//                  - does not guarantee insertion order
//                  - useful for achievements, tags and already-unlocked items

// order : 
//          - HASHSET
//                - no guaranteed order

//          - LINKEDHASHSET
//                - keeps insertion order

//          - TREESET
//                - sorted order

//------------------------------------------------------------------------------------------------------------------------1

// MAP : 
//       stores key-value pairs. You look up a value by its key

// what does it do?
//                  - provides fast lookup by key
//                  - models one-to-one relationships
//                  - returns null when a key is missing

//------------------------------------------------------------------------------------------------------------------------1

// CHOOSING THE RIGHT COLLECTION : 

//      LIST 
//           - do i need order?
//           - ordered group, duplicates allowed

//      SET 
//           - do i need uniqueness?

//      MAP 
//           - do i need key-based lookup?


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class AB_collections {
    public static void main(String[] args) {


        // 1. maintain my watchlist
        List<String> watchlist = new ArrayList<String>();
            watchlist.add("Breaking Bad");
            watchlist.add("Better Call Saul");
            watchlist.add("Narcos");
            watchlist.add("Breaking Bad"); // enables maintaining duplicates


            String recentlyWatched = watchlist.get(0);
            System.out.println(recentlyWatched);
            watchlist.remove("Narcos");

            System.out.println(watchlist);


        // 2. maintain our game achievements (we can unlock an achievement in a game multiple times but that achievement must only be shown once in our achievement section)
        Set<String> achievementStore = new LinkedHashSet<>();
        achievementStore.add("Defeated Ender Dragon");
        achievementStore.add("Defeated Wither");
        achievementStore.add("Crafted a Diamond Sword");
        achievementStore.add("Defeated Ender Dragon");

        System.out.println(achievementStore);


        // 3. profile page
        Map<String, String> profilePreferences = new HashMap<>();
        profilePreferences.put("Hitesh", "Anime");
        profilePreferences.put("Anirudh", "Comedy");

        System.out.println(profilePreferences.get("Anirudh"));
        System.out.println(profilePreferences);
    }
}
