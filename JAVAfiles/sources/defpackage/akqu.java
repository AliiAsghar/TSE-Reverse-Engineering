package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqu extends akpn implements akqc {
    static final akqa a = new akqb();
    public static final /* synthetic */ int c = 0;
    public final boolean b;
    private final Exception d;

    public akqu(UUID uuid, Exception exc, boolean z, akru akruVar) {
        super("<missing root>", uuid, akruVar);
        this.d = exc;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static akqu k(akru akruVar) {
        UUID b = akqn.a.b();
        if (!akrz.a()) {
            q();
            return new akqu(b, a, false, akruVar);
        }
        akqa akqaVar = new akqa();
        q();
        return new akqu(b, akqaVar, akqj.t(akqaVar), akruVar);
    }

    public static void q() {
        alpt l = akqj.l();
        if (!l.isEmpty()) {
            Iterable$EL.forEach(l, new ajql(3));
        }
    }

    @Override // defpackage.akqc
    public final akry f(String str, akrl akrlVar, boolean z, akru akruVar) {
        if (z) {
            akqj.x();
        }
        return new akqv(str, this, akrlVar, z, akruVar);
    }

    @Override // defpackage.akqc
    public final Exception g() {
        return this.d;
    }

    @Override // defpackage.akqc
    public final boolean h() {
        return this.b;
    }

    @Override // defpackage.akry
    public final akrl i() {
        return akrk.a;
    }

    @Override // defpackage.akry
    public final akri j(aktp aktpVar) {
        return akri.d(2);
    }

    @Override // defpackage.akry
    public final akrl l() {
        throw null;
    }

    @Override // defpackage.akry
    public final akry m(String str, akrl akrlVar, akru akruVar) {
        akqj.x();
        return f(str, akrlVar, true, akruVar);
    }

    @Override // defpackage.akry
    public final boolean p() {
        return false;
    }

    @Override // defpackage.akry
    public final void r() {
    }

    @Override // defpackage.akry
    public final void n(int i) {
    }

    @Override // defpackage.akry
    public final void o(boolean z) {
    }

    @Override // defpackage.akry
    public final void s(aktp aktpVar, Object obj) {
    }
}
