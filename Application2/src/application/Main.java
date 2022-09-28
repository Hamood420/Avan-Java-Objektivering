package application;
	
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application{
	public static JSONParse json = new JSONParse();
	public static CSVParser csv = new CSVParser();
	public static TableView<Product> table = new TableView();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException, ParseException, java.text.ParseException, org.json.simple.parser.ParseException {
		csv.ReadCSV();
		json.ReadJSON();

		//Skapar kolumner
		TableColumn<Product, String> row1 = new TableColumn<>("Item");
		row1.setCellValueFactory(new PropertyValueFactory<>("item"));
		
		TableColumn<Product, String> row2 = new TableColumn<>("Region");
		row2.setCellValueFactory(new PropertyValueFactory<>("region"));
		
		TableColumn<Product, String> row3 = new TableColumn<>("Rep1");
		row3.setCellValueFactory(new PropertyValueFactory<>("rep1"));
		
		TableColumn<Product, String> row4 = new TableColumn<>("Rep2");
		row4.setCellValueFactory(new PropertyValueFactory<>("rep2"));
		
		TableColumn<Product, String> row5 = new TableColumn<>("OrderDate");
		row5.setCellValueFactory(new PropertyValueFactory<>("orderDate"));
		
		TableColumn<Product, String> row6 = new TableColumn<>("Units");
		row6.setCellValueFactory(new PropertyValueFactory<>("units"));
		
		TableColumn<Product, String> row7 = new TableColumn<>("UnitCost");
		row7.setCellValueFactory(new PropertyValueFactory<>("unitCost"));
		
		TableColumn<Product, String> row8 = new TableColumn<>("Total");
		row8.setCellValueFactory(new PropertyValueFactory<>("Total"));
		
		table.getColumns().addAll(row1, row2, row3, row4, row5, row6, row7, row8);
		
		//Skapar en JSON knapp
		Button jsonBtn = new Button();
		jsonBtn.setText("Show JSON");
		jsonBtn.setOnAction(new EventHandler() {

			@Override
			public void handle(Event arg0) {
				ObservableList<Product> jsonData = FXCollections.observableArrayList(json.rows);
				table.setItems(jsonData);

			}
		});

		//Skapar en CSV knapp
		Button csvBtn = new Button();
		csvBtn.setText("Show CSV");
		csvBtn.setOnAction(new EventHandler() {

			@Override
			public void handle(Event arg0) {
				ObservableList<Product> csvData = FXCollections.observableArrayList(csv.rows);
				table.setItems(csvData);

			}
		});

		//Pop-rutan
		VBox vbox = new VBox();
		vbox.getChildren().add(table);
		vbox.getChildren().addAll(jsonBtn, csvBtn);
		vbox.setSpacing(10);
		vbox.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
