function salvar(){
    let tableUser = document.querySelector('.table'); 
    var row = tableUser.insertRow();

    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    let cell3 = row.insertCell(2);
    let cell4 = row.insertCell(3);

  cell1.innerHTML = document.getElementById('nome').value;
  cell2.innerHTML = document.getElementById('email').value;
  cell3.innerHTML = document.getElementById('data').value;
  cell4.innerHTML = document.getElementById('estado').value;

}