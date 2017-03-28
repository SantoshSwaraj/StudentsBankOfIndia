/**
 * 
 */
function showStatement(accountNo,dateFrom,dateTo) {
  var xhttp;    
 
  xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	document.getElementById("displaystmt").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", "displayStatement.jsp?q="+accountNo,dateFrom,dateTo, true);
  xhttp.send();
}





