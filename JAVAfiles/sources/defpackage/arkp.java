package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arkp implements Closeable {
    public final asqw a;
    public final arkk b;
    private final arkn c;

    public arkp(asqw asqwVar) {
        this.a = asqwVar;
        arkn arknVar = new arkn(asqwVar);
        this.c = arknVar;
        this.b = new arkk(arknVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        throw new java.io.IOException(defpackage.a.bV(r3, "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(int r2, short r3, byte r4, int r5) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arkp.a(int, short, byte, int):java.util.List");
    }

    public final void b() {
        this.a.f();
        this.a.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
