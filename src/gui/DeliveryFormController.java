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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DeliveryFormController {
	private Stage stage;
	private boolean isRushOrderVisible = false;
	
	
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
    private HBox rushOrderTimePart;
    
    @FXML
    private HBox rushOrderInstructionsPart;

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

    @FXML
    void chooseRushOrder(ActionEvent event) {
    	// Show or not show 2 rush order fields
    	this.isRushOrderVisible = !this.isRushOrderVisible; // Toggle the visibility flag
        rushOrderInstructionsPart.setVisible(this.isRushOrderVisible);
        rushOrderTimePart.setVisible(this.isRushOrderVisible);
    }
    
}
