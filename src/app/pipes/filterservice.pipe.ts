import { Pipe, PipeTransform } from '@angular/core';
import { service } from '../model/service';

@Pipe({
  name: 'filterCourses'
})
export class FilterCoursesPipe implements PipeTransform {

  transform(courses: any[], selectedCourse: string): any[] {
    if (!courses || !selectedCourse || selectedCourse === 'All') {
      return courses;
    }
    return courses.filter(course => course.course === selectedCourse);
  }
}