package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import defpackage.dbu;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahkm implements apxw {
    private final /* synthetic */ int a;

    public ahkm(int i) {
        this.a = i;
    }

    public static asja a(Context context) {
        asja a = aqov.a.get().a(context);
        a.getClass();
        return a;
    }

    public static asja c(Context context) {
        asja a = aqop.a.get().a(context);
        a.getClass();
        return a;
    }

    public static void d() {
        Boolean bool = false;
        bool.getClass();
    }

    public static ahoh e(ahmv ahmvVar, Context context, ahlp ahlpVar, apwt apwtVar, Object obj, armf armfVar, armf armfVar2, Executor executor, Object obj2, armf armfVar3, Object obj3, Object obj4) {
        return new ahoh(ahmvVar, context, ahlpVar, apwtVar, (ahoe) obj, armfVar, armfVar2, executor, (ahow) obj2, armfVar3, (ahop) obj3, (ahoq) obj4);
    }

    public static Handler f(algw algwVar) {
        return new Handler((Looper) ((alha) algwVar).a);
    }

    public static aiwv g() {
        return aiwr.a;
    }

    public static akob h(armf armfVar) {
        Boolean bool = false;
        bool.getClass();
        arbj arbjVar = new arbj();
        arbjVar.l("OrphanCacheAccountSynclet");
        arbjVar.a = armfVar;
        aknu aknuVar = new aknu();
        aknuVar.c(14L, TimeUnit.DAYS);
        aknw aknwVar = new aknw();
        aknwVar.b = akny.ON_CHARGER;
        aknwVar.b(7L, TimeUnit.DAYS);
        aknuVar.b(aknwVar.a());
        arbjVar.b = aknuVar.a();
        return arbjVar.k();
    }

    public static arpi i(arpi arpiVar) {
        arpiVar.getClass();
        aiut.c();
        arml armlVar = dbu.a;
        arpi a = dbu.a.a();
        arpg arpgVar = a.get(arpf.k);
        arpgVar.getClass();
        arpg arpgVar2 = arpiVar.get(arpf.k);
        arpgVar2.getClass();
        arpi plus = a.plus(new akaq((arwb) arpgVar, (arwm) arpgVar2)).plus(aktp.h(new akrv(1), false, 6)).plus(akds.a);
        plus.getClass();
        return plus;
    }

    public static akbo j(cg cgVar) {
        acss acssVar = new acss(cgVar, 11);
        enh N = cgVar.N();
        Boolean bool = false;
        bool.getClass();
        return new akbr(acssVar, cgVar, N);
    }

    public static ConnectivityManager k(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.getClass();
        return connectivityManager;
    }

    public static LocationManager l(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        locationManager.getClass();
        return locationManager;
    }

    public static ahpj m(ahmv ahmvVar, Context context, Object obj, aneo aneoVar, apwt apwtVar, Object obj2, ahkj ahkjVar, armf armfVar, Executor executor, ahiy ahiyVar) {
        return new ahpj(ahmvVar, context, (ahpe) obj, aneoVar, apwtVar, (ahpl) obj2, ahkjVar, armfVar, executor, ahiyVar);
    }

    public static akcy n(armf armfVar, ahiy ahiyVar) {
        return new akdf(new acss(armfVar, 12), ahiyVar);
    }

    public static arpi o(ahlp ahlpVar, aneo aneoVar) {
        aneoVar.getClass();
        arpi j = ahlpVar.j(aneoVar, new akrv(1));
        j.getClass();
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static atsg p(Executor executor, agcp agcpVar, Set set) {
        aiwx aiwxVar = aiwx.a;
        HashMap hashMap = new HashMap();
        alog n = alog.n(set);
        int size = n.size();
        for (int i = 0; i < size; i++) {
            ahmc.ae((aiwv) n.get(i), hashMap);
        }
        return new atsg(executor, agcpVar, aiwxVar, hashMap);
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                return new ahxe(null);
            case 7:
                return new ahnz((int[]) null);
            case 8:
                return new ahnz((int[]) null);
            case 9:
                return new adze((char[]) null);
            case 10:
                return new ahnz((int[]) null);
            case 11:
                ariy ariyVar = new ariy("places.googleapis.com", 443);
                albo.U(true, "Cannot change security when using ChannelCredentials");
                ariyVar.l = 1;
                return ariyVar.a();
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                throw null;
            case 16:
                throw null;
            case 17:
                throw null;
            case 18:
                throw null;
            case 19:
                throw null;
            default:
                throw null;
        }
    }
}
