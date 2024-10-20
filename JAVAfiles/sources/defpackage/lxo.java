package defpackage;

import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxo extends abms {
    public final wzy a;
    public final lva b;
    public final luz c;
    public final xnv d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final arwe h;
    public final alwo i;
    private final Context j;
    private final arwe k;
    private final arpi l;
    private final armf m;
    private final lxs n;
    private final jat o;

    public lxo(Context context, wzy wzyVar, jat jatVar, lva lvaVar, luz luzVar, arwe arweVar, arpi arpiVar, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, arwe arweVar2, lxs lxsVar) {
        context.getClass();
        wzyVar.getClass();
        jatVar.getClass();
        lvaVar.getClass();
        luzVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        xnvVar.getClass();
        armfVar4.getClass();
        arweVar2.getClass();
        lxsVar.getClass();
        this.j = context;
        this.a = wzyVar;
        this.o = jatVar;
        this.b = lvaVar;
        this.c = luzVar;
        this.k = arweVar;
        this.l = arpiVar;
        this.d = xnvVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.m = armfVar4;
        this.h = arweVar2;
        this.n = lxsVar;
        this.i = alwo.o("BugleBackup");
    }

    public static final void h(arlq arlqVar, lxf lxfVar) {
        Exception exc = lxfVar.b;
        if (exc == null) {
            arlqVar.c(lxfVar.a);
            arlqVar.a();
        } else {
            arlqVar.b(exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.aozb r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lxj
            if (r0 == 0) goto L13
            r0 = r6
            lxj r0 = (defpackage.lxj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lxj r0 = new lxj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            lxo r0 = r0.e
            defpackage.aqil.P(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            luz r6 = r4.c
            r0.e = r4
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 == r1) goto La6
            r0 = r4
        L45:
            java.util.List r6 = (java.util.List) r6
            int r1 = r6.size()
            java.util.ListIterator r6 = r6.listIterator(r1)
        L4f:
            boolean r1 = r6.hasPrevious()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r6.previous()
            luq r1 = (defpackage.luq) r1
            lwz r2 = r1.b
            lwz r3 = defpackage.lwz.D2D
            if (r2 != r3) goto L4f
            java.util.UUID r6 = r1.a
            aozb r5 = (defpackage.aozb) r5
            boolean r1 = r5.G()
            if (r1 == 0) goto L79
            alwo r5 = r0.i
            alvw r5 = r5.i()
            alwl r5 = (defpackage.alwl) r5
            java.lang.String r0 = "Passed in session id was empty, using last active restore execution session id %s"
            r5.t(r0, r6)
            return r6
        L79:
            java.util.UUID r1 = defpackage.yyb.bY(r5)
            boolean r1 = defpackage.d.F(r6, r1)
            if (r1 != 0) goto L99
            alwo r0 = r0.i
            alvw r0 = r0.i()
            alwl r0 = (defpackage.alwl) r0
            java.util.UUID r5 = defpackage.yyb.bY(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "Passed in session id %s does not match last active restore execution session id %s"
            r0.D(r1, r5, r6)
            return r6
        L99:
            java.util.UUID r5 = defpackage.yyb.bY(r5)
            return r5
        L9e:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "List contains no element matching the predicate."
            r5.<init>(r6)
            throw r5
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxo.a(aozb, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x016a A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0182 A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x019e A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b5 A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ca A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f3 A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x020b A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0220 A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023d A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0263 A[Catch: Exception -> 0x0044, TryCatch #2 {Exception -> 0x0044, blocks: (B:14:0x003f, B:15:0x0159, B:17:0x016a, B:18:0x016d, B:20:0x0182, B:21:0x0185, B:23:0x019e, B:24:0x01a1, B:26:0x01b5, B:27:0x01b8, B:29:0x01ca, B:30:0x01cd, B:32:0x01f3, B:33:0x01f6, B:35:0x020b, B:36:0x020e, B:38:0x0220, B:39:0x0223, B:41:0x023d, B:42:0x0240, B:44:0x0263, B:45:0x0266), top: B:13:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r18) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxo.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r12v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [lxo] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [lxo] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.os.ParcelFileDescriptor r23, defpackage.abmp r24, java.util.UUID r25, defpackage.arpe r26) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxo.c(android.os.ParcelFileDescriptor, abmp, java.util.UUID, arpe):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object d(defpackage.abni r36, defpackage.aqsm r37, defpackage.arpe r38) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxo.d(abni, aqsm, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.os.ParcelFileDescriptor r17, defpackage.abmp r18, java.util.UUID r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxo.e(android.os.ParcelFileDescriptor, abmp, java.util.UUID, arpe):java.lang.Object");
    }

    @Override // defpackage.abms
    public final void f(abna abnaVar, arlq arlqVar) {
        Duration ofMillis = Duration.ofMillis(this.d.a());
        this.i.n().t("Starting handshake on target device, request=%s", arqd.b(arqd.a, abnaVar.toByteArray()));
        qjh.l(this.k, null, new jyw(this, arlqVar, ofMillis, (arpe) null, 10), 3);
    }

    @Override // defpackage.abms
    public final void g(abni abniVar, arlq arlqVar) {
        qjh.l(this.k, null, new icz(this, abniVar, aqsm.k(), arlqVar, Duration.ofMillis(this.d.a()), (arpe) null, 4), 3);
    }
}
