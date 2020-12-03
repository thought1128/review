package generic_collection;

class Top<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class Ex10_01_generic {

	public static void main(String[] args) {
		Top<String> t1 = new Top<String>();
		t1.setData("Hello");
		System.out.println(t1.getData());
		System.out.println(t1.toString());
		System.out.println(t1);
		Top<Integer> t2 = new Top<Integer>();
		t2.setData(3);
		Integer x = new Integer(3);
		int a = t2.getData();
		a = (int) x;
		System.out.println(t2.getData());
		Top<Object> t3=new Top<Object>();
		t3.setData("object");
		System.out.println((String)t3.getData());
	}

}