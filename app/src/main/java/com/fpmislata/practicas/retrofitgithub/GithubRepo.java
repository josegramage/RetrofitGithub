package com.fpmislata.practicas.retrofitgithub;

/**
 * Created by joso on 02/02/2017.
 */

public class GithubRepo {

    String name;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
