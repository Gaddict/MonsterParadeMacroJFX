package app.main;
import app.macro.MainMacro;
import app.common.CommonConstants;
import app.common.CommonConstants.Mode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class Controller {


	@FXML
	private ComboBox<String> selectItemBox;


	@FXML
	protected void createItems(ActionEvent e) {
		MainMacro macro = new MainMacro();
		
		String selectedItem = selectItemBox.getValue();
		
		if(selectedItem.equals(CommonConstants.STR_JOU_YAKUSOU)){
			macro.start(Mode.Create, CommonConstants.JOU_YAKUSOU);
		} else if(selectedItem.equals(CommonConstants.STR_TOKU_YAKUSOU)) {
			macro.start(Mode.Create, CommonConstants.TOKU_YAKUSOU);
		}
		

	}

}