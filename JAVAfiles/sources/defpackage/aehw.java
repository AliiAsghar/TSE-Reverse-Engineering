package defpackage;

import android.content.Context;
import com.google.android.libraries.communications.mobileconfiguration.sync.SyncWorker;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehw {
    private static final alvi a = alvi.m("com/google/android/libraries/communications/mobileconfiguration/sync/SyncScheduler");
    private final Context b;
    private final vco c;

    public aehw(Context context, vco vcoVar) {
        this.b = context;
        this.c = vcoVar;
    }

    private final void d(Duration duration, gso gsoVar, boolean z) {
        int i;
        ((alvg) ((alvg) a.g()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncScheduler", "scheduleNextSync", 74, "SyncScheduler.java")).A("scheduling sync for %d seconds later, policy = %s", duration.getSeconds(), gsoVar);
        aozy createBuilder = apmm.a.createBuilder();
        aozy createBuilder2 = apmp.a.createBuilder();
        aozn i2 = aotl.i(duration);
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmp apmpVar = (apmp) createBuilder2.b;
        i2.getClass();
        apmpVar.c = i2;
        apmpVar.b |= 1;
        int i3 = aehb.a;
        int ordinal = gsoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i = 3;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i = 4;
                    } else {
                        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(gsoVar))));
                    }
                }
            } else {
                i = 5;
            }
        } else {
            i = 6;
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apmp apmpVar2 = (apmp) createBuilder2.b;
        apmpVar2.d = a.am(i);
        apmpVar2.b |= 2;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vco vcoVar = this.c;
        apmm apmmVar = (apmm) createBuilder.b;
        apmp apmpVar3 = (apmp) createBuilder2.s();
        apmpVar3.getClass();
        apmmVar.c = apmpVar3;
        apmmVar.b = 2;
        vcoVar.f((apmm) createBuilder.s());
        gsd gsdVar = new gsd();
        gsdVar.c(2);
        gsf a2 = gsdVar.a();
        gsz gszVar = new gsz(SyncWorker.class);
        gszVar.h(duration);
        gszVar.f(a2);
        gszVar.e(gry.EXPONENTIAL, aqnl.a.get().e(this.b), TimeUnit.SECONDS);
        gszVar.c("SYNC");
        if (aqnl.a.get().g(this.b)) {
            hgi hgiVar = new hgi((char[]) null);
            hgiVar.o("is_force_sync", z);
            gszVar.i(hgiVar.j());
            gszVar.c("FORCE_SYNC");
        }
        gvf.ar(this.b).l("SYNC", gsoVar, gszVar.j());
    }

    public final void a() {
        d(Duration.ZERO, gso.REPLACE, true);
    }

    public final void b(gso gsoVar) {
        d(Duration.ZERO, gsoVar, false);
    }

    public final void c(Map map) {
        Duration ofSeconds;
        Iterator<E> it = ((alor) map).values().iterator();
        long j = Long.MAX_VALUE;
        while (true) {
            if (it.hasNext()) {
                aehn aehnVar = (aehn) it.next();
                aotw aotwVar = aehnVar.d;
                if (aotwVar == null) {
                    aotwVar = aotw.a;
                }
                if ((aotwVar.b & 1) != 0) {
                    if (aqnl.c(this.b)) {
                        apct apctVar = aehnVar.e;
                        if (apctVar == null) {
                            apctVar = apct.a;
                        }
                        Duration between = Duration.between(aotl.l(apctVar), Instant.now());
                        aotw aotwVar2 = aehnVar.d;
                        if (aotwVar2 == null) {
                            aotwVar2 = aotw.a;
                        }
                        aozn aoznVar = aotwVar2.f;
                        if (aoznVar == null) {
                            aoznVar = aozn.a;
                        }
                        j = Math.min(j, Math.max(aqnl.a(this.b), aotl.k(aoznVar).minus(between).toSeconds()));
                    } else {
                        long a2 = aqnl.a(this.b);
                        aotw aotwVar3 = aehnVar.d;
                        if (aotwVar3 == null) {
                            aotwVar3 = aotw.a;
                        }
                        aozn aoznVar2 = aotwVar3.f;
                        if (aoznVar2 == null) {
                            aoznVar2 = aozn.a;
                        }
                        j = Math.min(j, Math.max(a2, apdp.a(aoznVar2) / 1000));
                    }
                } else {
                    ofSeconds = Duration.ZERO;
                    break;
                }
            } else {
                ofSeconds = Duration.ofSeconds(Math.min(aqnl.a.get().c(this.b), j));
                break;
            }
        }
        d(ofSeconds, gso.APPEND, false);
    }
}
