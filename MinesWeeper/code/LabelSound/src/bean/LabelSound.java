package bean;

import java.io.IOException; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;
 


import javax.swing.JLabel;
import javax.swing.JOptionPane; 



public class LabelSound extends JLabel { 
	
	private Clip clip; 
	private String ruta=null;
	
	
	public LabelSound() {
		super();		
		this.setLayout(null);		
	}

	
	    public void putRuta(String ruta) {
			try { 
				
				
				clip = AudioSystem.getClip();
				
				clip.open( AudioSystem.getAudioInputStream( 
						LabelSound.class.getResource(ruta))); 
				
				} 
				catch (UnsupportedAudioFileException ex) { 
					JOptionPane.showMessageDialog(this, "No se soporta ese formato de audio", "Error", JOptionPane.ERROR_MESSAGE); 
				} 
				catch (LineUnavailableException ex) { 
					JOptionPane.showMessageDialog(this, "No se puede abrir la linea (no hay tarjeta de sonido)", "Error "+ex.getMessage(), JOptionPane.ERROR_MESSAGE); 
				}
				catch (IOException ex) { 
					JOptionPane.showMessageDialog(this, "No se puede abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE); 
					
				}
				catch (NullPointerException ex){
					JOptionPane.showMessageDialog(this, "Archivo no encontrado ", "Error", JOptionPane.ERROR_MESSAGE); 
				}
				
				catch (IllegalArgumentException ex){
					JOptionPane.showMessageDialog(this, "Formato no soportado ", "Error " + ex.getMessage(), JOptionPane.ERROR_MESSAGE); 
				}
		}
		
		public void setRuta(String ruta) {
			this.ruta = ruta;
		}
		public String getRuta() {
			return ruta;
		}
		
		
		
		public Clip getClip(){
			return clip;
		}
		
		
		
		public void play(){
			if(clip!=null && clip.isOpen())
			clip.start();
		}
		
	
		
		public void playRepeat(int i){
			if(clip!=null && clip.isOpen())
			clip.loop(i);
		}
		
		public void playRepeat(){
			if(clip!=null && clip.isOpen())
			clip.loop(clip.LOOP_CONTINUOUSLY);
		}
		
		public void clear(){
			if(clip!=null && clip.isOpen())
			clip.flush();
		}
		
		public void stop(){
			if(clip!=null && clip.isOpen())
			clip.stop();
		}
		
		public void close(){
			if(clip!=null && clip.isOpen())
			clip.close();
		}
		
} 