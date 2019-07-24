import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	public void setup() {
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
		//add firstStack to root
		root.getChildren().add(firstStack);
		firstStack.setAlignment(Pos.BOTTOM_RIGHT);
		
		
		setScene(scene);
		display();
		
	}
	
	

}
