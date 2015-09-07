class SuperClass {
  static {
    System.out.println("SuperClass");
  }
  SuperClass() {
    System.out.println("SuperClass()");
  }
  public static void main(String[] args) {
    SubClass sc = new SubClass();
  }
}
class SubClass extends SuperClass {
  static {
    System.out.println("SubClass");
  }
  SubClass() {
    System.out.println("SubClass()");
  }
}
