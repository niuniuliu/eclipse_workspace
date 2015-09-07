package d01;

public class Test5 {
	public static void main(String arg[]) {
		int i1 = 123;
		int i2 = 456;
		double d1 = (i1 + i2) * 1.2;// 系统锟斤拷转锟斤拷为double锟斤拷锟斤拷锟斤拷
		float f1 = (float) ((i1 + i2) * 1.2);// 锟斤拷要锟斤拷强锟斤拷转锟斤拷锟斤拷
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte) (b1 + b2);// 系统锟斤拷转锟斤拷为int锟斤拷锟斤拷锟姐，锟斤拷
									// 要强锟斤拷转锟斤拷锟斤拷
		double d2 = 1e200;
//		float f2 = (float) d2;// 锟斤拷锟斤拷锟斤拷锟斤拷
		double f2 = (double) d2;
		float f4 = (float) d2;
		System.out.println(f4);
		System.out.println(f2);
		
		float f3 = 1.23f;// 锟斤拷锟斤拷锟絝
		long l1 = 123;
		long l2 = 30000000000l;// 锟斤拷锟斤拷锟絣
		float f = l1 + l2 + f3;// 系统锟斤拷转锟斤拷为float锟酵硷拷锟斤拷
		long l = (long) f;// 强锟斤拷转锟斤拷锟斤拷锟斤拷去小锟斤拷锟?
		
		System.out.println(f);
		System.out.println(l);
	}
}
