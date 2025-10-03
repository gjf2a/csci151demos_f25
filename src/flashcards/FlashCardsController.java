package flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class FlashCardsController {
    private FlashCardModel model;

    @FXML
    TextArea clue;

    @FXML
    TextArea answer;

    @FXML
    public void initialize() {
        model = new FlashCardModel();
    }

    @FXML
    public void save() {
        model.save(clue.getText(), answer.getText());
        clue.setText("");
        answer.setText("");
    }

    @FXML
    public void quiz() {
        clue.setText(model.quiz());
        answer.setText("");
    }

    public void check() {
        answer.setText(model.check());
    }
}
