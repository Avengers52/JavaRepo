import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[]rows = new HashSet[9];
        HashSet<Character>[]cols = new HashSet[9];
        HashSet<Character>[]box = new HashSet[9];

        for(int i = 0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){

                char val = board[i][j];
                if(val == '.') continue;
                int boxIndex = (i/3)*3 + (j/3);

                if(rows[i].contains(val) || cols[j].contains(val) || box[boxIndex].contains(val)){
                    return false;
                }

                rows[i].add(val);
                cols[j].add(val);
                box[boxIndex].add(val);
            }
        }
        return true;
        
    }
    
}
