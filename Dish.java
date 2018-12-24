package ru.mirea.arkabaev.lab3;

import java.lang.String;

public	class	Dish	{
    protected String	material;
    protected String	color;

    public	Dish(String	material,	String	color)	{
        this.material	=	material;
        this.color	=	color;
    }

    public	String	getMaterial()	{
        return	material;
    }
    public	void	setMaterial(String	material)	{
        this.material	=	material;
    }
    public	String	getColor()	{
        return	color;
    }
    public	void	setColor(String	color)	{
        this.color	=	color;
    }

    @Override
    public java.lang.String toString() {
        return "Dish{" +
                "material=" + material +
                ", color=" + color +
                '}';
    }
}


