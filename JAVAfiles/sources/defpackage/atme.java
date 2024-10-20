package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atme extends atmx {
    private static final long serialVersionUID = -8689038598776316533L;
    private int a;
    private int b;
    private int c;
    private byte[] d;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(' ');
        stringBuffer.append(this.b);
        stringBuffer.append(' ');
        stringBuffer.append(this.c);
        stringBuffer.append(' ');
        byte[] bArr = this.d;
        if (bArr == null) {
            stringBuffer.append('-');
        } else {
            stringBuffer.append(atpj.c(bArr));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atme();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.c();
        this.b = atktVar.c();
        this.c = atktVar.b();
        int c = atktVar.c();
        if (c > 0) {
            this.d = atktVar.i(c);
        } else {
            this.d = null;
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(this.a);
        atkvVar.g(this.b);
        atkvVar.d(this.c);
        byte[] bArr = this.d;
        if (bArr != null) {
            atkvVar.g(bArr.length);
            atkvVar.a(this.d);
        } else {
            atkvVar.g(0);
        }
    }
}
