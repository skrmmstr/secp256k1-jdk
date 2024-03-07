// Generated by jextract

package org.bitcoinj.secp256k1.foreign.jextract;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     unsigned char magic[4];
 *     secp256k1_nonce_function_hardened noncefp;
 *     void *ndata;
 * }
 * }
 */
public class secp256k1_schnorrsig_extraparams {

    secp256k1_schnorrsig_extraparams() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, secp256k1_h.C_CHAR).withName("magic"),
        MemoryLayout.paddingLayout(4),
        secp256k1_h.C_POINTER.withName("noncefp"),
        secp256k1_h.C_POINTER.withName("ndata")
    ).withName("$anon$82:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout magic$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char magic[4]
     * }
     */
    public static final SequenceLayout magic$layout() {
        return magic$LAYOUT;
    }

    private static final long magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char magic[4]
     * }
     */
    public static final long magic$offset() {
        return magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char magic[4]
     * }
     */
    public static MemorySegment magic(MemorySegment struct) {
        return struct.asSlice(magic$OFFSET, magic$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char magic[4]
     * }
     */
    public static void magic(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, magic$OFFSET, magic$LAYOUT.byteSize());
    }

    private static long[] magic$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char magic[4]
     * }
     */
    public static long[] magic$dimensions() {
        return magic$DIMS;
    }
    private static final VarHandle magic$ELEM_HANDLE = magic$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char magic[4]
     * }
     */
    public static byte magic(MemorySegment struct, long index0) {
        return (byte)magic$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char magic[4]
     * }
     */
    public static void magic(MemorySegment struct, long index0, byte fieldValue) {
        magic$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final AddressLayout noncefp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("noncefp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * secp256k1_nonce_function_hardened noncefp
     * }
     */
    public static final AddressLayout noncefp$layout() {
        return noncefp$LAYOUT;
    }

    private static final long noncefp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * secp256k1_nonce_function_hardened noncefp
     * }
     */
    public static final long noncefp$offset() {
        return noncefp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * secp256k1_nonce_function_hardened noncefp
     * }
     */
    public static MemorySegment noncefp(MemorySegment struct) {
        return struct.get(noncefp$LAYOUT, noncefp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * secp256k1_nonce_function_hardened noncefp
     * }
     */
    public static void noncefp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(noncefp$LAYOUT, noncefp$OFFSET, fieldValue);
    }

    private static final AddressLayout ndata$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ndata"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *ndata
     * }
     */
    public static final AddressLayout ndata$layout() {
        return ndata$LAYOUT;
    }

    private static final long ndata$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *ndata
     * }
     */
    public static final long ndata$offset() {
        return ndata$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *ndata
     * }
     */
    public static MemorySegment ndata(MemorySegment struct) {
        return struct.get(ndata$LAYOUT, ndata$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *ndata
     * }
     */
    public static void ndata(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ndata$LAYOUT, ndata$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

