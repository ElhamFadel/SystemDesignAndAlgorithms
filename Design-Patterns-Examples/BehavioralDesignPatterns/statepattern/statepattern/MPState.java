package statepattern;

public abstract class MPState {

	MediaPlayer mp;
	
	public MPState(MediaPlayer mp) {
		this.mp = mp;
	}
	
	public abstract void load();
	public abstract void unload();
	public abstract void play();
	public abstract void stop();
	public abstract void pause();
	public abstract void unpause();


}
