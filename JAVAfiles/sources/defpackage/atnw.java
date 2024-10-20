package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class atnw extends atmx {
    private static final long serialVersionUID = -8315884183112502995L;
    protected int a;
    protected atmk b;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = new atmk(atktVar);
    }

    @Override // defpackage.atmx
    public void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        this.b.h(atkvVar, null, z);
    }
}
