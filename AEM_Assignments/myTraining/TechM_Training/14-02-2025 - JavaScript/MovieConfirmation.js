<!DOCTYPE html>
<html>
<body>

<h2>Will you go to Film today?</h2>

<button onclick="myFunction()">Confirm</button>

<p id="demo"></p>

<script>
function myFunction() {
  let text;
  let person = confirm("Please enter you will go to fill or not:", "No: ");
  if (person == null || person == "") {
    text = "User cancelled the program today (will not go to movie!).";
  } else {
    text = "User will go movie!! Confirmed!!!thank you!!!!";
  }
  document.getElementById("demo").innerHTML = text;
}
</script>

</body>
</html>


