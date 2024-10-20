package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atms extends atmx {
    private static final long serialVersionUID = 8124584364211337460L;
    private atmk a;
    private atmk b;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atms();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = new atmk(atktVar);
        this.b = new atmk(atktVar);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        this.a.h(atkvVar, null, z);
        this.b.h(atkvVar, null, z);
    }
}
