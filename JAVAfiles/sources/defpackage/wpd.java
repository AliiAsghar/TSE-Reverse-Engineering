package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.TelephonyNetworkSpecifier;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.satelliteapi.dunestar.SatelliteConnectionChangeReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wpd {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer");
    public final ConnectivityManager a;
    public final qvr b;
    private final pds d;
    private final Context e;

    public wpd(ConnectivityManager connectivityManager, qvr qvrVar, pds pdsVar, Context context) {
        connectivityManager.getClass();
        qvrVar.getClass();
        context.getClass();
        this.a = connectivityManager;
        this.b = qvrVar;
        this.d = pdsVar;
        this.e = context;
    }

    public static final NetworkRequest c(int i, Integer num) {
        TelephonyNetworkSpecifier.Builder subscriptionId;
        TelephonyNetworkSpecifier build;
        NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addTransportType(i).addCapability(12);
        if (num != null) {
            subscriptionId = new TelephonyNetworkSpecifier.Builder().setSubscriptionId(num.intValue());
            build = subscriptionId.build();
            addCapability.setNetworkSpecifier(build);
        }
        NetworkRequest build2 = addCapability.build();
        build2.getClass();
        return build2;
    }

    public static /* synthetic */ PendingIntent d(wpd wpdVar, qwe qweVar, String str, int i) {
        if (1 == (i & 1)) {
            qweVar = null;
        }
        return wpdVar.a(qweVar, null, str);
    }

    public final PendingIntent a(qwe qweVar, Integer num, String str) {
        Intent a = lqn.e(new ComponentName(this.e, (Class<?>) SatelliteConnectionChangeReceiver.class), str).a();
        a.getClass();
        if (qweVar != null) {
            a.putExtra("MyIdentityToken", qweVar.b());
            if (num != null) {
                a.setIdentifier(qweVar.a + "|" + num);
            }
        }
        PendingIntent b = aipr.b(this.e, 0, a, yhy.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void b() {
        alvi alviVar = c;
        alvw d = alviVar.d();
        d.X(alwp.a, "BugleSatellite");
        ((alvg) d.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 49, "DunestarNetworkCallbackRegisterer.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executing...");
        try {
            ConnectivityManager connectivityManager = this.a;
            NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addTransportType(10).addCapability(12).removeCapability(13);
            if (((ansy) ((pdp) this.d).a.b()).e("bugle.remove_not_bandwidth_constrained_capability") && yhx.i) {
                removeCapability.removeCapability(37);
            }
            NetworkRequest build = removeCapability.build();
            build.getClass();
            connectivityManager.registerNetworkCallback(build, d(this, null, "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_NEW_SATELLITE_CONNECTION", 3));
            alvw d2 = alviVar.d();
            d2.X(alwp.a, "BugleSatellite");
            ((alvg) d2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 55, "DunestarNetworkCallbackRegisterer.kt")).q("registerNetworkCallbacksForNewSatelliteConnection executed.");
        } catch (IllegalArgumentException e) {
            alvw d3 = c.d();
            d3.X(alwp.a, "BugleSatellite");
            ((alvg) ((alvg) d3).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/DunestarNetworkCallbackRegisterer", "registerNetworkCallbacksForNewSatelliteConnection", 57, "DunestarNetworkCallbackRegisterer.kt")).q("IllegalArgumentException: Satellite features not supported");
        }
    }
}
