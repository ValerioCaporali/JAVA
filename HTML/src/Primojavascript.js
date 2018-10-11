var nome = prompt("Inserire il nome: ",0);
document.write ("Ciao " +nome+ " e benvenuto nella pagina.\n");
var primo = prompt("Inserisci il primo numero: ",0);
var secondo = prompt ("Inserire il secondo numero: ",0);
document.write("<br> Il primo numero è: " +primo);
document.write("<br> Il secondo numero è: " +secondo);
document.write("<br> La somma dei numeri da te inseriti è: " +(parseInt(primo) + parseInt(secondo)));
document.write("<br> La sottrazione è: " +(parseInt(primo) - parseInt(secondo)));
document.write("<br> La divisione è: " +(parseInt(primo) / parseInt(secondo)));
document.write("<br> La moltiplicazione è: " +(parseInt(primo) * parseInt(secondo)));

