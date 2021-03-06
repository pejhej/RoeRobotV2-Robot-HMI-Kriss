/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import Commands.Commando;
import java.nio.ByteBuffer;

/**
 *
 * @author PerEspen
 */

public class Move extends Commando
{
    private static final byte COMMAND_ADDRESS = 0x05;

  //The values for X, Z and Y movement
    private byte[] xValue;
    private byte[] yValue;
    private byte[] zValue;
    public Move()
    {
        super(COMMAND_ADDRESS);
        xValue = null;
        yValue = null;
        zValue = null;
    }
    
    
     public byte[] getxValue()
    {
        return xValue;
    }

    public void setxValue(byte[] xValue)
    {
        this.xValue = xValue;
    }

    public byte[] getyValue()
    {
        return yValue;
    }

    public void setyValue(byte[] yValue)
    {
        this.yValue = yValue;
    }

    public byte[] getzValue()
    {
        return zValue;
    }

    public void setzValue(byte[] zValue)
    {
        this.zValue = zValue;
    }
    
    
    /**
     * Set the byte[] value with an int of 2 significant numbers
     * @param intValue The int to set to value
     */
    public void setIntXValue(int intValue)
    {
        ByteBuffer dbuf = ByteBuffer.allocate(Integer.BYTES);
        dbuf.putInt(intValue);
         setxValue(dbuf.array()); // { 0, 1 }
    }

      /**
     * Set the byte[] value with an int of 2 significant numbers
     * @param intValue The int to set to value
     */
    public void setIntYValue(int intValue)
    {
        ByteBuffer dbuf = ByteBuffer.allocate(Integer.BYTES);
        dbuf.putInt(intValue);
         setyValue(dbuf.array()); // { 0, 1 }
    }
    
      /**
     * Set the byte[] value with an int of 2 significant numbers
     * @param intValue The int to set to value
     */
    public void setIntZValue(int intValue)
    {
        ByteBuffer dbuf = ByteBuffer.allocate(Integer.BYTES);
        dbuf.putInt(intValue);
         setzValue(dbuf.array()); // { 0, 1 }
    }
    
    
    /**
     * Returns byte[] value as int
     * @return  Returns byte[] value as int 
     */
     public int getIntYValue()
    {
        byte[] arr = getyValue();
        ByteBuffer wrapped = ByteBuffer.wrap(arr); // big-endian by default
        int num = wrapped.getInt();// 1
        
        return num;
    }
     
     
     
         /**
     * Set the byte[] value with an int of 2 significant numbers
     * @param intValue The int to set to value
     */
    public void setShortXValue(short intValue)
    {
        ByteBuffer dbuf = ByteBuffer.allocate(Short.BYTES);
        dbuf.putShort(intValue);
         setxValue(dbuf.array()); // { 0, 1 }
    }

         /**
     * Set the byte[] value with an int of 2 significant numbers
     * @param shortValue to set to value
     */
    public void setShortYValue(short shortValue)
    {
        ByteBuffer dbuf = ByteBuffer.allocate(Short.BYTES);
        dbuf.putShort(shortValue);
         setyValue(dbuf.array()); // { 0, 1 }
    }
    
            /**
     * Set the byte[] value with an int of 2 significant numbers
     * @param shortValue to set to value
     */
    public void setShortZValue(short shortValue)
    {
        ByteBuffer dbuf = ByteBuffer.allocate(Short.BYTES);
        dbuf.putShort(shortValue);
         setzValue(dbuf.array()); // { 0, 1 }
    }
    
    
    
        /**
 * Return the nr of bytes in the value
 * @return Return the nr of bytes in value as int
 */
    @Override
    public byte getNrOfBytesInByte()
    {
        int counter;
        int sum = getxValue().length + getzValue().length + getyValue().length;
        
         return (byte) sum ; // { 0, 1 }
    }
    
    
}
