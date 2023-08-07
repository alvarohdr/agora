import { Descendent } from "./Descendent";
import { User } from "./User";

export type Message = {
    header: string;
    body: string;
    sender: User;
    receiver: User;
    descendent: Descendent;
}