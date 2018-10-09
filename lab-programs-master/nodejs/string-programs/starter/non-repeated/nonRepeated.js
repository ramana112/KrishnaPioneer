var firstNonRepeatedCharacter = function (string) {
  for (var i = 0; i < string.length; i++) {
    var char = string.charAt(i);
    if (string.indexOf(char) == i && string.indexOf(char, i + 1) == -1) {
      console.log(char);
    }
  }
  return null;
}

module.exports =firstNonRepeatedCharacter;
