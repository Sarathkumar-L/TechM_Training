import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../services/api.service';
// import { enquiry } from '../../model/enquiry';
import { service } from '../../model/service';

@Component({
  selector: 'app-enquiries',
  templateUrl: './enquiries.component.html',
  styleUrl: './enquiries.component.css'
})

export class CourseListComponent implements OnInit {
  courses: any[] = [];
  selectedCategory: string = 'All';
  courseCategories: string[] = ['All', 'Frontend', 'Backend', 'Fullstack', 'DevOps'];
selected: any;

  constructor(private api: ApiService) {}

  ngOnInit() {
    this.api.getCourse().subscribe({
      next: (data) => {
        this.courses = data;
        this.extractCategories();
      },
      error: (error) => {
        console.error("Error fetching courses", error);
      }
    });
  }

  extractCategories() {
    const categories = this.courses.map(course => course.category);
    this.courseCategories = ['All', ...new Set(categories)];
  }
}