import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class GardenScene extends BaseScene {
	
	private Button[] gardenslots;
	private final int MAXSLOTS = 45;
	private final int WIDTH = 1220;
	private final int LENGTH = 720;
	
	//constructor, pass Session inst variable to parent
	public GardenScene(Session aSession) {
		super(aSession);
	}

	//override abstract parent
	@Override
	public void setup() {
		StackPane root = new StackPane();
		Scene scene = new Scene(root, WIDTH, LENGTH);
		
		//set up gridpane
		GridPane firstStack = new GridPane();
		firstStack.setPadding(new Insets(0, 22, 32, 0));
		firstStack.setGridLinesVisible(true);
		firstStack.setAlignment(Pos.BOTTOM_RIGHT);
		//create empty button array
		gardenslots = new Button[MAXSLOTS];	//number of elements must be stated
		for (int i = 0; i < MAXSLOTS; ++i) {
			gardenslots[i] = new Button("Button"+(i+1));	//label on buttons
			gardenslots[i].setPrefSize(100,  106);	//set button size
		}
		//create and add every button into array
		int button = 0;
		for (int row = 0; row < 5; ++row) {
			for (int column = 0; column < 9; ++column) {
				firstStack.add(gardenslots[button], column, row);
				++button;
			}
		}

		//add firstStack to root
		root.getChildren().add(firstStack);
		
		
		setScene(scene);
		display();
		
	}
	
	

}
