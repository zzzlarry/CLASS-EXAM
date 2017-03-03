
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Staff n1=new Staff("001","105050501");
	Staff n2=new Staff("002","105050502");
	Staff n3=new Staff("003","105050503");
	Staff n4=new Staff("004","105050504");
	Staff n5=new Staff("005","105050505");
	n1.setGender('男');
	System.out.println(n1.name+n1.getGender());
	n2.setGender('女');
	System.out.println(n2.getGender());
	n3.setGender('男');
	System.out.println(n3.getGender());
	n4.setGender('女');
	System.out.println(n4.getGender());
	n5.setGender('男');
	System.out.println(n5.getGender());
	n1.setHigh(160);
	System.out.println(n1.getHigh());
	n2.setHigh(161);
	System.out.println(n2.getHigh());
	n3.setHigh(162);
	System.out.println(n3.getHigh());
	n4.setHigh(163);
	System.out.println(n4.getHigh());
	n5.setHigh(164);
	System.out.println(n5.getHigh());
	}
}
