package defpackage;

import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjv implements wve {
    final /* synthetic */ xjw a;

    public xjv(xjw xjwVar) {
        this.a = xjwVar;
    }

    @Override // defpackage.wve
    public final Optional a() {
        aozy createBuilder = xju.a.createBuilder();
        xjw xjwVar = this.a;
        if (xjwVar.e.p("bugle_full_sync_in_progress")) {
            boolean q = xjwVar.e.q("bugle_full_sync_in_progress", false);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            xju xjuVar = (xju) createBuilder.b;
            xjuVar.b |= 1;
            xjuVar.c = q;
        }
        if (xjwVar.e.p("last_full_sync_time_millis")) {
            apct b = apds.b(xjwVar.e.e("last_full_sync_time_millis", -1L));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            xju xjuVar2 = (xju) createBuilder.b;
            b.getClass();
            xjuVar2.d = b;
            xjuVar2.b |= 2;
        }
        if (xjwVar.e.p("last_sync_time_millis")) {
            apct b2 = apds.b(xjwVar.e.e("last_sync_time_millis", -1L));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            xju xjuVar3 = (xju) createBuilder.b;
            b2.getClass();
            xjuVar3.e = b2;
            xjuVar3.b |= 4;
        }
        return Optional.of((xju) createBuilder.s());
    }

    @Override // defpackage.wvd
    public final void c() {
        ((mbl) this.a.f.b()).c("Bugle.ForwardSync.SettingsStore.Migration.Count");
    }

    @Override // defpackage.wve
    public final void b() {
    }
}
