package lar3;

public class Test {public static void main(String args[]) {
	Doctor doctor1 = new Doctor();
	
	Doctor doctor2 = new Doctor();
	
	System.out.println("��ʿ��a����ѧ��Ϊ"+doctor1.payFees(3500)+",ѧ�Ѳ�ѯ"+doctor1.queryFees(5000) +"������Ϊ��"+doctor1.getSalary(200000));
	
	System.out.println("��ʿ��b����ѧ��Ϊ"+doctor2.payFees(3000)+",ѧ�Ѳ�ѯ"+doctor2.queryFees(4500) +"������Ϊ��"+doctor2.getSalary(300000));
}


}
