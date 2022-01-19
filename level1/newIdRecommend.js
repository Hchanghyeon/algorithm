function solution(new_id) {
  let answer = "";
  let arr = [];
  let pattern_eng = /[a-z]/;
  let pattern_num = /[0-9]/;
  answer = new_id.toLowerCase();
  arr = answer.split("");

  let move = arr.filter((v) => {
    return (
      pattern_eng.test(v) === true ||
      pattern_num.test(v) === true ||
      v == "-" ||
      v == "_" ||
      v == "."
    );
  });

  for (let i = 0; i < move.length; i++) {
    if (move[i] == "." && move[i + 1] == ".") {
      move.splice(i, 1);
      i = -1;
    }
  }

  if (move[0] == ".") {
    move.splice(0, 1);
  }
  if (move[move.length - 1] == ".") {
    move.splice(move.length - 1, 1);
  }

  if (move.length == 0) {
    move.push("a");
  }

  if (move.length > 15) {
    move.splice(15, move.length - 15);
    if (move[move.length - 1] == ".") {
      move.splice(move.length - 1, 1);
    }
  }
  if (move.length < 3) {
    while (move.length < 3) {
      move.push(move[move.length - 1]);
    }
  }
  answer = move.join("");
  return answer;
}
