import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Launcher
{
    public static void main (String[] args)
    {
        Game myGame = new CustomGame(); 
        LwjglApplication launcher = new LwjglApplication( myGame, "Solitaire 52", 800, 600 );
    }
}