class TestBugF3 {
    public static void main(String[] a) {
	System.out.println(new Test().xy());
    }
}

//
class Test {

    public boolean xy(){
		boolean result;
		boolean x = false;
		boolean y = true;
		boolean result = x || y;
	}
	return result;
    }

}
