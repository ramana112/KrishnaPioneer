function display(m){
   var a = [[8, 3], [2, 4], [3, 6]],b = [[1, 2, 3], [4, 6, 8]];
   var m=multiply(a, b);
    for(var r=0;r<m.length;++r){
        console.log(m[r]);
    }
}
function multiply(a, b) {
    var aNumRows = a.length, aNumCols = a[0].length,
        bNumRows = b.length, bNumCols = b[0].length,
        m = new Array(aNumRows);
        for( var r = 0;r < aNumRows;++r){
            m[r] = new Array(bNumCols);
             for(var c = 0;c < bNumCols;++c){
                 m[r][c] = 0;
                 for( var i = 0; i < aNumCols; ++i){
                     m[r][c] += a[r][i] * b[i][c];
                 }
             }
        }
    return m;
}


module.exports = display;