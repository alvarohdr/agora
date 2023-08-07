import { IonCard, IonCardContent, IonCardHeader, IonCardSubtitle, IonCardTitle, IonContent, IonHeader, IonPage, IonText, IonTitle, IonToolbar } from '@ionic/react';
import ExploreContainer from '../components/ExploreContainer';
import './Tab1.css';
import { DescendentRelation, User } from '../model/User';
import { Descendent } from '../model/Descendent';
import { Message } from '../model/Message';
import { messages } from '../data';

const Tab1: React.FC = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>ÁGORA</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen>
        <IonContent>
          {messages.map((message, index) => {
            return (
                <IonCard key={index}>
                  <IonCardHeader>
                    <IonCardTitle>{message.header}</IonCardTitle>
                    <IonCardSubtitle>{message.descendent.name}</IonCardSubtitle>
                    <IonCardSubtitle>{message.sender.name}</IonCardSubtitle>
                  </IonCardHeader>

                  <IonCardContent>{message.body}</IonCardContent>
                </IonCard>
            );
          })}
        </IonContent>

      </IonContent>
    </IonPage>
  );
};

export default Tab1;


