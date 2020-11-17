import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;


public class AudioPlay extends Thread {
	private InputStream inputStream = null; 
	private String file = ""; 
	public AudioPlay(String file){ 
		this.file = file; 
		} 
	public void play() throws IOException { 
		inputStream = new FileInputStream(new File(file)); 
		AudioPlayer.player.start(inputStream); 
	} 
	@Override 
	public void run() { 
		try { 
		this.play(); 
		} catch (IOException e) { 
		e.printStackTrace(); 
		} 
	} 
}
