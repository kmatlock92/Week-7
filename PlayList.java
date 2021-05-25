import java.util.ArrayList;

public class PlayList implements IComponent {
	public Object String;

	public class Playlist {
		
	public String playListName;
	public ArrayList<IComponent> playList = new ArrayList();
		
	public Playlist(String playlistName) {
			this.playListName = playListName;
		}

	public void add (IComponent component) {
			playList.add(component);
		}
	public void remove(IComponent component) {
				playList.remove(component);
		}
	public void play() {
			for(IComponent component : playList) {
				component.play();
		}
	public setPlayBackSpeed(float speed) {
		for(IComponent component : this.playList) {
			component.setPlayBackSpeed(speed);
		}
	
	
	}
		}
		}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlayBackSpeed(float speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public java.lang.String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayBackSpeed() {
		// TODO Auto-generated method stub
		
	}
			
		
		//Your code goes here!
	}
