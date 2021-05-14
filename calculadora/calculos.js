function calcula(){
	var alfa = document.getElementById('in').value;
	result = alfa.replace('x', '*');
	document.getElementById('in').value = eval(result);
}