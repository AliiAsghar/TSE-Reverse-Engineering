package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmm extends atmx {
    private static final long serialVersionUID = -1277262990243423062L;
    private byte[] a;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a != null) {
            if (atmp.a("multiline")) {
                stringBuffer.append("(\n");
                stringBuffer.append(atow.d(this.a, true));
            } else {
                stringBuffer.append(atow.c(this.a));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmm();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.h();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.a(this.a);
    }
}
