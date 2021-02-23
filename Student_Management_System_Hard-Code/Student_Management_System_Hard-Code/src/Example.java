import java.util.*;
class Example{
//==================MAINMENUE=======================

public static void   mainmenue(String[]id,String []name,int []program,int []database){
Scanner input=new Scanner(System.in);
clearConsole();
System.out.println("\t---------------------------------------------------- ");
	System.out.println("\t|    WELCOME TO GDSE MARKS MANAGEMENT SYSTEM\t   |");
	System.out.println("\t----------------------------------------------------\n ");
	System.out.println("    ");
	System.out.println("[1] Add New Student\t\t\t[2] Add Student With Marks");
	System.out.println("[3] Add Marks\t\t\t\t[4] Update Student Details");
	System.out.println("[5] Update Marks\t\t\t[6] Delete Student");
	System.out.println("[7] Print Student Details\t\t[8] Print Student Rank");
	System.out.println("[9] Best in programming Fundamental\t[10] Best in DataBase Management System\n");
	System.out.print("Enter an option to continue >");
	final int option =input.nextInt();
	switch(option){
		case 1:AddNewStudent(id,name,program,database);break;
		case 2:AddStudentWithMarks(id,name,program,database);break;
		case 3:AddMarks(id,name,program,database);break;
		case 4:UpdateStudentDetails(id,name,program,database);break;
		case 5:UpdateMarks(id,name,program,database);break;
		case 6:DeleteStudent(id,name,program,database);break;
		case 7:PrintStudentDetails(id,name,program,database);break;
		case 8:PrintStudentRank(id,name,program,database);break;
		case 9:BestinprogrammingFundamental(id,name,program,database);break;
		case 10:BestinDataBaseManagementSystem(id,name,program,database);break;
		
		}
	}
//=====================================================
public final static void clearConsole() {
try {
final String os = System.getProperty("os.name");
if (os.contains("Windows")) {
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
} else {
System.out.print("\033[H\033[2J");
System.out.flush();
}
} catch (final Exception e) {
e.printStackTrace();
// Handle any exceptions.
}
}
public static int findNextIndex(String[] array){
int nextIndex=array.length;
for(int x=0;x<array.length;x++){
	if(array[x]==null){
	nextIndex=x;break;
	}
	}
	return nextIndex;
}
//=====================================================
	public static void AddNewStudent(String[]id,String []name,int program[],int[]database){
Scanner input=new Scanner(System.in);
clearConsole();
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t       ADD NEW STUDENT\t\t\t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
int index=findNextIndex(id);
int n=0;
String SID=null;
do{
	System.out.print("Enter Student ID : ");
  SID =input.nextLine();	
	for(int x=0;x<index;x++){
		if(id[x].equals(SID)){
			n=1;
			System.out.println(" ");
			System.out.println("This Student ID Already Exists.. ");
			break;}else{
				n=0;
				}
		}
	}while(n!=0);{
	int nextindex=findNextIndex(id);
		id[nextindex]=SID;
	System.out.print("Enter Student Name : ");
	name[nextindex]=input.nextLine();
		}
	command1(id,name,program,database);
}

public static void command1(String[]id,String []name,int[]program,int[]database){
	Scanner input=new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Student has been Add Successfully.Do you Want to Add New Student?(Y/N)");
		String command=input.nextLine();
		switch(command){
		case "Y":clearConsole();AddNewStudent(id,name,program,database);break;
		case"N":clearConsole();mainmenue(id,name,program,database);break;
	}
	
}
//=====================================================
public static void AddStudentWithMarks(String[]id,String []name,int []program,int []database){
Scanner input=new Scanner(System.in);
	clearConsole();
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t       ADD STUDENT WITH MARKS \t\t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
	int index=findNextIndex(id);
	int n=0;
	int nextindex=0;
	String SID=null;
do{
System.out.print("Enter Student ID : ");
  SID =input.nextLine();	
	for(int x=0;x<index;x++){
		if(id[x].equals(SID)){
			n=1;
			System.out.println(" ");
			System.out.println("This Student ID Already Exists.. ");
			break;}else{
				n=0;
				}
	}
	
}while(n!=0);{
		 nextindex=findNextIndex(id);
		id[nextindex]=SID;
		nextindex=findNextIndex(name);
		System.out.print("Enter Student Name : ");
		name[nextindex]=input.nextLine();
		}int m=0;
		int program_marks=0;
		do{
			System.out.print("Enter programming Fandamentals Marks :");
		    program_marks=input.nextInt();
			if(program_marks<0||program_marks>100){
				m=1;
			System.out.println("Invalid Marks,Please Enter Correct Marks");
				}else{ m=0;}
			}while(m!=0);{
				program[nextindex]=program_marks;
				}
				int num=0;
		int database1=0;
		do{
			System.out.print("Enter Database Management System Marks :");
			 database1=input.nextInt();
			if(database1<0||database1>100){
				num=1;
			System.out.println("Invalid Marks,Please Enter Correct Marks");
				}else{ num=0;}
			
			}while(num!=0);{
							
				database[nextindex]=database1;
				}
				command2(id,name,program,database);
	}
public static int findNextIndexMarks(int[] array){
int nextIndex=array.length;
for(int x=0;x<array.length;x++){
	if(array[x]==0){
	nextIndex=x;break;
	}
	}
	return nextIndex;
}
public static void command2(String[]id,String []name,int []program,int[]database){
	Scanner input=new Scanner(System.in);
	System.out.println(" ");
	System.out.print("Student has been Add Successfully.Do you Want to Add New Student(Y/N)");
	String command=input.nextLine();
	switch(command){
		case "Y":clearConsole();AddStudentWithMarks(id,name,program,database);break;
		case"N":clearConsole();mainmenue(id,name,program,database);break;
		}
	
	}
//=====================================================
public static void AddMarks(String[]id,String []name,int []program,int[]database){
	clearConsole();
	Scanner input=new Scanner(System.in);
	 String searchID=null;
	int temp=0;
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t             ADD MARKS \t\t\t\t     |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
	int num=0;
	int index=findNextIndex(id);
do{
System.out.print("Enter Student ID :");
	searchID=input.nextLine();
for(int x=0;x<index;x++){
	if(id[x].equals(searchID)){
		num=1;
		temp=x;
System.out.println(" Student Name   :"+name[temp]); 
checkmarksadd(id,name,program,database,temp);
addmarks(id,name,program,database);
		}else{
			num=0;

			}
				}
}while(num!=0);{
	System.out.println(" ");
	System.out.print("Invalid Student ID.Do you Want to Search Again?(Y/N) ");
String option =input.nextLine();
	switch (option){
		case "Y":AddMarks(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		
		}
	}
}
public static void addmarks(String[]id,String []name,int []program,int[]database){
	Scanner input=new Scanner(System.in);
	   int m=0;
		int program_marks=0;
		do{
			System.out.print("Enter Programming Fandamentals Marks :");
			 program_marks=input.nextInt();
			if(program_marks<0||program_marks>100){
				m=1;
			System.out.println("Invalid Marks,please Enter Correct Marks");
				}else{ m=0;}
			
			}while(m!=0);{
				int index1=findNextIndexMarks(program);
				program[index1]=program_marks;
				}
				
		int num1=0;
		int database1=0;
		do{
			System.out.print("Enter Database Management System Marks :");
			 database1=input.nextInt();
			if(database1<0||database1>100){
				num1=1;
			System.out.println("Invalid Marks,please Enter Correct Marks");
				}else{ num1=0;}
			
			}while(num1!=0);{
				
				int index2=findNextIndexMarks(database);
				database[index2]=database1;
				}
				command3(id,name,program,database);	
}
public static void command3(String[]id,String []name,int[]program,int[]database){
	Scanner input=new Scanner(System.in);
	System.out.println(" ");
	System.out.print("Marks have been Added Successfully.Do you Want to Add Marks for Another Student?(Y/N)");
	String command=input.nextLine();
	switch(command){
		case "Y":clearConsole();AddMarks(id,name,program,database);break;
		case"N":clearConsole();mainmenue(id,name,program,database);break;
		}
	
	}
public static void checkmarksadd(String[]id,String []name,int []program,int[]database,int temp){
Scanner input=new Scanner(System.in);
	String command=null;
	if(program[temp]>0&&0<database[temp]){
	System.out.println(" ");
	System.out.println("This Student Marks Already Added.");
	System.out.println("If you Want to Update the Marks,please use[4] Update Marks Option\n");
	System.out.print("Do you Want to Add Marka for Anothr Student?(Y/N)");
	 command=input.nextLine();
	switch(command){
		case "Y":clearConsole();AddMarks(id,name,program,database);
		case"N":clearConsole();mainmenue(id,name,program,database);
		}
		}
}
//=====================================================

public static void UpdateStudentDetails(String[]id,String []name,int []program,int []database){
	Scanner input=new Scanner(System.in);
    clearConsole();
     String searchID=null;
	int temp=0;
	int num=0;
	int index=findNextIndex(id);
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t       UPDATE STUDENT DETAILS\t\t\t     |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
	do{
System.out.print("Enter Student ID :");
	searchID=input.nextLine();
for(int x=0;x<index;x++){
	if(id[x].equals(searchID)){
		num=1;
		temp=x;
System.out.println("Student Name :"+name[temp]); 
System.out.print("Enter the new Student Name :");
String newname=input.nextLine();
name[temp]=newname;
System.out.println(" ");
System.out.print("Student Details has been Updated Successfully.");
System.out.print("Do you Want to Update Another Student Details?(Y/N)");
String command=input.nextLine();
switch (command){
		case "Y":UpdateStudentDetails(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		
		}


		}else{
			num=0;

			}
	
	}
}while(num!=0);{
	System.out.println(" ");
	System.out.print("Invalid Student ID.Do you Want to Search Again?(Y/N) ");
String option =input.nextLine();
	switch (option){
		case "Y":UpdateStudentDetails(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		
		}
	}
		
	}
//=====================================================
public static void UpdateMarks(String[]id,String []name,int []program,int[]database){
	clearConsole();
	Scanner input=new Scanner(System.in);
	 String searchID=null;
	int temp=0;
	int num=0;
	int index=findNextIndex(id);
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t             UPDATE MARKS\t\t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
	do{
System.out.print("Enter Student ID :");
	searchID=input.nextLine();
for(int x=0;x<index;x++){
	if(id[x].equals(searchID)){
		num=1;
		temp=x;
System.out.println("Enter Student Name       :"+name[temp]);
checkmarks(id,name,program,database,temp);
System.out.println(" ");
System.out.print("Marks have been Updata Successfully.\nDo you Want to update Marks for Another Student?(Y/N)");
String command=input.nextLine();
switch (command){ 
		case "Y":UpdateMarks(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		}

		}else{
			num=0;

			}
	}
}while(num!=0);{
	System.out.println(" ");
	System.out.print("Invalid Student ID.Do you Want to Search Again?(Y/N) ");
String option =input.nextLine();
	switch (option){
		case "Y":UpdateMarks(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		
		}
	}
	
}

public static void checkmarks(String[]id,String []name,int []program,int[]database,int temp){
	Scanner input=new Scanner(System.in);
	   int number=0;
		do{
			if(program[temp]==0&&database[temp]==0){
				number=1;
			System.out.println(" ");
			System.out.println("This student's marks not yet to be added.");
			System.out.print("Do you Want to Update Marka of  Anothr Student?(Y/N)");
			String  command=input.nextLine();
			switch(command){
			case "Y":clearConsole();UpdateMarks(id,name,program,database);
			case"N":clearConsole();mainmenue(id,name,program,database);
		}
				}else{ number=0;}
			
			}while(number!=0);{
	System.out.println(" Programming Fandamentals Marks       :"+program[temp]);
	System.out.println("Database Management System Marks      :"+database[temp]);
				
			}
	   int m=0;
		int program_marks=0;
		do{
			System.out.print("Enter Programming Fandamentals Marks :");
			 program_marks=input.nextInt();
			if(program_marks<0||program_marks>100){
				m=1;
			System.out.println("Invalid Marks,please Enter Correct Marks");
				}else{ m=0;}
			
			}while(m!=0);{
				program[temp]=program_marks;
				}
				
		int num1=0;
		int database_marks=0;
		do{
			System.out.print("Enter Database Management System Marks :");
			 database_marks=input.nextInt();
			if(database_marks<0||database_marks>100){
				num1=1;
			System.out.println("Invalid Marks,please Enter Correct Marks");
				}else{ num1=0;}
			
			}while(num1!=0);{
					database[temp]=database_marks;
				}
}
//=====================================================
public static void DeleteStudent(String[]id,String []name,int []program,int[]database){
	Scanner input=new Scanner(System.in);
	clearConsole();
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t             DELETE STUDENT  \t\t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
	 String searchID=null;
	 int index=findNextIndex(id);
	int num=0;
int temp=0;
		do{
System.out.print("Enter Student ID :");
searchID=input.nextLine();
for(int x=0;x<index;x++){
	if(id[x].equals(searchID)){
		num=1;
		temp=x;
		deletestudent(id,name,program,database,temp);
System.out.println(" ");
System.out.print("Student has been Delete Successfully.\nDo you Want to Delete Another Student?(Y/N) ");
String command=input.nextLine();
switch (command){ 
		case "Y":DeleteStudent(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		}
		}else{
			num=0;
			}
	}
}while(num!=0);{
	System.out.println(" ");
	System.out.print("Invalid Student ID.Do you Want to Search Again?(Y/N) ");
String option =input.nextLine();
	switch (option){
		case "Y":DeleteStudent(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		
		}
	}
	
	}
public static void  deletestudent(String[]id,String []name,int []program,int[]database,int temp){
		 int index=findNextIndex(id);
		for(int i=temp; i<index;i++){
				id[i]=id[i+1];
				name[i]=name[i+1];
				program[i]=program[i+1];
				database[i]=database[i+1];
			}
		index--;	
		}
//=====================================================
public static void PrintStudentDetails(String[]id,String []name,int []program,int[]database){
	Scanner input=new Scanner(System.in);
clearConsole();
int num=0;
int temp=0;
double xr=2.00;
String searchID=null;
int index=findNextIndex(id);
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t       Print Student Details     \t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
		do{
System.out.print("Enter Student ID :");
	searchID=input.nextLine();
	
for(int x=0;x<index;x++){
	if(id[x].equals(searchID)){
		num=1;
		temp=x;
	System.out.println("Student Name :"+name[temp]);
	Markscheckadded(id,name,program,database,temp);

	System.out.println("+---------------------------------+-----------------------------------+");
	System.out.println("|Programming Fundamentals Marks   |\t\t\t\t    "+program[temp]+"|");
	System.out.println("|Database Managment System Marks  |\t\t\t\t    "+database[temp]+"|");
	System.out.println("|Total Marks 			  |\t\t\t\t    "        +(program[temp]+database[temp])+"|");
	System.out.println("|Average Marks                    |\t\t\t\t  "+((program[temp]+database[temp])/xr)+"|");
	System.out.println("|Total. Marks      		  | \t\t\t\t"	+(program[temp]+database[temp])+" |");
	System.out.println("|Rank                             |\t\t\t\t "+"   |");
	System.out.println("+---------------------------------+-----------------------------------+");
System.out.print("Do you Want to Search Another Student Detais?(Y/N)");	
String option =input.nextLine();
switch (option){ 
		case "Y":PrintStudentDetails(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		}

		}else{
			num=0;

			}
	}
}while(num!=0);{
	System.out.println(" ");
	System.out.print("Invalid Student ID.Do You Want to Search Again?(Y/N) ");
String option =input.nextLine();
	switch (option){
		case "Y":PrintStudentDetails(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		
		}
	}

		}
public static void Markscheckadded(String[]id,String []name,int []program,int[]database,int temp){
Scanner input=new Scanner(System.in);
String command=null;
	if(program[temp]==0&&0==database[temp]){
	System.out.println(" ");
	System.out.println("THIS Student Marks Not Added. ");
	System.out.print("Do You Want to Search Again?(Y/N) ");
	System.out.print("Do you Want to Search Again?(Y/N) ");
	String option =input.nextLine();
	switch (option){
		case "Y":PrintStudentDetails(id,name,program,database);
		case "N":clearConsole();mainmenue(id,name,program,database);
		
		}
		}	

	
	
	
	}
//=====================================================
public static void PrintStudentRank(String[]id,String []name,int []program,int[]database){
	Scanner input=new Scanner(System.in);
clearConsole();
double d=2.00;
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\t       Print Student Ranks\t\t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");
	int index=findNextIndex(id);	
	System.out.println("+---------------------------------------------------------------------+");
	System.out.println("|Rank    |   ID      |    Name      |    Total Marks    |    Avg.Marks|");	
	System.out.println("+---------------------------------------------------------------------+");
	for(int x=0;x<index;x++){
	
	System.out.print("  "+(x+1)+" \t\t"+id[x]+"\t"+name[x]+"\t\t"+(program[x]+database[x])+"\t\t  "+((program[x]+database[x])/d)+"\n");
		}
		
	System.out.println("+---------------------------------------------------------------------+");	
		System.out.println(" ");
		System.out.print("Do you Want to Go Back to Main Menu?(Y/N):");
		String option=input.nextLine();
		switch(option){
			case "Y":clearConsole();mainmenue(id,name,program,database);
			case"N":PrintStudentRank(id,name,program,database);
			
			}

}


//=====================================================
public static void BestinprogrammingFundamental(String[]id,String []name,int []program,int[]database){
Scanner input=new Scanner(System.in);
clearConsole();
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");		
	System.out.println("+---------------------------------------------------------------------+");
	System.out.println("|     ID    |   Name        |    PF marks      |    DBMS Marks        |");	
	System.out.println("+---------------------------------------------------------------------+");	
				int index=findNextIndex(id);
				//int index=findNextIndexMarks(database);
				
		for(int i=0; i<index; i++){
		System.out.print("\t"+id[i]+"\t"+name[i]+"\t\t"+program[i]+"\t\t\t"+database[i]+"\n");	
		}
	System.out.println("+---------------------------------------------------------------------+");
	System.out.println(" ");
	System.out.print("Do you Want to Go Back to Main Menu?(Y/N):");
		String option=input.nextLine();
		switch(option){
			case "Y":clearConsole();mainmenue(id,name,program,database);
			case"N":BestinprogrammingFundamental(id,name,program,database);
		}
	}
	
//=====================================================
public static void BestinDataBaseManagementSystem(String[]id,String []name,int []program,int[]database){
Scanner input=new Scanner(System.in);
clearConsole();
	System.out.println("---------------------------------------------------------------------");
	System.out.println("|\t\tBEST IN DATABASE MANAGEMENT SYSTEM  \t\t    |");
	System.out.println("---------------------------------------------------------------------");
	System.out.println("   ");		
	int index=findNextIndex(id);
	System.out.println("+---------------------------------------------------------------------+");
	System.out.println("|     ID    |   Name        |    PF marks      |    DBMS Marks        |");	
	System.out.println("+---------------------------------------------------------------------+");		
	for(int i=0; i<index; i++){
		System.out.print("\t"+id[i]+"\t"+name[i]+"\t\t"+program[i]+"\t\t\t"+database[i]+"\n");		
		}
	System.out.println("+---------------------------------------------------------------------+");
	
	System.out.println(" ");
	System.out.print("Do you Want to Go Back to Main Menu?(Y/N):");
		String option=input.nextLine();
		switch(option){
			case "Y":clearConsole();mainmenue(id,name,program,database);
			case "N":BestinDataBaseManagementSystem(id,name,program,database);
		}
	}
//=====================================================
public static void main(String args[]){
Scanner input =new Scanner(System.in);
	System.out.print("[]");
	String heading=input.nextLine();
	String id[]=new String[1000];
	String name[]=new String[id.length];
	int program[]=new int[id.length];
	int database[]=new int[id.length];
	mainmenue(id,name,program,database);

}
}






	
