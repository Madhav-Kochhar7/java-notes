package com.streamify.music.catalog;

import com.streamify.music.models.*;
import com.streamify.music.utils.*;;
public class catalogDemo {
    static void main(){
        song song1 = new song("Flashing Lights", 99999);
        song1.showSummary();
        songPrinter.printGenre(song1);
    }
}
