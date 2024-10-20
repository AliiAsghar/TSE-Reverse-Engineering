package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmc extends atmx {
    private static final long serialVersionUID = -1037209403185658593L;
    private byte[] a;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("0x");
        stringBuffer.append(atpj.c(this.a));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmc();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.a(this.a);
    }
}
