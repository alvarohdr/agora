import { Descendent } from "./model/Descendent";
import { Message } from "./model/Message";
import { DescendentRelation, User } from "./model/User";

export const users:User[] = [
    {
      name: "Alvaro",
      surnames: "Hernandez",
      email: "alvaro@gmail.com",
    },
    {
      name: "Idaira",
      surnames: "Martín",
      email: "idaira@gmail.com",
    }
  ];
  
export const descendent: Descendent = {
name: "Hijo1"
}
  
export const relation:DescendentRelation[] = [
    {
        namePartner1: users[0],
        namePartner2: users[0],
        nameDescendent: descendent
}
];

export const messages: Message[] = [
    {
        header: "Asunto1",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto2",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto3",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto4",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto5",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto6",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto7",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto8",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
    {
        header: "Asunto9",
        body: "Esto es un mensaje",
        sender: users[0],
        receiver: users[1],
        descendent: descendent
    },
]