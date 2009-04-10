package org.lamport.tla.toolbox.tool.tlc.ui.editor.validator;


/**
 * Interface of validateble parts
 * @author Simon Zambrovski
 * @version $Id$
 */
public interface IValidateble
{

    /**
     * @param oldInput
     * @param newInput
     */
    public void validate();

}
