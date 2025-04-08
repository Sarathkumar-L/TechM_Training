<!DOCTYPE html>
<html>
<body>

<h2>Enter your age</h2>

<button onclick="myFunction()">Age</button>

<p id="demo"></p>

<script>
function myFunction() {
  let text;
  let person = prompt("Please enter you will go to fill or not:", "18 ");
  if (person == null || person == "") {
    text = "User cancelled the program. Please enter correct age!!";
  } else {
    text = "Your age is: " + person + "! thank you!";
  }
  document.getElementById("demo").innerHTML = text;
}
</script>

</body>
</html>


