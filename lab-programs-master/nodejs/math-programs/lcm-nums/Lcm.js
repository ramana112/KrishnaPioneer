var leastCommonMultiple = function(arr) {
    var minn, max;
    if ( arr[0] > arr[1] ) {
        minn = arr[1];
        max = arr[0];
    } else {
        minn = arr[0];
        max = arr[1];
    }
    function repeatRecurse(min, max, scm) {
        if ( scm % min === 0 && min < max ) {
            return repeatRecurse(min+1, max, scm);
        } else if ( scm % min !== 0 && min < max ) {
            return repeatRecurse(minn, max, scm+max);
        }
        return scm;
    } 
    return repeatRecurse(minn, max, max);
}
module.exports = leastCommonMultiple;