jQuery('document').ready(function() {
    
    /*jQuery('body').append('<a href="http://google.com">Goo</a>')
    //Ставит ссылку*/

    /*var a;
    a = jQuery('p').clone();
    jQuery('body').append(a);
    //Копирует p*/
    
    jQuery('input').on('keyup', function(){        
        var d, d0, d1, d2;
        
        a = jQuery('#a').val();
        b = jQuery('#b').val();
        c = jQuery('#c').val();
        
        a = parseInt(a);
        b = parseInt(b);
        c = parseInt(c);
        
        d = b*b - 4*a*c;        
        d0 = -b/2*a;
		d1 = (-b+(Math.sqrt(d)))/(2*a);
		d2 = (-b-(Math.sqrt(d)))/(2*a);
		
        jQuery('#div1').html(
			'D = b^2 - 4ac = ' + b + '^2 - 4 * ' + a + ' * ' + c + ' = ' + d);
		
		if (d == 0){
			jQuery('#div2').html(
				'D = 0, то х = ' + d0
			);
		}else{
			if (d>0){
				jQuery('#div2').html(
					'D > 0, то x1 = ' + d1 + ', x2 = ' + d2
				);
			}else{
				jQuery('#div2').html(
					'D < 0, то решений нет'
				);
			}
		}
		
    });
	
	jQuery('Button').on('click', function(){        
        var x1, x2, x3, sum;
        
        x1 = jQuery('#x1').val();
        x2 = jQuery('#x2').val();
        x3 = jQuery('#x3').val();
        
        x1 = parseInt(x1);
        x2 = parseInt(x2);
        x3 = parseInt(x3);
        
        sum = x1 + x2 + x3;        
        
        alert(x1 +' + '+ x2 +' + '+ x3 + ' = ' + sum);
    });

});