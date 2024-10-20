package defpackage;

import android.content.res.Configuration;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ch implements ecd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ch(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ecd
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((cj) this.a).e.r();
                return;
            case 1:
                ((cj) this.a).e.r();
                return;
            case 2:
                Configuration configuration = (Configuration) obj;
                da daVar = (da) this.a;
                if (daVar.Z()) {
                    daVar.s(configuration, false);
                    return;
                }
                return;
            case 3:
                Integer num = (Integer) obj;
                da daVar2 = (da) this.a;
                if (daVar2.Z() && num.intValue() == 80) {
                    daVar2.v(false);
                    return;
                }
                return;
            case 4:
                akip akipVar = (akip) obj;
                da daVar3 = (da) this.a;
                if (daVar3.Z()) {
                    daVar3.w(akipVar.a, false);
                    return;
                }
                return;
            case 5:
                akip akipVar2 = (akip) obj;
                da daVar4 = (da) this.a;
                if (daVar4.Z()) {
                    daVar4.B(akipVar2.a, false);
                    return;
                }
                return;
            case 6:
                ((View) this.a).post((Runnable) obj);
                return;
            case 7:
                ((arzk) this.a).c((gqz) obj);
                return;
            default:
                alvw h = ngr.c.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) h).h("com/google/android/apps/messaging/shared/app/BugleApplicationBase", "handleWorkManagerDatabaseCorruption", 187, "BugleApplicationBase.java")).q("BugleApplicationBase: work manager corruption detected, wiping app data");
                armf armfVar = ((ngr) this.a).p;
                if (armfVar != null) {
                    ((wpp) armfVar.b()).s("Bugle.Datamodel.WorkManagerCorrupted.Counts");
                    return;
                }
                return;
        }
    }
}
