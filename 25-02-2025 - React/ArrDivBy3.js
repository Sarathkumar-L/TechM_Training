import React from 'react';
import ReactDOM from 'react-dom/client';

function DivBY(props) {
	return <h1>{props.sk} - is divisible by 3</h1>
}
function NotDivBY(props) {
	return <h1>{props.ks} - not divisible by 3!</h1>
}

function CheckNumber(props) {
  const a = props.num1;
  const b=a.length;
  if (b%3==0) {
    return <DivBY sk={a}/>
  }
  return <NotDivBY ks={a}/>
}

const root = ReactDOM.createRoot(document.getElementById('sk'));
root.render(<CheckNumber num1={[1,2,3]} />);
