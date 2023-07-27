/*
    요구사항
    1. 선택된 값을 기준으로 4방면으로 순회하며 이동한 곳에서 X일 경우 더 이상 볼 필요가 없다.(맨허튼 거리 1)
    2. 만약 맨허튼 거리로 1 이동한 곳에서 X가 아닌 O일 경우 다시 한 번 4방면으로 순회한다. (맨허튼 거리 2)
    3. 이때 순회한 곳에서 P가 있을 경우 거리두기를 지키지 않은 것으로 Break 후 0으로 세팅한다.
    4. P가 없을 경우 다시 처음으로 돌아와서 선택된 값을 증가시켜 그 다음 값으로 위 내용을 반복한다.
    5. 끝까지 Break가 걸리지 않을 경우 거리두기가 지켜진 것이므로 1으로 세팅한다.
*/

class Solution {
    private static final int[] dx = { 0, -1, 1, 0 };
	private static final int[] dy = { -1, 0, 0, 1 };
        
    
    public int[] solution(String[][] places) {
        

        int[] answer = new int[5];
        for(int i=0; i < places.length; i++){
            String[][] splitedPlace = new String[5][5];

            // 각 대기실마다 문자열 분리
            for(int j=0; j < places[i].length; j++){
                String[] splitedLine = places[i][j].split("");
                
                for(int k=0; k < splitedLine.length; k++){
                    splitedPlace[j][k] = splitedLine[k];
                }
            }
            
            // 분리된 대기실마다 거리두기 판별 작업 시작
            if(isDistanced(splitedPlace)){
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
    
    private boolean isDistanced(String[][] place){ 
        for(int y = 0; y < place.length; y++){
            for(int x = 0; x < place[y].length; x++){
                if(!place[y][x].equals("P")) continue; // P가 아니면 체크 하지 않음.
                if(!isDistanced(place, x, y)) return false;
            }
        }
        
        return true;
    }
        
    private boolean isDistanced(String[][] place, int x, int y){
        for(int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny < 0 || ny >= place.length || nx < 0 || nx >= place[ny].length){
                continue;
            }
            
            switch(place[ny][nx]){
                case "P" : return false;
                case "O" : 
                    if (isNextToVolunteer(place, nx, ny, 3-d)) return false;
                    break;
            }
        }
        return true;
    }
    
    private boolean isNextToVolunteer(String[][] place, int x, int y, int exclude){
        for(int d = 0; d < 4; d++){
            if (d == exclude) continue;
            
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny < 0 || ny >= place.length || nx < 0 || nx >= place[ny].length){
                continue;
            }
            if(place[ny][nx].equals("P")) return true;
        }
        return false;
    }

}