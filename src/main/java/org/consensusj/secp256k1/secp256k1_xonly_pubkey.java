// Generated by jextract

package org.consensusj.secp256k1;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet lang=c :
 * struct secp256k1_xonly_pubkey {
 *     unsigned char data[64];
 * };
 * }
 */
public class secp256k1_xonly_pubkey {

    public static MemoryLayout $LAYOUT() {
        return constants$10.const$0;
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


