function solution(nums) {
    const share = nums.length/2;
    const setArray = new Set(nums);
    return setArray.size > share ? share : setArray.size;
}