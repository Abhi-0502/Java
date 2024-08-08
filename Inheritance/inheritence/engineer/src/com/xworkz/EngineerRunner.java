package com.xworkz;

import com.xworkz.aiml.AiMl;
import com.xworkz.civilengineer.CivilEngineer;
import com.xworkz.csengineer.CsEngineer;
import com.xworkz.ecengineer.EcEngineer;
import com.xworkz.mechengineer.MechEngineer;

public class EngineerRunner {

    public static void main(String[] args) {
        System.out.println("main started");

        CsEngineer csEngineer = new CsEngineer();
        csEngineer.ProblemSolving();

        AiMl aiMl=new AiMl();
        aiMl.ProblemSolving();

        CivilEngineer civilEngineer = new CivilEngineer();
        civilEngineer.ProblemSolving();

        EcEngineer ecEngineer=new EcEngineer();
        ecEngineer.ProblemSolving();

        MechEngineer mechEngineer=new MechEngineer();
        mechEngineer.ProblemSolving();




        System.out.println("main ended");
    }


}
