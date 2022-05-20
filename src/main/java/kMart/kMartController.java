package kMart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class kMartController {
    @FXML
    private TextArea txtArea;

    @FXML
    private RadioButton txtMedium, txtSmall;




String food ="";
    public void btnreset() {
        txtArea.setText("");

    }



    public void btnAdd(){
        food = "";
        if (txtSmall.isSelected()){
            food += "10";
        }
        if(txtMedium.isSelected()){
            food += "20";
        }
    }

    public void btnkmart(ActionEvent event) throws IOException {
        Parent kMart = FXMLLoader.load(getClass().getResource("KMart-view.fxml"));
        Scene scene = new Scene(kMart);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("kMart");
        stage.setScene(scene);
        stage.show();
    }

    public void btnfoodlist(ActionEvent event) throws IOException {
        Parent kMart = FXMLLoader.load(getClass().getResource("FoodList-view.fxml"));
        Scene scene = new Scene(kMart);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Food List");
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public String toString() {
        return "kMartController{" + "txtArea=" + txtArea + ", txtMedium=" + txtMedium + ", txtSmall=" + txtSmall +
                ", food='" + food + '\'' + '}';
    }

}

