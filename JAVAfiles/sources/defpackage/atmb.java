package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmb extends atmx {
    private static final long serialVersionUID = 5191232392044947002L;
    public int a;
    public int b;
    public atmk c;
    private byte[] d;
    private byte[] e;
    private byte[] k;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(h(this.d, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.e, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.k, true));
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmb();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = atktVar.b();
        this.d = atktVar.j();
        this.e = atktVar.j();
        this.k = atktVar.j();
        this.c = new atmk(atktVar);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        atkvVar.d(this.b);
        atkvVar.c(this.d);
        atkvVar.c(this.e);
        atkvVar.c(this.k);
        this.c.h(atkvVar, null, z);
    }

    @Override // defpackage.atmx
    public final atmk hr() {
        return this.c;
    }
}
