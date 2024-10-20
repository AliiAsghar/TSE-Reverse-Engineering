package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atlj extends atmx {
    private static final long serialVersionUID = -8730801385178968798L;
    private byte[] a;
    private byte[] b;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.a, true));
        if (this.b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(h(this.b, true));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atlj();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.j();
        if (atktVar.d() > 0) {
            this.b = atktVar.j();
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.c(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            atkvVar.c(bArr);
        }
    }
}
