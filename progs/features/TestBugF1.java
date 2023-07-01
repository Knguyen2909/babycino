class TestBugF1 {
    public static void main(String[] a) {
	System.out.println(new Test().xy());
    }
}

//if returns a type error on compilation, || does not allow ORing integers
class Test {

    public boolean xy(){
		boolean result;
		int x = 1;
		int y = 2;
		boolean result = x || y;
	}
	return result;
    }


