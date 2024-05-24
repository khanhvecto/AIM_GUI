package gui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DeliveryFormController {
	private Stage stage;
	
	public DeliveryFormController(Stage stage) {
		this.stage = stage;
	}
	
	@FXML
    private TextField deliveryInstructionsLabel;

    @FXML
    private TextField phoneLabel;

    @FXML
    private TextField cityLabel;

    @FXML
    private RadioButton rushOrderButton;

    @FXML
    private TextField addressLabel;

    @FXML
    private TextField rushOrderTimeLabel;

    @FXML
    private TextField emailLabel;

    @FXML
    private TextField rushOrderInstructionsLabel;

    @FXML
    private TextField nameLabel;

    @FXML
    private Button confirmDeliveryButton;

    @FXML
    void ClickHomeImage(MouseEvent event) throws Exception{
    	// Show store scene
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Store.fxml"));
		loader.setController(new StoreController(this.stage));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		this.stage.setScene(scene);
    }

    @FXML
    void pressConfirmDeliveryButton(ActionEvent event) throws Exception{
    	// Show invoice screen
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Invoice.fxml"));
		loader.setController(new InvoiceController(this.stage));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		this.stage.setScene(scene);
    }

}
