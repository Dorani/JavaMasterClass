package Packages_Pub_Priv_Scope_Access.Access_Modifiers;

/**
 * Created by dev on 19/11/2015.
 */

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?\
    //its set to package private, so accesible to all classes within our package_pub_priv etc
// 2. the int variable SOME_CONSTANT?
    //set to public, so all interface var are pub static final
// 3. methodA?
    //public, cause all interfaces methods are public
// 4. methodB and methodC?
    //public, cause all interfaces methods are public
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}


