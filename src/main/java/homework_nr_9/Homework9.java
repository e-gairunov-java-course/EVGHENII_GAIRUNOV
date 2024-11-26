package homework_nr_9;

import java.util.*;

public class Homework9 {
    private List<String> toDoList;
    private Map<String,String> dictionary;

    public Homework9() {
        toDoList = new ArrayList<String>();
        dictionary = new HashMap<String,String>();
        String[] eng = new String[]{"desk", "hedgehog", "twenty", "plane", "bag", "human", "door", "hello", "world", "word"};
        String[] rom = new String[]{"banca", "arici", "douazeci", "avion", "geanta", "om", "usa", "salut", "lumea", "cuvant"};
        for(int i = 0; i < eng.length; i++)dictionary.put(eng[i],rom[i]);
    }

    public void newWord(String engWord, String romWord){
        dictionary.put(engWord.toLowerCase(),romWord.toLowerCase());
    }

    public void addNewElement(String newElement){
        toDoList.add(newElement);
    }

    public ArrayList<String> showList(){
        return (ArrayList<String>) toDoList;
    }

    public HashSet<String> showSet(ArrayList<String> arrayList){
        return new HashSet<String>(arrayList);
    }

    public String translate(String word){
        return dictionary.getOrDefault(word, "Sorry, there isn't such word in the dictionary.");
    }

    public static void main(String[] args) {
        Homework9 hw9 = new Homework9();
        hw9.addNewElement("Task 1");
        hw9.addNewElement("Task 2");
        hw9.addNewElement("Task 5");
        hw9.addNewElement("Task 3");
        hw9.addNewElement("Task 4");
        hw9.addNewElement("Task 6");
        hw9.addNewElement("Task 1");
        System.out.println(hw9.showList());
        System.out.println(hw9.showSet(hw9.showList()));
        String word;
        Scanner cin = new Scanner(System.in);
        System.out.println("\n\nTranslator is on. To exit input \"--q\".");
        while(true){
           word = cin.nextLine().toLowerCase();
           if(Objects.equals(word, "--q")) break;
           System.out.println("Romanian word for \"" + word + "\" is: " + hw9.translate(word));
        }
    }
}
