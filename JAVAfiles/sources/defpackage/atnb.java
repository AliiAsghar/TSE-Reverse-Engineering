package defpackage;

import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class atnb extends atmx {
    private static final long serialVersionUID = -3738444391533812369L;
    protected int a;
    protected int b;
    protected int c;
    protected long d;
    protected Date e;
    protected Date k;
    protected int l;
    protected atmk m;
    protected byte[] n;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(atnu.a(this.a));
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d);
        stringBuffer.append(" ");
        if (atmp.a("multiline")) {
            stringBuffer.append("(\n\t");
        }
        stringBuffer.append(atld.a(this.e));
        stringBuffer.append(" ");
        stringBuffer.append(atld.a(this.k));
        stringBuffer.append(" ");
        stringBuffer.append(this.l);
        stringBuffer.append(" ");
        stringBuffer.append(this.m);
        if (atmp.a("multiline")) {
            stringBuffer.append("\n");
            stringBuffer.append(atow.d(this.n, true));
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(atow.c(this.n));
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = atktVar.c();
        this.c = atktVar.c();
        this.d = atktVar.e();
        this.e = new Date(atktVar.e() * 1000);
        this.k = new Date(atktVar.e() * 1000);
        this.l = atktVar.b();
        this.m = new atmk(atktVar);
        this.n = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        atkvVar.g(this.b);
        atkvVar.g(this.c);
        atkvVar.f(this.d);
        atkvVar.f(this.e.getTime() / 1000);
        atkvVar.f(this.k.getTime() / 1000);
        atkvVar.d(this.l);
        this.m.h(atkvVar, null, z);
        atkvVar.a(this.n);
    }
}
