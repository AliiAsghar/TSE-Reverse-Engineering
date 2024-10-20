package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afoa extends mr {
    final /* synthetic */ afof c;

    public afoa(afof afofVar) {
        this.c = afofVar;
    }

    @Override // defpackage.mr
    public final int b(int i) {
        afoq afoqVar = this.c.e;
        if (afoqVar == null || afoqVar.H(i).b() != 1) {
            return 1;
        }
        afoq afoqVar2 = this.c.e;
        if (afoqVar2 == null) {
            arro.b("currentAdapter");
            afoqVar2 = null;
        }
        return afoqVar2.f;
    }
}
