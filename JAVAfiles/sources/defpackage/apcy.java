package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apcy extends apda {
    public apcy(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.apda
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // defpackage.apda
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.apda
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.apda
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.apda
    public final void e(Object obj, long j, boolean z) {
        if (apdb.d) {
            apdb.o(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            apdb.p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.apda
    public final void f(Object obj, long j, byte b) {
        if (apdb.d) {
            apdb.o(obj, j, b);
        } else {
            apdb.p(obj, j, b);
        }
    }

    @Override // defpackage.apda
    public final void g(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.apda
    public final void h(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.apda
    public final boolean i(Object obj, long j) {
        if (apdb.d) {
            return apdb.x(obj, j);
        }
        return apdb.y(obj, j);
    }
}
