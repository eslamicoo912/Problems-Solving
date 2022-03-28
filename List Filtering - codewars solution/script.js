let arr = [4, 0, 1, "a", "b", 0, 15];

function filter_list(l) {
  const newArr = l.filter((val) => {
    if (typeof val == "number" || val === 0) return true;
  });
  return newArr;
}

console.log(filter_list(arr));
console.log(typeof 0);
