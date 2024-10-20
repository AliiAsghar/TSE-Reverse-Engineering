package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class keu implements miz {
    private final miz a;
    private final ket b = ket.a;

    public keu(miz mizVar) {
        this.a = mizVar;
    }

    @Override // defpackage.miz
    public final miy a() {
        return this.a.a();
    }

    @Override // defpackage.miz
    public final MessageId b() {
        return this.a.b();
    }

    @Override // defpackage.miz
    public final mje c() {
        return this.a.c();
    }

    @Override // defpackage.miz
    public final ConversationId d() {
        return this.a.d();
    }

    @Override // defpackage.miz
    public final /* synthetic */ mym e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof keu) && d.F(this.a, ((keu) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.miz
    public final nbe f() {
        return this.a.f();
    }

    @Override // defpackage.miz
    public final akul g() {
        return this.a.g();
    }

    @Override // defpackage.miz
    public final Instant h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.miz
    public final Instant i() {
        return this.a.i();
    }

    @Override // defpackage.miz
    public final Long j() {
        return this.a.j();
    }

    @Override // defpackage.miz
    public final String k() {
        return this.a.k();
    }

    @Override // defpackage.miz
    public final String l() {
        return this.a.l();
    }

    @Override // defpackage.miz
    public final boolean m() {
        return this.a.m();
    }

    @Override // defpackage.miz
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.miz
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.miz
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.miz
    public final nbv q() {
        return this.a.q();
    }

    @Override // defpackage.miz
    public final int r() {
        return this.a.r();
    }

    @Override // defpackage.miz
    public final int s() {
        return this.a.s();
    }

    @Override // defpackage.miz
    public final ndk t() {
        return this.a.t();
    }

    public final String toString() {
        return "HiddenMessage(message=" + this.a + ")";
    }

    @Override // defpackage.miz
    public final qdq u() {
        return this.a.u();
    }
}
