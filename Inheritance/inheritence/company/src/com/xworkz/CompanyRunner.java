package com.xworkz;

import com.xworkz.accenture.Accenture;
import com.xworkz.ibm.Ibm;
import com.xworkz.texcus.Texcus;
import com.xworkz.trinity.Trinity;
import com.xworkz.tvs.Tvs;

public class CompanyRunner {
    public static void main(String[] args) {
        Accenture accenture=new Accenture();
        accenture.service();

        Ibm ibm= new Ibm();
        ibm.service();

        Texcus texcus = new Texcus();
        texcus.service();

        Tvs tvs = new Tvs();
        tvs.service();

        Trinity trinity = new Trinity();
        trinity.service();
    }
}
