import java.util.ArrayList;
import java.util.List;

class TipCalc{
    private List<String> names = new ArrayList<>();

    public void addName(String name){
        names.add(name);
    }
    public static Integer getTipPercentage(List<String> names){
        if (names.size()==0)
        {
            return 0;
        }

        else if (names.size() <=5)
        {
            return 10;
        }
        else
        {
            return 20;
        }

    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public List<String> addPerson(List<String> names, String name){
        List<String> newNames = new ArrayList<>(names);
        newNames.add(name);
        return newNames;

    }

    public static void main(String[] args) {
        TipCalc tipCalc = new TipCalc();
        tipCalc.addName("Alice");
        tipCalc.addName("Bob");
        tipCalc.addName("Charlie");
        tipCalc.addName("Charlie");
        tipCalc.addName("Charlie");
        System.out.println("Names: " + tipCalc.getNames());
        System.out.println("Tip Percentage: " + TipCalc.getTipPercentage(tipCalc.getNames()));
        System.out.println(tipCalc.addPerson(tipCalc.getNames(), "David")); 
    }

}

