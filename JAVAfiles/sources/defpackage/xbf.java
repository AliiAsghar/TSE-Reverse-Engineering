package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbf {
    private static final alvi f = alvi.m("com/google/android/apps/messaging/shared/sms/config/MmsConfigManager");
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final yjy b;
    public final anen c;
    public final xbg d;
    public final rzx e;
    private final xan g;
    private final yjf h;

    public xbf(yjy yjyVar, xan xanVar, yjf yjfVar, anen anenVar, rzx rzxVar, xbg xbgVar) {
        this.b = yjyVar;
        this.g = xanVar;
        this.h = yjfVar;
        this.c = anenVar;
        this.e = rzxVar;
        this.d = xbgVar;
    }

    private final synchronized void f() {
        if (!this.d.f) {
            xan xanVar = this.g;
            xanVar.getClass();
            d(xanVar);
        }
    }

    public final xbe a(int i) {
        Lock lock;
        if (this.g != null) {
            f();
        }
        xbg xbgVar = this.d;
        int a = xbgVar.h.h(i).a();
        if (xbgVar.i.W()) {
            xbgVar.b();
        }
        xbgVar.b.lock();
        try {
            xbe xbeVar = (xbe) xbgVar.d.get(a);
            if (xbeVar == null) {
                alvw i2 = xbg.a.i();
                i2.X(alwp.a, "Bugle");
                alvg alvgVar = (alvg) i2;
                alvgVar.V(1, TimeUnit.MINUTES);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/sms/config/MmsConfigMap", "get", 105, "MmsConfigMap.java")).J("Get mms config failed: invalid subId. subId=%d, real subId=%d, map=%s", Integer.valueOf(i), Integer.valueOf(a), xbgVar.d);
                xbeVar = new xbe(a, new Bundle());
                xbgVar.d.put(a, xbeVar);
                lock = xbgVar.b;
            } else {
                lock = xbgVar.b;
            }
            lock.unlock();
            return xbeVar;
        } catch (Throwable th) {
            xbgVar.b.unlock();
            throw th;
        }
    }

    public final alpt b() {
        to toVar = new to();
        Iterator it = c().iterator();
        while (it.hasNext()) {
            String k = ((xbe) it.next()).k();
            if (!TextUtils.isEmpty(k)) {
                toVar.add(k);
            }
        }
        return alpt.o(toVar);
    }

    public final List c() {
        xbg xbgVar = this.d;
        if (xbgVar.i.W()) {
            xbgVar.b();
        }
        xbgVar.b.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < xbgVar.d.size(); i++) {
                xbe xbeVar = (xbe) xbgVar.d.valueAt(i);
                if (xbeVar != null) {
                    arrayList.add(xbeVar);
                }
            }
            return arrayList;
        } finally {
            xbgVar.b.unlock();
        }
    }

    public final void d(xbh xbhVar) {
        alog alogVar;
        boolean z;
        if (!this.h.i()) {
            alvw i = f.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/sms/config/MmsConfigManager", "hasPhonePermissions", 170, "MmsConfigManager.java")).q("Loading mms config failed: no permission to access subscriptions.");
            int i2 = alog.d;
            alogVar = alsx.a;
        } else {
            Stream map = Collection.EL.stream(this.b.l()).map(new wmi(17));
            int i3 = alog.d;
            alogVar = (alog) map.collect(alls.a);
        }
        SparseArray sparseArray = new SparseArray();
        xbhVar.f();
        Iterator<E> it = alogVar.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            xbe xbeVar = new xbe(intValue, xbhVar.a(intValue));
            this.a.compareAndSet(false, xbeVar.m());
            xbeVar.i().ifPresent(new mua(this, xbeVar, intValue, 2));
            sparseArray.append(intValue, xbeVar);
        }
        xbg xbgVar = this.d;
        xbgVar.b.lock();
        try {
            xbgVar.d.clear();
            Iterator<E> it2 = alogVar.iterator();
            while (it2.hasNext()) {
                xbe xbeVar2 = (xbe) sparseArray.get(((Integer) it2.next()).intValue());
                int i4 = xbeVar2.a;
                if (i4 != -1) {
                    z = true;
                } else {
                    z = false;
                }
                albo.T(z);
                xbgVar.b.lock();
                try {
                    xbgVar.d.put(i4, xbeVar2);
                    xbgVar.b.unlock();
                } finally {
                }
            }
        } finally {
            xbgVar.f = true;
            if (xbgVar.g.isEmpty()) {
                xbgVar.g = Optional.of(Instant.now());
            }
            xbgVar.b.unlock();
            Iterator<E> it3 = alogVar.iterator();
            while (it3.hasNext()) {
                ((Integer) it3.next()).intValue();
                xbgVar.c();
            }
        }
    }

    public final boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = c().iterator();
        while (it.hasNext()) {
            if (str.equals(((xbe) it.next()).k())) {
                return true;
            }
        }
        return false;
    }
}
