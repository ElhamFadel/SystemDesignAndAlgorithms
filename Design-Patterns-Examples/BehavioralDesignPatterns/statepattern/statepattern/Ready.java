package statepattern;

public class Ready extends MPState{

	public Ready(MediaPlayer mp) {
		super(mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unload() {
		System.out.println("Unloading file");
		mp.setCurrentState(new Idle(mp));
	}

	@Override
	public void play() {
		System.out.println("start playing..");
		mp.setCurrentState(new Playing(mp));
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
