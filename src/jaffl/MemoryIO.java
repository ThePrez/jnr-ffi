/* 
 * Copyright (C) 2007, 2008 Wayne Meissner
 * 
 * This file is part of jffi.
 *
 * This code is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU Lesser General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License 
 * version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with this work.  If not, see <http://www.gnu.org/licenses/>.
 */

package jaffl;

import java.nio.charset.Charset;


/**
 * Interface to reading/writing various types of memory
 */
public interface MemoryIO {
    abstract public byte getByte(long offset);
    abstract public short getShort(long offset);
    abstract public int getInt(long offset);
    abstract public long getLong(long offset);
    abstract public float getFloat(long offset);
    abstract public double getDouble(long offset);
    abstract public void putByte(long offset, byte value);
    abstract public void putShort(long offset, short value);
    abstract public void putInt(long offset, int value);
    abstract public void putLong(long offset, long value);
    abstract public void putFloat(long offset, float value);
    abstract public void putDouble(long offset, double value);
    abstract public void get(long offset, byte[] dst, int off, int len);
    abstract public void put(long offset, byte[] dst, int off, int len);
    abstract public void get(long offset, short[] dst, int off, int len);
    abstract public void put(long offset, short[] dst, int off, int len);
    abstract public void get(long offset, int[] dst, int off, int len);
    abstract public void put(long offset, int[] dst, int off, int len);
    abstract public void get(long offset, long[] dst, int off, int len);
    abstract public void put(long offset, long[] dst, int off, int len);
    abstract public void get(long offset, float[] dst, int off, int len);
    abstract public void put(long offset, float[] dst, int off, int len);
    abstract public void get(long offset, double[] dst, int off, int len);
    abstract public void put(long offset, double[] dst, int off, int len);
    abstract public MemoryIO getMemoryIO(long offset);
    abstract public MemoryIO getMemoryIO(long offset, long size);
    abstract public Pointer getPointer(long offset);
    abstract public void putPointer(long offset, Pointer value);
    abstract public int indexOf(long offset, byte value);    
    abstract public int indexOf(long offset, byte value, int maxlen);
    abstract public boolean isDirect();
    abstract public long getAddress(long offset);
    
    abstract public void putAddress(long offset, long value);
    abstract public void putAddress(long offset, Address value);
    abstract public long getNativeLong(long offset);
    abstract public void putNativeLong(long offset, long value);
    abstract public String getString(long offset, int maxLength, Charset cs);
    abstract public void putString(long offset, String string, int maxLength, Charset cs);

    abstract public MemoryIO slice(long offset);
    abstract public MemoryIO slice(long offset, long size);

    abstract public void transferTo(long offset, MemoryIO other, long otherOffset, long count);
}