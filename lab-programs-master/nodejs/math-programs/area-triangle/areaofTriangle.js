var triangleArea = function triangleArea (side1,side2,side3){
var semiperimeter = (side1+side2+side3)/2
var area = Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
return area;
};
module.exports = triangleArea;