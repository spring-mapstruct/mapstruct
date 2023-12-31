/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._2907;

public class Target {

    private TargetNested[] nested;

    public TargetNested[] getNested() {
        return nested;
    }

    public void setNested(TargetNested[] nested) {
        this.nested = nested;
    }

    public static class TargetNested {
        private String prop;

        public String getProp() {
            return prop;
        }

        public void setProp(String prop) {
            this.prop = prop;
        }
    }
}
