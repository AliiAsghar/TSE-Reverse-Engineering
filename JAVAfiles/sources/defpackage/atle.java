package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atle extends atmx {
    private static final long serialVersionUID = -6349714958085750705L;
    private byte[] a;
    private byte[] b;
    private byte[] c;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(h(this.b, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.a, true));
        stringBuffer.append(" ");
        stringBuffer.append(h(this.c, true));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atle();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.b = atktVar.j();
        this.a = atktVar.j();
        this.c = atktVar.j();
        try {
            double parseDouble = Double.parseDouble(h(this.b, false));
            double parseDouble2 = Double.parseDouble(h(this.a, false));
            if (parseDouble >= -90.0d && parseDouble <= 90.0d) {
                if (parseDouble2 >= -180.0d && parseDouble2 <= 180.0d) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("illegal latitude ");
                stringBuffer.append(parseDouble2);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
            StringBuffer stringBuffer2 = new StringBuffer("illegal longitude ");
            stringBuffer2.append(parseDouble);
            throw new IllegalArgumentException(stringBuffer2.toString());
        } catch (IllegalArgumentException e) {
            throw new atoc(e.getMessage());
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.c(this.b);
        atkvVar.c(this.a);
        atkvVar.c(this.c);
    }
}
