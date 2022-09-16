import com.badlogic.gdx.math.MathUtils;

public class LevelScreen extends BaseScreen
{
    public void initialize() 
    {        
        BaseActor background = new BaseActor(0, 0, mainStage);
        background.loadTexture("assets/felt.jpg");
        BaseActor.setWorldBounds(background);

        for (int r = 0; r < Card.rankNames.length; r++){
            for (int s = 0; s < Card.suitNames.length; s++){
                int x = MathUtils.random(0, 800);
                int y = MathUtils.random(0, 300);
                Card c = new Card(x, y, mainStage);
                c.setRankSuitValues(r, s);
            }
        }
    }

    public void update(float dt)
    {
       
    }
}