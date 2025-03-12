import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiService } from '../../../services/api.service';

import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

@Component({
  selector: 'app-service-details',
  templateUrl: './service-details.component.html',
  styleUrl: './service-details.component.css'
})
export class ServiceDetailsComponent {
  id: any = '';
  title: string = '';
  desctitle: string = '';
  description: string[] = [];
  videourl: SafeResourceUrl = ''; // ✅ Use SafeResourceUrl instead of string

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private api: ApiService,
    private sanitizer: DomSanitizer // ✅ Inject DomSanitizer
  ) {
    this.id = this.route.snapshot.paramMap.get('id');
    const navigation = this.router.getCurrentNavigation();
    if (navigation?.extras.state) {
      this.title = navigation.extras.state['title'];
      // this.videourl = this.sanitizer.bypassSecurityTrustResourceUrl(navigation.extras.state['videoUrl']);
      
  }
}

ngOnInit() {
  this.api.getDetails(this.id).subscribe({
    next: (result: any) => {
      console.log(result);
      this.desctitle = result[0].title;
      this.description = result[0].description;

      // Convert YouTube URL to embed format
      let rawUrl = result[0].videourl;
      if (rawUrl.includes("youtu.be")) {
        rawUrl = rawUrl.replace("youtu.be/", "www.youtube.com/embed/");
      } else if (rawUrl.includes("watch?v=")) {
        rawUrl = rawUrl.replace("watch?v=", "embed/");
      }

      // ✅ Sanitize URL before assigning
      this.videourl = this.sanitizer.bypassSecurityTrustResourceUrl(rawUrl);
    },
    error: (error: any) => console.log(error)
  });
}
}
