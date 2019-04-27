package cn.hd.employee;

import java.util.Scanner;

/*业务类:对员工进行操作  增删改查
 * 
 */

public class DoBusiness {
	Employee[] emps=new Employee[100];		//员工数组!!!!!!!!!!!!!!!!!
	int count=0;		//计数器
	/*
	 * 添加员工
	 * 成功  返回true
	 */
	public boolean add(Employee emp) {
		emps[count++]=emp;
		return true;
		
	}
	
	//查询单个员工
	public Employee selectById(String id) {
		int i;
		for(i=0;i<emps.length;i++)			//每次输入一个员工的信息
			if(emps[i]!=null)
				if(emps[i].getSid().equals(id)) {
					System.out.println(emps[i].getSid()+"       "+emps[i].getSname()+"    "+emps[i].getBirthday()+"     "+emps[i].getSalary());		
					break;
				}
		if(i==emps.length)	  System.out.println("**********该员工不存在!**********");	
		return null;
	}
	
	//查询所有员工
	public Employee selectAll() {
		System.out.println("员工编号        员工名称       员工生日                员工薪资");
		for(int i=0;i<emps.length;i++) 			//每次输入一个员工的信息
			if(emps[i]!=null)
				System.out.println(emps[i].getSid()+"       "+emps[i].getSname()+"    "+emps[i].getBirthday()+"     "+emps[i].getSalary());
		
		return null;
		
	}
	
	//修改员工
	public boolean update(String id) {		//根据id查询
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<emps.length;i++)			//每次输入一个员工的信息	//直接把传过来的员工赋给当前数组中
			if(emps[i]!=null)
				if(emps[i].getSid().equals(id)) {
					System.out.println("**********请输入修改员工的姓名**********");
					String name=sc.next();
					System.out.println("**********请输入修改员工的生日**********");
					String birthday=sc.next();
					System.out.println("**********请输入添加员工的薪资**********");
					String salary=sc.next();
					emps[i].setSid(id);
					emps[i].setSname(name);
					emps[i].setBirthday(birthday);
					emps[i].setSalary(salary);
					return true;
				}
		if(i==emps.length)	  System.out.println("**********该员工不存在!**********");	
		return false;
	}
	
	//删除员工
	public boolean delete(String id) {
		int i;
		for(i=0;i<emps.length;i++)			//每次输入一个员工的信息
			if(emps[i]!=null)				//判断是否为空,避免空指针!!!!!!!!!!!!!!!
				if(emps[i].getSid().equals(id)) {
					emps[i]=null;
					return true;
			}
		if(i==emps.length)	   System.out.println("**********该员工不存在!**********");	   
		return false;
	}
	

	

}
