package command.nocommand;

import java.util.ArrayList;
import java.util.List;

public class DrawCommandManager {

	List<DrawingCommand> commands = new ArrayList<>();
	int index = 0;
	
	public void addCommand(DrawingCommand c){
		commands.add(c);
		index++;
	}

	public void undo() {
		if(index>0){
			index--;
			DrawingCommand c = commands.get(index);
			c.unexecute();
		}
	}

	public void redo() {
		if(index < commands.size()){
			DrawingCommand c = commands.get(index);
			c.execute();
			index++;
		}
	}


}
