package defpackage;

import java.io.Closeable;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspf implements Closeable {
    public static final Logger a;
    public final asqw b;
    private final aspe c;
    private final asoj d;

    static {
        Logger logger = Logger.getLogger(asom.class.getName());
        logger.getClass();
        a = logger;
    }

    public aspf(asqw asqwVar) {
        asqwVar.getClass();
        this.b = asqwVar;
        aspe aspeVar = new aspe(asqwVar);
        this.c = aspeVar;
        this.d = new asoj(aspeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        throw new java.io.IOException(defpackage.a.bV(r3, "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List b(int r2, int r3, int r4, int r5) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspf.b(int, int, int, int):java.util.List");
    }

    private final void c() {
        this.b.f();
        this.b.d();
        byte[] bArr = asmt.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x04f4, code lost:
    
        if (r18 == 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04f6, code lost:
    
        r8.f(defpackage.asmt.b, true);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x006d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r20, defpackage.asou r21) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspf.a(boolean, asou):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
