class Solution {
    private static boolean[] visited;
    private static int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;

        for(int i = 0; i < dungeons.length; i++){
            visited = new boolean[dungeons.length];
            visited[i] = true;
            recursive(1, 1, i, k, dungeons); // [80, 20]
        }
        
        return max;
    }
    
    public void recursive(int depth, int sum, int index, int fatigue, int[][] dungeons){     
        int leastFatigue = dungeons[index][0]; // 최소 피로도 80
        int consumeFatigue = dungeons[index][1]; // 소모 피로도 20
        
        if(fatigue < leastFatigue){ // 현재 피로도가 최소 피로도보다 작을 때
            return;
        }
        
        max = Math.max(max, sum); // max = 1, sum = 1
        
        if(depth == dungeons.length){
            return;
        }
        
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i]){
                visited[i] = true;
                recursive(depth + 1, sum + 1, i, fatigue - consumeFatigue, dungeons);
                visited[i] = false;
            }
        }
    }
}