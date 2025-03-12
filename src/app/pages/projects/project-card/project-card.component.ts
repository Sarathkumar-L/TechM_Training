import { Component, Input, input, model } from '@angular/core';
// import { projects } from '../../../model/projects';
import { service } from '../../../model/service';

@Component({
  selector: 'app-project-card',
  templateUrl: './project-card.component.html',
  styleUrl: './project-card.component.css'
})
export class ProjectCardComponent {
  @Input() service:service={id:'',title:'',description:'',image:''}
}
