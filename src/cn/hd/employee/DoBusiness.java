package cn.hd.employee;

import java.util.Scanner;

/*ҵ����:��Ա�����в���  ��ɾ�Ĳ�
 * 
 */

public class DoBusiness {
	Employee[] emps=new Employee[100];		//Ա������!!!!!!!!!!!!!!!!!
	int count=0;		//������
	/*
	 * ���Ա��
	 * �ɹ�  ����true
	 */
	public boolean add(Employee emp) {
		emps[count++]=emp;
		return true;
		
	}
	
	//��ѯ����Ա��
	public Employee selectById(String id) {
		int i;
		for(i=0;i<emps.length;i++)			//ÿ������һ��Ա������Ϣ
			if(emps[i]!=null)
				if(emps[i].getSid().equals(id)) {
					System.out.println(emps[i].getSid()+"       "+emps[i].getSname()+"    "+emps[i].getBirthday()+"     "+emps[i].getSalary());		
					break;
				}
		if(i==emps.length)	  System.out.println("**********��Ա��������!**********");	
		return null;
	}
	
	//��ѯ����Ա��
	public Employee selectAll() {
		System.out.println("Ա�����        Ա������       Ա������                Ա��н��");
		for(int i=0;i<emps.length;i++) 			//ÿ������һ��Ա������Ϣ
			if(emps[i]!=null)
				System.out.println(emps[i].getSid()+"       "+emps[i].getSname()+"    "+emps[i].getBirthday()+"     "+emps[i].getSalary());
		
		return null;
		
	}
	
	//�޸�Ա��
	public boolean update(String id) {		//����id��ѯ
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<emps.length;i++)			//ÿ������һ��Ա������Ϣ	//ֱ�ӰѴ�������Ա��������ǰ������
			if(emps[i]!=null)
				if(emps[i].getSid().equals(id)) {
					System.out.println("**********�������޸�Ա��������**********");
					String name=sc.next();
					System.out.println("**********�������޸�Ա��������**********");
					String birthday=sc.next();
					System.out.println("**********���������Ա����н��**********");
					String salary=sc.next();
					emps[i].setSid(id);
					emps[i].setSname(name);
					emps[i].setBirthday(birthday);
					emps[i].setSalary(salary);
					return true;
				}
		if(i==emps.length)	  System.out.println("**********��Ա��������!**********");	
		return false;
	}
	
	//ɾ��Ա��
	public boolean delete(String id) {
		int i;
		for(i=0;i<emps.length;i++)			//ÿ������һ��Ա������Ϣ
			if(emps[i]!=null)				//�ж��Ƿ�Ϊ��,�����ָ��!!!!!!!!!!!!!!!
				if(emps[i].getSid().equals(id)) {
					emps[i]=null;
					return true;
			}
		if(i==emps.length)	   System.out.println("**********��Ա��������!**********");	   
		return false;
	}
	

	

}
