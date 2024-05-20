import { Injectable } from '@angular/core';
import { Course } from '../model/course';
import { HttpClient } from '@angular/common/http';
import { tap, first, delay } from 'rxjs/operators';





@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private readonly API  = '/assets/courses.jsona';

  constructor(private httpClient: HttpClient) { }

  list(){

    return this.httpClient.get<Course[]>(this.API)
    .pipe(
      first(),
      delay(15000),
      tap(courses => console.log(courses))
    );
    //[{_id: '1', name: 'Angular', category:'Front-end'}]
  }
}
