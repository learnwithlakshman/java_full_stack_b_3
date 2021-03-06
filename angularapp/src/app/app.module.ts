import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CbookComponent } from './cbook/cbook.component';
import { HeaderComponent } from './header/header.component';
import { QuizComponent } from './quiz/quiz.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CbookComponent,
    HeaderComponent,
    QuizComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
