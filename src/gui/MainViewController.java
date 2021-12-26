package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemNew;
	
	@FXML
	private MenuItem menuItemPreferences;
	
	@FXML
	private MenuItem menuItemUpdate;
	
	@FXML
	private MenuItem menuItemDelete;
	
	@FXML
	private MenuItem menuItemRead;
	
	@FXML
	private MenuItem menuItemGitHubPage;
	
	@FXML
	private MenuItem menuItemGitAbout;
	
	
	@FXML
	public void onMenuItemNew() {
		loadView("/gui/NewRegistration.fxml");
	}
	
	@FXML
	public void onMenuItemPreferences() {
		System.out.println("onMenuItemPreferences");
	}
	
	@FXML
	public void onMenuItemUpdate() {
		System.out.println("onMenuItemUpdate");
		
	}
	
	@FXML
	public void onMenuItemDelete() {
		System.out.println("onMenuItemDelete");
		
	}
	
	@FXML
	public void onMenuItemRead() {
		System.out.println("onMenuItemRead");
		
	}
	
	@FXML
	public void onMenuItemGitHubPage() throws IOException {
		Runtime.getRuntime().exec("cmd.exe /C start iexplore.exe https://github.com/leoabrantes/rentalCarService-javafx-jdbc");
		
	}
	
	@FXML
	public void onMenuItemAbout() {
		loadView("/gui/About.fxml");
		
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	
	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
			
			
		}
		catch(IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

}
