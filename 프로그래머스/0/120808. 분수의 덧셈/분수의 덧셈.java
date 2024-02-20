class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int Num1 = numer1 * denom2; //분자1
        int Num2 = numer2 * denom1; //분자2
        int Num = Num1+Num2;
        int Den = denom1 * denom2; //통분
        
        int m_num = 0;
        
        //최대공약수 찾기
        for(int i=1; i <= Num && i <= Den  ;i++){
            if( Num%i == 0 && Den%i ==0 ){
                m_num = i;
            }
        }
        
        Num = Num/m_num;
        Den = Den/m_num;
        
        int[] answer = {Num, Den};
        
        return answer;
    }
}