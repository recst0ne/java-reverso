/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

        
/**
 *
 * @author CDA03-02
 */
public class ExceptionMetier extends Exception {

    /**
     * Creates a new instance of <code>ExceptionMetier</code> without detail
     * message.
     */
    public ExceptionMetier() {
    }

    /**
     * Constructs an instance of <code>ExceptionMetier</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionMetier(String message) {
        super(message);
    }
}
