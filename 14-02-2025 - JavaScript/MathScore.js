<!DOCTYPE html>
<html>
<body>

<h2>Enter the maths mark!</h2>

<button onclick="myFunction()">Check</button>

<p id="demo"></p>

<script>
function myFunction() {
  let text;
  let person = prompt("Enter maths mark!!!:");
  if (person == null || person == "") {
    text = "Invalid. Please enter any correct day to check!!!";
  } else {
    if(person===100){
    text="Phenomenal!"
    }
    else if(person >=85){
    text="Excellent"
    }
    else if(person >=71 && person <85){
    text="Good work"
    }
    else if(person >=51 && person <71){
    text="Practice well"
    }
    else{
    text="Hard work is needed"
    }
  }
  document.getElementById("demo").innerHTML = text;
}

</script>

</body>
</html>
