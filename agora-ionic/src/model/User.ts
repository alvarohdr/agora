import { Descendent } from "./Descendent";

export type User = {
    name: string;
    surnames: string;
    email: string;
}

export type DescendentRelation = {
    namePartner1: User;
    namePartner2: User;
    nameDescendent: Descendent;
}