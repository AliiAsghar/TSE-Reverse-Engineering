package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asrg implements asro {
    private final OutputStream a;
    private final asrs b;

    public asrg(OutputStream outputStream, asrs asrsVar) {
        this.a = outputStream;
        this.b = asrsVar;
    }

    @Override // defpackage.asro
    public final asrs a() {
        return this.b;
    }

    @Override // defpackage.asro, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.asro, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.asro
    public final void hq(asqu asquVar, long j) {
        aotl.T(asquVar.b, 0L, j);
        while (j > 0) {
            this.b.l();
            asrl asrlVar = asquVar.a;
            asrlVar.getClass();
            int min = (int) Math.min(j, asrlVar.c - asrlVar.b);
            this.a.write(asrlVar.a, asrlVar.b, min);
            int i = asrlVar.b + min;
            asrlVar.b = i;
            long j2 = min;
            asquVar.b -= j2;
            j -= j2;
            if (i == asrlVar.c) {
                asquVar.a = asrlVar.a();
                asrm.b(asrlVar);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.a + ")";
    }
}
