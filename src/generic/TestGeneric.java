package generic;

import java.util.LinkedList;
import java.util.List;

public class TestGeneric {

	public void noGenericsListIteration() {
		List list = new LinkedList();
		list.add("foo");
		list.add(new Integer(7));
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i); // runtime error
		}
	}

	public void genericListIteration() {
		List<String> list = new LinkedList<String>();
		list.add("foo");
		// list.add(new Integer(7)); // compile-time error
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
		}
	}

	public class Canvas {
	}

	public class Shape {
		public void draw(Canvas c){
		}
		
	}

	public class Circle extends Shape {
		private int x, y, radius;

		public void draw(Canvas c) {
		}
	}

	public void drawAll(List<? extends Shape> shapes) {
		for (Shape s : shapes) {
			s.draw(new Canvas());
		}
	}

	public void add(List<Shape> shapes) {
		shapes.add(new Circle());
	}

	public <E> void reverse(List<E> list) {
		for (int i = 0; i < list.size() / 2; i++) {
			int j = list.size() - 1 - i;
			E e = list.get(i);
			list.set(i, list.get(j));
			list.set(j, e);
		}
	}
}
