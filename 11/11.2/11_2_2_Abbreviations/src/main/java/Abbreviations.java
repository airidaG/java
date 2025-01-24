import java.util.HashMap;

public class Abbreviations {

    private String abbreviation;
    private String explanation;
    HashMap<String, String> abbreviations = new HashMap<>();

    public Abbreviations() {


    }

    public void addAbbreviation(String abbreviation, String explanation) {

        abbreviations.put(this.abbreviation = abbreviation, this.explanation = explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {

        if (abbreviations.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {

        if (hasAbbreviation(abbreviation)) {
            return abbreviations.get(abbreviation);

        } else {
            return null;
        }

    }
}
