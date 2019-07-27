
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class GardenScene extends BaseScene {

	private Button[] gardenslots;
	private final int MAXSLOTS = 45;
	private final int LENGTH = 1220;
	private final int WIDTH = 720;

	//constructor, pass Session inst variable to parent
	public GardenScene(Session aSession) {
		super(aSession);
	}

	//override abstract parent
	@Override
	public void setup() {
		StackPane root = new StackPane();
		Scene scene = new Scene(root, LENGTH, WIDTH);

		//Initialize game
		Player player = new Player();
		Game game = new Game(player);

		root.getChildren().add(gardenButtons(game.getPlayer()));

		setScene(scene);
		display();

	}

	public Node gardenButtons(Player aPlayer) {

		VBox root = new VBox();

//		for (int column = 0; column = )
		Button peaShooter = new Button("Peashooter");
		Button cherryBomb = new Button("Cherrybomb");
		Button frozenPeaShooter = new Button("Frozen Peashooter");

		//setup plants buttons in first row of layout
		HBox box = new HBox();
		box.getChildren().addAll(peaShooter, cherryBomb,frozenPeaShooter);

		//create empty button array for button
		gardenslots = new Button[MAXSLOTS];	//number of elements must be stated
		for (int i = 0; i < MAXSLOTS; ++i) {
			gardenslots[i] = new Button("Button"+(i+1));	//label on buttons
			gardenslots[i].setPrefSize(100,  106);	//set button size
		}

		//set up gridpane as second row of layout
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(0, 22, 32, 0));
//		grid.setGridLinesVisible(true);
		grid.setAlignment(Pos.BOTTOM_RIGHT);

		//create and add every button into array
		int button = 0;
		for (int row = 0; row < 5; ++row) {
			for (int column = 0; column < 9; ++column) {
				grid.add(gardenslots[button], column, row);
				++button;
			}
		}

		//add firstrow (plantwidgets) and secondrow (gardenslots) to root
		root.getChildren().add(box);
		root.getChildren().add(grid);

		return root;
	}

}
