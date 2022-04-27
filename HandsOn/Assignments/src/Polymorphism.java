
class Hospital {

  public void patients() {
    System.out.println("Parent");
  }
}

class Ivy extends Hospital {

  public void patients() {
    System.out.println("Ivy 200");
  }
}

class Apollo extends Hospital {

  public void patients() {
    System.out.println("Apollo 400");
  }
}
class Sahyadri extends Hospital {

	  public void patients() {
	    System.out.println("Sahyadri 600");
	  }
	}
class Polymorphism{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ivy ob1 = new Ivy();
		ob1.patients();
		
		Apollo ob2 = new Apollo();
		ob2.patients();
		
		Sahyadri ob3 = new Sahyadri();
		ob3.patients();

	}
}
