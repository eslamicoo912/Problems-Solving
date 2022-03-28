// write a function to take a sentence as a string from the user , for each word that its length is equal to or greater than 5 , reverse it

function spinWords(sentence) {
  const words = sentence.split(" ");
  for (let i = 0; i < words.length; i++) {
    if (words[i].length >= 5) {
      words[i] = words[i].split("").reverse().join("");
    }
  }
  return words.join(" ");
}

console.log(spinWords("this is another test"));
