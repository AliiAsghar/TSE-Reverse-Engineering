package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kog extends knj {
    private final Context g;
    private final yjy h;
    private final xyt i;
    private final yjr j;
    private final ryg k;

    public kog(kni kniVar, Context context, yjy yjyVar, xyt xytVar, yjr yjrVar, ryg rygVar) {
        super(kniVar, "SMS/MMS Connectivity Check");
        this.g = context;
        this.h = yjyVar;
        this.i = xytVar;
        this.j = yjrVar;
        this.k = rygVar;
    }

    @Override // defpackage.knj
    public final knk a() {
        Optional of;
        boolean isDataEnabled;
        Optional empty;
        int simState;
        this.f.j("Checking SIM statuses");
        ArrayList arrayList = new ArrayList();
        kof kofVar = new kof(this.f, this.h, this.g);
        yjy yjyVar = kofVar.a;
        jxv jxvVar = kofVar.c;
        int c = yjyVar.c();
        int b = yjyVar.b();
        knl h = jxvVar.h();
        h.x("defaultSmsSubId", c);
        h.q();
        knl h2 = kofVar.c.h();
        h2.x("defaultDataSubId", b);
        h2.q();
        TelephonyManager telephonyManager = (TelephonyManager) kofVar.b.getSystemService("phone");
        if (telephonyManager != null) {
            int e = kofVar.a.e();
            for (int i = 0; i < e; i++) {
                knl h3 = kofVar.c.h();
                h3.x("slotId", i);
                simState = telephonyManager.getSimState(i);
                h3.x("simState", simState);
                h3.q();
            }
        }
        if (kofVar.a.p()) {
            of = Optional.empty();
        } else {
            of = Optional.of(kofVar.b.getString(R.string.set_default_sms_sim_suggestion));
        }
        of.ifPresent(new ixj(arrayList, 19));
        koe koeVar = new koe(this.f, this.g, this.h, this.i, this.j);
        TelephonyManager telephonyManager2 = (TelephonyManager) koeVar.a.getSystemService("phone");
        if (telephonyManager2 == null) {
            koeVar.d.j("telephony manager is null");
        } else {
            knl h4 = koeVar.d.h();
            h4.A("Device is SMS Capable", telephonyManager2.isSmsCapable());
            isDataEnabled = telephonyManager2.isDataEnabled();
            h4.A("Data is enabled", isDataEnabled);
            h4.A("Network is roaming", telephonyManager2.isNetworkRoaming());
            h4.A("Device is in airplaneMode", koeVar.c.w());
            h4.q();
        }
        List l = koeVar.b.l();
        koeVar.b(l, 0);
        koeVar.b(l, 1);
        if (koeVar.c.w()) {
            empty = Optional.of(koeVar.a.getString(R.string.turn_off_airplane_mode_suggestion));
        } else {
            empty = Optional.empty();
        }
        empty.ifPresent(new ixj(arrayList, 19));
        knq knqVar = new knq(this.f, this.g, this.k);
        knqVar.a();
        Optional.ofNullable(knqVar.b).ifPresent(new ixj(arrayList, 19));
        if (!arrayList.isEmpty()) {
            return new knk(4, arrayList);
        }
        return knk.a;
    }
}
