package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xru implements xrw {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final agnq b;
    public final armf c;
    public final rjq d;
    public final rdi e;
    public final xnv f;
    public final oge g;
    public final rcw h;
    public final yyt i;
    private final anen j;

    public xru(agnq agnqVar, anen anenVar, armf armfVar, rjq rjqVar, rcw rcwVar, yyt yytVar, rdi rdiVar, xnv xnvVar, oge ogeVar) {
        this.j = anenVar;
        this.b = agnqVar;
        this.c = armfVar;
        this.d = rjqVar;
        this.h = rcwVar;
        this.i = yytVar;
        this.e = rdiVar;
        this.f = xnvVar;
        this.g = ogeVar;
    }

    @Override // defpackage.xrw
    public final akul a(final xss xssVar, Optional optional) {
        final Optional map = optional.map(new xos(5));
        alwl alwlVar = (alwl) a.g();
        alwlVar.X(ydl.e, xssVar.a.toString());
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadSucceeded", 101, "FileUploadCallbackHandler.java")).q("Upload succeeded callback is called.");
        return aktp.aj(new ancr() { // from class: xrt
            /* JADX WARN: Removed duplicated region for block: B:32:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0183  */
            @Override // defpackage.ancr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 499
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xrt.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.j);
    }
}
