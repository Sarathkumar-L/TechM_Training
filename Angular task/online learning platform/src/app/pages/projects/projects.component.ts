import { Component } from '@angular/core';
// import { projects } from '../../model/projects';
import { service } from '../../model/service';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrl: './projects.component.css'
})
export class ProjectsComponent {
projectslist: service[]=[];

constructor(private api:ApiService){
  
  }
  ngOnInit(){ 
        this.api.getProjects().subscribe({
            next:(result:service[])=>this.projectslist = result,
            error:(error)=>console.log(error)
        });
  
    }

}


