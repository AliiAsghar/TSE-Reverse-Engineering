package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqv extends akqe implements akqc {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public akqv(String str, akqc akqcVar, akrl akrlVar, boolean z, akru akruVar) {
        super("<missing root>:".concat(String.valueOf(str)), akqcVar, akrl.e(akrlVar, akrk.b), akruVar);
        this.b = akqcVar.g();
        this.a = akqcVar.h();
        this.c = z;
    }

    public static void k() {
        alpt l = akqj.l();
        if (!l.isEmpty()) {
            Iterable$EL.forEach(l, new ajql(4));
        }
    }

    @Override // defpackage.akqc
    public final akry f(String str, akrl akrlVar, boolean z, akru akruVar) {
        boolean z2;
        if (z && !this.c) {
            akqj.x();
        }
        if ((z && !this.c) || this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new akqv(str, this, akrlVar, z2, akruVar);
    }

    @Override // defpackage.akqc
    public final Exception g() {
        return this.b;
    }

    @Override // defpackage.akqc
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.akqe, defpackage.akry
    public final akri j(aktp aktpVar) {
        akri j = super.j(aktpVar);
        if (j.c() == 3) {
            return akri.d(2);
        }
        return j;
    }

    @Override // defpackage.akry
    public final akrl l() {
        return akrk.a;
    }

    @Override // defpackage.akry
    public final akry m(String str, akrl akrlVar, akru akruVar) {
        return f(str, akrlVar, true, akruVar);
    }

    @Override // defpackage.akry
    public final boolean p() {
        return false;
    }

    public akqv(UUID uuid, String str, akrl akrlVar, Exception exc, boolean z, boolean z2, akru akruVar) {
        super("<missing root>:".concat(String.valueOf(str)), uuid, akrl.e(akrlVar, akrk.b), akruVar);
        this.a = z2;
        this.b = exc;
        this.c = z;
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
