import {Component, OnInit} from '@angular/core';
import {User} from "./user";
import {UserService} from './user.service';
import {error} from "@angular/compiler-cli/src/transformers/util";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{
  public users: User[] | undefined;

  constructor(private  userService: UserService) {}

  ngOnInit() {
    this.getUsers();
  }

  public getUsers(): void {
      this.userService.findAll().subscribe(
        (response: User[]) => {
          this.users = response;
        },
        (error: HttpErrorResponse) => {
          alert(error.message)
        }
      )
    }
}
