package cn.hd.employee;

import java.util.Scanner;

public class Client {

//	private static Employee temp = null;			//�ȶ���������̬Employee ��
//	private static Employee temp3 = null;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoBusiness db=new DoBusiness();			//����һ��ҵ������󣬿��Ե��øö���ĸ��������в���
		
		System.out.println("******************************************Ա������ϵͳv3.0******************************************");
		System.out.println("**********���������: 1:���  2:ɾ��  3:�޸�  4:��ѯ  5:��ʾ����  6:�˳�**********");
		System.out.println("**********���������**********");
		sc = new Scanner(System.in);
		int choice=sc.nextInt();      //��������,ѡ��
		while(choice<6){
			switch(choice){
			case 1:
				Scanner sc2=new Scanner(System.in);
				System.out.println("**********���������Ա���ı�ţ�**********");
				String  id=sc2.next();
				System.out.println("**********���������Ա����������**********");
				String name=sc2.next();
				System.out.println("**********���������Ա�������գ�**********");
				String birthday=sc2.next();
//				String[] str=birthday.split("-");
//				Calendar c=Calendar.getInstance();
//				c.set(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
				System.out.println("**********���������Ա����н�ʣ�**********");
				String salary=sc2.next();
//				temp = null;
				Employee temp = new Employee();				//��һ��д��������һ���¶��󣬵�����Ϊ�գ�������п�ָ�����!!!!!!!!!!!!!!!!!!!
				temp.setSid(id);
				temp.setSname(name);
				temp.setBirthday(birthday);
				temp.setSalary(salary);
//				if(db.add(new Employee(id,name,birthday,salary)))				//�ڶ���д����ֱ�Ӹ�ֵ
				if(db.add(temp))
					System.out.println("**********��ӳɹ�!**********");
				else 
					System.out.println("**********���ʧ��!**********");
				break;    
			case 2: 
				System.out.println("**********������ɾ��Ա���ı��**********");
				id=sc.next();
				if(db.delete(id))			//����ʱ,�ж��Ƿ�Ϊ��,�����ָ��!!!!!!!!!!!!!!!!!!!!!!
					System.out.println("**********ɾ���ɹ�!**********");
				else 
					System.out.println("**********ɾ��ʧ��!**********");
				break;
			case 3:
				Scanner sc3=new Scanner(System.in);
				System.out.println("**********�������޸�Ա���ı��**********");
				String id3=sc3.next();
//				System.out.println("**********�������޸�Ա��������**********");
//				String name3=sc3.next();
//				
//				System.out.println("**********�������޸�Ա��������**********");
//				String birthday3=sc3.next();
//				String[] str3=birthday3.split("-");
//				Calendar c3=Calendar.getInstance();
//				c3.set(Integer.parseInt(str3[0]),Integer.parseInt(str3[1]),Integer.parseInt(str3[2]));
//				System.out.println("**********���������Ա����н��**********");
//				String salary3=sc3.next();
//				Employee temp3=new Employee();
//				temp3.setSid(id3);
//				temp3.setSname(name3);
//				temp3.setBirthday(birthday3);
//				temp3.setSalary(salary3);
				if(db.update(id3))    
//				if(db.update(new Employee(id3,name3,birthday3,salary3))) 		//�ڶ���д��
					System.out.println("**********�޸ĳɹ�!**********");
				else 
					System.out.println("**********�޸�ʧ��!**********");
				break;
			case 4:
				System.out.println("**********����Ҫ��ѯԱ���ı��**********");
				Scanner sc4=new Scanner(System.in);
				String id4=sc4.next();
				db.selectById(id4);
				break;
			case 5:
				System.out.println("**********��ʾ����**********");
				db.selectAll();
				break;
			default:    
				System.exit(0); 
				break;
			}//case����
			System.out.println("**********���������: 1:���  2:ɾ��  3:�޸�  4:��ѯ  5:��ʾ����  6:�˳�**********");
			choice=sc.nextInt(); 
		}//while����
		System.out.println("*****************�˳�ϵͳ*****************");        
		System.exit(0);
	}//main����
	
	
	
	
	
}//�����
