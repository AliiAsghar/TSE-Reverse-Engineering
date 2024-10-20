package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mni implements ncq {
    public static final alwo a = alwo.o("BugleConversation");
    private final ngp b;

    public mni(anen anenVar, iew iewVar, ConversationId conversationId) {
        d.s(true);
        snf e = sni.e();
        e.w("DatabaseConversationDisableModeObserver");
        e.c(sni.c.ak);
        e.h(new mjz(conversationId, 19));
        sne b = e.b();
        this.b = new ngp(iewVar.m(b, "DatabaseConversationDisableModeObserver"), new mnh(anenVar, b, (BugleConversationId) conversationId));
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.b.a(ncpVar);
    }

    @Override // defpackage.ncq
    public final akul b() {
        return this.b.b();
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        return this.b.c();
    }
}
