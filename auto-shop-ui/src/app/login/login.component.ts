import { Component, OnInit } from "@angular/core";
import {HttpService} from "../services/http.service";

@Component({
    selector: "app-login",
    templateUrl: "./login.component.html",
    styleUrls: ["./login.component.scss"]
})
export class LoginComponent implements OnInit {

    constructor(private httpService: HttpService) {
    }

    ngOnInit(): void {
        this.httpService.getLoginView();
    }

}
