package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxa implements mml {
    public static final alwo a = alwo.o("BugleGroupManagement");
    private static final xny c = new xnx("RcsGroupRecovery::onConversationOpened");
    public final vxk b;
    private final anen d;

    public vxa(anen anenVar, vxk vxkVar) {
        this.d = anenVar;
        this.b = vxkVar;
    }

    @Override // defpackage.mml
    public final akrh a() {
        return c.a();
    }

    @Override // defpackage.mml
    public final akul b(BugleConversation bugleConversation, miv mivVar) {
        return aktp.ah(new ung(this, bugleConversation, 20, null), this.d);
    }
}
