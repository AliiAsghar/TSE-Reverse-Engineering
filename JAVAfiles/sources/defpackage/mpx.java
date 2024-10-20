package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpx implements ncq {
    public final BugleConversation a;
    public final qxr b;
    public final iew c;
    public final yyt d;
    private final arwe e;
    private final arwe f;
    private final wfh g;

    public mpx(arwe arweVar, arwe arweVar2, wfh wfhVar, iew iewVar, qxr qxrVar, BugleConversation bugleConversation) {
        this.e = arweVar;
        this.f = arweVar2;
        this.g = wfhVar;
        this.c = iewVar;
        this.b = qxrVar;
        this.a = bugleConversation;
        this.d = wfhVar.Y(new mpw(this));
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.d.w(new kzq(ncpVar, 7), "RbmConversationPropertiesSupplier::register", "RbmConversationPropertiesSupplier::callback", "RbmConversationPropertiesSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        c = qjh.c(this.f, arpj.a, arwf.a, new lfn(this, (arpe) null, 4));
        return c;
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final akul d() {
        akul c;
        c = qjh.c(this.e, arpj.a, arwf.a, new leb(this, (arpe) null, 17));
        return c;
    }
}
