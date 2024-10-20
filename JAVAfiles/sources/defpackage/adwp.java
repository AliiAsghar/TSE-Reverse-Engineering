package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.Log;
import j$.util.Collection;
import j$.util.Map;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwp {
    private static volatile adwp b;
    public final Object a;

    private adwp(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static adwp f(Context context) {
        if (b == null) {
            synchronized (adwp.class) {
                if (b == null) {
                    b = new adwp(context);
                }
            }
        }
        return b;
    }

    public static final void l(int i) {
        if (i == 2) {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                Log.i("D26R", ">>> ".concat(String.valueOf(String.valueOf(stackTraceElement))));
            }
        }
    }

    private static List r(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                break;
            }
            arrayList.add(str.substring(i, indexOf));
            i = str2.length() + indexOf;
        }
        if (i != 0) {
            str = str.substring(i);
        }
        arrayList.add(str);
        return arrayList;
    }

    public final LinkProperties a(Network network) {
        try {
            return ((ConnectivityManager) this.a).getLinkProperties(network);
        } catch (RuntimeException e) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    public final Network b() {
        try {
            return ((ConnectivityManager) this.a).getActiveNetwork();
        } catch (SecurityException e) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    public final NetworkCapabilities c(Network network) {
        try {
            return ((ConnectivityManager) this.a).getNetworkCapabilities(network);
        } catch (SecurityException e) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    public final NetworkInfo d() {
        try {
            return ((ConnectivityManager) this.a).getActiveNetworkInfo();
        } catch (SecurityException e) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
        } catch (RuntimeException e2) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e2);
        }
    }

    public final NetworkInfo e(Network network) {
        try {
            return ((ConnectivityManager) this.a).getNetworkInfo(network);
        } catch (SecurityException e) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    public final void g(ConnectivityManager.NetworkCallback networkCallback) {
        try {
            d$$ExternalSyntheticApiModelOutline0.m((ConnectivityManager) this.a, networkCallback);
        } catch (SecurityException e) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    public final void h(ConnectivityManager.NetworkCallback networkCallback) {
        ((ConnectivityManager) this.a).unregisterNetworkCallback(networkCallback);
    }

    public final Network[] i() {
        try {
            return ((ConnectivityManager) this.a).getAllNetworks();
        } catch (SecurityException e) {
            throw new adwk("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final adxn j(String str, String str2, String str3) {
        aday adayVar = (aday) this.a.b();
        adayVar.getClass();
        return new adxn(adayVar, str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(String str, ContentValues contentValues, agoz agozVar) {
        alog alogVar = agozVar.e.h;
        if (alogVar != null) {
            int i = 0;
            while (i < ((alsx) alogVar).c) {
                boolean c = ((agpw) alogVar.get(i)).c(str, contentValues);
                i++;
                if (c) {
                    return true;
                }
            }
        }
        alog i2 = agozVar.n.i();
        int i3 = ((alsx) i2).c;
        int i4 = 0;
        while (i4 < i3) {
            boolean k = k(str, contentValues, ((agoa) i2.get(i4)).a);
            i4++;
            if (k) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set, java.lang.Object] */
    public final void m(agoz agozVar) {
        boolean contains;
        synchronized (agnc.a) {
            agozVar.T();
            agozVar.U();
            synchronized (agnc.a) {
                contains = this.a.contains(agozVar);
            }
            if (!contains) {
                this.a.add(agozVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public final void n(String str, String str2) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new HashSet());
        }
        ((Set) this.a.get(str)).add(str2);
    }

    public final void o(String str, String str2) {
        List r = r(str, " AS ");
        if (r.size() > 1) {
            str = (String) r.get(r.size() - 1);
        }
        List r2 = r(str, ".");
        int size = r2.size();
        if (size != 1) {
            if (size == 2) {
                n((String) r2.get(0), (String) r2.get(1));
                return;
            }
            throw new IllegalArgumentException(a.cg(str, str2, "invalid column reference: ", "."));
        }
        if (str2 != null) {
            n(str2, (String) r2.get(0));
            return;
        }
        throw new IllegalStateException("found unqualified column reference: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final boolean p(String str, String[] strArr) {
        Set set = (Set) this.a.get(str);
        if (set == null) {
            return false;
        }
        if (strArr != null && Collections.disjoint(set, Arrays.asList(strArr))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set, java.lang.Object] */
    public final aoij q(agnw agnwVar, Predicate predicate, aglo agloVar) {
        alog n;
        ArrayList arrayList = new ArrayList();
        synchronized (agnc.a) {
            for (agoz agozVar : this.a) {
                if (d$$ExternalSyntheticApiModelOutline0.m(predicate, agozVar)) {
                    arrayList.add(agozVar);
                }
            }
        }
        alob alobVar = new alob();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            agoz agozVar2 = (agoz) arrayList.get(i);
            Map map = (Map) agoz.a.get();
            synchronized (agnc.a) {
                n = alog.n((Collection) Collection.EL.stream(agozVar2.l).map(new agnz(5)).collect(Collectors.toCollection(new agmr(10))));
            }
            alob alobVar2 = new alob();
            int size2 = n.size();
            int i2 = 0;
            while (i2 < size2) {
                agmc agmcVar = (agmc) n.get(i2);
                Object x = agoz.x(new mun(agozVar2, agmcVar, agloVar, 4));
                ArrayList arrayList2 = arrayList;
                ((alvg) agoz.c.a(agoz.d).h("com/google/android/libraries/databaseannotations/support/QueryBase", "notifyPreChangeListeners", 931, "QueryBase.java")).B("preChangeInTransactionWithObject; table: %s; cl: %s", agoz.R(agozVar2.e.a), agmcVar.d);
                List list = (List) Map.EL.computeIfAbsent(map, agmcVar, new agnz(4));
                list.add(x);
                alobVar2.h(new agou(agozVar2, agmcVar, list.size() - 1, list));
                i2++;
                arrayList = arrayList2;
                size = size;
            }
            alobVar.h(alobVar2.g());
            i++;
            arrayList = arrayList;
        }
        return new aoij(agnwVar, alobVar.g(), agloVar, (char[]) null);
    }

    public adwp(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adwp(armf armfVar, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adwp(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public adwp(aghf aghfVar) {
        aghfVar.getClass();
        this.a = asck.d(0, 1, 2);
    }

    public adwp(byte[] bArr) {
        this.a = new HashMap();
    }

    public adwp(java.util.Map map) {
        this.a = new HashMap(map);
    }

    public adwp() {
        this.a = new HashSet();
    }
}
