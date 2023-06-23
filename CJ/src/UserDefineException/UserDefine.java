package UserDefineException;

  class UserDefine {

	public void getResult(String a) throws NoDataFoundException {
		int position = -1;
		String name[]= {"abhi","yash","pranav","niraj"};
		for(int b= 0;b<name.length;b++) {
			if(name[b].equals(a)) {
				position = b;
				System.out.println("Position : "+position);
				break;
			}	
		}
		if(position==-1) {
			NoDataFoundException v = new NoDataFoundException("No Data found");
			throw v;
		}
		

}
  }
