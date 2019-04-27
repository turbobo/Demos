package yuangong;

/*数组形式  员工管理系统

 * 
 */

import java.util.Scanner;

public class yuangongguanli{                     
	public static void main(String[] args){
		String[][] emps=new String[10][];
		int num=0;    //全局变量  员工数量
	  	System.out.println("******************************************员工管理系统v1.0******************************************");
		System.out.println("**********请输入操作： 1：添加  2：删除  3：修改  4：查询  5：显示所有  6：退出**********");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();      //输入数字
		while(choice<6){
			switch(choice){
				case 1:
					add(emps,num);
					num++;
					break;    
				case 2: 
					System.out.println("**********请输入删除员工的编号：*************");
					String id=sc.next();
					delete(emps,id);
					//num--;  num不能减一  否则 下次添加员工时会少一位
					break;
				case 3:
					//int n=3;
					System.out.println("*****************修改员工：*****************");        
					update(emps);
					break;
				case 4:
					System.out.println("*****************查找员工：*****************");        
					search(emps);
					break;
				case 5:
					System.out.println("**************显示所有员工：****************");        
					select(emps);
					System.out.println();
					break;
				default:    
					System.exit(0); 
					break;

			 }              // switch结束
			//System.out.println();
			System.out.println("**********请输入操作： 1：添加  2：删除  3：修改  4：查询  5：显示所有  6：退出**********");
			choice = sc.nextInt();                   //继续输入选择！！！！！！！！！！！！！！！！！！！

		}    //while结束
		System.out.println("*****************退出系统*****************");        
		System.exit(0);
		
	}          //main函数结束

	public static void add(String[][] emps,int n){
		//String[] temp={Math.round(Math.random()*1000)+"","一号","21","11000"};     产生0-1000之间的随机数
		Scanner sc=new Scanner(System.in);
		System.out.println("**********请输入添加员工的编号：**********");
		String id=sc.next();
		System.out.println("**********请输入添加员工的姓名：**********");
		String name=sc.next();
		System.out.println("**********请输入添加员工的年龄：**********");
		String age=sc.next();
		System.out.println("**********请输入添加员工的薪资：**********");
		String salary=sc.next();
		String[] temp={id,name,age,salary};            //将四个信息放到临时一维字符串数组中
		emps[n]=temp;
		System.out.println("*****************已添加员工！*****************"); 
	}

	public static void delete(String[][] emps,String id){              	//根据编号删除员工信息
	       	int i;
		for(i=0;i<emps.length;i++)
			if(emps[i]!=null)                         	   	//判断员工是否存在
				if(emps[i][0].equals(id)) {             	//判断id与emps[i][0]是否相等
					emps[i]=null;  
					System.out.println("**********删除成功！**********");
					break;
				}	
		if(i==emps.length)	   System.out.println("**********该员工不存在!**********");	   //找到最后都没有匹配的员工		
	}

	public static void update(String[][] emps){        			//根据编号给员工修改信息
		Scanner sc=new Scanner(System.in);
		System.out.println("**********请输入修改员工的编号：**********");
		String id=sc.next();
		int i;
		for(i=0;i<emps.length;i++)
			if(emps[i]!=null)                         	   	//判断员工是否存在
				if(emps[i][0].equals(id))           	//判断id与emps[i][0]是否相等
					break;
		if(i==emps.length)	  System.out.println("该员工不存在：");	
		else{
		System.out.println("**********请输入员工的姓名：**********");
		String name=sc.next();
		System.out.println("**********请输入员工的年龄：**********");
		String age=sc.next();
		System.out.println("**********请输入员工的薪资：**********");
		String salary=sc.next();
		String[] temp={id,name,age,salary};     		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	       	for(i=0;i<emps.length;i++)
			if(emps[i]!=null)                        	//判断员工是否存在!!!!!!!!!!!!!!!!!!!!!!!!!!!
				if(emps[i][0].equals(id)){         //判断id与emps[i][0]是否相等!!!!!!!!!!!!!!!!!!!!!!!
					emps[i]=temp; 
					break;                      //只要修改一个员工，修改后即可跳出循环****************************
				} 
		}
		System.out.println("*****************已修改员工！*****************");
	}

	public static void search(String[][] emps){
		System.out.println("**********根据编号查询，请输入编号：**********");
		Scanner sc=new Scanner(System.in);                  //每次输入时都要用Scanner sc=new Scanner(System.in);!!!!!!!!!!!!!!!!!!!!!!!!
		String id=sc.next();
		int i;
		System.out.println("员工编号   员工名称   员工年龄   员工薪资");
		for(i=0;i<emps.length;i++)
			if(emps[i]!=null)
				if(emps[i][0].equals(id)){
					for(int j=0;j<emps[i].length;j++)
						System.out.print(emps[i][j]+"    ");
					System.out.println();
					System.out.println("*****************查找成功！*****************");   
					break;                           //只要输出一个员工，找到后即可跳出循环
				}
		if(i==emps.length)	  System.out.println("**********该员工不存在!**********");	
	}

	public static void select(String[][] emps){
		System.out.println("员工编号   员工名称   员工年龄   员工薪资");	
		for(int i=0;i<emps.length;i++)
			if(emps[i]!=null){
				for(int j=0;j<emps[i].length;j++)
					System.out.print(emps[i][j]+"     ");
				System.out.println();                //输完一个员工信息即换行
				}

	}


}