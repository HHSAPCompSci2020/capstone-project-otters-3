package theDeathNotice.graphics;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import javazoom.jl.decoder.JavaLayerException;
/**
 * This is a SoundPlayer that plays the sound.
 * @author skyla
 * 
 */
public class SoundPlayer {
	private String filename;
	private Thread playThread;
	
	SoundPlayer(String filename) {
		this.filename = filename;
		playThread = new Thread(runnablePlay);
		
	}
	void start() {
		playThread.start();
	}
	
	Runnable runnablePlay=new Runnable() {
		   @Override
		   public void run() {
	            URL file = ClassLoader.getSystemClassLoader().getResource(filename);
				try {
					BufferedInputStream bs = new BufferedInputStream(file.openStream());
					javazoom.jl.player.Player player = new javazoom.jl.player.Player(bs);
					player.play();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
		   }
		 };
}
