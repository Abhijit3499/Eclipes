package UserDefineException;


	public class UDE{
		public static void main(String[] args) {
			UserDefine u = new UserDefine();
			
			try {
				u.getResult("abhi b");
			}
			catch(NoDataFoundException v){
				System.out.println(v.getMessage());
			}
			
		}
	}


