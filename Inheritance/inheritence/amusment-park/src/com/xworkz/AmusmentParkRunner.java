package com.xworkz;

import com.xworkz.esselworld.EsselWorld;
import com.xworkz.grs.Grs;
import com.xworkz.imagica.Imagica;
import com.xworkz.queensland.QueensLand;
import com.xworkz.wonderla.Wonderla;

public class AmusmentParkRunner {
    public static void main(String[] args) {
        EsselWorld esselWorld = new EsselWorld();
        esselWorld.enjoy();

        Grs grs = new Grs();
        grs.enjoy();

        Imagica imagica = new Imagica();
        imagica.enjoy();

        QueensLand queensLand = new QueensLand();
        queensLand.enjoy();

        Wonderla wonderla = new Wonderla();
        wonderla.enjoy();
    }
}
