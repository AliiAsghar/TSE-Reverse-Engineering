package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnd extends atmx {
    private static final long serialVersionUID = 1640247915216425235L;
    private int a;
    private int b;
    private int c;
    private byte[] d;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        stringBuffer.append(" ");
        stringBuffer.append(atpj.c(this.d));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atnd();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.c();
        this.b = atktVar.c();
        this.c = atktVar.c();
        this.d = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.g(this.a);
        atkvVar.g(this.b);
        atkvVar.g(this.c);
        atkvVar.a(this.d);
    }
}
