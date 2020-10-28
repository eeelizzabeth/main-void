import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
    selector: 'register',
    templateUrl: './register.component.html'})
    
  export class RegisterComponent implements OnInit {
  
    registerForm: FormGroup;
    constructor(private formBuilder: FormBuilder) { }
  
    ngOnInit(): void {
      this.registerForm = this.formBuilder.group({
        title: ['', Validators.required],
        firstName: ['', Validators.required],
        lastName: ['', Validators.required],
        email: ['', [Validators.required, Validators.email]],
        password: ['', [Validators.required, Validators.minLength(6)]],
        confirmPassword: ['', Validators.required],
        acceptTerms: [false, Validators.requiredTrue]
      })}
    //   }, {
    //     validator: MustMatch('password', 'confirmPassword')
    //   }
    
    
    onSubmit() {
      // TODO: Use EventEmitter with form value
      console.log(this.registerForm.value)
    }
  
  }