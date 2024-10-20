package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyd {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter");
    public final armf b;
    public final armf c;
    private final oeo d;
    private final pmm e;

    public qyd(armf armfVar, oeo oeoVar, armf armfVar2, pmm pmmVar) {
        this.b = armfVar;
        this.d = oeoVar;
        this.c = armfVar2;
        this.e = pmmVar;
    }

    public static long a(tkh tkhVar) {
        agnw d;
        agnw d2;
        d = agnc.d("$primary");
        d2 = agnc.d("$primary");
        long a2 = agnc.a(d2, "self_participants", tkhVar, new tkg(d, 0), new ter(tkhVar, 7));
        Long.valueOf(a2).getClass();
        return a2;
    }

    public static void d() {
        Integer valueOf;
        Integer valueOf2;
        tbb f = ParticipantsTable.f();
        f.aj("resetIsValidPhoneNumberData");
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 55010) {
            agnc.t("is_valid_phone_number_data", intValue2);
        }
        if (intValue >= 55010) {
            f.a.put("is_valid_phone_number_data", (Boolean) false);
        }
        f.M(new qxo(11));
        f.a().e();
    }

    private final void f(tap tapVar, Optional optional) {
        boolean z;
        String str;
        if (this.d.a()) {
            int i = tapVar.d;
            Optional map = optional.map(new qxo(12));
            if (i >= -1) {
                z = true;
            } else {
                z = false;
            }
            d.s(z);
            qwe g = ((qvq) this.c.b()).g(i, (String) map.orElse(null), null);
            if (this.e.a()) {
                alvw g2 = a.g();
                g2.X(alwp.a, "BugleDataModel");
                alvg alvgVar = (alvg) g2;
                alvgVar.X(ydl.t, Integer.valueOf(i));
                alvz alvzVar = ydl.u;
                if (map.isPresent()) {
                    str = advq.SIM_ICCID.c(map.get());
                } else {
                    str = "null";
                }
                alvgVar.X(alvzVar, str);
                alvgVar.X(ydl.v, g);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "supplementFieldsForSelfBeforeBuild", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "ParticipantsColumnSetter.java")).q("set token for new self participant");
            } else {
                alvw g3 = a.g();
                g3.X(alwp.a, "BugleDataModel");
                alvg alvgVar2 = (alvg) g3;
                alvgVar2.X(ydl.t, Integer.valueOf(i));
                alvgVar2.X(ydl.u, (String) map.orElse(null));
                alvgVar2.X(ydl.v, g);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "supplementFieldsForSelfBeforeBuild", 209, "ParticipantsColumnSetter.java")).q("set token for new self participant");
            }
            tapVar.D(g);
        }
    }

    public final long b(ParticipantsTable.BindData bindData) {
        boolean z;
        if (this.d.a()) {
            if (bindData.p() >= -1) {
                z = true;
            } else {
                z = false;
            }
            d.s(z);
        }
        return bindData.E().longValue();
    }

    @Deprecated
    public final ParticipantsTable.BindData c(tap tapVar, Optional optional) {
        f(tapVar, optional);
        ParticipantsTable.BindData b = tapVar.b(new sym(20));
        b.D();
        albo.C(b);
        albo.C(b.M());
        albo.A(!"-1".equals(b.M()), b.M(), new Object[0]);
        return b;
    }

    public final void e(tap tapVar) {
        f(tapVar, Optional.empty());
    }
}
