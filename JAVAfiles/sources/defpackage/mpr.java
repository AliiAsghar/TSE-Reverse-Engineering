package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpr implements uvn {
    private final armf a;
    private final arwe b;
    private final armf c;

    public mpr(armf armfVar, arwe arweVar, armf armfVar2) {
        armfVar.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = arweVar;
        this.c = armfVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.mpq
            if (r0 == 0) goto L13
            r0 = r6
            mpq r0 = (defpackage.mpq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mpq r0 = new mpq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mpr r0 = r0.d
            defpackage.aqil.P(r6)
            goto L53
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.aqil.P(r6)
            armf r6 = r5.a
            java.lang.Object r6 = r6.b()
            mlu r6 = (defpackage.mlu) r6
            boolean r2 = defpackage.ofn.a()
            ncq r6 = r6.e(r3, r2)
            akul r6 = r6.b()
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 == r1) goto Laa
            r0 = r5
        L53:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.aqjn.J(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto La5
            java.lang.Object r2 = r6.next()
            mmj r2 = (defpackage.mmj) r2
            r2.getClass()
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = r2.a
            boolean r3 = r3 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId
            if (r3 == 0) goto L91
            armf r3 = r0.a
            java.lang.Object r3 = r3.b()
            mlu r3 = (defpackage.mlu) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r2.a
            r2.getClass()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r2 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId) r2
            r4 = 0
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r2 = r3.A(r2, r4)
            goto La1
        L91:
            armf r3 = r0.a
            java.lang.Object r3 = r3.b()
            mlu r3 = (defpackage.mlu) r3
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r2 = r2.a
            miv r4 = defpackage.miv.MINIMAL
            com.google.android.apps.messaging.shared.api.messaging.Conversation r2 = r3.a(r2, r4)
        La1:
            r1.add(r2)
            goto L67
        La5:
            java.lang.Object r6 = defpackage.aqjn.Z(r1)
            return r6
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpr.a(arpe):java.lang.Object");
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul c() {
        return uvl.c();
    }

    @Override // defpackage.uvn
    public final akul d() {
        akul c;
        if (((orq) this.c.b()).a()) {
            c = qjh.c(this.b, arpj.a, arwf.a, new lgp(this, (arpe) null, 17));
            return c;
        }
        akul ag = aktp.ag(arnv.a);
        ag.getClass();
        return ag;
    }
}
