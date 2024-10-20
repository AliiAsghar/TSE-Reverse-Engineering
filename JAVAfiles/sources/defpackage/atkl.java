package defpackage;

import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atkl extends atky {
    public long a;
    public long b;
    public byte[] c;
    public byte[] d;

    public atkl() {
        super(20732);
    }

    @Override // defpackage.atky
    public final String a() {
        try {
            StringBuffer stringBuffer = new StringBuffer("{task ");
            stringBuffer.append(this.a);
            stringBuffer.append("/");
            stringBuffer.append(this.b);
            stringBuffer.append(" ");
            stringBuffer.append(new String(this.c, "UTF-8"));
            stringBuffer.append("/");
            stringBuffer.append(new String(this.d, "UTF-8"));
            stringBuffer.append("}");
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException unused) {
            StringBuffer stringBuffer2 = new StringBuffer("{task ");
            stringBuffer2.append(this.a);
            stringBuffer2.append("/");
            stringBuffer2.append(this.b);
            stringBuffer2.append("}");
            return stringBuffer2.toString();
        }
    }

    @Override // defpackage.atky
    public final void b(atkt atktVar) {
        this.a = atktVar.e();
        this.b = atktVar.e();
        this.c = atktVar.i(atktVar.c());
        this.d = atktVar.i(atktVar.c());
    }

    @Override // defpackage.atky
    public final void c(atkv atkvVar) {
        atkvVar.f(this.a);
        atkvVar.f(this.b);
        atkvVar.g(this.c.length);
        atkvVar.a(this.c);
        atkvVar.g(this.d.length);
        atkvVar.a(this.d);
    }
}
