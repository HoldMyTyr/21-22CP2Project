public class board{

    	/**
    	*@Author Maximilian C. Sutton
    	*@Version 0.01
    	*@Since 2020-12-09
    	*/

	static String[][] board = new String[8][3];

	static public void popBoard() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 3; j++){
				//first fill with empty str
				board[i][j] = " ";
			}
		}
	}

	static public void genBoard(){

	}

	static public void reDraw(){
		
	}
}