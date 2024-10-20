package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jft implements mml {
    public final yjv a;
    public final lzz b;
    public final mgu c;
    private final arwe d;
    private final xny e;

    public jft(arwe arweVar, mgu mguVar, yjv yjvVar, lzz lzzVar) {
        arweVar.getClass();
        mguVar.getClass();
        yjvVar.getClass();
        lzzVar.getClass();
        this.d = arweVar;
        this.c = mguVar;
        this.a = yjvVar;
        this.b = lzzVar;
        this.e = new xnx("GilMetadataOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.mml
    public final akrh a() {
        return this.e.a();
    }

    @Override // defpackage.mml
    public final akul b(BugleConversation bugleConversation, miv mivVar) {
        mivVar.getClass();
        return qjh.a(arrn.I(this.d, null, null, new jfs(bugleConversation, this, null), 3));
    }
}
