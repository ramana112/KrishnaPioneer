function diagonal(a){
    for(var i=0;i<a.length;++i){
        for(var j=0;j<a.length;j++){
            if(i==j){
                console.log(a[i][j]);
            }
        }
    }
}
module.exports = diagonal;