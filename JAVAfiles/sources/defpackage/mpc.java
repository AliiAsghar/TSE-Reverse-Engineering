package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpc implements ncq {
    public final Conversation a;
    public final miw b;
    public final ncq c;
    private final arwe d;

    public mpc(arwe arweVar, Conversation conversation, miw miwVar, ncq ncqVar) {
        this.d = arweVar;
        this.a = conversation;
        this.b = miwVar;
        this.c = ncqVar;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        yga a = this.a.d().a(ncpVar);
        a.getClass();
        return a;
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new jks(this, (arpe) null, 14));
        return c;
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("PenpalBotConversationLocalIdentitiesSupplier.getBlocking is not supported.");
    }
}
