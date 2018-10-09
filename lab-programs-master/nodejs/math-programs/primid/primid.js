var generatePyramid = function (NumberofRows) {
    var count = [];
    for (var i = 1; i <= NumberofRows; i++) {
        for (var j = 1; j <= i; j++) {
            count.push(j);
            console.log(j);
        }
    }
}
module.exports = generatePyramid;