import { AboutComponent } from './about/about.component';
import { RegisterComponent } from './log-in/register.component';
import { LogInComponent } from './log-in/log-in.component';
import { NgModule, Component, ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {CarouselComponent} from './carousel/carousel.component';

const routes: Routes = [
  {path: '', component: CarouselComponent, 
  // children: [
  //   {path: 'about', component: AboutComponent}
  // ]
},
  {path: 'log-in', component: LogInComponent},
  {path: 'register', component: RegisterComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
}
// {path: '' , component: CarouselComponent, 
// {path:'', component: AboutComponent, outlet: 'about-page'},
// {path:'about', component: AboutComponent, outlet: 'about-page'},
// {path: 'about', component: AboutComponent},