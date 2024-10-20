package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnz extends atmx {
    private static final long serialVersionUID = -4193583311594626915L;
    private byte[] a;

    @Override // defpackage.atmx
    public final String a() {
        return i(this.a);
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atnz();
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
