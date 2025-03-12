import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProjectsComponent } from './pages/projects/projects.component';
import { ContactsComponent } from './pages/contacts/contacts.component';
import { AboutComponent } from './pages/about/about.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './common/login/login.component';
// import { EnquiriesComponent } from './pages/enquiries/enquiries.component';
import { EnqiryFormComponent } from './pages/home/enqiry-form/enqiry-form.component';
import { ServiceDetailsComponent } from './pages/home/service-details/service-details.component';
import { CourseSubscriptionComponent } from './pages/course-subscription/course-subscription.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'about',component:AboutComponent},
  {path:'contact',component:ContactsComponent},	
  {path:'projects',component:ProjectsComponent},
  {path:'enquiries',component:EnqiryFormComponent},
  {path:'services/:id',component:ServiceDetailsComponent},
  {path:'login',component: LoginComponent},
  {path: 'courses', component: CourseSubscriptionComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
