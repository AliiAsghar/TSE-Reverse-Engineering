package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmi extends atmx {
    private static final long serialVersionUID = -5796493183235216538L;
    private byte[] a;

    @Override // defpackage.atmx
    public final String a() {
        return i(this.a);
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmi();
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
