class TestBugF2 {
    public static void main(String[] a) {
	System.out.println(new Test().xy());
    }
}

//
class Test {

    public boolean xy(){
		boolean result;
		boolean x = true;
		boolean y = false;
		boolean result = x || y;
		x = false;
		boolean result = x || y;
	}
	return result;
    }

}
