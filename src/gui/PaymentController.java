package gui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PaymentController {
	private Stage stage;
	
	public PaymentController(Stage stage) {
		this.stage = stage;
	}
	
    @FXML
    private VBox paymentArea;

    @FXML
    void clickHomeImage(MouseEvent event) throws Exception{
    	// Show store scene
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Store.fxml"));
		loader.setController(new StoreController(this.stage));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		this.stage.setScene(scene);
    }

}
