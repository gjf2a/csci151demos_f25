package flashcards;

import java.util.ArrayList;

public class FlashCardModel {
    private ArrayList<String> clues = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();
    private int choice;

    public void save(String clue, String answer) {
        clues.add(clue);
        answers.add(answer);
    }

    public String quiz() {
        choice = (int)(clues.size() * Math.random());
        return clues.get(choice);
    }

    public String check() {
        return answers.get(choice);
    }
}
