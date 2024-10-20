package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvv implements ncq {
    public final BugleConversationId a;
    private final mjg b;
    private final anen c;

    public mvv(mjg mjgVar, anen anenVar, BugleConversationId bugleConversationId) {
        this.b = mjgVar;
        this.c = anenVar;
        this.a = bugleConversationId;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.b.g(new mvu(ncpVar, 0));
    }

    @Override // defpackage.ncq
    public final akul b() {
        return aktp.ai(new mig(this, 6), this.c);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("Blocking API is not supported.");
    }
}
