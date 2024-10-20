package defpackage;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjl extends aqzg {
    private final asqu a;

    public arjl(asqu asquVar) {
        this.a = asquVar;
    }

    @Override // defpackage.aqzg, defpackage.arfh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.z();
    }

    @Override // defpackage.arfh
    public final int e() {
        try {
            return this.a.d() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // defpackage.arfh
    public final int f() {
        return (int) this.a.b;
    }

    @Override // defpackage.arfh
    public final arfh g(int i) {
        asqu asquVar = new asqu();
        asquVar.hq(this.a, i);
        return new arjl(asquVar);
    }

    @Override // defpackage.arfh
    public final void i(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.arfh
    public final void j(OutputStream outputStream, int i) {
        outputStream.getClass();
        asqu asquVar = this.a;
        long j = i;
        aotl.T(asquVar.b, 0L, j);
        asrl asrlVar = asquVar.a;
        while (j > 0) {
            asrlVar.getClass();
            int min = (int) Math.min(j, asrlVar.c - asrlVar.b);
            outputStream.write(asrlVar.a, asrlVar.b, min);
            int i2 = asrlVar.b + min;
            asrlVar.b = i2;
            long j2 = min;
            asquVar.b -= j2;
            j -= j2;
            if (i2 == asrlVar.c) {
                asrl a = asrlVar.a();
                asquVar.a = a;
                asrm.b(asrlVar);
                asrlVar = a;
            }
        }
    }

    @Override // defpackage.arfh
    public final void k(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int e = this.a.e(bArr, i, i2);
            if (e != -1) {
                i2 -= e;
                i += e;
            } else {
                throw new IndexOutOfBoundsException(a.cb(i2, "EOF trying to read ", " bytes"));
            }
        }
    }

    @Override // defpackage.arfh
    public final void l(int i) {
        try {
            this.a.B(i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }
}
