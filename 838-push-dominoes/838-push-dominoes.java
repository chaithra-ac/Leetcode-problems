class Solution {
    public String pushDominoes(String dominoes) {

        char[] chars = dominoes.toCharArray();
        int length = chars.length;
        int force  = 0;
        int[] forces = new int[length];

        for(int i = 0; i < chars.length; i++){

            if(chars[i] == 'R'){
                force = length;
                forces[i] = length;
            } else if(chars[i] == 'L'){
                force = 0;
                forces[i] = 0;
            } else{
                if(force != 0){
                    --force;
                    forces[i] = force;
                }
            }
        }

        for( int i = length - 1; i >= 0; i--){

            if(chars[i] == 'L'){
                force = length;
                forces[i] -= force;
            } else if(chars[i] == 'R'){
                force = 0;
            } else{
                if(force != 0){
                    --force;
                    forces[i] -= force;
                }
            }
            chars[i] = forces[i] >= 0  ? (forces[i] > 0 ? 'R' : '.') : 'L';
        }
        return new String(chars);
    }

}