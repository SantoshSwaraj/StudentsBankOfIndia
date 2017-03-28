/**
 * 
 */
function showStatement(accountNo,dateFrom,dateTo) {
  var xhttp;    
 
  xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
     // document.getElementById("txtHint").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", "DisplayStatementServlet.java?q="+accountNo,dateFrom,dateTo, true);
  xhttp.send();
}





