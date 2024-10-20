package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class raz implements rix {
    private final armf a;
    private final armf b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;
    private final armf s;
    private final armf t;

    public raz(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18, armf armfVar19, armf armfVar20) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.j = armfVar10;
        armfVar11.getClass();
        this.k = armfVar11;
        armfVar12.getClass();
        this.l = armfVar12;
        armfVar13.getClass();
        this.m = armfVar13;
        armfVar14.getClass();
        this.n = armfVar14;
        armfVar15.getClass();
        this.o = armfVar15;
        armfVar16.getClass();
        this.p = armfVar16;
        armfVar17.getClass();
        this.q = armfVar17;
        armfVar18.getClass();
        this.r = armfVar18;
        armfVar19.getClass();
        this.s = armfVar19;
        armfVar20.getClass();
        this.t = armfVar20;
    }

    public final MarkAsReadAction a(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType, boolean z, boolean z2, int i, int i2) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        yjr yjrVar = (yjr) this.c.b();
        yjrVar.getClass();
        mbl mblVar = (mbl) this.d.b();
        mblVar.getClass();
        mho mhoVar = (mho) this.e.b();
        mhoVar.getClass();
        wzs wzsVar = (wzs) this.f.b();
        wzsVar.getClass();
        agnq agnqVar = (agnq) this.g.b();
        agnqVar.getClass();
        xca xcaVar = (xca) this.h.b();
        xcaVar.getClass();
        qik qikVar = (qik) this.i.b();
        qikVar.getClass();
        ugy ugyVar = (ugy) this.j.b();
        ugyVar.getClass();
        viq viqVar = (viq) this.k.b();
        viqVar.getClass();
        Optional optional = (Optional) ((apxx) this.l).a;
        agxw agxwVar = (agxw) this.p.b();
        agxwVar.getClass();
        conversationIdTypeArr.getClass();
        armf armfVar = this.q;
        armf armfVar2 = this.m;
        armf armfVar3 = this.r;
        return new MarkAsReadAction(context, xnvVar, yjrVar, mblVar, mhoVar, wzsVar, agnqVar, xcaVar, qikVar, ugyVar, viqVar, optional, armfVar2, this.n, this.o, agxwVar, armfVar, armfVar3, this.s, this.t, conversationIdTypeArr, messageIdType, z, z2, i, i2);
    }

    @Override // defpackage.rix
    public final /* synthetic */ Action b(int i) {
        return a(new ConversationIdType[0], rvc.a, true, false, 1, i);
    }

    @Override // defpackage.rhp
    public final /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        yjr yjrVar = (yjr) this.c.b();
        yjrVar.getClass();
        mbl mblVar = (mbl) this.d.b();
        mblVar.getClass();
        mho mhoVar = (mho) this.e.b();
        mhoVar.getClass();
        wzs wzsVar = (wzs) this.f.b();
        wzsVar.getClass();
        agnq agnqVar = (agnq) this.g.b();
        agnqVar.getClass();
        xca xcaVar = (xca) this.h.b();
        xcaVar.getClass();
        qik qikVar = (qik) this.i.b();
        qikVar.getClass();
        ugy ugyVar = (ugy) this.j.b();
        ugyVar.getClass();
        viq viqVar = (viq) this.k.b();
        viqVar.getClass();
        Optional optional = (Optional) ((apxx) this.l).a;
        agxw agxwVar = (agxw) this.p.b();
        agxwVar.getClass();
        parcel.getClass();
        armf armfVar = this.q;
        armf armfVar2 = this.m;
        armf armfVar3 = this.r;
        return new MarkAsReadAction(context, xnvVar, yjrVar, mblVar, mhoVar, wzsVar, agnqVar, xcaVar, qikVar, ugyVar, viqVar, optional, armfVar2, this.n, this.o, agxwVar, armfVar, armfVar3, this.s, this.t, parcel);
    }

    @Override // defpackage.rix
    public final /* synthetic */ akul d(ConversationIdType conversationIdType) {
        return akul.g(riw.a(this, conversationIdType, rvc.a, true, false, -1).s());
    }

    @Override // defpackage.rix
    public final /* synthetic */ void e(ConversationIdType conversationIdType) {
        riw.b(this, conversationIdType, true);
    }

    @Override // defpackage.rix
    public final /* synthetic */ void f(ConversationIdType conversationIdType) {
        Action a = riw.a(this, conversationIdType, rvc.a, true, false, 2);
        a.t();
        ((MarkAsReadAction) a).c.J().m(conversationIdType);
    }

    @Override // defpackage.rix
    public final /* synthetic */ void g(ConversationIdType conversationIdType, Optional optional) {
        int i;
        MessageIdType messageIdType = rvc.a;
        ConversationIdType[] conversationIdTypeArr = {conversationIdType};
        if (optional.isPresent()) {
            i = ((ajwt) optional.get()).a;
        } else {
            i = -1;
        }
        a(conversationIdTypeArr, messageIdType, true, false, -1, i).z();
    }

    @Override // defpackage.rix
    public final /* synthetic */ Action h(ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z) {
        return riw.a(this, conversationIdType, messageIdType, true, z, -1);
    }

    @Override // defpackage.rix
    public final /* synthetic */ Action i(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType) {
        return a(conversationIdTypeArr, messageIdType, true, false, -1, -1);
    }

    @Override // defpackage.rix
    public final /* synthetic */ void j(ConversationIdType conversationIdType) {
        riw.b(this, conversationIdType, false);
    }
}
