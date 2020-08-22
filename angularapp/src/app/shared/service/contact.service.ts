import { Contact } from './../model/contact.model';
import { environment } from './../../../environments/environment';
import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable, concat } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContactService {
 
  

  baseUrl = environment.baseUrl;
  constructor(private http:HttpClient) { }

  getAllContacts():Observable<Contact[]>{
      return this.http.get<Contact[]>(`${this.baseUrl}/getall`);
  }

  addContact(contact:Contact):Observable<Contact>{
    const headers = { 'Content-Type': 'application/json' }
     return this.http.post<Contact>(`${this.baseUrl}/new`,contact,{headers});
  }
  deleteContact(cid: string):Observable<Contact> {
    return this.http.delete<Contact>(`${this.baseUrl}/delete/${cid}`);
  }
  
  editContact(cid: string):Observable<Contact> {
    return this.http.get<Contact>(`${this.baseUrl}/get/${cid}`);
  }
}
