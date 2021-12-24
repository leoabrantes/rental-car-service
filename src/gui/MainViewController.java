package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("onMenuItemNew");
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
		System.out.println("onMenuItemAbout");
		
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	
	

}
