package gui_demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DemoController {
    @FXML
    TextField text;

    @FXML
    Button button;

    @FXML
    public void initialize() {

    }

    @FXML
    public void pushButton() {
        text.setText(Utilities.reversed(text.getText()));
    }
}
