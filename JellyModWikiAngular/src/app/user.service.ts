import { HttpClient } from '@angular/common/http';
import { User } from './user';
import {Observable} from "rxjs";
import {Injectable} from "@angular/core";

@Injectable()
export class UserService {

  private readonly apiServerUrl = 'http://localhost:8080/api/users';

  constructor(private http: HttpClient) {
  }

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.apiServerUrl);
  }

  public addUser(user: User) {
    return this.http.post<User>(this.apiServerUrl, user);
  }
}
