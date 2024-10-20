package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlh implements mml {
    public final armf a;
    public final armf b;
    private final arwe c;
    private final xny d;

    public mlh(arwe arweVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.c = arweVar;
        this.a = armfVar;
        this.b = armfVar2;
        this.d = new xnx("ActiveUserMetricsOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.mml
    public final akrh a() {
        return this.d.a();
    }

    @Override // defpackage.mml
    public final akul b(BugleConversation bugleConversation, miv mivVar) {
        akul c;
        mivVar.getClass();
        if (mivVar == miv.FOR_DISPLAY) {
            c = qjh.c(this.c, arpj.a, arwf.a, new mlg(bugleConversation, this, (arpe) null, 0));
            return c;
        }
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }
}
