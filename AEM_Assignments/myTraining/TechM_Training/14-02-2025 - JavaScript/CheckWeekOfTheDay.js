<!DOCTYPE html>
<html>
<body>

<h2>Enter the week day !!</h2>

<button onclick="myFunction()">Check</button>

<p id="demo"></p>

<script>
function myFunction() {
  let text;
  let person = prompt("Enter the Day:");
  if (person == null || person == "") {
    text = "Invalid. Please enter any correct day to check!!!";
  } else {
    switch (person.toLowerCase()) {
        case "monday":
            text="Start of the week!"
            break;
        case "tuesday":
        case "wednesday":
        case "thursday":
            text="Mid of the week!"
            break;
        case "friday":
            text="Last working day of the week!"
            break;
        case "saturday":
            text="WeekEnd - Saturday!"
            break;
        case "sunday":
            text="WeekEnd - Sunday!"
            break;
        default:
            text="Invalid input!"
    }
  }
  document.getElementById("demo").innerHTML = text;
}

</script>

</body>
</html>
