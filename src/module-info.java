module TestFXModule {
	requires javafx.controls;
	requires javafx.fxml;	
	requires interfacemodule;
	
	opens application to javafx.graphics, javafx.fxml;
	
	uses interfacemodule.iViewWindow;
}
