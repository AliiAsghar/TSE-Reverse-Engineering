package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atod extends atmx {
    private static final long serialVersionUID = 4267576252335579764L;
    private byte[] a;

    @Override // defpackage.atmx
    public final String a() {
        return h(this.a, true);
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atod();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        this.a = atktVar.j();
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        atkvVar.c(this.a);
    }
}
