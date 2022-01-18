function solution(board, moves) {
  let answer = 0;
  let moved = [];

  for (let i = 0; i < moves.length; i++) {
    for (let j = 0; j < board.length; j++) {
      if (board[j][moves[i] - 1] !== 0) {
        moved.push(board[j][moves[i] - 1]);
        board[j][moves[i] - 1] = 0;
        break;
      }
    }
  }

  for (let i = 0; i < moved.length; i++) {
    if (moved[i] === moved[i + 1]) {
      answer += 2;
      moved.splice(i, 2);
      i = 0;
    }
  }

  return answer;
}
