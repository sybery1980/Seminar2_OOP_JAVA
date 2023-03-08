import java.util.ArrayList;

public class Zoo {
        private ArrayList <Animal>zoo;
        public Zoo() {
            this.zoo = new ArrayList();
            Tiger tiger = new Tiger( "Вася",1 ,"Черно-оранжевый",40);
            Cat cat = new Cat("Петя",1,"черный");
            zoo.add(tiger);
            zoo.add(cat);

        }


    }

