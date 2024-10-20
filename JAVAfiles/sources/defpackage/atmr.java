package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmr extends atmx {
    private static final long serialVersionUID = 1811540008806660667L;
    private int a;
    private atmk b;
    private atmk c;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append(" ");
        stringBuffer.append(this.b);
        stringBuffer.append(" ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmr();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.b();
        this.b = new atmk(atktVar);
        this.c = new atmk(atktVar);
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.d(this.a);
        this.b.h(atkvVar, null, z);
        this.c.h(atkvVar, null, z);
    }
}
