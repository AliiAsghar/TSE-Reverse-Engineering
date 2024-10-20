package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xcd {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils");
    public final armf a;
    public final armf b;
    public final Context c;
    private final armf e;
    private final Executor f;
    private final Object g = new Object();
    private final HashMap h = new HashMap();
    private final zbl i;

    public xcd(Context context, Executor executor, armf armfVar, armf armfVar2, armf armfVar3, zbl zblVar) {
        this.c = context;
        this.f = executor;
        this.a = armfVar;
        this.e = armfVar2;
        this.b = armfVar3;
        this.i = zblVar;
    }

    public static int a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        int i = gregorianCalendar.get(15) + gregorianCalendar.get(16);
        alvi alviVar = d;
        alvw d2 = alviVar.d();
        d2.X(alwp.a, "Bugle");
        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils", "getTimeOffset", 44, "WapPushSiUtils.java")).r("Timezone Offset: %d", i);
        alvw d3 = alviVar.d();
        d3.X(alwp.a, "Bugle");
        ((alvg) ((alvg) d3).h("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils", "getTimeOffset", 45, "WapPushSiUtils.java")).r("DST Timezone Offset: %d", gregorianCalendar.get(16));
        return i;
    }

    public final void b() {
        qjb.a(new wuo(this, 4), this.f);
    }

    public final boolean c(int i) {
        zke zkeVar;
        if (((Boolean) zke.a.e()).booleanValue()) {
            synchronized (this.g) {
                HashMap hashMap = this.h;
                Integer valueOf = Integer.valueOf(i);
                zkeVar = (zke) hashMap.get(valueOf);
                if (zkeVar == null) {
                    zkeVar = this.i.a(i);
                    this.h.put(valueOf, zkeVar);
                }
            }
            return ((Boolean) zkeVar.i().orElse(Boolean.valueOf(((xbf) this.e.b()).a(i).m()))).booleanValue();
        }
        return ((zxy) this.a.b()).x(i).q(this.c.getResources().getString(R.string.wap_push_si_pref_key), ((xbf) this.e.b()).a(i).m());
    }
}
