package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnv implements mll {
    private final ConversationId a;
    private final mll b;

    public mnv(ConversationId conversationId, mll mllVar) {
        this.a = conversationId;
        this.b = mllVar;
    }

    @Override // defpackage.mll
    public final String A() {
        return this.b.A();
    }

    @Override // defpackage.mll
    public final String B() {
        return this.b.B();
    }

    @Override // defpackage.mll
    public final boolean C() {
        return this.b.C();
    }

    @Override // defpackage.mll
    public final boolean D() {
        return this.b.D();
    }

    @Override // defpackage.mll
    public final /* synthetic */ boolean E() {
        return lgc.I(this);
    }

    @Override // defpackage.mll
    public final boolean F() {
        return this.b.F();
    }

    @Override // defpackage.miu
    public final Uri a() {
        return this.b.a();
    }

    @Override // defpackage.miu
    public final mit b() {
        return this.b.b();
    }

    @Override // defpackage.miu
    public final ConversationId c() {
        return this.a;
    }

    @Override // defpackage.miu
    public final mmy d() {
        return this.b.d();
    }

    @Override // defpackage.miu
    public final mnk e() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnv)) {
            return false;
        }
        mnv mnvVar = (mnv) obj;
        if (d.F(this.a, mnvVar.a) && d.F(this.b, mnvVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.miu
    public final nfw f() {
        return this.b.f();
    }

    @Override // defpackage.miu
    public final tqc g() {
        return this.b.g();
    }

    @Override // defpackage.miu
    public final String h() {
        return this.b.h();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.miu
    public final boolean i() {
        return false;
    }

    @Override // defpackage.miu
    public final boolean j() {
        return this.b.j();
    }

    @Override // defpackage.miu
    public final boolean k() {
        return this.b.k();
    }

    @Override // defpackage.miu
    public final boolean l() {
        return this.b.l();
    }

    @Override // defpackage.miu
    public final boolean m() {
        return false;
    }

    @Override // defpackage.miu
    public final boolean n() {
        return this.b.n();
    }

    @Override // defpackage.miu
    public final boolean o() {
        return false;
    }

    @Override // defpackage.miu
    public final boolean p() {
        return this.b.p();
    }

    @Override // defpackage.miu
    public final boolean q() {
        return this.b.q();
    }

    @Override // defpackage.mll
    public final int r() {
        return this.b.r();
    }

    @Override // defpackage.mll
    public final int s() {
        return this.b.s();
    }

    @Override // defpackage.mll
    public final long t() {
        return this.b.t();
    }

    public final String toString() {
        return arsd.q("\n    EmergencySosConversationProperties: {\n        id: " + this.a + "\n        kind: " + b() + "\n        ConversationType: " + tvu.b(r()) + "\n        name: " + h() + "\n        nameIsAutomatic: " + n() + "\n        canAddPeople: false\n        archiveStatus: " + g() + "\n        isDeleted: " + q() + "\n        activeSelfIdentity: " + f() + "\n        longPressActionsEnabled: false\n        shouldShowSinName: false\n    }\n  ");
    }

    @Override // defpackage.mll
    public final mod u() {
        return this.b.u();
    }

    @Override // defpackage.mll
    public final qpd v() {
        return this.b.v();
    }

    @Override // defpackage.mll
    public final vvh w() {
        return this.b.w();
    }

    @Override // defpackage.mll
    public final amjj x() {
        return this.b.x();
    }

    @Override // defpackage.mll
    public final Instant y() {
        return this.b.y();
    }

    @Override // defpackage.mll
    public final String z() {
        return this.b.z();
    }
}
