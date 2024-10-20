package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class moc implements ncq {
    public final arwe a;
    public final BugleConversationId b;
    public final ncq c;
    public yga d;
    public final iew e;
    public final yyt f;
    private final arwe g;
    private final armf h;
    private final qvv i;
    private final armf j;
    private final wfh k;

    public moc(arwe arweVar, arwe arweVar2, wfh wfhVar, iew iewVar, armf armfVar, qvv qvvVar, armf armfVar2, BugleConversationId bugleConversationId, ncq ncqVar) {
        this.g = arweVar;
        this.a = arweVar2;
        this.k = wfhVar;
        this.e = iewVar;
        this.h = armfVar;
        this.i = qvvVar;
        this.j = armfVar2;
        this.b = bugleConversationId;
        this.c = ncqVar;
        this.f = wfhVar.Y(new mlr(this, 2));
    }

    public static final sqz i(ConversationIdType conversationIdType) {
        Object apply;
        sra sraVar = new sra(src.a);
        sraVar.w("loadPenpalState");
        apply = new mjz(conversationIdType, 20).apply(new srb());
        sraVar.k(new agpw((srb) apply));
        return sraVar.b();
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.f.w(new kzq(ncpVar, 6), "PenpalObservableSupplier::register", "PenpalObservableSupplier::callback", "PenpalObservableSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ akul b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final akul d() {
        akul c;
        c = qjh.c(this.g, arpj.a, arwf.a, new leb(this, (arpe) null, 16));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.nfw r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mny
            if (r0 == 0) goto L13
            r0 = r6
            mny r0 = (defpackage.mny) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mny r0 = new mny
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            j$.util.Optional r5 = r5.i()
            java.lang.Object r5 = r5.get()
            msh r5 = (defpackage.msh) r5
            java.lang.String r5 = r5.n()
            armf r6 = r4.j
            java.lang.Object r6 = r6.b()
            psq r6 = (defpackage.psq) r6
            qei r5 = r6.c(r5)
            qvv r6 = r4.i
            qwj r2 = defpackage.qwj.a
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = r2.a(r6, r5, r0)
            if (r6 == r1) goto L6d
        L5b:
            qvo r6 = (defpackage.qvo) r6
            if (r6 == 0) goto L65
            qwe r5 = r6.c
            r5.getClass()
            return r5
        L65:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "My identity not found while retrieving MyIdentityToken"
            r5.<init>(r6)
            throw r5
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moc.e(nfw, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mnz
            if (r0 == 0) goto L13
            r0 = r5
            mnz r0 = (defpackage.mnz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mnz r0 = new mnz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            ncq r5 = r4.c
            akul r5 = r5.b()
            r0.c = r3
            java.lang.Object r5 = defpackage.arro.F(r5, r0)
            if (r5 == r1) goto L7a
        L40:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L55
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
        L53:
            r3 = r1
            goto L75
        L55:
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r0 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r0
            msh r0 = r0.f()
            java.lang.String r0 = r0.n()
            java.lang.String r2 = "+18339913448"
            boolean r0 = defpackage.d.F(r0, r2)
            if (r0 == 0) goto L59
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moc.f(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r18, defpackage.nfw r19, int r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moc.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, nfw, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.sqz r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mob
            if (r0 == 0) goto L13
            r0 = r6
            mob r0 = (defpackage.mob) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mob r0 = new mob
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.aqil.P(r6)
            akul r5 = r5.s()
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r5, r0)
            if (r6 == r1) goto L5c
        L41:
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = defpackage.aqjn.ah(r6)
            sqw r5 = (defpackage.sqw) r5
            if (r5 == 0) goto L56
            java.lang.String r6 = "desired_gemini_state"
            r5.ao(r3, r6)
            boolean r5 = r5.b
            goto L57
        L56:
            r5 = 0
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moc.h(sqz, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.nfw r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.mnx
            if (r0 == 0) goto L13
            r0 = r9
            mnx r0 = (defpackage.mnx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mnx r0 = new mnx
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            defpackage.aqil.P(r9)
            armq r9 = (defpackage.armq) r9
            java.lang.Object r8 = r9.a
            goto L67
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.a
            defpackage.aqil.P(r9)
            goto L5b
        L3d:
            defpackage.aqil.P(r9)
            armf r9 = r7.h
            apxx r9 = (defpackage.apxx) r9
            java.lang.Object r9 = r9.a
            j$.util.Optional r9 = (j$.util.Optional) r9
            java.lang.Object r9 = r9.get()
            vnm r9 = (defpackage.vnm) r9
            r0.a = r9
            r0.d = r5
            java.lang.Object r8 = r7.e(r8, r0)
            if (r8 == r1) goto L6d
            r6 = r9
            r9 = r8
            r8 = r6
        L5b:
            qwe r9 = (defpackage.qwe) r9
            r0.a = r3
            r0.d = r4
            java.lang.Object r8 = r8.b()
            if (r8 == r1) goto L6d
        L67:
            boolean r9 = r8 instanceof defpackage.armp
            if (r9 == 0) goto L6c
            return r3
        L6c:
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moc.j(nfw, arpe):java.lang.Object");
    }
}
