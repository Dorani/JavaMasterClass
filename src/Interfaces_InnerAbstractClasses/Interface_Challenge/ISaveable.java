package Interfaces_InnerAbstractClasses.Interface_Challenge;

import java.util.List;

public interface ISaveable {
    //Save, write the data in the format of stringed Array List
    List<String> write();
    //Reading the data from the data structure
    void read(List<String> savedValues);
}
