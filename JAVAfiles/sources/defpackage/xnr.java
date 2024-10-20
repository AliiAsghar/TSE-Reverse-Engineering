package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnr implements xns {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater");
    public static final String[] b = {"_id", "chset"};
    public static final Uri c;
    public final armf d;
    public final armf e;
    public final arwe f;
    private final armf g;

    static {
        Uri parse = Uri.parse("content://mms/part");
        parse.getClass();
        c = parse;
    }

    public xnr(armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.d = armfVar;
        this.e = armfVar2;
        this.g = armfVar3;
        this.f = arweVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[Catch: all -> 0x00a5, LOOP:0: B:13:0x007f->B:15:0x0085, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00a5, blocks: (B:12:0x0079, B:13:0x007f, B:15:0x0085), top: B:11:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.xnp
            if (r0 == 0) goto L13
            r0 = r12
            xnp r0 = (defpackage.xnp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xnp r0 = new xnp
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            xnr r0 = r0.d
            defpackage.aqil.P(r12)
            goto L77
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L32:
            defpackage.aqil.P(r12)
            armf r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            atsg r5 = (defpackage.atsg) r5
            android.net.Uri r6 = defpackage.xnr.c
            java.lang.String r12 = "DISTINCT chset"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            java.util.Locale r12 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r9 = "chset"
            r8[r3] = r9
            r8[r4] = r9
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String r8 = "%s IS NOT NULL AND %s != 0"
            java.lang.String r8 = java.lang.String.format(r12, r8, r2)
            r8.getClass()
            r9 = 0
            r10 = 0
            andc r12 = r5.h(r6, r7, r8, r9, r10)
            arwe r2 = r11.f
            arwl r12 = defpackage.qjh.n(r12, r2)
            r0.d = r11
            r0.c = r4
            arxw r12 = (defpackage.arxw) r12
            java.lang.Object r12 = r12.hk(r0)
            if (r12 == r1) goto Lac
            r0 = r11
        L77:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r1 = r12
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch: java.lang.Throwable -> La5
            r1.getClass()     // Catch: java.lang.Throwable -> La5
        L7f:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> La5
            if (r2 == 0) goto L9e
            java.lang.String r2 = r1.getString(r3)     // Catch: java.lang.Throwable -> La5
            r2.getClass()     // Catch: java.lang.Throwable -> La5
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> La5
            armf r4 = r0.g     // Catch: java.lang.Throwable -> La5
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> La5
            mbl r4 = (defpackage.mbl) r4     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = "Bugle.Telephony.Parts.Charset.Counts"
            r4.e(r5, r2)     // Catch: java.lang.Throwable -> La5
            goto L7f
        L9e:
            r0 = 0
            defpackage.armd.i(r12, r0)
            arnb r12 = defpackage.arnb.a
            return r12
        La5:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La7
        La7:
            r1 = move-exception
            defpackage.armd.i(r12, r0)
            throw r1
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnr.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00d9 -> B:10:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r14, defpackage.arpe r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnr.b(java.util.List, arpe):java.lang.Object");
    }
}
