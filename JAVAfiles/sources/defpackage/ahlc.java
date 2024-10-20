package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahlc extends ahlf {
    public final alhr a;

    public ahlc(long j) {
        if (j > -100 && j < 100) {
            albo.D(new vrz(j, 2));
            this.a = albo.D(new vrz(j, 3));
        } else {
            this.a = albo.D(new vrz(j, 4));
            albo.D(new agud(this, 9));
        }
    }

    @Override // defpackage.ahlf
    public final String a() {
        return (String) this.a.get();
    }
}
