var rest = localStorage.getItem('myRest') || 0;
$(window).load(function() {
	
	localStorage.setItem('myRest', ++rest);
    console.log(rest);
	
	if(rest == 1){
		setTimeout(function(){
			modal.style.display = "block";   
		}, 5000);
	};
	if(rest == 2){
		setTimeout(function(){
			modal.style.display = "block";   
		}, 15000);
	};
	if(rest >=3){
		$('html').mouseleave(function(){
			setTimeout(function(){
    			modal.style.display = "block";   
			}, 30000);
		});
	}
});

var modal = document.getElementById('myModal');

function closeModal() {
    modal.style.display = "none";
}

window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
} 