import { PlayerComponent } from './player/player.component';
import { TeamComponent } from './team/team.component';
import { IplComponent } from './ipl.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [

    {
      path:'',
      component:IplComponent,
      children:[
        {
            path:'',
            component:TeamComponent
        },
        {
          path:'teams',
          component:TeamComponent
        },{
          path:'players',
          component:PlayerComponent
        }
      ]
    }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class IplRoutingModule { }
