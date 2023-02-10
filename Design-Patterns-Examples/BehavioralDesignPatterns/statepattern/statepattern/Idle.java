package statepattern;

public class Idle extends MPState{

	public Idle(MediaPlayer mp) {
		super(mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		System.out.println("Loading audio track from disk");
		mp.setCurrentState(new Ready(mp));
	}

	@Override
	public void unload() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unpause() {
		// TODO Auto-generated method stub
		
	}



}
