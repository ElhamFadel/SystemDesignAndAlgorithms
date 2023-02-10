package composite.painter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import composite.painter.shapes.Shape;




public class ReflectionShapeFactory{
		
		private static List<Class> shapeClasses = new ArrayList<Class>();
		private static ReflectionShapeFactory instance;
		
		private ReflectionShapeFactory(){};
		
		public static ReflectionShapeFactory getInstance(){
			if(instance == null){
				instance = new ReflectionShapeFactory();
			}
			return instance;
		}
		
		public static Shape createShape(String classPath){
			Shape p = null;
			Class c;
			try {
				c = Class.forName(classPath);
				Constructor con = c.getConstructor();
				p = (Shape) con.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return p;
		}
		
		public static void registerShape(Class shapeClass){
			shapeClasses.add(shapeClass);
		}
		
		public static List<Class> getRegisteredShapes(){
			return shapeClasses;
		}
	}
