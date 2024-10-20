package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atne extends atmx {
    private static final long serialVersionUID = 1049740098229303931L;
    public long a;
    public long b;
    private atmk c;
    private atmk d;
    private long e;
    private long k;
    private long l;

    public atne() {
    }

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(this.d);
        if (atmp.a("multiline")) {
            stringBuffer.append(" (\n\t\t\t\t\t");
            stringBuffer.append(this.a);
            stringBuffer.append("\t; serial\n\t\t\t\t\t");
            stringBuffer.append(this.e);
            stringBuffer.append("\t; refresh\n\t\t\t\t\t");
            stringBuffer.append(this.k);
            stringBuffer.append("\t; retry\n\t\t\t\t\t");
            stringBuffer.append(this.l);
            stringBuffer.append("\t; expire\n\t\t\t\t\t");
            stringBuffer.append(this.b);
            stringBuffer.append(" )\t; minimum");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(this.a);
            stringBuffer.append(" ");
            stringBuffer.append(this.e);
            stringBuffer.append(" ");
            stringBuffer.append(this.k);
            stringBuffer.append(" ");
            stringBuffer.append(this.l);
            stringBuffer.append(" ");
            stringBuffer.append(this.b);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atne();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.c = new atmk(atktVar);
        this.d = new atmk(atktVar);
        this.a = atktVar.e();
        this.e = atktVar.e();
        this.k = atktVar.e();
        this.l = atktVar.e();
        this.b = atktVar.e();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        this.c.h(atkvVar, atknVar, z);
        this.d.h(atkvVar, atknVar, z);
        atkvVar.f(this.a);
        atkvVar.f(this.e);
        atkvVar.f(this.k);
        atkvVar.f(this.l);
        atkvVar.f(this.b);
    }

    public atne(atmk atmkVar, int i, atmk atmkVar2, atmk atmkVar3) {
        super(atmkVar, i);
        p(atmkVar2);
        this.c = atmkVar2;
        p(atmkVar3);
        this.d = atmkVar3;
        this.a = 0L;
        this.e = 0L;
        this.k = 0L;
        this.l = 0L;
        this.b = 0L;
    }
}
