package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atng extends atmx {
    private static final long serialVersionUID = -3886460132387522052L;
    public int a;
    public int b;
    public int c;
    public atmk d;

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
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(this.c);
        stringBuffer4.append(" ");
        stringBuffer.append(stringBuffer4.toString());
        stringBuffer.append(this.d);
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atng();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = atktVar.b();
        this.c = atktVar.b();
        this.d = new atmk(atktVar);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        atkvVar.d(this.b);
        atkvVar.d(this.c);
        this.d.h(atkvVar, null, z);
    }

    @Override // defpackage.atmx
    public final atmk hr() {
        return this.d;
    }
}
