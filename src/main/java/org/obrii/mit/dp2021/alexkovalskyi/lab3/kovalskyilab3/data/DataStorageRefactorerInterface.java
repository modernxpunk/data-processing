/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.obrii.mit.dp2021.alexkovalskyi.lab3.kovalskyilab3.data;

import java.util.List;
/**
 *
 * @author alex
 */

public interface DataStorageRefactorerInterface {
    void createDataList(Data data);
    List<Data> readDataList();
    void updateDataList(int id, Data data);
    void deleteDataList(int id);
    void writeDataList(List<Data> data);
}