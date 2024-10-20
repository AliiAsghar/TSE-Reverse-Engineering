package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfl extends unp {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("BugleTelephony");
    private static final ContentValues c;
    private final arpi d;
    private final arwe e;
    private final mbl f;
    private final atsg g;

    static {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ct_cls", (Integer) 135);
        c = contentValues;
    }

    public wfl(arpi arpiVar, arwe arweVar, atsg atsgVar, mbl mblVar) {
        arpiVar.getClass();
        arweVar.getClass();
        atsgVar.getClass();
        mblVar.getClass();
        this.d = arpiVar;
        this.e = arweVar;
        this.g = atsgVar;
        this.f = mblVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("MarkRcsMessagesInTelephonyWorkerHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c2;
        wfg wfgVar = (wfg) apbtVar;
        wfgVar.getClass();
        c2 = qjh.c(this.e, arpj.a, arwf.a, new wfj(this, unsVar, wfgVar, (arpe) null, 0));
        return c2;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = wfg.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(android.net.Uri r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.wfk
            if (r0 == 0) goto L13
            r0 = r7
            wfk r0 = (defpackage.wfk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wfk r0 = new wfk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.aqil.P(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.aqil.P(r7)
            atsg r7 = r5.g
            android.content.ContentValues r2 = defpackage.wfl.c
            r4 = 0
            com.google.common.util.concurrent.ListenableFuture r7 = r7.m(r6, r2, r4)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.arro.F(r7, r0)
            if (r7 == r1) goto L63
        L47:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L4c
            goto L52
        L4c:
            int r0 = r7.intValue()
            if (r0 == r3) goto L5f
        L52:
            alwo r0 = defpackage.wfl.b
            alvw r0 = r0.i()
            alwl r0 = (defpackage.alwl) r0
            java.lang.String r1 = "Did not mark RCS in telephony for %s"
            r0.t(r1, r6)
        L5f:
            r7.getClass()
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfl.j(android.net.Uri, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v15, types: [alwl] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [wfl] */
    /* JADX WARN: Type inference failed for: r8v3, types: [wfl] */
    /* JADX WARN: Type inference failed for: r8v5, types: [wfl] */
    /* JADX WARN: Type inference failed for: r8v6, types: [wfl] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d4 -> B:13:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f7 -> B:14:0x0112). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.wfg r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfl.k(wfg, arpe):java.lang.Object");
    }
}
