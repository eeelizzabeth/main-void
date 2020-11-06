import { LogInComponent } from './log-in.component';
import { UserService } from './../user.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import { passwordMatchValidator} from './functions.validators';

@Component({
    selector: 'register',
    templateUrl: './register.component.html'})
    
  export class RegisterComponent implements OnInit {
  

    registerForm: FormGroup;
    submitted = false;
    loading = false;
    constructor(private formBuilder: FormBuilder, private userService: UserService) { }
  
    ngOnInit(): void {
      this.registerForm = this.formBuilder.group(
        {
          title: ['', Validators.required],
          firstName: ['', Validators.required],
          lastName: ['', Validators.required],
          address: ['', Validators.required],
          email: ['', [Validators.required, Validators.email]],
          password: ['', [Validators.required, Validators.minLength(6)]],
          confirmPassword: ['', Validators.required],
          acceptTerms: [false, Validators.requiredTrue]
        }, { validator: passwordMatchValidator('password', 'confirmPassword')});
    }
    
    get f() { return this.registerForm.controls; }

    
    
    onSubmit() {
      // TODO: Use EventEmitter with form value
      this.submitted = true;

      // stop here if form is invalid
      if (this.registerForm.invalid) {
        
        return;
      }
      console.log(this.registerForm.value);

      this.userService.createUser(this.registerForm.value).
      pipe(first()).
      subscribe({
        next: () => {
          console.log(this.registerForm.value);
          console.log("Complete, added user");
        },    
        error: error => {
          console.log("An error has occured, the user did not register!")
        }  
      });
    }
  }