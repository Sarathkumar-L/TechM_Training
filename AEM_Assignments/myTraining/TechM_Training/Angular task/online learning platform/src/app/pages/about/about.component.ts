import { Component } from '@angular/core';
// import { ApiService } from '../../../services/api.service';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent {
  name: string = '';
  email: string = '';
  selectedCourse: string = '';
  subscriptionSuccess: boolean = false;
  errors: string[] = [];

  courses: string[] = [
    'Angular Basics',
    'Advanced TypeScript',
    'Web Development with Angular',
    'React for Beginners',
    'Node.js Essentials'
  ];

  constructor(private api: ApiService) {}

  submitForm() {
    this.errors = [];
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

    if (!this.name || this.name.length < 3) {
      this.errors.push("Name should be at least three characters long");
    }
    if (!this.email || !emailPattern.test(this.email)) {
      this.errors.push("Invalid Email");
    }
    if (!this.selectedCourse) {
      this.errors.push("Please select a course");
    }

    if (this.errors.length === 0) {
      this.api.addCourse({
        name: this.name,
        email: this.email,
        course: this.selectedCourse
      }).subscribe({
        next: (response) => {
          this.subscriptionSuccess = true;
          console.log("Subscription Response:", response);
          this.resetForm();
        },
        error: (error) => {
          console.error("Error subscribing to course", error);
          this.errors.push("Something went wrong. Please try again");
        }
      });
    }
  }

  resetForm() {
    this.name = '';
    this.email = '';
    this.selectedCourse = '';
  }
}