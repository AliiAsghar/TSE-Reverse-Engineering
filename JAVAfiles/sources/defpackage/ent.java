package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ent extends enu implements enk {
    final enm a;
    final /* synthetic */ env b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ent(env envVar, enm enmVar, enz enzVar) {
        super(envVar, enzVar);
        this.b = envVar;
        this.a = enmVar;
    }

    @Override // defpackage.enu
    public final boolean a() {
        return this.a.N().a().a(eng.STARTED);
    }

    @Override // defpackage.enu
    public final void b() {
        this.a.N().d(this);
    }

    @Override // defpackage.enu
    public final boolean c(enm enmVar) {
        if (this.a == enmVar) {
            return true;
        }
        return false;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        eng a = this.a.N().a();
        if (a != eng.DESTROYED) {
            eng engVar = null;
            while (engVar != a) {
                d(a());
                engVar = a;
                a = this.a.N().a();
            }
            return;
        }
        this.b.i(this.c);
    }
}
