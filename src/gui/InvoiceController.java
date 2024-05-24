package gui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class InvoiceController {
	private Stage stage;
	
	public InvoiceController(Stage stage) {
		this.stage = stage;
	}
	
    @FXML
    private Label totalLabel;

    @FXML
    private ScrollPane itemsPane;

    @FXML
    private Label deliveryInstructionsLabel;

    @FXML
    private Label phoneLabel;

    @FXML
    private Label shippingFees;

    @FXML
    private Label cityLabel;

    @FXML
    private Label subTotalLabel;

    @FXML
    private Label addressLabel;

    @FXML
    private Label rushOrderTimeLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label rushOrderInstructionsLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void clickHomeImage(MouseEvent event) throws Exception{
    	// Show store scene
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Store.fxml"));
		loader.setController(new StoreController(this.stage));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		this.stage.setScene(scene);
    }

    @FXML
    void pressConfirmOrder(ActionEvent event) throws Exception{
    	// Show Payment screen
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Payment.fxml"));
		loader.setController(new PaymentController(this.stage));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		this.stage.setScene(scene);
    }

}
