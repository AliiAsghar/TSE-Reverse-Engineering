package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kci implements miz {
    public final List a;
    private final /* synthetic */ miz b;
    private final kcj c;
    private final nbe d;
    private final mje e;

    public kci(miz mizVar, miz mizVar2) {
        List B;
        mje kchVar;
        this.b = mizVar2;
        if (mizVar instanceof kci) {
            B = aqjn.ar(((kci) mizVar).a, mizVar2);
        } else {
            B = aqjn.B(mizVar, mizVar2);
        }
        this.a = B;
        this.c = new kcj(B);
        this.d = new nbf(this, 1);
        if (!B.isEmpty()) {
            Iterator it = B.iterator();
            while (it.hasNext()) {
                if (!(((miz) it.next()).c() instanceof mjl)) {
                    kchVar = mizVar2.c();
                    break;
                }
            }
        }
        kchVar = new kch(mizVar2, this);
        this.e = kchVar;
    }

    @Override // defpackage.miz
    public final miy a() {
        return this.b.a();
    }

    @Override // defpackage.miz
    public final MessageId b() {
        return this.b.b();
    }

    @Override // defpackage.miz
    public final mje c() {
        return this.e;
    }

    @Override // defpackage.miz
    public final ConversationId d() {
        return this.b.d();
    }

    @Override // defpackage.miz
    public final /* synthetic */ mym e() {
        return this.c;
    }

    @Override // defpackage.miz
    public final nbe f() {
        return this.d;
    }

    @Override // defpackage.miz
    public final akul g() {
        return this.b.g();
    }

    @Override // defpackage.miz
    public final Instant h() {
        return this.b.h();
    }

    @Override // defpackage.miz
    public final Instant i() {
        return this.b.i();
    }

    @Override // defpackage.miz
    public final Long j() {
        return this.b.j();
    }

    @Override // defpackage.miz
    public final String k() {
        return this.b.k();
    }

    @Override // defpackage.miz
    public final String l() {
        return this.b.l();
    }

    @Override // defpackage.miz
    public final boolean m() {
        return this.b.m();
    }

    @Override // defpackage.miz
    public final boolean n() {
        return this.b.n();
    }

    @Override // defpackage.miz
    public final boolean o() {
        return this.b.o();
    }

    @Override // defpackage.miz
    public final boolean p() {
        return this.b.p();
    }

    @Override // defpackage.miz
    public final nbv q() {
        return this.b.q();
    }

    @Override // defpackage.miz
    public final int r() {
        return this.b.r();
    }

    @Override // defpackage.miz
    public final int s() {
        return this.b.s();
    }

    @Override // defpackage.miz
    public final ndk t() {
        return this.b.t();
    }

    @Override // defpackage.miz
    public final qdq u() {
        return this.b.u();
    }
}
