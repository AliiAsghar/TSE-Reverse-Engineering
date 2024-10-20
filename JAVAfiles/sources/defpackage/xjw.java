package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjw {
    public static final utz a = uuh.i(uuh.b, "enable_forward_sync_manager_prefs_migration_to_settings_store", false);
    public static final xze b = xze.g("BugleDataModel", "ForwardSyncManagerSettingsService");
    public static final Instant c = Instant.ofEpochMilli(-1);
    public static final Instant d = Instant.ofEpochMilli(-1);
    public final ykw e;
    public final armf f;
    public final wul g;
    public final anen h;

    public xjw(ykw ykwVar, armf armfVar, armf armfVar2, anen anenVar) {
        this.e = ykwVar;
        this.f = armfVar;
        znj znjVar = (znj) armfVar2.b();
        aiwl a2 = wus.a();
        a2.i(wuk.FORWARD_SYNC_MANAGER);
        a2.k(xju.a);
        a2.j(new xjv(this));
        this.g = znjVar.ab(a2.f());
        this.h = anenVar;
    }

    public final akul a() {
        if (!((Boolean) a.e()).booleanValue()) {
            return aktp.ag(Instant.ofEpochMilli(this.e.e("last_full_sync_time_millis", -1L)));
        }
        return this.g.h().h(new xgu(13), this.h);
    }

    public final akul b(boolean z) {
        this.e.g("bugle_full_sync_in_progress", z);
        return this.g.j(new uam(z, 4)).h(new xgu(5), this.h);
    }

    public final boolean c() {
        return this.e.q("bugle_full_sync_in_progress", false);
    }
}
