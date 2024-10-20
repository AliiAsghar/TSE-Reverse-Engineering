package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmk implements mml {
    private static final alwo a = alwo.o("BugleEtouffee");
    private final xny b;
    private final rgo c;

    public mmk(rgo rgoVar) {
        rgoVar.getClass();
        this.c = rgoVar;
        this.b = new xnx("EtouffeeOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.mml
    public final akrh a() {
        return this.b.a();
    }

    @Override // defpackage.mml
    public final akul b(BugleConversation bugleConversation, miv mivVar) {
        mivVar.getClass();
        DefaultConversation defaultConversation = (DefaultConversation) bugleConversation;
        a.m().t("Refresh encryption status for conversation %s.", defaultConversation.a.b());
        this.c.a(defaultConversation.a.a).t();
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }
}
