package main;

public class Main {
	public static void main(String[] args) {
//		Employee employee = new Employee("201901","����",4000,1000);
//		System.out.println("Ա���ı�ţ�"+employee.getNo());
//		System.out.println("Ա����������"+employee.getName());
//		System.out.println("Ա���Ļ������ʣ�"+employee.getMoney());
//		System.out.println("Ա���������"+employee.getGrowth());
//		employee.growthMoney();
//		System.out.println("Ա����������Ĺ��ʣ�"+employee.getMoney());
		
		Clock BeiJing = new Clock();
		while(true){
			BeiJing.increase();
			System.out.println(BeiJing.getHour()+":"+BeiJing.getMinute());
		}
	}

}
