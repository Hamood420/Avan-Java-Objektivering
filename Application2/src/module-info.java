module Application2 {
	requires javafx.controls;
	requires java.security.jgss;
	requires json.simple;
	
	opens application to javafx.graphics, javafx.fxml;
}
