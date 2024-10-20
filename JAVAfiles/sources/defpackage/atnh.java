package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnh extends atmx {
    private static final long serialVersionUID = -8104701402654687025L;
    private int a;
    private int b;
    private byte[] c;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(atpj.c(this.c));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atnh();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.c();
        this.b = atktVar.c();
        this.c = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(this.a);
        atkvVar.g(this.b);
        atkvVar.a(this.c);
    }
}
