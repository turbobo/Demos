package cn.hd.employee;


/*Ա����
 * 
 */

public class Employee {
	private String sid;			//��װ����,��Ҫ�����ṩ�޸ĵĽӿ�
	private String sname;
	private String birthday;
	private String salary;
	
	public Employee(){					//Ĭ���޲ι��캯��
		
	}
	

	
	public Employee(String sid, String sname, String birthday, String salary) {			//���ĸ���Ϣ��ֵ���´���������
		super();
		this.sid = sid;					//����ǰ����ֵ
		this.sname = sname;
		this.birthday = birthday;
		this.salary = salary;
	}






	public String getSid() {		//��װ�Ľӿ�
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
