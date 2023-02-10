package painter;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import painter.shapes.Circle;

public class ShapeFactory {

	public static Map<Integer, Class<? extends Shape>> m = new HashMap<>();
	
	static{
		File shapeDirectory = new File("C:\\Users\\PROBOOK\\workspace2\\designpatterns\\src\\painter\\shapes");
		File[] classFiles = shapeDirectory.listFiles();
		int i=1;
		for(File classFile: classFiles){
			String className = classFile.getName().split("\\.")[0];
			Class<? extends Shape> c= null;
			try {
				c = Class.forName("painter.shapes."+className).asSubclass(Shape.class);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			m.put(i, c);
			i++;
		}
	}
	
	public static Shape createShape(int type){
		Class<? extends Shape> c = m.get(type);
		try {
			Shape p = (Shape)c.getConstructor().newInstance();
			return p;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
