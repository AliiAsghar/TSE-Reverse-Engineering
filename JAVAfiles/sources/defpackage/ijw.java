package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijw {
    public static final xze a = xze.g("BugleDataModel", "ConversationDataService");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/conversation/dataservice/ConversationDataServiceImpl");
    public final anen c;
    public final anen d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final alhr o;
    public final iql p;
    public final uac q;
    public final lxe r;
    public final vid s;
    private final armf t;

    public ijw(uac uacVar, anen anenVar, lxe lxeVar, iql iqlVar, vid vidVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        this.r = lxeVar;
        this.q = uacVar;
        this.c = anenVar;
        this.p = iqlVar;
        this.s = vidVar;
        this.d = anenVar2;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.i = armfVar5;
        this.t = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = armfVar9;
        this.m = armfVar10;
        this.n = armfVar11;
        this.o = albo.D(new ezp(armfVar12, 13));
    }

    public final akul a(ConversationIdType conversationIdType, tqc tqcVar, amfe amfeVar) {
        return aktp.ai(new imh(this, conversationIdType, tqcVar, amfeVar, 1), this.c);
    }

    public final void b(ConversationIdType conversationIdType, msh mshVar, boolean z, boolean z2, int i) {
        ((tzn) this.t.b()).c(conversationIdType, mshVar, z, z2, i).k(qiu.b(), andi.a);
    }

    public final void c(ConversationIdType conversationIdType, boolean z, int i) {
        ((tzn) this.t.b()).d(conversationIdType, z, i).k(qiu.b(), andi.a);
    }
}
