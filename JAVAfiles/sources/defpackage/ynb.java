package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynb {
    private static final utz a = uuh.i(uuh.b, "enable_spam_clearcut_logging", true);
    private final armf b;
    private final armf c;
    private final armf d;
    private final xnv e;
    private final arwe f;

    public ynb(armf armfVar, armf armfVar2, armf armfVar3, xnv xnvVar, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        xnvVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = xnvVar;
        this.f = arweVar;
    }

    private final long c(long j) {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.amyy r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yna
            if (r0 == 0) goto L13
            r0 = r7
            yna r0 = (defpackage.yna) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yna r0 = new yna
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            amyy r6 = r0.e
            ynb r0 = r0.d
            defpackage.aqil.P(r7)
            goto L5a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r7)
            utz r7 = defpackage.ynb.a
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La1
            armf r7 = r5.d
            java.lang.Object r7 = r7.b()
            lru r7 = (defpackage.lru) r7
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            r0 = r5
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L63
            goto La1
        L63:
            armf r7 = r0.c
            java.lang.Object r7 = r7.b()
            abnr r7 = (defpackage.abnr) r7
            armf r1 = r0.b
            java.lang.Object r1 = r1.b()
            android.content.Context r1 = (android.content.Context) r1
            amyz r2 = new amyz
            r2.<init>()
            abom r1 = defpackage.aglt.b(r1, r2)
            abnq r6 = r7.h(r6, r1)
            xnv r7 = r0.e
            j$.time.Instant r7 = r7.f()
            long r1 = r7.toEpochMilli()
            long r1 = r0.c(r1)
            xnv r7 = r0.e
            long r3 = r7.a()
            long r3 = r0.c(r3)
            r6.j(r1, r3)
            r6.c()
            arnb r6 = defpackage.arnb.a
            return r6
        La1:
            arnb r6 = defpackage.arnb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynb.a(amyy, arpe):java.lang.Object");
    }

    public final void b(amyy amyyVar) {
        qjh.l(this.f, null, new xgk(this, amyyVar, (arpe) null, 16), 3);
    }
}
