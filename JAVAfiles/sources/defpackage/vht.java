package defpackage;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vht {
    public vht() {
    }

    public static void a(vgq vgqVar) {
        xzb.k("BugleNetwork", "Executing RPC: className=%s requestId=%s", vgqVar.f(), vgqVar.g());
    }

    public static void b(vgq vgqVar) {
        xzb.k("BugleNetwork", "Received result for RPC: className=%s requestId=%s, responseId=%d", vgqVar.f(), vgqVar.g(), Long.valueOf(vgqVar.a()));
    }

    public static void c(vgq vgqVar) {
        xzb.o("BugleNetwork", "Failed to make RPC call: className=%s requestId=%s, responseId=%d", vgqVar.f(), vgqVar.g(), Long.valueOf(vgqVar.a()));
    }

    public static final boolean d() {
        Object e = vbh.c.e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    public static anha e(int i) {
        aozy createBuilder = anha.a.createBuilder();
        if (i != -2) {
            if (i != -1) {
                if (i < 0) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((anha) createBuilder.b).b = a.an(2);
                } else {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((anha) createBuilder.b).b = a.an(4);
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((anha) createBuilder.b).c = i;
                }
            } else {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((anha) createBuilder.b).b = a.an(2);
            }
        } else {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((anha) createBuilder.b).b = a.an(3);
        }
        return (anha) createBuilder.s();
    }

    public static String f(int i) {
        return String.format("#%06X", Integer.valueOf(i & 16777215));
    }

    public static int g(Context context) {
        UsageStatsManager usageStatsManager;
        int appStandbyBucket;
        if (Build.VERSION.SDK_INT >= 28 && (usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats")) != null) {
            appStandbyBucket = usageStatsManager.getAppStandbyBucket();
            return appStandbyBucket;
        }
        return 0;
    }

    public static int h(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return 0;
        }
        if (powerManager.isIgnoringBatteryOptimizations(context.getPackageName())) {
            return 2;
        }
        return 1;
    }

    public static String i(Context context, List list) {
        StringBuilder sb = new StringBuilder();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                rwz rwzVar = (rwz) it.next();
                if (rwzVar.aV()) {
                    if (rwzVar.bk() && !rwzVar.bt()) {
                        i++;
                    }
                    if (rwzVar.bz()) {
                        i2++;
                    }
                }
            }
            Resources resources = context.getResources();
            if (i > 0) {
                sb.append(resources.getQuantityString(R.plurals.notification_picture_count, i, Integer.valueOf(i)));
            }
            if (i2 > 0) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(resources.getString(R.string.enumeration_comma));
                }
                sb.append(resources.getQuantityString(R.plurals.notification_video_count, i2, Integer.valueOf(i2)));
            }
        }
        return sb.toString();
    }

    public static String j(double d, double d2) {
        return String.format(Locale.US, "https://www.google.com/maps/place/%1$.5f,%2$.5f/", Double.valueOf(d), Double.valueOf(d2));
    }

    public static final SmartSuggestionItemSuggestionData k(szn sznVar) {
        sznVar.getClass();
        aqcz k = sznVar.k();
        aqcy aqcyVar = k.e;
        if (aqcyVar == null) {
            aqcyVar = aqcy.b;
        }
        aozy builder = aqcyVar.toBuilder();
        builder.getClass();
        aozy builder2 = k.toBuilder();
        aqba h = sznVar.h();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((aqcy) builder.b).d = h.a();
        sznVar.ao(6, "consumption_state");
        aqbb aqbbVar = sznVar.g;
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((aqcy) builder.b).e = aqbbVar.a();
        if (!builder2.b.isMutable()) {
            builder2.u();
        }
        aqcz aqczVar = (aqcz) builder2.b;
        aqcy aqcyVar2 = (aqcy) builder.s();
        aqcyVar2.getClass();
        aqczVar.e = aqcyVar2;
        aqczVar.b |= 1;
        apag s = builder2.s();
        s.getClass();
        sznVar.ao(0, "_id");
        String str = sznVar.a;
        str.getClass();
        return new SmartSuggestionItemSuggestionData((aqcz) s, str, ryk.a);
    }

    public static agmh[] l() {
        return (agmh[]) rpb.e.s;
    }

    public vht(znj znjVar, ryg rygVar, mbl mblVar, anen anenVar) {
        aiwl a = wus.a();
        a.i(wuk.FIREBASE);
        a.k(vds.a);
        a.j(new vdz(rygVar, anenVar, mblVar, 0));
        a.h(new uzg(5));
        znjVar.ab(a.f());
    }
}
