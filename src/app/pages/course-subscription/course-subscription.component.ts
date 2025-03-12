import { Component, OnInit } from '@angular/core';
// import { ApiService } from '../../../services/api.service';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-course-subscription',
  templateUrl: './course-subscription.component.html',
  styleUrls: ['./course-subscription.component.css']
})
export class CourseSubscriptionComponent implements OnInit {
  subscribedCourses: any[] = [];
  selectedCourse: string = 'All';
  courseCategories: string[] = ['All', 'Angular Basics', 'Advanced TypeScript', 'Web Development with Angular', 'React for Beginners', 'Node.js Essentials'];

  constructor(private api: ApiService) {}

  ngOnInit() {
    this.loadSubscribedCourses();
  }

  loadSubscribedCourses() {
    this.api.getCourse().subscribe({
      next: (data) => {
        this.subscribedCourses = data;
        console.log("Subscribed Courses:", this.subscribedCourses); // Debugging line
      },
      error: (error) => {
        console.error("Error fetching subscribed courses", error);
      }
    });
  }
}