package com.puppycrawl.tools.checkstyle.checks.annotation;

public class NotOverride
{
    /**
     * {@inheritDoc}
     */
    private void bleh() {

    }

    /**
     * {@inheritDoc}
     */
    public static void eh() {

    }
    
    /**
     * {@inheritDoc}
     */
    public String junk = "";
    
    void dodoo() {}
}
