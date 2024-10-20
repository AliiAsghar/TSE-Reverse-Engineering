package defpackage;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.tachyon.contacts.reachability.IReachabilityService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.duokit.GenerateInviteLinkRequest;
import com.google.android.gms.duokit.LookupSingleRemoteReachabilityRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abxe implements aciq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abxe(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, aegu] */
    @Override // defpackage.aciq
    public final acir a(Object obj) {
        alog alogVar;
        boolean z;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    Location location = (Location) obj;
                    location.getClass();
                    ahxl ahxlVar = (ahxl) this.a;
                    ahwx ahwxVar = ahxlVar.a;
                    WifiManager wifiManager = (WifiManager) ahwxVar.c.getSystemService("wifi");
                    if (wifiManager != null && wifiManager.isWifiEnabled()) {
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults != null && !scanResults.isEmpty()) {
                            alog E = alog.E(alsr.b(new zyv(10)), scanResults);
                            ArrayList arrayList = new ArrayList();
                            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                            int i3 = ((alsx) E).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ScanResult scanResult = (ScanResult) E.get(i4);
                                if (scanResult != null && !TextUtils.isEmpty(scanResult.SSID)) {
                                    long a = (ahwxVar.b.a() * 1000) - scanResult.timestamp;
                                    long j = ahwx.a;
                                    String str = scanResult.SSID;
                                    if (str != null) {
                                        if (str.indexOf(95) >= 0) {
                                            String lowerCase = str.toLowerCase(Locale.ENGLISH);
                                            if (lowerCase.contains("_nomap") || lowerCase.contains("_optout")) {
                                                z = true;
                                                if (a <= j && !z) {
                                                    arrayList.add(new ahww(connectionInfo, scanResult));
                                                }
                                            }
                                        }
                                        z = false;
                                        if (a <= j) {
                                            arrayList.add(new ahww(connectionInfo, scanResult));
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Null SSID.");
                                    }
                                }
                            }
                            alogVar = alog.n(arrayList);
                        } else {
                            int i5 = alog.d;
                            alogVar = alsx.a;
                        }
                    } else {
                        int i6 = alog.d;
                        alogVar = alsx.a;
                    }
                    alog alogVar2 = alogVar;
                    aibs aibsVar = (aibs) this.b;
                    if (aibsVar.a.isEmpty()) {
                        return actx.r(new abra(new Status(9012, "Place Fields must not be empty.")));
                    }
                    final aogy aogyVar = ahxlVar.d;
                    ahyr ahyrVar = (ahyr) aogyVar.c;
                    ahyf ahyfVar = new ahyf(aibsVar, location, alogVar2, ahyrVar.b(), ahyrVar.a(), (agxw) aogyVar.d);
                    final long a2 = aogyVar.a.a();
                    return ((agrk) aogyVar.e).k(ahyfVar, ahyg.class).a(new acca(6)).a(new acig() { // from class: ahyi
                        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, aegu] */
                        @Override // defpackage.acig
                        public final Object a(acir acirVar) {
                            int i7;
                            aogy aogyVar2 = aogy.this;
                            long a3 = aogyVar2.a.a();
                            if (acirVar.l()) {
                                i7 = ((aibt) acirVar.h()).a.size();
                            } else {
                                i7 = 0;
                            }
                            aozy createBuilder = anaa.a.createBuilder();
                            if (!createBuilder.b.isMutable()) {
                                createBuilder.u();
                            }
                            anaa anaaVar = (anaa) createBuilder.b;
                            anaaVar.b |= 1;
                            anaaVar.c = i7;
                            anaa anaaVar2 = (anaa) createBuilder.s();
                            aozy createBuilder2 = anac.a.createBuilder();
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar = createBuilder2.b;
                            anac anacVar = (anac) apagVar;
                            anacVar.c = 3;
                            anacVar.b |= 1;
                            if (!apagVar.isMutable()) {
                                createBuilder2.u();
                            }
                            anac anacVar2 = (anac) createBuilder2.b;
                            anaaVar2.getClass();
                            anacVar2.g = anaaVar2;
                            anacVar2.b |= 128;
                            int i8 = ahiy.i(acirVar);
                            if (!createBuilder2.b.isMutable()) {
                                createBuilder2.u();
                            }
                            apag apagVar2 = createBuilder2.b;
                            anac anacVar3 = (anac) apagVar2;
                            long j2 = a2;
                            anacVar3.d = i8 - 1;
                            anacVar3.b |= 2;
                            long j3 = a3 - j2;
                            if (!apagVar2.isMutable()) {
                                createBuilder2.u();
                            }
                            Object obj2 = aogyVar2.f;
                            anac anacVar4 = (anac) createBuilder2.b;
                            anacVar4.b |= 4;
                            anacVar4.e = (int) j3;
                            ((ahiy) obj2).f((anac) createBuilder2.s(), 3);
                            return (aibt) acirVar.h();
                        }
                    });
                }
                boolean b = ((abwv) obj).b();
                Object obj2 = this.a;
                if (!b) {
                    ((abxg) obj2).a.h(14);
                    return actx.r(new IllegalStateException("API provider not available"));
                }
                Object obj3 = this.b;
                ajxp ajxpVar = new ajxp(null);
                ajxpVar.c = new abxb(i2);
                ajxpVar.b = 12302;
                acir g = ((abrc) obj2).g(ajxpVar.b());
                g.r(new ktn(obj2, 8));
                return g.e(new abxe(obj2, obj3, 0));
            }
            abwv abwvVar = (abwv) obj;
            boolean b2 = abwvVar.b();
            Object obj4 = this.a;
            if (!b2) {
                ((abxd) obj4).b.h(15);
                return actx.r(new IllegalStateException("Neither Duo nor Meet API provider is available"));
            }
            Object obj5 = this.b;
            ajxp ajxpVar2 = new ajxp(null);
            ajxpVar2.c = new abxb(0);
            ajxpVar2.b = 12302;
            acir g2 = ((abrc) obj4).g(ajxpVar2.b());
            g2.r(new ktn(obj4, 6));
            return g2.e(new aogx((abxd) obj4, (GenerateInviteLinkRequest) obj5, abwvVar, 1));
        }
        IReachabilityService iReachabilityService = (IReachabilityService) obj;
        acit acitVar = new acit();
        Object obj6 = this.b;
        Object obj7 = this.a;
        try {
            iReachabilityService.queryReachabilityNoCache(alog.r(((LookupSingleRemoteReachabilityRequest) obj6).a.b), new abxf((abxg) obj7, (LookupSingleRemoteReachabilityRequest) obj6, acitVar));
        } catch (RemoteException unused) {
            ((abxg) obj7).a.h(14);
            acitVar.a(new IllegalStateException("Failed to query Duo reachability service"));
        }
        return (acir) acitVar.a;
    }
}
