package cn.hd.employee;


/*员工类
 * 
 */

public class Employee {
	private String sid;			//封装属性,但要向外提供修改的接口
	private String sname;
	private String birthday;
	private String salary;
	
	public Employee(){					//默认无参构造函数
		
	}
	

	
	public Employee(String sid, String sname, String birthday, String salary) {			//将四个信息赋值到新创建对象中
		super();
		this.sid = sid;					//给当前对象赋值
		this.sname = sname;
		this.birthday = birthday;
		this.salary = salary;
	}






	public String getSid() {		//封装的接口
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	

}
