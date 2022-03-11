package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Date;

/**
 * @Avtor Evgeniy Karavaev
 *
 * Evgeniy_900@mail.ru
 */

public class Controller extends Main{
    @FXML
    private Label numberResult;

    @FXML
    private TextField txtNumber;

    @FXML
    private Label onMessage;

    @FXML
    private ProgressBar onPb;

    @FXML
    private Label dateNow;

    private Date now;







    @FXML
    private void plButtonClick() {
        try {
            int i;
            i = Integer.parseInt(numberResult.getText());
            if (i < 60) {
                numberResult.setText(String.valueOf(Integer.parseInt(numberResult.getText()) + 1));
            } else {
                onMessage.setText("Дальнейшее увеличение числа невозможно!");
            }
        }catch (NumberFormatException e){
            onMessage.setText("Для увеличения введите число!");
        }
    }

    @FXML
    private void mnButtonClick(){
        try {
            int i;
            i = Integer.parseInt(numberResult.getText());
            if (i > 30) {
                numberResult.setText(String.valueOf(Integer.parseInt(numberResult.getText()) - 1));
            }else{
                onMessage.setText("Дальнейшее уменьшение числа невозможно!");
            }
        }catch (NumberFormatException e){
            onMessage.setText("Для уменьшения введите число!");
        }
    }

    @FXML
    private void onButtonClick() {
        try {
            int i;
            String tn = txtNumber.getText();
            i = Integer.parseInt(tn);
            if(i >= 40 && i <= 50) {
                numberResult.setText(tn);
                onMessage.setText("Теперь число можно уменьшить и увеличить!");
            }else{
                onMessage.setText("Введено число меньше 40 или больше 50, попробуйте еще!");
            }
        } catch (NumberFormatException e) {
            onMessage.setText("Вы не ввели число или неверный формат данных!");
        }
        now = new Date();
        dateNow.setText(String.valueOf(now));
    }
}
