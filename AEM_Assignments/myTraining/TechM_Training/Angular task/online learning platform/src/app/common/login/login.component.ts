import { Component } from '@angular/core';
// import { ApiService } from '../../../services/api.service';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';
  loginError: string = '';

  constructor(private api: ApiService) {}

  login() {
    this.api.authenticate(this.username, this.password).subscribe({
      next: (isAuthenticated) => {
        if (isAuthenticated) {
          alert('Login successful!');
          // Redirect to a different page or perform other actions
        } else {
          this.loginError = 'Invalid username or password';
        }
      },
      error: (error) => {
        console.error('Error during authentication', error);
        this.loginError = 'An error occurred. Please try again later.';
      }
    });
  }
}