package lar3;

public class Test {public static void main(String args[]) {
	Doctor doctor1 = new Doctor();
	
	Doctor doctor2 = new Doctor();
	
	System.out.println("博士生a所交学费为"+doctor1.payFees(3500)+",学费查询"+doctor1.queryFees(5000) +"年收入为："+doctor1.getSalary(200000));
	
	System.out.println("博士生b所交学费为"+doctor2.payFees(3000)+",学费查询"+doctor2.queryFees(4500) +"年收入为："+doctor2.getSalary(300000));
}


}
