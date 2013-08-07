/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.evaluation.customer;

import java.io.Serializable;

public class Request implements Serializable {

    /**
     * Default ID.
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String personId;
    private Integer amount;
    private boolean valid;
    private String invalidReason;
    private boolean canceled;

    public Request(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setInvalid(String reason) {
        this.valid = false;
        this.invalidReason = reason;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid() {
        this.valid = true;
    }

    public String getInvalidReason() {
        return invalidReason;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public boolean equals(Object o) {
        if (o instanceof Request) {
            return this.id.equals(((Request) o).id);
        }
        return false;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

}
