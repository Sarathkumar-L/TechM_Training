<!DOCTYPE html>
<html>
<body>

<h2>Enter Address - JavaScript Prompt</h2>

<button onclick="myFunction()">Address</button>

<p id="demo"></p>

<script>
function myFunction() {
  let text;
  let person = prompt("Please enter your address:", "No: ");
  if (person == null || person == "") {
    text = "User cancelled the prompt.";
  } else {
    text = "Your current address: " + person + "! thank you!";
  }
  document.getElementById("demo").innerHTML = text;
}
</script>

</body>
</html>


