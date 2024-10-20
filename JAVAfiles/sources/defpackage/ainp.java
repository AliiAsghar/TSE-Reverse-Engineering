package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ainp extends aink {
    @Override // defpackage.ailc
    public final aimh h() {
        i(2087);
        aily ailyVar = new aily();
        while (true) {
            ailx ailxVar = new ailx();
            if (this.a.q(0) == '*') {
                this.a.a(42);
                ailxVar.b = true;
            } else {
                super.s(ailxVar);
            }
            ailyVar.g(ailxVar);
            this.a.h();
            if (this.a.q(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.q(0) == '\n') {
            return ailyVar;
        }
        throw a("unexpected char");
    }
}
