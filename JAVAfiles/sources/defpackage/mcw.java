package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mcw implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ mcw(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        agmh agmhVar;
        agmh agmhVar2;
        agmh agmhVar3;
        switch (this.a) {
            case 0:
                return mcx.c(2, 2);
            case 1:
                return ames.a.createBuilder();
            case 2:
                return mcx.c(3, 2);
            case 3:
                return amgb.a.createBuilder();
            case 4:
                return new mfa();
            case 5:
                return new HashMap();
            case 6:
                return new ArrayList();
            case 7:
                alhr alhrVar = mic.h;
                return null;
            case 8:
                alvw i = mic.l.i();
                i.X(alwp.a, "BugleUsageStatistics");
                alvg alvgVar = (alvg) i;
                alvgVar.Z(alwk.MEDIUM);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "getConfiguration", 5759, "UsageStatisticsImpl.java")).q("Unable to retrieve the RCS Config, unexpected empty subId");
                return Optional.empty();
            case 9:
                return null;
            case 10:
                return new HashMap();
            case 11:
                return null;
            case 12:
                return new IllegalStateException("selfIdentity expected for RCS group");
            case 13:
            case 14:
                return null;
            case 15:
                return d.M();
            case 16:
                agmhVar = ParticipantsTable.c.a;
                return agmhVar;
            case 17:
                return d.M();
            case 18:
                return d.ae();
            case 19:
                agmhVar2 = sni.c.a;
                return agmhVar2;
            default:
                agmhVar3 = sni.c.a;
                return agmhVar3;
        }
    }
}
