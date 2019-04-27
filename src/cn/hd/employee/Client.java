package cn.hd.employee;

import java.util.Scanner;

public class Client {

//	private static Employee temp = null;			//先定义两个静态Employee 类
//	private static Employee temp3 = null;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoBusiness db=new DoBusiness();			//创建一个业务类对象，可以调用该对象的各方法进行操作
		
		System.out.println("******************************************员工管理系统v3.0******************************************");
		System.out.println("**********请输入操作: 1:添加  2:删除  3:修改  4:查询  5:显示所有  6:退出**********");
		System.out.println("**********请输入操作**********");
		sc = new Scanner(System.in);
		int choice=sc.nextInt();      //输入数字,选择
		while(choice<6){
			switch(choice){
			case 1:
				Scanner sc2=new Scanner(System.in);
				System.out.println("**********请输入添加员工的编号：**********");
				String  id=sc2.next();
				System.out.println("**********请输入添加员工的姓名：**********");
				String name=sc2.next();
				System.out.println("**********请输入添加员工的生日：**********");
				String birthday=sc2.next();
//				String[] str=birthday.split("-");
//				Calendar c=Calendar.getInstance();
//				c.set(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
				System.out.println("**********请输入添加员工的薪资：**********");
				String salary=sc2.next();
//				temp = null;
				Employee temp = new Employee();				//第一种写法，创建一个新对象，但不能为空，否则会有空指针错误!!!!!!!!!!!!!!!!!!!
				temp.setSid(id);
				temp.setSname(name);
				temp.setBirthday(birthday);
				temp.setSalary(salary);
//				if(db.add(new Employee(id,name,birthday,salary)))				//第二种写法，直接赋值
				if(db.add(temp))
					System.out.println("**********添加成功!**********");
				else 
					System.out.println("**********添加失败!**********");
				break;    
			case 2: 
				System.out.println("**********请输入删除员工的编号**********");
				id=sc.next();
				if(db.delete(id))			//遍历时,判断是否为空,避免空指针!!!!!!!!!!!!!!!!!!!!!!
					System.out.println("**********删除成功!**********");
				else 
					System.out.println("**********删除失败!**********");
				break;
			case 3:
				Scanner sc3=new Scanner(System.in);
				System.out.println("**********请输入修改员工的编号**********");
				String id3=sc3.next();
//				System.out.println("**********请输入修改员工的姓名**********");
//				String name3=sc3.next();
//				
//				System.out.println("**********请输入修改员工的生日**********");
//				String birthday3=sc3.next();
//				String[] str3=birthday3.split("-");
//				Calendar c3=Calendar.getInstance();
//				c3.set(Integer.parseInt(str3[0]),Integer.parseInt(str3[1]),Integer.parseInt(str3[2]));
//				System.out.println("**********请输入添加员工的薪资**********");
//				String salary3=sc3.next();
//				Employee temp3=new Employee();
//				temp3.setSid(id3);
//				temp3.setSname(name3);
//				temp3.setBirthday(birthday3);
//				temp3.setSalary(salary3);
				if(db.update(id3))    
//				if(db.update(new Employee(id3,name3,birthday3,salary3))) 		//第二种写法
					System.out.println("**********修改成功!**********");
				else 
					System.out.println("**********修改失败!**********");
				break;
			case 4:
				System.out.println("**********输入要查询员工的编号**********");
				Scanner sc4=new Scanner(System.in);
				String id4=sc4.next();
				db.selectById(id4);
				break;
			case 5:
				System.out.println("**********显示所有**********");
				db.selectAll();
				break;
			default:    
				System.exit(0); 
				break;
			}//case结束
			System.out.println("**********请输入操作: 1:添加  2:删除  3:修改  4:查询  5:显示所有  6:退出**********");
			choice=sc.nextInt(); 
		}//while结束
		System.out.println("*****************退出系统*****************");        
		System.exit(0);
	}//main结束
	
	
	
	
	
}//类结束
