// Generated by jextract

package org.consensusj.secp256k1;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$12 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$12() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "secp256k1_keypair_xonly_pub",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "secp256k1_keypair_xonly_tweak_add",
        constants$4.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(secp256k1_nonce_function_hardened.class, "apply", constants$12.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$12.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(secp256k1_nonce_function_bip340.class, "apply", constants$12.const$2);
}


