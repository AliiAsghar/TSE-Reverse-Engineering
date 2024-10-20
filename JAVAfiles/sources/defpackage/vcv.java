package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vcv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager");
    public static final utz b = uuh.h(uuh.b, "tachyon_ditto_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final utz c = uuh.h(uuh.b, "tachyon_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final utz d = uuh.h(uuh.b, "tachyon_spam_host_and_port", "instantmessaging-pa.googleapis.com:443");
    public static final utz e = uuh.f(uuh.b, "ditto_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(30));
    public static final utz f = uuh.f(uuh.b, "ditto_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(10));
    public static final utz g = uuh.f(uuh.b, "verified_sms_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(10));
    public static final utz h = uuh.f(uuh.b, "verified_sms_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(15));
    public static final utz i = uuh.h(uuh.b, "sticker_service_host_and_port", "sticker-pa.googleapis.com:443");
    static final alhr j;
    private final anen A;
    private final vjs D;
    private final ghw E;
    public aquc k;
    public aquc m;
    public aquc p;
    public aquc r;
    public aquc t;
    public aquc v;
    private final Context x;
    private final armf y;
    private final armf z;
    public final Object l = new Object();
    public final Object n = new Object();
    public final Map o = new ConcurrentHashMap();
    public final Object q = new Object();
    public final Object s = new Object();
    public final Object u = new Object();
    public final Object w = new Object();
    private final SparseArray B = new SparseArray();
    private final Object C = new Object();

    static {
        uuh.h(uuh.b, "people_api_host_and_port", "people-pa.googleapis.com:443");
        uuh.f(uuh.b, "people_api_keep_alive_time_ms", TimeUnit.SECONDS.toMillis(30L));
        uuh.f(uuh.b, "people_api_keep_alive_timeout_ms", TimeUnit.SECONDS.toMillis(10L));
        j = uuh.w("enable_primes_interceptor");
    }

    public vcv(Context context, armf armfVar, anen anenVar, vjs vjsVar, armf armfVar2, ghw ghwVar) {
        this.x = context;
        this.z = armfVar;
        this.A = anenVar;
        this.D = vjsVar;
        this.y = armfVar2;
        this.E = ghwVar;
    }

    private final String g(int i2) {
        String str;
        int i3 = yuv.a(this.x).b;
        if (i2 != 2) {
            if (i2 != 3) {
                str = "ANDROID_CHANNEL_FALLBACK";
            } else {
                str = "ANDROID_CHANNEL";
            }
        } else {
            str = "CRONET";
        }
        return "Bugle/" + i3 + " (" + str + ")";
    }

    private final void h(int i2) {
        ((mbl) this.y.b()).e("Bugle.Grpc.Channel.Creation.Count", i2 - 1);
    }

    public final aquc a(String str, vho vhoVar) {
        return b(str, ((Long) e.e()).longValue(), ((Long) f.e()).longValue(), vhoVar);
    }

    public final aquc b(String str, long j2, long j3, vho vhoVar) {
        int i2;
        List c2 = anna.e(':').c(str);
        String str2 = (String) c2.get(0);
        if (c2.size() > 1) {
            i2 = Integer.parseInt((String) c2.get(1));
        } else {
            i2 = 0;
        }
        if (this.E.q().isPresent() && !(this.E.q().get() instanceof ates)) {
            alvw g2 = a.g();
            g2.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createManagedChannel", 387, "GrpcChannelManager.java")).B("Creating gRPC Managed channel with Cronet: %s:%d", str2, i2);
            h(2);
            aqyv j4 = aqyv.j(str2, i2, (CronetEngine) this.E.q().get());
            j4.i(g(2));
            if (((Boolean) ((utz) j.get()).e()).booleanValue()) {
                aqrv[] aqrvVarArr = new aqrv[1];
                agqt agqtVar = agqt.a;
                if (agqtVar == null) {
                    synchronized (agqt.class) {
                        agqtVar = agqt.a;
                        if (agqtVar == null) {
                            agqtVar = new agqt(arll.b());
                            agqt.a = agqtVar;
                        }
                    }
                }
                aqrvVarArr[0] = agqtVar;
                j4.g(aqrvVarArr);
            }
            j4.k(vhoVar.a());
            return j4.a();
        }
        alvi alviVar = a;
        alvw i3 = alviVar.i();
        i3.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createManagedChannel", 399, "GrpcChannelManager.java")).q("Unable to load CronetEngine - falling back to OkHttp AndroidChannelBuilder");
        alvw d2 = alviVar.d();
        d2.X(alwp.a, "BugleNetwork");
        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "createAndroidChannel", 430, "GrpcChannelManager.java")).B("Creating gRPC Managed channel with AndroidChannelBuilder: %s:%d", str2, i2);
        h(4);
        ariy ariyVar = new ariy(str2, i2);
        ariyVar.k(j2, TimeUnit.MILLISECONDS);
        ariyVar.l(j3, TimeUnit.MILLISECONDS);
        ariyVar.m(vhoVar);
        if (((Boolean) ((utz) j.get()).e()).booleanValue()) {
            ariyVar.g(arll.b());
        }
        aqwl aqwlVar = new aqwl(ariyVar);
        aqwlVar.a = this.x;
        aqwlVar.i(g(4));
        return aqwlVar.a();
    }

    public final aquc c(String str) {
        return a(str, f(3));
    }

    public final aqut d() {
        aqut aqutVar = new aqut();
        String valueOf = String.valueOf(this.x.getPackageName());
        aqutVar.h(new aquj("X-Goog-Api-Key", aqut.c), "AIzaSyCB5sc4sgRVObMraVTM-ymBkANcjiQXcV0");
        aqutVar.h(new aquj("Sec-X-Google-Grpc", aqut.c), "1");
        aqutVar.h(new aquj("Origin", aqut.c), "android-app://".concat(valueOf));
        return aqutVar;
    }

    @Deprecated
    public final String e() {
        Optional d2;
        Optional l = ((adje) this.z.b()).l();
        if (l.isEmpty()) {
            alvw i2 = a.i();
            i2.X(alwp.a, "BugleNetwork");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 548, "GrpcChannelManager.java")).q("Cannot use tachyon phone channel URL from ACS config because ACS Configuration does not exist for default SIM. Falling back to phenotype value.");
            d2 = Optional.empty();
        } else {
            d2 = ((Configuration) l.get()).d();
            if (d2.isEmpty()) {
                alvw g2 = a.g();
                g2.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 556, "GrpcChannelManager.java")).q("Not using tachyon phone channel URL from ACS config because ACS parameter does not exist. Falling back to phenotype value.");
                d2 = Optional.empty();
            } else if (TextUtils.isEmpty((CharSequence) d2.get())) {
                alvw i3 = a.i();
                i3.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 562, "GrpcChannelManager.java")).q("Cannot use tachyon phone channel URL from ACS config because ACS parameter has an empty value. Falling back to phenotype value.");
                d2 = Optional.empty();
            } else {
                alvw g3 = a.g();
                g3.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getPhoneChannelEndpointFromDefaultAcsConfig", 567, "GrpcChannelManager.java")).t("Using tachyon phone channel URL from ACS config: %s", d2.get());
            }
        }
        utz utzVar = vcq.a;
        utzVar.getClass();
        return (String) d2.orElseGet(new uea(utzVar, 8));
    }

    public final vho f(int i2) {
        vho vhoVar;
        synchronized (this.C) {
            int i3 = i2 - 1;
            vhoVar = (vho) this.B.get(i3);
            if (vhoVar == null) {
                vhoVar = this.D.x(i2, this.A);
                this.B.put(i3, vhoVar);
            }
        }
        return vhoVar;
    }
}
