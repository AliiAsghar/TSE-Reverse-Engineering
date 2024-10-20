package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlk extends rg {
    final /* synthetic */ zll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlk(zll zllVar) {
        super(true);
        this.a = zllVar;
    }

    @Override // defpackage.rg
    public final void b() {
        zll zllVar = this.a;
        if (zllVar.a.R().isPresent()) {
            zll.a(zllVar.a);
            cg e = zllVar.a.a().e("messages");
            if (e instanceof zlu) {
                ((zlu) e).E().b(-1);
                return;
            }
            return;
        }
        zllVar.d.h(false);
        zllVar.a.c().d();
    }
}
