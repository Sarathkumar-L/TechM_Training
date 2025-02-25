import React from 'react';
import ReactDOM from 'react-dom/client';

function EvenNumber(props) {
	return <h1>{props.sk} - This is Even Number!!! </h1>
}
function OddNumber(props) {
	return <h1>{props.ks} - This is Odd Number!</h1>
}

function CheckNumber(props) {
  const a = props.num1;
  if (a%2==0) {
    return <EvenNumber sk={a}/>
  }
  return <OddNumber ks={a}/>
}

const root = ReactDOM.createRoot(document.getElementById('sk'));
root.render(<CheckNumber num1="45678" />);
