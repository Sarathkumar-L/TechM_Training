import { Component } from '@angular/core';
import { contact } from '../../model/contacts';
import { contacts } from '../../data/info';
@Component({
  selector: 'app-contacts',
  templateUrl: './contacts.component.html',
  styleUrl: './contacts.component.css'
})
export class ContactsComponent {
  contactlist:contact[] = contacts 
}
