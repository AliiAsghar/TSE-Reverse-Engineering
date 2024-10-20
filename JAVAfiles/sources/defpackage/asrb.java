package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asrb implements asrq {
    private byte a;
    private final asrk b;
    private final Inflater c;
    private final asrc d;
    private final CRC32 e;

    public asrb(asrq asrqVar) {
        asrqVar.getClass();
        asrk asrkVar = new asrk(asrqVar);
        this.b = asrkVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new asrc(asrkVar, inflater);
        this.e = new CRC32();
    }

    private final void c(asqu asquVar, long j, long j2) {
        asrl asrlVar = asquVar.a;
        asrlVar.getClass();
        while (true) {
            long j3 = asrlVar.c - asrlVar.b;
            if (j < j3) {
                break;
            }
            asrlVar = asrlVar.f;
            asrlVar.getClass();
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (asrlVar.b + j);
            int min = (int) Math.min(asrlVar.c - i, j2);
            this.e.update(asrlVar.a, i, min);
            asrlVar = asrlVar.f;
            asrlVar.getClass();
            j2 -= min;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + arsd.V(aotl.S(i2), 8) + " != expected 0x" + arsd.V(aotl.S(i), 8));
    }

    @Override // defpackage.asrq
    public final asrs a() {
        return this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        if (r0 == 2) goto L50;
     */
    @Override // defpackage.asrq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.asqu r18, long r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asrb.b(asqu, long):long");
    }

    @Override // defpackage.asrq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
