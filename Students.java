package multi.override;

public class Students {
	
     public void getStudentInfo(int id) {
    	 System.out.println(id);
     }
     public void getStudentInfo(int id, String name) {
    	 System.out.println(name);
    	 System.out.println(id);
     }
     public void getStudentInfo(String email, int phonenumber) {
    	 System.out.println(email);
    	 System.out.println(phonenumber);
     }
     public static void main(String[] args) {
    	 Students st = new Students();
    	 st.getStudentInfo(1234);
    	 st.getStudentInfo(1234, "rose");
    	 st.getStudentInfo("rose@gmail.com", 1234567890);
    	 
		
	}
}
