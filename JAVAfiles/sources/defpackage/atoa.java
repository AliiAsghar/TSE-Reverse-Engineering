package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atoa extends atmx {
    private static final long serialVersionUID = 7955422413971804232L;
    private int a;
    private int b;
    private byte[] c = new byte[0];

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(this.a);
        stringBuffer2.append(" ");
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(this.b);
        stringBuffer3.append(" ");
        stringBuffer.append(stringBuffer3.toString());
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atoa();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = atktVar.b();
        this.c = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        atkvVar.d(this.b);
        atkvVar.a(this.c);
    }
}
