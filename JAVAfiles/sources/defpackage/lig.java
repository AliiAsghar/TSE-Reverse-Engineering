package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lig {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public lig(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, byte[] bArr) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.g = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
        armfVar7.getClass();
        this.f = armfVar7;
        armfVar8.getClass();
        this.i = armfVar8;
        armfVar9.getClass();
        this.h = armfVar9;
        armfVar10.getClass();
        this.k = armfVar10;
        armfVar11.getClass();
        this.j = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
    }

    public final void a(ConversationId conversationId) {
        if (qta.p((eog) this.f) != null) {
            Object obj = this.f;
            lkd lkdVar = (lkd) this.j;
            lkdVar.b(new lls(new llt(conversationId, false, false, 3, null, qta.p((eog) obj), false, true, 2982)));
            return;
        }
        MessageCoreData messageCoreData = (MessageCoreData) ((eog) this.f).a("draft_data");
        lkd lkdVar2 = (lkd) this.j;
        lkdVar2.b(new lls(new llt(conversationId, false, false, 3, messageCoreData, null, false, true, 3014)));
    }

    public final jkt b() {
        return new jkt(new jkq(this, new jjv(c().e(), 5), 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final wul c() {
        return (wul) this.i.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jkr
            if (r0 == 0) goto L13
            r0 = r5
            jkr r0 = (defpackage.jkr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            jkr r0 = new jkr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            wul r5 = r4.c()
            r0.b = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L4a
        L3e:
            yfq r5 = (defpackage.yfq) r5
            boolean r5 = r5.e
            if (r5 == 0) goto L47
            jku r5 = defpackage.jku.a
            goto L49
        L47:
            jku r5 = defpackage.jku.b
        L49:
            return r5
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.d(arpe):java.lang.Object");
    }

    public final Object e(int i, arpe arpeVar) {
        String string = ((Context) this.c).getString(i);
        string.getClass();
        Object k = ((jxv) this.d).k(new kjl(string, null, false, null, null, 125), arpeVar);
        if (k == arpl.a) {
            return k;
        }
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final Object f(jku jkuVar, jku jkuVar2) {
        int i;
        mbl mblVar = (mbl) this.b.b();
        jkuVar.getClass();
        jkuVar2.getClass();
        jku jkuVar3 = jku.a;
        if (jkuVar == jkuVar3 && jkuVar2 == jkuVar3) {
            i = 1;
        } else if (jkuVar == jkuVar3 && jkuVar2 == jku.b) {
            i = 2;
        } else {
            jku jkuVar4 = jku.b;
            if (jkuVar == jkuVar4 && jkuVar2 == jkuVar3) {
                i = 3;
            } else if (jkuVar == jkuVar4 && jkuVar2 == jkuVar4) {
                i = 4;
            } else {
                throw new IllegalArgumentException("Unhandled state " + jkuVar.name() + " to " + jkuVar2.name());
            }
        }
        mblVar.e("Bugle.DirectSend.FastImageSending.OptionSelected.Count", i - 1);
        return arnb.a;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final imk g(ConversationIdType conversationIdType) {
        tqx tqxVar = (tqx) this.a.b();
        tqxVar.getClass();
        anen anenVar = (anen) this.b.b();
        anenVar.getClass();
        anen anenVar2 = (anen) this.c.b();
        anenVar2.getClass();
        ahiy ahiyVar = (ahiy) this.g.b();
        ahiyVar.getClass();
        uhj uhjVar = (uhj) this.e.b();
        uhjVar.getClass();
        ansy ansyVar = (ansy) this.f.b();
        ansyVar.getClass();
        kor korVar = (kor) this.k.b();
        Optional optional = (Optional) ((apxx) this.j).a;
        iew iewVar = (iew) this.l.b();
        return new imk(this.d, tqxVar, anenVar, anenVar2, ahiyVar, uhjVar, ansyVar, this.i, this.h, korVar, optional, iewVar, conversationIdType);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [armf, java.lang.Object] */
    public final nfq h(ParticipantsTable.BindData bindData) {
        xyt xytVar = (xyt) this.e.b();
        xytVar.getClass();
        anen anenVar = (anen) this.k.b();
        anenVar.getClass();
        bindData.getClass();
        return new nfq(this.a, this.f, this.b, this.l, this.j, this.g, this.h, xytVar, anenVar, this.d, this.c, this.i, bindData);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    public final DefaultConversation i(BugleConversationId bugleConversationId, boolean z) {
        anen anenVar = (anen) this.j.b();
        anenVar.getClass();
        ndi ndiVar = (ndi) this.h.b();
        ndiVar.getClass();
        nfx nfxVar = (nfx) this.a.b();
        nfxVar.getClass();
        mlt mltVar = (mlt) this.k.b();
        mltVar.getClass();
        mto mtoVar = (mto) this.e.b();
        mtoVar.getClass();
        kor korVar = (kor) this.i.b();
        korVar.getClass();
        bugleConversationId.getClass();
        ?? r11 = this.d;
        ?? r12 = this.c;
        ?? r13 = this.l;
        ?? r14 = this.g;
        return new DefaultConversation(anenVar, ndiVar, nfxVar, this.b, mltVar, this.f, mtoVar, korVar, r11, r12, r13, r14, bugleConversationId, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final akul j(Callable callable) {
        return aktp.ai(callable, this.j);
    }

    public lig(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.f = armfVar4;
        armfVar5.getClass();
        this.l = armfVar5;
        armfVar6.getClass();
        this.k = armfVar6;
        armfVar7.getClass();
        this.b = armfVar7;
        armfVar8.getClass();
        this.a = armfVar8;
        armfVar9.getClass();
        this.h = armfVar9;
        armfVar10.getClass();
        this.i = armfVar10;
        armfVar11.getClass();
        this.j = armfVar11;
        armfVar12.getClass();
        this.g = armfVar12;
    }

    public lig(Context context, arwe arweVar, arwe arweVar2, armf armfVar, lre lreVar, jxv jxvVar, armf armfVar2, owh owhVar, owi owiVar, armf armfVar3, owk owkVar) {
        context.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        armfVar.getClass();
        lreVar.getClass();
        jxvVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.c = context;
        this.j = arweVar;
        this.g = arweVar2;
        this.b = armfVar;
        this.e = lreVar;
        this.d = jxvVar;
        this.a = armfVar2;
        this.f = owhVar;
        this.l = owiVar;
        this.h = armfVar3;
        this.k = owkVar;
        this.i = armd.a(new jjw(this, 5));
    }

    public lig(arwe arweVar, arpi arpiVar, Context context, aksr aksrVar, ndi ndiVar, lgd lgdVar, miw miwVar, izz izzVar, eog eogVar, lkd lkdVar, armf armfVar, lxe lxeVar) {
        arweVar.getClass();
        arpiVar.getClass();
        context.getClass();
        aksrVar.getClass();
        ndiVar.getClass();
        lgdVar.getClass();
        miwVar.getClass();
        izzVar.getClass();
        eogVar.getClass();
        lkdVar.getClass();
        armfVar.getClass();
        lxeVar.getClass();
        this.a = arweVar;
        this.b = arpiVar;
        this.c = context;
        this.d = aksrVar;
        this.i = ndiVar;
        this.k = lgdVar;
        this.e = miwVar;
        this.l = izzVar;
        this.f = eogVar;
        this.j = lkdVar;
        this.g = armfVar;
        jdn jdnVar = new jdn(lxeVar.b, izzVar.a(), new igb(this, (arpe) null, 13), 17, null);
        int i = ascp.a;
        this.h = arrn.T(jdnVar, arweVar, asco.a(0L, 3), null);
    }

    public lig(mfo mfoVar, lzy lzyVar, xyt xytVar, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, anen anenVar3, armf armfVar3, armf armfVar4, armf armfVar5, orv orvVar, acxh acxhVar) {
        this.c = mfoVar;
        this.k = lzyVar;
        this.e = xytVar;
        if (((ansy) ((nvc) orvVar).a.b()).e("bugle.enable_sequential_executor_for_recurring_metrics_upload")) {
            this.j = new anew(anenVar2);
        } else {
            this.j = anenVar;
        }
        this.b = anenVar2;
        this.i = armfVar;
        this.f = armfVar2;
        this.g = anenVar3;
        this.a = armfVar3;
        this.h = armfVar4;
        this.d = armfVar5;
        this.l = acxhVar;
    }

    public lig(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.j = armfVar;
        armfVar2.getClass();
        this.h = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.k = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.e = armfVar7;
        armfVar8.getClass();
        this.i = armfVar8;
        armfVar9.getClass();
        this.d = armfVar9;
        armfVar10.getClass();
        this.c = armfVar10;
        armfVar11.getClass();
        this.l = armfVar11;
        armfVar12.getClass();
        this.g = armfVar12;
    }

    public lig(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, char[] cArr) {
        armfVar.getClass();
        this.l = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.k = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.h = armfVar5;
        armfVar6.getClass();
        this.c = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.a = armfVar8;
        armfVar9.getClass();
        this.d = armfVar9;
        armfVar10.getClass();
        this.i = armfVar10;
        armfVar11.getClass();
        this.j = armfVar11;
        this.b = armfVar12;
    }

    public lig(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.l = armfVar4;
        armfVar5.getClass();
        this.j = armfVar5;
        armfVar6.getClass();
        this.g = armfVar6;
        armfVar7.getClass();
        this.h = armfVar7;
        armfVar8.getClass();
        this.e = armfVar8;
        armfVar9.getClass();
        this.k = armfVar9;
        armfVar10.getClass();
        armfVar11.getClass();
        this.d = armfVar11;
        armfVar12.getClass();
        this.c = armfVar12;
        armfVar13.getClass();
        this.i = armfVar13;
        armfVar14.getClass();
    }
}
