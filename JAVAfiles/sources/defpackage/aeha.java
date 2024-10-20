package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeha implements aegz {
    public static final alvi a = alvi.m("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor");
    public final aehm b;
    private final Context c;
    private final anen d;
    private final anen e;

    public aeha(Context context, anen anenVar, anen anenVar2, aehm aehmVar) {
        this.c = context;
        this.d = anenVar;
        this.e = anenVar2;
        this.b = aehmVar;
    }

    @Override // defpackage.aegz
    public final Optional a(String str) {
        Optional c = this.b.c(str);
        if (c.isPresent() && (((aehn) c.get()).b & 2) != 0) {
            aotw aotwVar = ((aehn) c.get()).d;
            if (aotwVar == null) {
                aotwVar = aotw.a;
            }
            if (aqnl.a.get().k(this.c)) {
                aozy builder = ((apag) c.get()).toBuilder();
                apct j = aotl.j(Instant.now());
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                aehn aehnVar = (aehn) builder.b;
                j.getClass();
                aehnVar.f = j;
                aehnVar.b |= 8;
                albo.bR(this.d.submit(new xqt((Object) this, str, builder.s(), 17)), new adnx(6), this.e);
            }
            apct apctVar = ((aehn) c.get()).e;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            Instant l = aotl.l(apctVar);
            aozn aoznVar = aotwVar.f;
            if (aoznVar == null) {
                aoznVar = aozn.a;
            }
            if (l.plus(aotl.k(aoznVar)).isBefore(Instant.now())) {
                ((alvg) ((alvg) a.d()).h("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor", "getConfiguration", 79, "MobileConfigurationAccessor.java")).q("getConfiguration returning expired config");
            }
            return Optional.of(aotwVar);
        }
        ((alvg) ((alvg) a.d()).h("com/google/android/libraries/communications/mobileconfiguration/api/accessor/MobileConfigurationAccessor", "getConfiguration", 83, "MobileConfigurationAccessor.java")).q("getConfiguration returning empty");
        return Optional.empty();
    }

    @Override // defpackage.aegz
    public final void b() {
        throw new UnsupportedOperationException("accessor does not support forceSyncConfigurations");
    }

    @Override // defpackage.aegz
    public final void d(alor alorVar) {
        throw new UnsupportedOperationException("accessor does not support registerParameters");
    }
}
