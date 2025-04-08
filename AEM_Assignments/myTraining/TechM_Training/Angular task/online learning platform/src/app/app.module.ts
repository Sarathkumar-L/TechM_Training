import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { ProjectsComponent } from './pages/projects/projects.component';
import { AboutComponent } from './pages/about/about.component';
import { ContactsComponent } from './pages/contacts/contacts.component';
import { MenuBarComponent } from './common/menu-bar/menu-bar.component';
import { ContactItemComponent } from './pages/contacts/contact-item/contact-item.component';
import { HttpClientModule } from '@angular/common/http';
import { ServiceCardComponent } from './pages/home/service-card/service-card.component';
import { EnqiryFormComponent } from './pages/home/enqiry-form/enqiry-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './common/login/login.component';
// import { FilterservicePipe } from './pipes/filterservice.pipe';
import { FilterCoursesPipe } from './pipes/filterservice.pipe';
import { HighlightPipe } from './pipes/highlight.pipe';
import { ServiceDetailsComponent } from './pages/home/service-details/service-details.component';
import { EnquiryResponseComponent } from './pages/enquiries/enquiry-response/enquiry-response.component';
import { ProjectCardComponent } from './pages/projects/project-card/project-card.component';

import { SafeUrlPipe } from './pipes/safe-url.pipe';
// import { FormsModule } from '@angular/forms';
import { CourseSubscriptionComponent } from './pages/course-subscription/course-subscription.component';
import { FilterSubscribedCoursesPipe } from './pipes/filter-subscribed-courses.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProjectsComponent,
    AboutComponent,
    ContactsComponent,
    MenuBarComponent,
    ContactItemComponent,
    ServiceCardComponent,
    EnqiryFormComponent,
    LoginComponent,
    FilterCoursesPipe,
    HighlightPipe,
    ServiceDetailsComponent,
    EnquiryResponseComponent,
    ProjectCardComponent,
    SafeUrlPipe,
    CourseSubscriptionComponent,
    FilterSubscribedCoursesPipe,
    // ReactiveFormsModule
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule, //template driven forms(ngModel)
    ReactiveFormsModule //reactive forms (formControl and formBuilder)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
