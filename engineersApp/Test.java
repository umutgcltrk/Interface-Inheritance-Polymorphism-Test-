package com.company.engineersApp;

import javax.naming.directory.SchemaViolationException;

public class Test {
    public static void main(String[] args) {
        Engineer engineerYazılım = new SoftwareEngineer(); //Upcasting
        SoftwareEngineer hasYazılımcı = (SoftwareEngineer) engineerYazılım; //Downcasting
        engineerYazılım.work();
        hasYazılımcı.writeCode();
        hasYazılımcı.work();

        JavaEnthusiast javaManyagi = new JavaEnthusiast();
        javaManyagi.writeJava(hasYazılımcı);

        Blogger blogger = new Blogger("Java da polymorphism");
        blogger.writeBlog(hasYazılımcı);

        InstumentPlayer instumentPlayer = new InstumentPlayer("Saz ");
        instumentPlayer.play(hasYazılımcı);

        Parent parent = new Parent("Ahmetcan");
        parent.giveMoneyToChild(hasYazılımcı);

        Engineer kaynakMuhendisi = new MachineEngineer();
        MachineEngineer hasKaynakMüh = (MachineEngineer) kaynakMuhendisi;
        hasKaynakMüh.work();
        hasKaynakMüh.doWelding();

        InstumentPlayer instumentPlayer1 = new InstumentPlayer("Keman");
        instumentPlayer1.play(hasKaynakMüh);

    }
}
