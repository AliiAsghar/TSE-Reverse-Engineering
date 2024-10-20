package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzv implements mzm {
    public final String a;
    public final yyt b;
    private final agmc c;

    public mzv(wfh wfhVar, String str, agoz agozVar, mzu mzuVar) {
        this.a = str;
        agmc agmcVar = (agmc) mzuVar.a(new mpv(this, 11));
        this.c = agmcVar;
        this.b = wfhVar.Y(new neq(agozVar, agmcVar, 1));
    }

    @Override // defpackage.mzm
    public final mzl a() {
        return new mzl(this.a);
    }

    @Override // defpackage.mzm
    public final yga b(mjf mjfVar) {
        kzq kzqVar = new kzq(mjfVar, 19);
        String str = this.a;
        return this.b.w(kzqVar, str, str, str);
    }
}
