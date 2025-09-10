class Solution {
    public int maxBottlesDrunk(int full, int exc) {
        int drunk=full;
        int empty=full;
        
        while(empty>=exc){
            
            empty-=exc;
            exc++;
            drunk+=1;
            empty++;
            
            

            

            }
            return drunk;
        }

    }
