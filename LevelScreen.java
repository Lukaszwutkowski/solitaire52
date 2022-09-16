import com.badlogic.gdx.math.MathUtils;

import java.util.ArrayList;

public class LevelScreen extends BaseScreen
{
    private ArrayList<Pile> pileList;
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
                c.toBack();
            }
        }

        background.toBack();

        pileList = new ArrayList<Pile>();
        for (int i = 0; i < 4; i++){
            int pileX = 120 + 150 * i;
            int pileY = 450;
            Pile pile = new Pile(pileX, pileY, mainStage);
            pileList.add(pile);
        }

        for (BaseActor actor : BaseActor.getList(mainStage, "Card")){
            Card card = (Card)actor;
            if (card.getRankValue() == 0){
                Pile pile = pileList.get(card.getSuitValue());
                card.toFront();
                card.moveToActor(pile);
                pile.addCard(card);
                card.setDraggable(false);
            }
        }
    }

    public void update(float dt)
    {
       
    }
}