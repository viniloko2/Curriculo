function imprime(){
let numero = document.getElementById('numero').value;
let divisoria = document.getElementById("result");
divisoria.innerHTML = `<p>a tabuada é ${numero} </p>`;
for(let i = 0; i <= 10; i++){
    let calc = i*numero;
    const node = document.createElement("p");
    const text = document.createTextNode(` ${numero} x ${i}: ${calc}`); 
    node.appendChild(text);
    divisoria.appendChild(node);
}
//
}
var contval = 0;
function clique(){
    updateDisplay(++contval);
}
function updateDisplay(val){
document.getElementById("contador").innerHTML = val;
}
//random

function random(){
    let numero = document.getElementById("numero").value;
    var randam = Math.floor(Math.random() * numero);
    document.getElementById("resultado").innerHTML = randam;
}