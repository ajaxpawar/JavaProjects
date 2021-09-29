import java.util.*;
public class MySolution {
	static Integer numberOfBlocks;
	public Character[] blocksOrder=new Character[numberOfBlocks];
	public MySolution() {
		setBlockOrder();
		if(checkOrder(blocksOrder)) {
			System.out.println("Blocks are akready in order  !");
		}
		else {
			Character[] tempPosition=new Character[numberOfBlocks];
			for(int i=0;i<(blocksOrder.length);i++) {
				System.out.println(blocksOrder[i]+"  move on the table");
				tempPosition[i]=blocksOrder[i];
				blocksOrder[i]=' ';
			}
			//System.out.println(blocksOrder[(blocksOrder.length)-1]+"  is on the table");
			//tempPosition[numberOfBlocks-1]=blocksOrder[numberOfBlocks-1];
			//blocksOrder[numberOfBlocks-1]=' ';

			char temp=(char)(65+numberOfBlocks-1);
		/*	System.out.println("blockorde:");
			printOrder(blocksOrder);
			System.out.println("TempOrde: :");
			printOrder(tempPosition);*/
			//System.out.println("temp="+temp);
			//blocksOrder[(blocksOrder.length)-1]=' ';
			for (int i=numberOfBlocks-1;i>=0;i--) {
					
					for(int j=0;j<tempPosition.length;j++) {
						if(tempPosition[j]==temp) {
							blocksOrder[i]=tempPosition[j];
							
							tempPosition[j]=' ';
						}
					}
				
				temp--;
				printOrder(blocksOrder);
			}
		}	
	}
	boolean checkOrder(Character[] blocksOrder2) {
		char temp='A';
		for(int i=0;i<blocksOrder.length;i++) {
			if(blocksOrder[i]!=temp) {
				return false;
			}
			temp++;
		}
		return true;
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
			if(i==list.length-1) {
				System.out.println(list[i]+" move on the table");
			}
			if(list[i]!=' ' && i!=list.length-1) {
				System.out.println(list[i]+" move on the "+list[i+1]);
			}
			//System.out.println("|");
		}
		System.out.println("++++++++++TABLE+++++++++++");
	}
	public static void main(String[] args) {
		numberOfBlocks=getNumberOfBlocks();
		MySolution obj=new MySolution();

	}

}
