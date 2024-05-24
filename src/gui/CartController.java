package gui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CartController {
	
	private Stage stage;
	
	public CartController(Stage stage) {
		this.stage = stage;
	}
	
	@FXML
    private ScrollPane itemsPane;

    @FXML
    private Label amountLabel;

    @FXML
    private Label _VATLabel;

    @FXML
    private Label subTotalLabel;

    @FXML
    private Button placeOrderButton;

    @FXML
    void clickHomeImage(MouseEvent event) throws Exception {
    	// Show store scene
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Store.fxml"));
		loader.setController(new StoreController(this.stage));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		this.stage.setScene(scene);
    }

    @FXML
    void pressPlaceOrder(ActionEvent event) throws Exception{
    	// Show delivery form
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/DeliveryForm.fxml"));
		loader.setController(new DeliveryFormController(this.stage));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		this.stage.setScene(scene);
    }


}
