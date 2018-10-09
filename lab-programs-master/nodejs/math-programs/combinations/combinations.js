var combinations = function (arr, num ) {
	var i, j,k, combs,head,tailcombs;
	if (num > arr.length || k <= 0) {
		return [];
	}
	if (num == arr.length) {
		return [arr];
	}
	if (num == 1) {
		combs = [];
		for (i = 0; i < arr.length; i++) {
		combs.push([arr[i]]);
		}
		return combs;
	}
    combs = [];
	for (i = 0; i < arr.length - k + 1; i++) {
		head = arr.slice(i, i + 1);
		tailcombs = combinations(arr.slice(i + 1), k - 1);
		for (j = 0; j < tailcombs.length; j++) {
			combs.push(head.concat(tailcombs[j]));
		}
	}
	return combs;
}
var arr = [1,2,3,4];
console.log(combinations(arr,2));
module.exports = combinations;
