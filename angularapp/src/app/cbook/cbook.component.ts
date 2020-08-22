import { ContactService } from './../shared/service/contact.service';
import { Contact } from './../shared/model/contact.model';
import { Component, OnInit } from '@angular/core';
import { concat } from 'rxjs';

@Component({
  selector: 'app-cbook',
  templateUrl: './cbook.component.html',
  styleUrls: ['./cbook.component.css']
})
export class CbookComponent implements OnInit {

  contacts:Contact[] = [];
  contact:Contact={"name":"","email":"","mobile":"","city":""}
 
  constructor(private contactService:ContactService) { }

  ngOnInit(): void {
     this.getAllContacts();
  }

  onSubmit(contactForm){
      console.log(contactForm);
      let contact:Contact = contactForm.value;
      this.contactService.addContact(contact).subscribe(res=>{
          this.getAllContacts(); 
      })
      contactForm.reset();
  }

  getAllContacts(){
    this.contactService.getAllContacts().subscribe(res=>{
      this.contacts = res;
  })
  }

  deleteContact(cid:string){
     this.contactService.deleteContact(cid).subscribe(res=>{
          this.getAllContacts();
     })
  }
  editContact(cid:string){
    this.contactService.editContact(cid).subscribe(res=>{
      this.contact = res;
 });
  }
}
