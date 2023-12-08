import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        for(int i=0;i<reserve.length;i++) {
            for(int j=0;j<lost.length;j++) {
                if(reserve[i] == lost[j]) { //여벌 체육복을 가져온 학생이 체육복을 도난 당한 경우 lost,reserve에서 뺌
                    lost[j] = 0;
                    reserve[i] = 0;
                }
            }
        }
        
        Arrays.sort(lost);
        Arrays.sort(reserve);   // 오름차순 정렬
        
        for(int stu : lost){ 
            if(stu != 0){  // 여벌 체육복을 가진 학생을 0로 처리하여 무시. (result : 학생수 - 체육복이 없는 인원의 수)
                n = n - 1;
            }
        }
        
        int result = n;   // 현재 수업 참여가 가능한 인원 수
        
        for(int i=0;i<reserve.length;i++) {
            if(reserve[i] == 0) continue;
            for(int j=0;j<lost.length;j++) {
                if(lost[j] == 0) continue;  // 0 : 여분이 있거나 reserve로부터 체육복을 빌린 학생
                
                if(Math.abs(reserve[i] - lost[j]) == 1) {
                    result ++;
                    lost[j] = 0;    // 빌려준거 처리 //학생 번호는 1부터 시작 가정
                    break;  
                }
            }
        }
        System.out.println("result : " + result);        
        return result;
    }
}