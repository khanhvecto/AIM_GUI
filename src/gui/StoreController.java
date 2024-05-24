package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StoreController {
	private Stage stage;
	
	public StoreController(Stage stage) {
		this.stage = stage;
	}
	
	@FXML
    private ImageView cartImage;
	
    @FXML
    void clickCartImage(MouseEvent event) throws Exception{

    	// Show cart screen
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Cart.fxml"));
    	loader.setController(new CartController(this.stage));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
    	this.stage.setScene(scene);
    }

}
