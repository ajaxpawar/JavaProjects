import java.util.*;
public class MySolution {
	static Integer numberOfBlocks;
	public Character[] blocksOrder=new Character[numberOfBlocks];
	public MySolution() {
		setBlockOrder();
		printOrder(blocksOrder);
		char temp='A';
		char temp2;
		for(int i=0;i<blocksOrder.length;i++) {
			if(blocksOrder[i]!=temp) {
				for(int j=i+1;j<blocksOrder.length;j++) {
					if(blocksOrder[j]==temp) {
						temp2=blocksOrder[i];
						blocksOrder[i]=blocksOrder[j];
						blocksOrder[j]=temp2;
					}
				}
			}
			temp++;
			System.out.println("+++++++++++++ ");
			printOrder(blocksOrder);
			System.out.println("+++++++++++++ ");

		}
		
	}
	static int getNumberOfBlocks() {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Enter Numbers of Blocks: ");
		return (scan.nextInt());
	}
	public void setBlockOrder() {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<numberOfBlocks;i++) {
			System.out.print("Enter  Block: ");
			blocksOrder[i]=Character.toUpperCase(scan.next().charAt(0));
		}
	}
	public void printOrder(Character[] list) {
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
			System.out.println("|");
		}
	}
	public static void main(String[] args) {
		numberOfBlocks=getNumberOfBlocks();
		MySolution obj=new MySolution();

	}

}
