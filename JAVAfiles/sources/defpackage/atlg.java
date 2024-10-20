package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atlg extends atmx {
    private static final long serialVersionUID = -4732870630947452112L;
    private byte[] a;
    private byte[] b;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.a, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.b, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atlg();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.j();
        this.b = atktVar.j();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.c(this.a);
        atkvVar.c(this.b);
    }
}
