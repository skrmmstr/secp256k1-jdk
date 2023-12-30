// Generated by jextract

package org.consensusj.secp256k1;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet lang=c :
 * int (*secp256k1_nonce_function_hardened)(unsigned char* nonce32,unsigned char* msg,unsigned long msglen,unsigned char* key32,unsigned char* xonly_pk32,unsigned char* algo,unsigned long algolen,void* data);
 * }
 */
public interface secp256k1_nonce_function_hardened {

    int apply(java.lang.foreign.MemorySegment nonce32, java.lang.foreign.MemorySegment msg, long msglen, java.lang.foreign.MemorySegment key32, java.lang.foreign.MemorySegment xonly_pk32, java.lang.foreign.MemorySegment algo, long algolen, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(secp256k1_nonce_function_hardened fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$12.const$3, fi, constants$12.const$2, scope);
    }
    static secp256k1_nonce_function_hardened ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _nonce32, java.lang.foreign.MemorySegment _msg, long _msglen, java.lang.foreign.MemorySegment _key32, java.lang.foreign.MemorySegment _xonly_pk32, java.lang.foreign.MemorySegment _algo, long _algolen, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$12.const$4.invokeExact(symbol, _nonce32, _msg, _msglen, _key32, _xonly_pk32, _algo, _algolen, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


