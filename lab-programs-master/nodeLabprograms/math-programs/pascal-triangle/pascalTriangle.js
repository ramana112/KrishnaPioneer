var PascalsTriangle = function (num) {
    var arr = {};
    for(var row = 0; row < num; row++) {
        arr[row] = [];
        for(var col = 0; col < row+1; col++) {
            if(col === 0 || col === row) {
                arr[row][col] = 1;
            } else {
                arr[row][col] = arr[row-1][col-1] + arr[row-1][col];
            }         
        }       
    }   
    return arr;
}
module.exports = PascalsTriangle;