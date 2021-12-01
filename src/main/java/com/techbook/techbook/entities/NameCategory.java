package com.techbook.techbook.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum NameCategory {

    INFORMATICA("informatica",0),

    FICCAO("ficcao",1),

    DIREITO("direito", 2),

    INFANTIL("infantil", 3);

    String nameCategory = "";
    int index;

}
