import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AnimationController {
    @FXML
    Label arrayLabel1;
    @FXML
    Label arrayLabel2;
    @FXML
    Label arrayLabel3;
    @FXML
    Label arrayLabel4;
    @FXML
    Label arrayLabel5;
    @FXML
    Label arrayLabel6;
    @FXML
    Label arrayLabel7;
    @FXML
    Label arrayLabel8;
    @FXML
    Label arrayLabel9;
    @FXML
    Label arrayLabel10;
    @FXML
    Label arrow0;
    @FXML
    Label arrow1;
    @FXML
    Label arrow2;
    @FXML
    Label arrow3;
    @FXML
    Label arrow4;
    @FXML
    Label arrow5;
    @FXML
    Label arrow6;
    @FXML
    Label arrow7;
    @FXML
    Label arrow8;
    @FXML
    TextField valueTextField;
    @FXML
    TextField indexTextfield;
    @FXML
    Button insertButton;
    @FXML
    Button deleteButton;


    public void insert(ActionEvent actionEvent) {
        if (Integer.parseInt(indexTextfield.getText())>=AnimationArrayList.getUsers().size()){
            AnimationArrayList.getUsers().add(Integer.parseInt(valueTextField.getText()));
        }

        if (Integer.parseInt(indexTextfield.getText())<AnimationArrayList.getUsers().size()){
            AnimationArrayList.getUsers().set(Integer.parseInt(indexTextfield.getText()),Integer.parseInt(valueTextField.getText()));
        }


        if (AnimationArrayList.getUsers().size()<1)
            arrayLabel1.setText("");
        else
        arrayLabel1.setText(AnimationArrayList.getUsers().get(0).toString());
        if (AnimationArrayList.getUsers().size()<2)
            arrayLabel2.setText("");
        else
        arrayLabel2.setText(AnimationArrayList.getUsers().get(1).toString());
        if (AnimationArrayList.getUsers().size()<3)
            arrayLabel3.setText("");
        else
            arrayLabel3.setText(AnimationArrayList.getUsers().get(2).toString());

        if (AnimationArrayList.getUsers().size()<4)
            arrayLabel4.setText("");
        else
            arrayLabel4.setText(AnimationArrayList.getUsers().get(3).toString());

        if (AnimationArrayList.getUsers().size()<5)
            arrayLabel5.setText("");
        else
            arrayLabel5.setText(AnimationArrayList.getUsers().get(4).toString());

        if (AnimationArrayList.getUsers().size()<6)
            arrayLabel6.setText("");
        else
            arrayLabel6.setText(AnimationArrayList.getUsers().get(5).toString());

        if (AnimationArrayList.getUsers().size()<7)
            arrayLabel7.setText("");
        else
            arrayLabel7.setText(AnimationArrayList.getUsers().get(6).toString());

        if (AnimationArrayList.getUsers().size()<8)
            arrayLabel8.setText("");
        else
            arrayLabel8.setText(AnimationArrayList.getUsers().get(7).toString());

        if (AnimationArrayList.getUsers().size()<9)
            arrayLabel9.setText("");
        else
            arrayLabel9.setText(AnimationArrayList.getUsers().get(8).toString());

        if (AnimationArrayList.getUsers().size()<10)
            arrayLabel10.setText("");
        else
            arrayLabel10.setText(AnimationArrayList.getUsers().get(9).toString());

    }

    public void delete(ActionEvent actionEvent) {

        for (int list: AnimationArrayList.getUsers()){
            if(Integer.parseInt(valueTextField.getText())==list){
                AnimationArrayList.getUsers().remove(AnimationArrayList.getUsers().indexOf(Integer.parseInt(valueTextField.getText())));
            }
        }


        if (AnimationArrayList.getUsers().size()<1)
            arrayLabel1.setText("");
        else
            arrayLabel1.setText(AnimationArrayList.getUsers().get(0).toString());
        if (AnimationArrayList.getUsers().size()<2)
            arrayLabel2.setText("");
        else
            arrayLabel2.setText(AnimationArrayList.getUsers().get(1).toString());
        if (AnimationArrayList.getUsers().size()<3)
            arrayLabel3.setText("");
        else
            arrayLabel3.setText(AnimationArrayList.getUsers().get(2).toString());

        if (AnimationArrayList.getUsers().size()<4)
            arrayLabel4.setText("");
        else
            arrayLabel4.setText(AnimationArrayList.getUsers().get(3).toString());

        if (AnimationArrayList.getUsers().size()<5)
            arrayLabel5.setText("");
        else
            arrayLabel5.setText(AnimationArrayList.getUsers().get(4).toString());

        if (AnimationArrayList.getUsers().size()<6)
            arrayLabel6.setText("");
        else
            arrayLabel6.setText(AnimationArrayList.getUsers().get(5).toString());

        if (AnimationArrayList.getUsers().size()<7)
            arrayLabel7.setText("");
        else
            arrayLabel7.setText(AnimationArrayList.getUsers().get(6).toString());

        if (AnimationArrayList.getUsers().size()<8)
            arrayLabel8.setText("");
        else
            arrayLabel8.setText(AnimationArrayList.getUsers().get(7).toString());

        if (AnimationArrayList.getUsers().size()<9)
            arrayLabel9.setText("");
        else
            arrayLabel9.setText(AnimationArrayList.getUsers().get(8).toString());

        if (AnimationArrayList.getUsers().size()<10)
            arrayLabel10.setText("");
        else
            arrayLabel10.setText(AnimationArrayList.getUsers().get(9).toString());
    }
}
