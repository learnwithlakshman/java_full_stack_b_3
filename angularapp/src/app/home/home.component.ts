import { Component, OnInit } from '@angular/core';
import { Employee } from '../shared/model/employee.model';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  message = "Welcome to Angular World!";
  imgSrc = "../../assets/img/off.PNG"
  status:boolean=false;

  username:string="Krishna";

  viewType="table";
  search="";

  servers:any[] = [
    {"ip":"198.168.123.456","status":false},
    {"ip":"398.168.123.459","status":true},
    {"ip":"298.168.123.488","status":true},
    {"ip":"298.168.123.499","status":false}
  
  ]

  searchList:Employee[]=[];
  employees:Employee[]=[

    {"name":"Krish","dob":new Date('1984-08-06'),"salary":8000},
    {"name":"Balu","dob":new Date('1983-04-23'),"salary":7000},
    {"name":"Manoj","dob":new Date('1982-01-10'),"salary":6000}

  ];
  constructor() {
      setTimeout(() => {
        this.username = "Manoj PVN";
      }, 3000);
   }

  ngOnInit(): void {
  }

  toggleBulb(){
    this.status = !this.status;
    this.imgSrc = this.status ? "../../assets/img/on.PNG" : "../../assets/img/off.PNG" ;
  }

  changeStatus(server:any){
      server.status = !server.status;
  }

  deleteServer(server:any){
      let pos = this.indexOf(server);
      this.servers.splice(pos,1);
  }

  searchEmployees(){
    if(this.search.length > 0){
       this.searchList = this.employees.filter(e=>e.name.includes(this.search));
    }else{
      this.searchList = [];
    }
  }

  indexOf(server){
      for(let i=0;i<this.servers.length;i++){
        if(this.servers[i].ip === server.ip){
          return i;
        }
      }
  }
}
