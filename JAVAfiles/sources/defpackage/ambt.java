package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes4.dex */
enum ambt implements ambr {
    UNSAFE_LITTLE_ENDIAN,
    UNSAFE_BIG_ENDIAN;

    private static final Unsafe c;
    private static final int d;

    static {
        Unsafe b = b();
        c = b;
        d = b.arrayBaseOffset(byte[].class);
        if (b.arrayIndexScale(byte[].class) == 1) {
        } else {
            throw new AssertionError();
        }
    }

    private static Unsafe b() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ambs
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        return aetn.be();
                    }
                });
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.ambr
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Long.reverseBytes(c.getLong(bArr, i + d));
            }
            throw null;
        }
        return c.getLong(bArr, i + d);
    }
}
