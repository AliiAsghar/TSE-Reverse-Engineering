package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxc implements ncq {
    public final msk a;
    public final ExecutorService b;
    public final xnv c;
    public final BugleConversationId d;
    public final ncq e;
    public yga f = null;
    public final usk g;
    public final yyt h;

    public mxc(usk uskVar, wfh wfhVar, msk mskVar, ExecutorService executorService, xnv xnvVar, BugleConversationId bugleConversationId, ncq ncqVar) {
        this.g = uskVar;
        this.h = wfhVar.Y(new mlr(this, 4));
        this.a = mskVar;
        this.b = executorService;
        this.c = xnvVar;
        this.d = bugleConversationId;
        this.e = ncqVar;
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.h.w(new kzq(ncpVar, 14), "ActiveComposersSupplier::register", "ActiveComposersSupplier::callback", "ActiveComposersSupplier::unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        return this.g.k().i(new lso(this, 16), this.b);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final akul d() {
        return aktp.ah(new kut(this, 20), this.b);
    }
}
