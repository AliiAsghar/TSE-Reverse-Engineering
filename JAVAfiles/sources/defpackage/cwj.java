package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwj implements ciq {
    public static final cwj a = new cwj();
    public static Boolean b;

    private cwj() {
    }

    @Override // defpackage.ciq
    public final void a(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.ciq
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        csg.a("canFocus is read before it is written");
        throw new armj();
    }

    @Override // defpackage.ciq
    public final /* synthetic */ void b(arqr arqrVar) {
    }

    @Override // defpackage.ciq
    public final /* synthetic */ void c(arqr arqrVar) {
    }
}
