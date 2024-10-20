package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkc extends atmx {
    private static final long serialVersionUID = 4763014646517016835L;
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
        if (this.d != null) {
            if (atmp.a("multiline")) {
                stringBuffer.append(" (\n");
                stringBuffer.append(atow.d(this.d, true));
            } else {
                stringBuffer.append(" ");
                stringBuffer.append(atow.c(this.d));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atkc();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = atktVar.b();
        this.c = atktVar.c();
        this.d = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        atkvVar.d(this.b);
        atkvVar.g(this.c);
        atkvVar.a(this.d);
    }
}
