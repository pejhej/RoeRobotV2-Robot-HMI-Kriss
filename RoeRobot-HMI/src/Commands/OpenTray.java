/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author PerEspen
 */
public class OpenTray extends Commando
{
    private static final byte COMMAND_ADDRESS = 0x23;

     
    public OpenTray( )
    {
        super(COMMAND_ADDRESS);
    }
    
}
