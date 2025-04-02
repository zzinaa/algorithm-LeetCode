class Solution {
    int n;
    boolean[][] dp;
    public boolean canCross(int[] stones) {

        if(stones[1] != 1) return false;
        
        n = stones.length;
        dp = new boolean[n][n];
        return recursive(stones, 0, 1);
    }

    private boolean recursive(int[] stones, int lastIdx, int curIdx) {

        if(curIdx == n - 1) return true; // 현재 인덱스가 마지막 돌이라면 건너기 완료

        if(dp[lastIdx][curIdx]) return false; // 이미 계산 완료한 곳이라면 false
        
        int prevJump = stones[curIdx] - stones[lastIdx]; // 현재 있는 돌 - 이전에 있던 돌 = 이전 k, 개구리가 얼마나 뛰었는지
        int nextIdx = curIdx + 1; // 다음으로 갈 곳 단순히 1 더해봄 

        // nextIdx 는 n 보다는 작아야 하고(마지막 넘어가면 안됨) + 다음으로 갈 곳의 돌멩이 번호 <= 현재 있는 돌멩이 번호 + k + 1 (조건)
        while(nextIdx < n && stones[nextIdx] <= stones[curIdx] + prevJump + 1) {

            int nextJump = stones[nextIdx] - stones[curIdx]; // 다음으로 갈 려면 얼마나 뛰어야 하는지 계산
            int jump = nextJump - prevJump;

            if(jump >= -1 && jump <= 1) { // 이전 점프랑 현재 점프랑 차이가 k - 1, k, k + 1 에 해당하는지 확인
                if(recursive(stones, curIdx, nextIdx)) { // 조건에 부합하면 재귀 돌림
                    return true; // 재귀 안 쪽에서 true 가 나오면 바깥 쪽도 true
                }
            }

            dp[lastIdx][curIdx] = true; // true 처리가 안되었으면 해당 dp 좌표 true 처리 (두 번 계산 안하도록)
            nextIdx ++; // 단순히 1을 더 했었으니 위에서 true 가 안나오면 한 번 더 더함
        }

        return false; // 위에서 안걸리면 false 처리
    }
}