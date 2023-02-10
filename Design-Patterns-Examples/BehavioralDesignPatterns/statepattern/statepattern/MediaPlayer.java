package statepattern;

public class MediaPlayer {
	
	MPState currentState;

	public void setCurrentState(MPState currentState) {
		this.currentState = currentState;
	}
	
	public MediaPlayer() {
		currentState = new Idle(this);
	}
	
	public void load() {
		currentState.load();
	}
	public void unload() {
		currentState.unload();
	}
	public void play() {
		currentState.play();
	}
	public void stop() {
		currentState.stop();
	}
	public void pause() {
		currentState.pause();
	}
	public void unpause() {
		currentState.unpause();
	}

	public static void main(String[] args) {
		MediaPlayer mp = new MediaPlayer();
		mp.play();
		mp.load();
		mp.pause();
		mp.play();
		mp.pause();
		mp.unpause();
		mp.load();
		mp.stop();
	}
}
