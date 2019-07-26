import java.io.FileInputStream;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class GardenScene extends BaseScene {
	
	private Button[] gardenslots;
	private final int MAXSLOTS = 45;
	
	//constructor, pass Session inst variable to parent
	public GardenScene(Session aSession) {
		super(aSession);
	}

	//override abstract parent
	@Override
	public void setup() throws Exception {
		
		Image Garden = new Image(new FileInputStream("BackgroundPvZ.jpg"));
		ImageView GardenView = new ImageView(Garden);
		GardenView.setFitHeight(720);
		GardenView.setFitWidth(1500);
        
		//creating the box where the buttons will be added
		HBox buttons = new HBox();     
        
		//uploading image file
		FileInputStream walnut =  new FileInputStream("walnut.png");
		Image aWalnut = new Image(walnut); // create a image 
		ImageView theWalnut = new ImageView(aWalnut);// create a image View 
        
		//same upload image process but for sunflower
		FileInputStream sunflower = new FileInputStream("PvZ_Sunflower.jpg");
		Image aSunflower = new Image(sunflower); // create a image 
		ImageView theSunflower = new ImageView(aSunflower);        
        
		//creating the buttons and adding them to the HBox
		Button thyWalnut = new Button("walnut",theWalnut);
		Button thySunflower = new Button("",theSunflower);
		buttons.getChildren().add(thyWalnut);
		buttons.getChildren().add(thySunflower);
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 1050, 720);
		
		//set up gridpane
		GridPane firstStack = new GridPane();
		//create empty button array
		gardenslots = new Button[MAXSLOTS];	//number of elements must be stated
		for (int i = 0; i < MAXSLOTS; ++i) {
			gardenslots[i] = new Button("Button"+(i+1));	//label on buttons
			gardenslots[i].setPrefSize(100,  100);	//set button size
		}
		//create and add every button into array
		int button = 0;
		for (int row = 0; row < 5; ++row) {
			for (int column = 0; column < 9; ++column) {
				firstStack.add(gardenslots[button], column, row);
				++button;
			}
		}
		
//		root.setGridLinesVisible(true);
		
		//adding background image
		root.getChildren().add(GardenView);

		//add firstStack to root
		root.getChildren().add(firstStack);
		firstStack.setAlignment(Pos.BOTTOM_RIGHT);
		
		//adding second stack of buttons to root
		root.getChildren().add(buttons);
		buttons.setAlignment(Pos.TOP_LEFT);
		
		
		setScene(scene);
		display();
		
	}
	
	

}

