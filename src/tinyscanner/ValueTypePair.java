/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinyscanner;

/**
 *
 * @author shaza
 */
public class ValueTypePair {
    private final String value;
    private final String type;
    private int length;
    public ValueTypePair(String v, String t, int l){
        this.value = v;
        this.type = t;
        this.length = l;
    }
    public String getTokenValue(){ return value;}
    public String getTokenType(){ return type;}
    public int getTokenLength(){ return length;}
}
