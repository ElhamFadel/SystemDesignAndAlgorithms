package statepattern;

public class Playing extends MPState{

	public Playing(MediaPlayer mp) {
		super(mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
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
		System.out.println("Stopping audio");
		mp.setCurrentState(new Ready(mp));
	}

	@Override
	public void pause() {
		System.out.println("Store current info and pause");
		mp.setCurrentState(new Paused(mp));
	}

	@Override
	public void unpause() {
		// TODO Auto-generated method stub
		
	}


}
