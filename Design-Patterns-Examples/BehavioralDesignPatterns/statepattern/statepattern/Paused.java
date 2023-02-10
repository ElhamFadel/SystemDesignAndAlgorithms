package statepattern;

public class Paused extends MPState{

	

	public Paused(MediaPlayer mp) {
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
		System.out.println("Stopping..");
		mp.setCurrentState(new Ready(mp));
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unpause() {
		System.out.println("Restore current info and resume");
		mp.setCurrentState(new Playing(mp));
	}

}
