package review;


class Product{
	private String code;
	private String company;

	Product(String code,String company){
		this.code=code;
		this.company=company;
	}
	public void show(){
		System.out.print(code+"\s"+company+"\n");
	}
}
class Computer extends Product{
	private String windows;
	private int bit;

	Computer(String code,String company,String windows,int bit){
		super(code, company);
		this.windows=windows;
		this.bit=bit;
	}
	public void show(){
		super.show();
		System.out.print(windows+"\s"+bit);
	}
}
public class Ex07_inheritance {
	public static void main(String[] args) {
		Product p = new Product("PO1","중앙");
		Computer c = new Computer("C01","삼성","window10",64);
		
		p.show();
		c.show();

	}
}
