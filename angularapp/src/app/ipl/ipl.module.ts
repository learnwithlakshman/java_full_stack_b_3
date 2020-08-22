import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { IplRoutingModule } from './ipl-routing.module';
import { IplComponent } from './ipl.component';
import { HeaderComponent } from './header/header.component';
import { PlayerComponent } from './player/player.component';
import { TeamComponent } from './team/team.component';


@NgModule({
  declarations: [IplComponent, HeaderComponent, PlayerComponent, TeamComponent],
  imports: [
    CommonModule,
    IplRoutingModule
  ]
})
export class IplModule { }
