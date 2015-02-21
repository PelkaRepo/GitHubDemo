package org.pelka.demo.gitdemo.rest.model;

/**
 * This artifact represents a served data model, with
 * accesors and mutators for that model.
 * 
 * @author arnoldpelka
 *
 */
public class MyModel {
	private final long id;
    private final String content;

    public MyModel(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
