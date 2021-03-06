/**
 * 
 */
require(['environment', 'logger'], function (F, Logger) {
    var global = this;
    //F.cacheBust(true);
    //F.export(global);
    require('View', function(View){
        var m = new View();
        m.show();
    }, function(e){
        Logger.severe(e);
        if(global.document){
            var messageParagraph = global.document.createElement('p');
            global.document.body.appendChild(messageParagraph);
            messageParagraph.innerHTML = 'An error occured while require(\'View\'). Error: ' + e;
            messageParagraph.style.margin = '10px';
            messageParagraph.style.fontFamily = 'Arial';
            messageParagraph.style.fontSize = '14pt';
        }
    });
});