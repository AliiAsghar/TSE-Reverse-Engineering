package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmg extends atmx {
    private static final long serialVersionUID = -5165065768816265385L;
    private atmk a;
    private atnv b;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        if (!this.b.b()) {
            stringBuffer.append(' ');
            stringBuffer.append(this.b.toString());
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmg();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = new atmk(atktVar);
        this.b = new atnv(atktVar);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        this.a.h(atkvVar, null, false);
        this.b.a(atkvVar);
    }
}
