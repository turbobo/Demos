package yuangong;

/*������ʽ  Ա������ϵͳ

 * 
 */

import java.util.Scanner;

public class yuangongguanli{                     
	public static void main(String[] args){
		String[][] emps=new String[10][];
		int num=0;    //ȫ�ֱ���  Ա������
	  	System.out.println("******************************************Ա������ϵͳv1.0******************************************");
		System.out.println("**********����������� 1�����  2��ɾ��  3���޸�  4����ѯ  5����ʾ����  6���˳�**********");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();      //��������
		while(choice<6){
			switch(choice){
				case 1:
					add(emps,num);
					num++;
					break;    
				case 2: 
					System.out.println("**********������ɾ��Ա���ı�ţ�*************");
					String id=sc.next();
					delete(emps,id);
					//num--;  num���ܼ�һ  ���� �´����Ա��ʱ����һλ
					break;
				case 3:
					//int n=3;
					System.out.println("*****************�޸�Ա����*****************");        
					update(emps);
					break;
				case 4:
					System.out.println("*****************����Ա����*****************");        
					search(emps);
					break;
				case 5:
					System.out.println("**************��ʾ����Ա����****************");        
					select(emps);
					System.out.println();
					break;
				default:    
					System.exit(0); 
					break;

			 }              // switch����
			//System.out.println();
			System.out.println("**********����������� 1�����  2��ɾ��  3���޸�  4����ѯ  5����ʾ����  6���˳�**********");
			choice = sc.nextInt();                   //��������ѡ�񣡣�����������������������������������

		}    //while����
		System.out.println("*****************�˳�ϵͳ*****************");        
		System.exit(0);
		
	}          //main��������

	public static void add(String[][] emps,int n){
		//String[] temp={Math.round(Math.random()*1000)+"","һ��","21","11000"};     ����0-1000֮��������
		Scanner sc=new Scanner(System.in);
		System.out.println("**********���������Ա���ı�ţ�**********");
		String id=sc.next();
		System.out.println("**********���������Ա����������**********");
		String name=sc.next();
		System.out.println("**********���������Ա�������䣺**********");
		String age=sc.next();
		System.out.println("**********���������Ա����н�ʣ�**********");
		String salary=sc.next();
		String[] temp={id,name,age,salary};            //���ĸ���Ϣ�ŵ���ʱһά�ַ���������
		emps[n]=temp;
		System.out.println("*****************�����Ա����*****************"); 
	}

	public static void delete(String[][] emps,String id){              	//���ݱ��ɾ��Ա����Ϣ
	       	int i;
		for(i=0;i<emps.length;i++)
			if(emps[i]!=null)                         	   	//�ж�Ա���Ƿ����
				if(emps[i][0].equals(id)) {             	//�ж�id��emps[i][0]�Ƿ����
					emps[i]=null;  
					System.out.println("**********ɾ���ɹ���**********");
					break;
				}	
		if(i==emps.length)	   System.out.println("**********��Ա��������!**********");	   //�ҵ����û��ƥ���Ա��		
	}

	public static void update(String[][] emps){        			//���ݱ�Ÿ�Ա���޸���Ϣ
		Scanner sc=new Scanner(System.in);
		System.out.println("**********�������޸�Ա���ı�ţ�**********");
		String id=sc.next();
		int i;
		for(i=0;i<emps.length;i++)
			if(emps[i]!=null)                         	   	//�ж�Ա���Ƿ����
				if(emps[i][0].equals(id))           	//�ж�id��emps[i][0]�Ƿ����
					break;
		if(i==emps.length)	  System.out.println("��Ա�������ڣ�");	
		else{
		System.out.println("**********������Ա����������**********");
		String name=sc.next();
		System.out.println("**********������Ա�������䣺**********");
		String age=sc.next();
		System.out.println("**********������Ա����н�ʣ�**********");
		String salary=sc.next();
		String[] temp={id,name,age,salary};     		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	       	for(i=0;i<emps.length;i++)
			if(emps[i]!=null)                        	//�ж�Ա���Ƿ����!!!!!!!!!!!!!!!!!!!!!!!!!!!
				if(emps[i][0].equals(id)){         //�ж�id��emps[i][0]�Ƿ����!!!!!!!!!!!!!!!!!!!!!!!
					emps[i]=temp; 
					break;                      //ֻҪ�޸�һ��Ա�����޸ĺ󼴿�����ѭ��****************************
				} 
		}
		System.out.println("*****************���޸�Ա����*****************");
	}

	public static void search(String[][] emps){
		System.out.println("**********���ݱ�Ų�ѯ���������ţ�**********");
		Scanner sc=new Scanner(System.in);                  //ÿ������ʱ��Ҫ��Scanner sc=new Scanner(System.in);!!!!!!!!!!!!!!!!!!!!!!!!
		String id=sc.next();
		int i;
		System.out.println("Ա�����   Ա������   Ա������   Ա��н��");
		for(i=0;i<emps.length;i++)
			if(emps[i]!=null)
				if(emps[i][0].equals(id)){
					for(int j=0;j<emps[i].length;j++)
						System.out.print(emps[i][j]+"    ");
					System.out.println();
					System.out.println("*****************���ҳɹ���*****************");   
					break;                           //ֻҪ���һ��Ա�����ҵ��󼴿�����ѭ��
				}
		if(i==emps.length)	  System.out.println("**********��Ա��������!**********");	
	}

	public static void select(String[][] emps){
		System.out.println("Ա�����   Ա������   Ա������   Ա��н��");	
		for(int i=0;i<emps.length;i++)
			if(emps[i]!=null){
				for(int j=0;j<emps[i].length;j++)
					System.out.print(emps[i][j]+"     ");
				System.out.println();                //����һ��Ա����Ϣ������
				}

	}


}