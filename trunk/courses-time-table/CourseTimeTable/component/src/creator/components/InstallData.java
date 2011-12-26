/*
 * File: InstallData.java
 * Auth: Creator
 * Date: 06 februarie 2008, 21:09
 ********************************************
 Copyright (C) 2007  Bogdan
 
 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License.
 
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 ********************************************
 */

package creator.components;

/**
 *
 * @author Creator
 */
public class InstallData {
    
    
    public String m_name;
    protected int m_size;
    protected boolean m_selected;
    
    /** Creates a new instance of InstallData */
    public InstallData(String name,Boolean value) {
        m_name = name;
        m_selected = value;
    }
    public InstallData(String name) {
        this(name,false);
    }
    
    public String getName() {
        return m_name;
    }
    
    public void setSelected(boolean selected) {
        m_selected = selected;
    }
    
    public void invertSelected() {
        m_selected = !m_selected;
    }
    
    public boolean isSelected() {
        return m_selected;
    }
    
    public String toString() {
        return m_name;
    }
    
}
