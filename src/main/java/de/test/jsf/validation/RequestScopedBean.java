/**
 * Copyright (c) 2017-2017, Freistaat Bayern
 *
 * This software is unless otherwise specified property of the State of Bavaria.
 *
 * Unless required by applicable law or agreed to in writing, this software is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.
 */
package de.test.jsf.validation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Named
@RequestScoped
public class RequestScopedBean {

    @NotNull
    String notNull1;

    @NotNull
    String notNull2;

    @NotEmpty
    String notEmpty1;

    @NotEmpty
    String notEmpty2;

    String nullable1;

    String nullable2;

    @NotNull
    Long notNullLong;

    Long nullableLong;

    public String getNotEmpty1() {
        return this.notEmpty1;
    }

    public String getNotEmpty2() {
        return this.notEmpty2;
    }

    public String getNotNull1() {
        return this.notNull1;
    }

    public String getNotNull2() {
        return this.notNull2;
    }

    public Long getNotNullLong() {
        return this.notNullLong;
    }

    public String getNullable1() {
        return this.nullable1;
    }

    public String getNullable2() {
        return this.nullable2;
    }

    public Long getNullableLong() {
        return this.nullableLong;
    }

    public String save() {
        System.out.println("___REQUEST_SCOPED_BEAN___=" + this);
        return "";
    }

    public void setNotEmpty1(final String notEmpty1) {
        this.notEmpty1 = notEmpty1;
    }

    public void setNotEmpty2(final String notEmpty2) {
        this.notEmpty2 = notEmpty2;
    }

    public void setNotNull1(final String notNull1) {
        this.notNull1 = notNull1;
    }

    public void setNotNull2(final String notNull2) {
        this.notNull2 = notNull2;
    }

    public void setNotNullLong(final Long notNullLong) {
        this.notNullLong = notNullLong;
    }

    public void setNullable1(final String nullable1) {
        this.nullable1 = nullable1;
    }

    public void setNullable2(final String nullable2) {
        this.nullable2 = nullable2;
    }

    public void setNullableLong(final Long nullableLong) {
        this.nullableLong = nullableLong;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RequestScopedBean [notNull1=");
        builder.append(this.notNull1);
        builder.append(", notNull2=");
        builder.append(this.notNull2);
        builder.append(", notEmpty1=");
        builder.append(this.notEmpty1);
        builder.append(", notEmpty2=");
        builder.append(this.notEmpty2);
        builder.append(", nullable1=");
        builder.append(this.nullable1);
        builder.append(", nullable2=");
        builder.append(this.nullable2);
        builder.append(", notNullLong=");
        builder.append(this.notNullLong);
        builder.append(", nullableLong=");
        builder.append(this.nullableLong);
        builder.append("]");
        return builder.toString();
    }
}
