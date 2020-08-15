import { Question } from './../shared/model/question.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {

  questions:Question[]=[

    {"qid":1,"qdata":"What is the output of 10 >> 1?","options":["10","5","2","1"],"answer":2},
    {"qid":2,"qdata":"Which of the following is not a valid key word in Java ?","options":["int","float","if","String"],"answer":4},
    {"qid":3,"qdata":"Which of the following is not a valid operator in Java ?","options":["+","-","**","*"],"answer":3},
    {"qid":4,"qdata":"If the interface has single abstract method then what it will be called as ? ","options":["interface","funcational interface","abstract interface","java8 interface"],"answer":2},
    {"qid":5,"qdata":"which of the following is termination operation in java8 stream ?","options":["filter","stream","map","forEach"],"answer":4},

  ]

  result:any;

  answerKey:Map<number,number>=new Map();
  constructor() {

      for(let q of this.questions){
        this.answerKey[q.qid]=q.answer;   
        q.answer = 0;   
      }
 

   }

  ngOnInit(): void {


  }


  showResult(f){
      let ccount = 0,wcount:0;
      for(let q of this.questions){
       
        let ans = this.answerKey[q.qid];
        
        if(ans == q.answer){
            ccount++;
        }else{
            wcount++;
        }
      }
      window.scroll(0, 0);
     
        this.result =(ccount/this.questions.length)*100; 


      setTimeout(() => {
        this.result = undefined; 
      }, 3000);

      
      f.reset();
  }

}
