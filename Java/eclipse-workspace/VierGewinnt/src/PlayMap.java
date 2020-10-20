
public class PlayMap {
	
	public static void initialGrid() {
			
		//Creating an InitialGrid as base
		String[][] initialGridArray = {	{" "," "," "," "," "," "},		//first Row
										{" "," "," "," "," "," "},		//second Row
										{" "," "," "," "," "," "},		//third Row
										{" "," "," "," "," "," "},		//fourth Row
										{" "," "," "," "," "," "},		//fifth Row
										{" "," "," "," "," "," "}};		//sixth Row
		
		//Set the RuntimeGrid = InitialGrid for the start
		String[][] runtimeGrid = initialGridArray;
		
		//printing RuntimeGrid
		System.out.println("  1 2 3 4 5 6"); 	//Row description
		System.out.println("+-------------+");	//TopBorder
		
		
		for(int i = 0; i < runtimeGrid.length; ++i) {
		 
			System.out.print("| ");		//LeftBorder
			for(int j = 0; j < runtimeGrid[i].length; ++j) {
				
				
				System.out.print(runtimeGrid[i][j] + " ");
				
				
			}
			
			System.out.print("|");		//RightBorder
			System.out.println();		//new line
			
		}
		System.out.println("+-------------+");	//BottomBorder
			
	}

}
