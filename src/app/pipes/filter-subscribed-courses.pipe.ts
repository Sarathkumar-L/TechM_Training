import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterSubscribedCourses'
})
export class FilterSubscribedCoursesPipe implements PipeTransform {

  transform(courses: string[], filterText: string): string[] {
    if (!filterText) return courses;
    return courses.filter(course => course.toLowerCase().includes(filterText.toLowerCase()));
  }

}