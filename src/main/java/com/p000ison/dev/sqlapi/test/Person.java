package com.p000ison.dev.sqlapi.test;

import com.p000ison.dev.sqlapi.TableObject;
import com.p000ison.dev.sqlapi.annotation.DatabaseColumn;
import com.p000ison.dev.sqlapi.annotation.DatabaseColumnGetter;
import com.p000ison.dev.sqlapi.annotation.DatabaseColumnSetter;
import com.p000ison.dev.sqlapi.annotation.DatabaseTable;

@DatabaseTable(name = "tablenamea")
public class Person implements TableObject {

    private String formattedName= "p";

    @DatabaseColumn(position = 1, id = true, databaseName = "id",primary = true, unique = true)
    private int id;

    @DatabaseColumn(position = 2, databaseName = "name")
    public String name = "b";


    public Person()
    {
    }

    @DatabaseColumnSetter(position = 3, databaseName = "fname")
    public void setFormattedName(String formattedName)
    {
        this.formattedName = formattedName.replace(' ', '_');
    }

    @DatabaseColumnGetter(databaseName = "fname")
    public String getFormattedName()
    {
        return formattedName;
    }
}
