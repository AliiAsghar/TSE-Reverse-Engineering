package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tyj implements akfb {
    private static final xze b = xze.g("BugleEtouffee", "E2eeInfoDataSource");
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/info/E2eeInfoDataSource");
    public final armf a;
    private final arwe d;
    private final arwe e;
    private final arpi f;
    private final arpi g;
    private final arpi h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final xnv m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final uav q;

    public tyj(arwe arweVar, arwe arweVar2, arpi arpiVar, arpi arpiVar2, arpi arpiVar3, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, xnv xnvVar, armf armfVar6, armf armfVar7, armf armfVar8, uav uavVar) {
        this.d = arweVar;
        this.e = arweVar2;
        this.f = arpiVar;
        this.g = arpiVar2;
        this.h = arpiVar3;
        this.i = armfVar;
        this.j = armfVar2;
        this.k = armfVar3;
        this.l = armfVar4;
        this.a = armfVar5;
        this.m = xnvVar;
        this.n = armfVar6;
        this.o = armfVar7;
        this.p = armfVar8;
        this.q = uavVar;
        if (((okg) armfVar7.b()).a() && ((ozy) armfVar8.b()).a() && (uavVar.b & 2) == 0) {
            throw new IllegalArgumentException("Fetching e2ee capabilities should not have been triggered without providing self identity.");
        }
    }

    private final qei m() {
        if (!((okg) this.o.b()).a()) {
            return null;
        }
        uav uavVar = this.q;
        if ((uavVar.b & 2) != 0) {
            qei qeiVar = uavVar.f;
            if (qeiVar == null) {
                return qei.a;
            }
            return qeiVar;
        }
        alvw i = c.i();
        i.X(alwp.a, "BugleEtouffee");
        ((alvg) i.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/info/E2eeInfoDataSource", "getSelfIdentity", 97, "E2eeInfoDataSource.kt")).q("Self identity is missing in E2eeInfoDataSource, use default.");
        return null;
    }

    private final Object n(arpe arpeVar) {
        uav uavVar = this.q;
        int i = uavVar.c;
        if (i == 2) {
            if (((okg) this.o.b()).a() && ((ozy) this.p.b()).a()) {
                return arro.q(this.f, new pze(this, (arpe) null, 15), arpeVar);
            }
            return arro.q(this.g, new pze(this, (arpe) null, 16, (byte[]) null), arpeVar);
        }
        if (i == 1) {
            apax apaxVar = ((uau) uavVar.d).b;
            apaxVar.getClass();
            return apaxVar;
        }
        throw new IllegalArgumentException("Request should have either conversationId or a list of MessagingIdentity.");
    }

    @Override // defpackage.akfb
    public final andc a() {
        if (((okg) this.o.b()).a() && ((ozy) this.p.b()).a()) {
            return qjh.k(this.e, new txt(this, (arpe) null, 4));
        }
        return qjh.k(this.d, new txt(this, (arpe) null, 5, (byte[]) null));
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        akul c2;
        akul c3;
        if (!((okg) this.o.b()).a() || !((ozy) this.p.b()).a()) {
            c2 = qjh.c(this.d, arpj.a, arwf.a, new jks(this, (arpe) null, 19, (byte[]) null));
            return c2;
        }
        c3 = qjh.c(this.e, arpj.a, arwf.a, new jks(this, (arpe) null, 18));
        return c3;
    }

    @Override // defpackage.akfb
    public final /* bridge */ /* synthetic */ Object c() {
        int i = uaq.e;
        return uap.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        if (r9.y(r3, r2, r6, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r3.y(r9, r2, r6, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (r9.x(r2, r6, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[LOOP:0: B:20:0x005f->B:22:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyj.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @defpackage.armg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.tyd
            if (r0 == 0) goto L13
            r0 = r6
            tyd r0 = (defpackage.tyd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tyd r0 = new tyd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r0 = r0.d
            defpackage.aqil.P(r6)     // Catch: java.lang.Throwable -> L29
            goto L58
        L29:
            r6 = move-exception
            goto L84
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            defpackage.aqil.P(r6)
            java.lang.String r6 = "E2eeInfoDataSource#getMsisdn"
            akrh r6 = defpackage.aktp.e(r6)
            armf r2 = r5.l     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L80
            vbu r2 = (defpackage.vbu) r2     // Catch: java.lang.Throwable -> L80
            akul r2 = r2.b()     // Catch: java.lang.Throwable -> L80
            r2.getClass()     // Catch: java.lang.Throwable -> L80
            r0.d = r6     // Catch: java.lang.Throwable -> L80
            r0.c = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = defpackage.arro.F(r2, r0)     // Catch: java.lang.Throwable -> L80
            if (r0 == r1) goto L7f
            r4 = r0
            r0 = r6
            r6 = r4
        L58:
            j$.util.Optional r6 = (j$.util.Optional) r6     // Catch: java.lang.Throwable -> L29
            r1 = 0
            java.lang.Object r6 = r6.orElse(r1)     // Catch: java.lang.Throwable -> L29
            msh r6 = (defpackage.msh) r6     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L77
            j$.util.Optional r6 = r6.e()     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L77
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L29
            qei r6 = (defpackage.qei) r6     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = r6.d     // Catch: java.lang.Throwable -> L29
            if (r6 == 0) goto L77
            defpackage.armd.i(r0, r1)
            return r6
        L77:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "Failed to retrieve msisdn"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L29
            throw r6     // Catch: java.lang.Throwable -> L29
        L7f:
            return r1
        L80:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L84:
            throw r6     // Catch: java.lang.Throwable -> L85
        L85:
            r1 = move-exception
            defpackage.armd.i(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyj.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.List r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.tye
            if (r0 == 0) goto L13
            r0 = r9
            tye r0 = (defpackage.tye) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tye r0 = new tye
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            akrh r8 = r0.d
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L2e
            goto La6
        L2e:
            r9 = move-exception
            goto Lb1
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            akrh r8 = r0.d
            defpackage.aqil.P(r9)     // Catch: java.lang.Throwable -> L3f
            goto L7d
        L3f:
            r9 = move-exception
            goto L87
        L41:
            defpackage.aqil.P(r9)
            armf r9 = r7.o
            java.lang.Object r9 = r9.b()
            okg r9 = (defpackage.okg) r9
            boolean r9 = r9.a()
            java.lang.String r2 = "E2eeInfoDataSource#getRegistrations"
            if (r9 == 0) goto L95
            armf r9 = r7.p
            java.lang.Object r9 = r9.b()
            ozy r9 = (defpackage.ozy) r9
            boolean r9 = r9.a()
            if (r9 == 0) goto L95
            arpi r9 = r0.u()
            boolean r9 = defpackage.aktp.al(r9)
            if (r9 == 0) goto L8d
            akrh r9 = defpackage.aktp.e(r2)
            r0.d = r9     // Catch: java.lang.Throwable -> L83
            r0.c = r5     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r7.g(r8, r0)     // Catch: java.lang.Throwable -> L83
            if (r8 == r1) goto Lac
            r6 = r9
            r9 = r8
            r8 = r6
        L7d:
            akfa r9 = (defpackage.akfa) r9     // Catch: java.lang.Throwable -> L3f
            defpackage.armd.i(r8, r3)
            return r9
        L83:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L87:
            throw r9     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            defpackage.armd.i(r8, r9)
            throw r0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r8.<init>(r9)
            throw r8
        L95:
            akrh r9 = defpackage.aktp.e(r2)
            r0.d = r9     // Catch: java.lang.Throwable -> Lad
            r0.c = r4     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r8 = r7.g(r8, r0)     // Catch: java.lang.Throwable -> Lad
            if (r8 == r1) goto Lac
            r6 = r9
            r9 = r8
            r8 = r6
        La6:
            akfa r9 = (defpackage.akfa) r9     // Catch: java.lang.Throwable -> L2e
            defpackage.armd.i(r8, r3)
            return r9
        Lac:
            return r1
        Lad:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        Lb1:
            throw r9     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            defpackage.armd.i(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyj.f(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ae A[LOOP:0: B:12:0x01a8->B:14:0x01ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8 A[LOOP:3: B:59:0x00d2->B:61:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.util.List r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyj.g(java.util.List, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[Catch: all -> 0x0057, LOOP:0: B:34:0x00e9->B:36:0x00ef, LOOP_END, TryCatch #2 {all -> 0x0057, blocks: (B:32:0x0052, B:33:0x00cd, B:34:0x00e9, B:36:0x00ef, B:38:0x0117, B:43:0x005f, B:44:0x00b5, B:46:0x00c0, B:49:0x012a, B:50:0x0131, B:54:0x0077, B:56:0x009d, B:57:0x009f), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0 A[Catch: all -> 0x0057, TryCatch #2 {all -> 0x0057, blocks: (B:32:0x0052, B:33:0x00cd, B:34:0x00e9, B:36:0x00ef, B:38:0x0117, B:43:0x005f, B:44:0x00b5, B:46:0x00c0, B:49:0x012a, B:50:0x0131, B:54:0x0077, B:56:0x009d, B:57:0x009f), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #2 {all -> 0x0057, blocks: (B:32:0x0052, B:33:0x00cd, B:34:0x00e9, B:36:0x00ef, B:38:0x0117, B:43:0x005f, B:44:0x00b5, B:46:0x00c0, B:49:0x012a, B:50:0x0131, B:54:0x0077, B:56:0x009d, B:57:0x009f), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.arpe r17) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyj.h(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:31:0x0048, B:32:0x00c9, B:33:0x00df, B:35:0x00e5, B:37:0x00ed, B:39:0x00f2, B:42:0x00fc, B:47:0x0053, B:48:0x00b1, B:50:0x00bc, B:53:0x0117, B:54:0x011e, B:56:0x005e, B:57:0x0095), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:31:0x0048, B:32:0x00c9, B:33:0x00df, B:35:0x00e5, B:37:0x00ed, B:39:0x00f2, B:42:0x00fc, B:47:0x0053, B:48:0x00b1, B:50:0x00bc, B:53:0x0117, B:54:0x011e, B:56:0x005e, B:57:0x0095), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #1 {all -> 0x0062, blocks: (B:31:0x0048, B:32:0x00c9, B:33:0x00df, B:35:0x00e5, B:37:0x00ed, B:39:0x00f2, B:42:0x00fc, B:47:0x0053, B:48:0x00b1, B:50:0x00bc, B:53:0x0117, B:54:0x011e, B:56:0x005e, B:57:0x0095), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyj.i(arpe):java.lang.Object");
    }

    public final List j(List list) {
        alog d = ((vcb) this.j.b()).d(alzz.aZ(list));
        d.getClass();
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List k() {
        String str;
        rtz rtzVar = (rtz) this.i.b();
        uav uavVar = this.q;
        if (uavVar.c == 2) {
            str = (String) uavVar.d;
        } else {
            str = "";
        }
        List K = rtzVar.K(ruy.b(str));
        K.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(K, 10));
        alur it = ((alog) K).iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            bindData.getClass();
            String l = rxn.l(bindData);
            if (l != null) {
                qei a = ((psq) this.k.b()).a(l, false);
                a.getClass();
                arrayList.add(a);
            } else {
                throw new IllegalStateException("Unable to create ChatEndpoint");
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map l(List list) {
        alog b2 = ((vcb) this.j.b()).b(alzz.aZ(list));
        b2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(b2, 10)), 16));
        alur it = b2.iterator();
        while (it.hasNext()) {
            E next = it.next();
            String g = ((sec) next).g();
            g.getClass();
            linkedHashMap.put(g, next);
        }
        return linkedHashMap;
    }
}
