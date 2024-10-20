package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aioc extends aink {
    @Override // defpackage.ailc
    public final aimh h() {
        aimu aimuVar = new aimu();
        this.a.a(2070);
        this.a.h();
        this.a.a(58);
        this.a.h();
        while (true) {
            aimt aimtVar = new aimt();
            super.s(aimtVar);
            aimuVar.g(aimtVar);
            this.a.h();
            if (this.a.q(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.q(0) == '\n') {
            return aimuVar;
        }
        throw a("unexpected char");
    }
}
