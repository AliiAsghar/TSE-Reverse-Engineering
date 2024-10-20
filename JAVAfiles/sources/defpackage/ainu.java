package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ainu extends ailc {
    @Override // defpackage.ailc
    public final aimh h() {
        aime aimeVar = new aime();
        this.a.a(2090);
        this.a.h();
        this.a.a(58);
        this.a.h();
        String f = this.a.f();
        this.a.a(10);
        try {
            aimeVar.e(Integer.parseInt(f));
            return aimeVar;
        } catch (NumberFormatException unused) {
            throw a("bad integer format");
        }
    }
}
