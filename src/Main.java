import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //HashMap Listelerini sözlük tarzı key-value yapılarında kullanabiliriz.
        HashMap<String,String> dictionary = new HashMap<String, String>();
        dictionary.put("cat","kedi");
        dictionary.put("dog","köpek");
        dictionary.put("man","adam");
        dictionary.put("human","insan");
        System.out.println(dictionary);
        System.out.println(dictionary.size());

        for(String item:dictionary.keySet()){
            System.out.println("Key: " + item + " Value: " + dictionary.get(item));
        }

        dictionary.remove("man");
        System.out.println(dictionary);
        System.out.println(dictionary.get(2));
        dictionary.clear();
        System.out.println(dictionary.get("human"));

        // farklı veri tipleriyle de kullanılabilir.
        HashMap<String,Integer> ages = new HashMap<String, Integer>();
        ages.put("Bilal", 32);
        ages.put("Said",35);
        ages.put("nusret",30);

        for (String item:ages.keySet()){
            System.out.println(item + " yaşı " + ages.get(item));
        }
    }
}