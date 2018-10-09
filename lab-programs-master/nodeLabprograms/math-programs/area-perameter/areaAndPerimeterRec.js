var circle = function (radius){
    this.radius = radius;
  // area method
    this.area = function () {
        return Math.PI * this.radius * this.radius;
    };
  // perimeter method
    this.perimeter = function (){
        return 2*Math.PI*this.radius;
    };
}
module.exports = circle;
