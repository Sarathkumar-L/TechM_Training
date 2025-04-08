import React from 'react';
import ReactDOM from 'react-dom/client';

function DivBy(props) {
	return <h1>{props.sk} - This is divisible by 13!!! </h1>
}
function NotDivBy(props) {
	return <h1>{props.ks} - This is not divisible by 13!</h1>
}

function CheckNumber(props) {
  const a = props.num1;
  if (a%13==0) {
    return <DivBy sk={a}/>
  }
  return <NotDivBy ks={a}/>
}

const root = ReactDOM.createRoot(document.getElementById('sk'));
root.render(<CheckNumber num1="26" />);
