import { IonButton, IonCard, IonCardContent, IonContent, IonHeader, IonInput, IonItem, IonPage, IonSelect, IonSelectOption, IonTextarea, IonTitle, IonToolbar } from '@ionic/react';
import ExploreContainer from '../components/ExploreContainer';
import './Tab3.css';
import { descendent, users } from '../data';

const Tab3: React.FC = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Tab 3</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent fullscreen>
        {
          //Si solo existe un partner o un hijo, no mostrar menú de elección sino autorrellenar campo
        }
        <IonCard>
          <IonCardContent>

            <IonItem>
              <IonSelect label="Receiver" interface="popover" placeholder="Select One">
                {users.map((user, index) => {
                  return (
                    <IonSelectOption key={index} value={user.name}>{user.name}</IonSelectOption>
                  );
                })}
              </IonSelect>
            </IonItem>

            <IonItem>
              <IonSelect label="Descendent" interface="popover" placeholder="Select One">
                <IonSelectOption value={descendent.name}>{descendent.name}</IonSelectOption>
              </IonSelect>
            </IonItem>

            <IonInput label="Header" labelPlacement="floating" fill="outline"></IonInput>

            <IonItem>
              <IonTextarea
                placeholder="Type something here"
                autoGrow={true}
              ></IonTextarea>
            </IonItem>
            
            <IonButton expand='block'>Send</IonButton>
          </IonCardContent>
        </IonCard>
      </IonContent>
    </IonPage>
  );
};

export default Tab3;
