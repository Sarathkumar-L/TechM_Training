const calculate = () => {
    let operation = prompt("Choose an operation: add, subtract, multiply, divide : ");
    let num1 = parseFloat(prompt("Enter first number:"));
    let num2 = parseFloat(prompt("Enter second number:"));

    switch (operation) {
        case "add":
            console.log(`Sum: ${num1 + num2}`);
            break;
        case "subtract":
            console.log(`Difference: ${num1 - num2}`);
            break;
        case "multiply":
            console.log(`Product: ${num1 * num2}`);
            break;
        case "divide":
            console.log(`Division: ${num1 / num2}`);
            
            break;
        default:
            console.log("Invalid operation");
    }
};

calculate();
