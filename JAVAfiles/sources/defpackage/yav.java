package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.ims.ImsMmTelManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yav implements yaq {
    public static final alvi d = alvi.m("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl");
    private static final alwo s = alwo.o("BugleConnectivity");
    private static final alog t = alog.v(new yau(2, yap.BLUETOOTH), new yau(0, yap.CELLULAR), new yau(3, yap.ETHERNET), new yau(4, yap.VPN), new yau(1, yap.WIFI));
    private static final Duration u = Duration.ofSeconds(3);
    private final armf A;
    private final armf B;
    private final AtomicReference C;
    private final armf D;
    private final armf E;
    private final alhr F;
    private alhr G;
    public final Context e;
    public final armf f;
    public final IntentFilter g;
    public final anen h;
    public final Executor i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final List m = new ArrayList();
    public final List n = new ArrayList();
    public final AtomicInteger o;
    public final AtomicReference p;
    public final AtomicReference q;
    public final yax r;
    private final armf v;
    private final armf w;
    private final apwt x;
    private final apwt y;
    private final armf z;

    public yav(Context context, armf armfVar, armf armfVar2, apwt apwtVar, apwt apwtVar2, anen anenVar, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        new ArrayList();
        this.o = new AtomicInteger(3);
        this.C = new AtomicReference(amnj.UNKNOWN_SIGNAL_STRENGTH);
        this.p = new AtomicReference(wpc.a);
        this.q = new AtomicReference(wpc.a);
        this.e = context;
        this.f = armfVar;
        this.w = armfVar2;
        this.x = apwtVar;
        this.y = apwtVar2;
        this.i = new anew(anenVar);
        this.h = anenVar;
        this.v = armfVar3;
        this.z = armfVar4;
        this.D = armfVar5;
        this.E = armfVar6;
        this.A = armfVar7;
        this.B = armfVar9;
        this.j = armfVar8;
        this.k = armfVar10;
        this.l = armfVar11;
        IntentFilter intentFilter = new IntentFilter();
        this.g = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.r = new yax(this);
        this.F = albo.E(new vvk(this, 20), u);
    }

    private final boolean C() {
        if (((adtn) this.v.b()).u() && q()) {
            return true;
        }
        return false;
    }

    private static boolean D(ImsMmTelManager imsMmTelManager, Method method, int i) {
        try {
            return Boolean.TRUE.equals(method.invoke(imsMmTelManager, 8, Integer.valueOf(i)));
        } catch (IllegalAccessException e) {
            alvw h = d.h();
            h.X(alwp.a, "BugleConnectivity");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isImsCapabilityAvailable", 392, "ConnectivityUtilImpl.java")).u("IsImsCapabilityAvailable(%d, %d) method not accessible.", 8, i);
            return false;
        } catch (InvocationTargetException e2) {
            alvw h2 = d.h();
            h2.X(alwp.a, "BugleConnectivity");
            ((alvg) ((alvg) ((alvg) h2).g(e2)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isImsCapabilityAvailable", 396, "ConnectivityUtilImpl.java")).J("IsImsCapabilityAvailable(%d, %d) method threw exception. %s", 8, Integer.valueOf(i), e2);
            return false;
        }
    }

    public static String x(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return String.format(Locale.US, "UNKNOWN (%d)", Integer.valueOf(i));
                    }
                    return "STATE_POWER_OFF";
                }
                return "STATE_EMERGENCY_ONLY";
            }
            return "STATE_OUT_OF_SERVICE";
        }
        return "STATE_IN_SERVICE";
    }

    public final boolean A(qvo qvoVar) {
        uac a = ((qvr) this.B.b()).a(qvoVar);
        Stream map = Collection.EL.stream(((yjy) a.a).l()).map(new qvm(2));
        alpt B = a.B();
        B.getClass();
        return ((Boolean) map.filter(new ncc(B, 17)).findFirst().map(new xol(this, 14)).orElse(false)).booleanValue();
    }

    public final void B(int i) {
        qiu.h(((qvv) this.A.b()).a().h(new ikg(this, i, 17), this.h));
    }

    @Override // defpackage.yaq
    public final yay a(int i, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i == 7) {
                        return yay.AVAILABLE;
                    }
                    throw new IllegalArgumentException(a.bV(i, "The message protocol is invalid: "));
                }
                return c();
            }
            return b(i2);
        }
        return d(i2);
    }

    @Override // defpackage.yaq
    public final yay b(int i) {
        NetworkInfo networkInfo;
        if (C()) {
            return yay.AVAILABLE;
        }
        Network[] allNetworks = ((ConnectivityManager) this.f.b()).getAllNetworks();
        int length = allNetworks.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                Network network = allNetworks[i2];
                if (network != null && (networkInfo = ((ConnectivityManager) this.f.b()).getNetworkInfo(network)) != null && networkInfo.getType() == 0) {
                    z = networkInfo.isConnected();
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        yaz w = w(i);
        if (w != yaz.UNAVAILABLE && w != yaz.EMERGENCY_ONLY) {
            if (n() && z) {
                return yay.AVAILABLE;
            }
            return yay.UNKNOWN;
        }
        return yay.UNAVAILABLE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r2 != false) goto L12;
     */
    @Override // defpackage.yaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yay c() {
        /*
            r7 = this;
            boolean r0 = r7.n()
            if (r0 != 0) goto L4e
            armf r0 = r7.w
            java.lang.Object r0 = r0.b()
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isDeviceIdleMode()
            armf r1 = r7.f
            java.lang.Object r1 = r1.b()
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            r2 = 0
            if (r1 == 0) goto L28
            boolean r1 = r1.isAvailable()
            if (r1 == 0) goto L28
            r2 = 1
        L28:
            alvi r1 = defpackage.yav.d
            alvw r1 = r1.f()
            alvz r3 = defpackage.alwp.a
            java.lang.String r4 = "BugleConnectivity"
            r1.X(r3, r4)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r3 = "isNetworkAvailableButDeviceInDozeMode"
            r4 = 691(0x2b3, float:9.68E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl"
            java.lang.String r6 = "ConnectivityUtilImpl.java"
            alvw r1 = r1.h(r5, r3, r4, r6)
            alvg r1 = (defpackage.alvg) r1
            java.lang.String r3 = "dozing: %b, network available: %b"
            r1.I(r3, r0, r2)
            if (r0 == 0) goto L6d
            if (r2 == 0) goto L6d
        L4e:
            apwt r0 = r7.y
            java.lang.Object r0 = r0.b()
            ybg r0 = (defpackage.ybg) r0
            armf r1 = r0.d
            java.lang.Object r1 = r1.b()
            yjy r1 = (defpackage.yjy) r1
            int r1 = r1.f()
            yaz r0 = r0.a(r1)
            yaz r1 = defpackage.yaz.EMERGENCY_ONLY
            if (r0 == r1) goto L6d
            yay r0 = defpackage.yay.AVAILABLE
            goto L6f
        L6d:
            yay r0 = defpackage.yay.UNAVAILABLE
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yav.c():yay");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01de, code lost:
    
        if (D(r11, (java.lang.reflect.Method) r0, 3) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x021e, code lost:
    
        if (r0.isAvailable(8, 3) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0256, code lost:
    
        if (r0 != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029f  */
    @Override // defpackage.yaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yay d(int r18) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yav.d(int):yay");
    }

    @Override // defpackage.yaq
    public final alpt e() {
        try {
            Network activeNetwork = ((ConnectivityManager) this.f.b()).getActiveNetwork();
            if (activeNetwork == null) {
                return altg.a;
            }
            NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f.b()).getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return altg.a;
            }
            alpr alprVar = new alpr();
            Collection.EL.stream(t).filter(new xdm(networkCapabilities, 13)).map(new ybe(1)).forEach(new xpw(alprVar, 18));
            if (networkCapabilities.hasTransport(5)) {
                alprVar.c(yap.OTHER);
            }
            if (networkCapabilities.hasTransport(6)) {
                alprVar.c(yap.OTHER);
            }
            return alprVar.g();
        } catch (SecurityException e) {
            ((alwl) ((alwl) ((alwl) s.i()).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "getActiveNetworkTransports", (char) 731, "ConnectivityUtilImpl.java")).q("Failed to get active network transports due to missing ACCESS_NETWORK_STATE permissions");
            return altg.a;
        }
    }

    @Override // defpackage.yaq
    public final ListenableFuture f() {
        if (!n()) {
            return albo.bI(false);
        }
        return this.h.submit(akto.k(new vcr(16)));
    }

    @Override // defpackage.yaq
    public final void g() {
        this.G = albo.D(new vvk(this, 19));
    }

    @Override // defpackage.yaq
    public final void h() {
        qjb.a(new wuo(this, 18), this.i);
    }

    @Override // defpackage.yaq
    public final void i(yan yanVar) {
        if (!((Boolean) ((utz) a.get()).e()).booleanValue()) {
            ybq ybqVar = (ybq) this.x.b();
            ybf ybfVar = new ybf(new xpw(this, 19), 4);
            synchronized (ybqVar.e) {
                ybp ybpVar = (ybp) ybqVar.g.get(1);
                if (ybpVar == null) {
                    ybpVar = ybp.NONE;
                    ybqVar.g.put(1, ybpVar);
                }
                int ordinal = ybpVar.ordinal();
                int i = 3;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                ybqVar.a();
                            }
                        } else {
                            ((alwl) ybq.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/PhoneStateListenerManager", "registerServiceStateListenerInternal", 155, "PhoneStateListenerManager.java")).r("Listener has already been registered for event: %d", 1);
                        }
                    } else {
                        ((alwl) ybq.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/PhoneStateListenerManager", "registerServiceStateListenerInternal", 151, "PhoneStateListenerManager.java")).r("Listener is being registered asynchronously for event: %d", 1);
                    }
                } else {
                    ybqVar.g.put(1, ybp.REGISTERING);
                    if (yhx.c) {
                        ybqVar.f.put(1, new ybn(ybqVar, ybqVar.b, ybfVar));
                        ybqVar.a();
                    } else {
                        ybqVar.c.post(new yar(ybqVar, ybfVar, i, null));
                    }
                }
            }
        }
        qjb.a(new yar(this, yanVar, 0), this.i);
    }

    @Override // defpackage.yaq
    public final void j(yao yaoVar, yam yamVar) {
        int f;
        ybg ybgVar = (ybg) this.y.b();
        alwl alwlVar = (alwl) ybg.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "registerConnectivityStateListener", 97, "NetworkStateMonitorManager.java");
        yal b = yal.b(yamVar.c);
        if (b == null) {
            b = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        alwlVar.B("registerConnectivityStateListener: subscription type %s, subId %d.", b, yamVar.d);
        int i = yamVar.c;
        yal b2 = yal.b(i);
        if (b2 == null) {
            b2 = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        yal yalVar = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
        if (b2 != yalVar) {
            yal b3 = yal.b(i);
            if (b3 == null) {
                b3 = yalVar;
            }
            int i2 = 2;
            if (b3 != yal.SPECIFIED_SUBSCRIPTION || (yamVar.b & 2) != 0) {
                if (ybgVar.d()) {
                    ybgVar.e.registerReceiver(ybgVar.j, ybgVar.f, 4);
                }
                int i3 = yamVar.c;
                yal b4 = yal.b(i3);
                if (b4 == null) {
                    b4 = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
                }
                if (b4 != yal.ALL_ACTIVE_SUBSCRIPTIONS) {
                    yal b5 = yal.b(i3);
                    if (b5 == null) {
                        b5 = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
                    }
                    if (b5 != yal.SPECIFIED_SUBSCRIPTION || (f = yamVar.d) < 0) {
                        f = ((yjy) ybgVar.d.b()).f();
                    }
                    synchronized (ybgVar.i) {
                        ybgVar.c(f);
                        ybgVar.b(yaoVar, f);
                    }
                    return;
                }
                ((yjy) ybgVar.d.b()).n(new yas(ybgVar, yaoVar, i2, null));
                return;
            }
        }
        yal b6 = yal.b(i);
        if (b6 != null) {
            yalVar = b6;
        }
        throw new IllegalArgumentException("Register ConnectivityStateListener for invalid subscription: subscription_type " + yalVar.name() + ", subscription_id " + yamVar.d);
    }

    @Override // defpackage.yaq
    public final void k(yao yaoVar, yam yamVar) {
        int f;
        yba ybaVar;
        ybg ybgVar = (ybg) this.y.b();
        alwl alwlVar = (alwl) ybg.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "unregisterConnectivityStateListener", 149, "NetworkStateMonitorManager.java");
        yal b = yal.b(yamVar.c);
        if (b == null) {
            b = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        alwlVar.B("unregisterConnectivityStateListener: subscription type %s, subId %d.", b, yamVar.d);
        int i = yamVar.c;
        yal b2 = yal.b(i);
        if (b2 == null) {
            b2 = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        if (b2 == yal.ALL_ACTIVE_SUBSCRIPTIONS) {
            f = -1;
        } else {
            yal b3 = yal.b(i);
            if (b3 == null) {
                b3 = yal.SUBSCRIPTION_TYPE_UNSPECIFIED;
            }
            if (b3 != yal.SPECIFIED_SUBSCRIPTION || (f = yamVar.d) < 0) {
                f = ((yjy) ybgVar.d.b()).f();
            }
        }
        synchronized (ybgVar.i) {
            Map map = ybgVar.h;
            Integer valueOf = Integer.valueOf(f);
            List list = (List) map.get(valueOf);
            if (list == null) {
                ((alwl) ((alwl) ybg.a.g()).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "removeConnectivityStateListener", 305, "NetworkStateMonitorManager.java")).r("removeConnectivityStateListener: Entry in connectivityListenerListsMap not found for subId %d.", f);
            } else {
                boolean remove = list.remove(yaoVar);
                if (list.isEmpty()) {
                    ybgVar.h.remove(valueOf);
                }
                if (!remove) {
                    ((alwl) ((alwl) ybg.a.g()).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "removeConnectivityStateListener", 316, "NetworkStateMonitorManager.java")).r("removeConnectivityStateListener: ConnectivityStateListener not found for subId %d.", f);
                } else {
                    boolean e = ybgVar.e(-1);
                    aluq listIterator = alpt.o(ybgVar.g.keySet()).listIterator();
                    while (listIterator.hasNext()) {
                        Integer num = (Integer) listIterator.next();
                        int intValue = num.intValue();
                        if (e && ybgVar.e(intValue) && (ybaVar = (yba) ybgVar.g.remove(num)) != null) {
                            ybaVar.c();
                        }
                    }
                }
            }
        }
        if (ybgVar.d()) {
            try {
                ybgVar.e.unregisterReceiver(ybgVar.j);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // defpackage.yaq
    public final boolean l(int i) {
        if (p(i) && !((Boolean) this.F.get()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yaq
    public final boolean m() {
        return ((ConnectivityManager) this.f.b()).isActiveNetworkMetered();
    }

    @Override // defpackage.yaq
    public final boolean n() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.b()).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        ybv ybvVar = (ybv) this.D.b();
        int b = ((adtn) this.v.b()).b();
        if (!((ofj) ybvVar.d.b()).a()) {
            ybvVar.a();
            if (!ybvVar.b.b(b)) {
                ((alwl) ybv.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/SingleRegistrationImsConnectivityProvider", "isSingleRegistrationImsConnectionAvailable", 71, "SingleRegistrationImsConnectivityProvider.java")).q("Single Registration is not enabled.");
            } else {
                ybu ybuVar = ybvVar.c;
                int i = ybu.b;
                if (ybuVar.a == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.yaq
    public final boolean o() {
        if (!yhx.h) {
            return false;
        }
        if (((wpc) this.p.get()).equals(wpc.a)) {
            alhr alhrVar = this.G;
            if (alhrVar != null) {
            } else {
                ((alwl) ((alwl) s.i()).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "registerSatelliteNetworkCallbacks", 966, "ConnectivityUtilImpl.java")).q("defaultDataRegisterer has not been initialized");
            }
            Network activeNetwork = ((ConnectivityManager) this.f.b()).getActiveNetwork();
            if (activeNetwork != null) {
                z(activeNetwork);
            }
        }
        return ((wpc) this.p.get()).equals(wpc.b);
    }

    @Override // defpackage.yaq
    public final boolean p(int i) {
        return w(i).equals(yaz.SATELLITE);
    }

    @Override // defpackage.yaq
    public final boolean q() {
        return adom.u(this.e);
    }

    @Override // defpackage.yaq
    public final boolean r() {
        return yhx.a;
    }

    @Override // defpackage.yaq
    public final amnj s() {
        return (amnj) this.C.get();
    }

    @Override // defpackage.yaq
    public final int t() {
        int ordinal = ((wpc) this.p.get()).ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 3) {
            return 4;
        }
        if (ordinal != 4) {
            return 1;
        }
        return 5;
    }

    @Override // defpackage.yaq
    public final void u(ahjj ahjjVar) {
        qjb.a(new yar(this, ahjjVar, 1, null), this.i);
    }

    @Override // defpackage.yaq
    public final void v(ahjj ahjjVar) {
        qjb.a(new yar(this, ahjjVar, 2, null), this.i);
    }

    public final yaz w(int i) {
        return ((ybg) this.y.b()).a(i);
    }

    public final void y(wpc wpcVar) {
        this.q.set((wpc) this.p.getAndSet(wpcVar));
        alvw d2 = d.d();
        d2.X(alwp.a, "BugleConnectivity");
        ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "setDataConnection", 911, "ConnectivityUtilImpl.java")).D("Data connection changed from %s to %s", this.q.get(), this.p.get());
    }

    public final void z(Network network) {
        NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f.b()).getNetworkCapabilities(network);
        if (networkCapabilities != null && yhx.h) {
            if (yhx.i && networkCapabilities.hasTransport(10)) {
                y(wpc.b);
                return;
            }
            if (((odm) this.E.b()).a()) {
                try {
                    if (networkCapabilities.hasTransport(10)) {
                        y(wpc.b);
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    alvw d2 = d.d();
                    d2.X(alwp.a, "BugleConnectivity");
                    ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "networkCapabilitiesHasSatellite", 904, "ConnectivityUtilImpl.java")).q("IllegalArgumentException: Satellite features not supported");
                }
            }
            if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(1)) {
                y(wpc.e);
            } else {
                y(wpc.c);
            }
        }
    }
}
