package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkb extends atmx {
    private static final long serialVersionUID = 8544304287274216443L;
    private int a;
    private byte[] b;
    private byte[] c;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(h(this.b, false));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atkb();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.c();
        this.b = atktVar.j();
        this.c = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(this.a);
        atkvVar.c(this.b);
        atkvVar.a(this.c);
    }
}
