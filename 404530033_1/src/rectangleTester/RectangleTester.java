package rectangleTester;
import java.util.Scanner;

public class RectangleTester {
	int X,Y,Width,Height;
    void Rectangle(int _Height,int _Width,int _X,int _Y){
    this.Height = _Height;
    this.Width = _Width;
    this.X = _X;
    this.Y = _Y;
        }
    int getHeight(){
    	return this.Height;
    }
    int getWidth(){
    	return this.Width;
    }
    int getX(){
    	return this.X;
    }
    int getY(){
    	return this.Y;
    }
    int Area(){
    	return Width*Height;
    }
    int Perimeter(){
    	return (Width+Height)*2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Rectangle #1\n enter the Height:");
        int height1 = in.nextInt();
        System.out.print("enter the Width:");
        int width1 = in.nextInt();
        System.out.print("enter X:");
        int x1 = in.nextInt();
        System.out.print("enter Y:");
        int y1 = in.nextInt();
        int area1 = width1*height1;
        int perimeter1 = (width1+height1)*2;
        System.out.println("java.rectangle[X="+x1+",Y="+y1+",Width="+width1+",Height="+height1+"]");
        System.out.println("Area="+area1);
        System.out.println("Perimeter="+perimeter1);
        System.out.println();
        
        System.out.print("Rectangle #2\n enter the Height:");
        int height2 = in.nextInt();
        System.out.print("enter the Width:");
        int width2 = in.nextInt();
        System.out.print("enter X:");
        int x2 = in.nextInt();
        System.out.print("enter Y:");
        int y2 = in.nextInt();
        
        int area2 = width2*height2;
        int perimeter2 = (width2+height2)*2;
        System.out.println("java.rectangle[X="+x2+",Y="+y2+",Width="+width2+",Height="+height2+"]");
        System.out.println("Area="+area2);
        System.out.println("Perimeter="+perimeter2);
        
	}

}
