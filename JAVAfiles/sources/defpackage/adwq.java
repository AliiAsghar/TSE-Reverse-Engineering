package defpackage;

import android.content.Context;
import android.os.ParcelUuid;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwq {
    private static volatile adwq b;
    public final Object a;

    public adwq(adwq adwqVar) {
        this.a = new ahdb(adwqVar);
    }

    public static adwq b(Context context) {
        if (b == null) {
            synchronized (adwq.class) {
                if (b == null) {
                    b = new adwq(context);
                }
            }
        }
        return b;
    }

    public static final ahcn j(int i) {
        aozy createBuilder = anas.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anas anasVar = (anas) createBuilder.b;
        anasVar.b |= 8;
        anasVar.d = i;
        return new ahcn(new agxw(createBuilder));
    }

    public final SubscriptionInfo a(int i) {
        try {
            return ((SubscriptionManager) this.a).getActiveSubscriptionInfo(i);
        } catch (SecurityException e) {
            throw new adwk("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final List c() {
        try {
            return ((SubscriptionManager) this.a).getActiveSubscriptionInfoList();
        } catch (SecurityException e) {
            throw new adwk("READ_PHONE_STATE permission is missing.", e);
        }
    }

    public final List d(ParcelUuid parcelUuid) {
        List subscriptionsInGroup;
        try {
            subscriptionsInGroup = ((SubscriptionManager) this.a).getSubscriptionsInGroup(parcelUuid);
            return subscriptionsInGroup;
        } catch (SecurityException e) {
            throw new adwk("READ_PHONE_STATE permission is missing.", e);
        }
    }

    @Deprecated(since = "R")
    public final void e(SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener) {
        try {
            ((SubscriptionManager) this.a).addOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
        } catch (SecurityException e) {
            throw new adwk("READ_PHONE_STATE permission is missing.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    public final boolean f(oo ooVar, int i, List list) {
        afjh afjhVar;
        if (true == list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            if (list.isEmpty()) {
                return true;
            }
            for (Object obj : list) {
                if (true != (obj instanceof Object)) {
                    obj = null;
                }
                if (obj != null) {
                    ?? r4 = this.a;
                    int i2 = arsc.a;
                    Object obj2 = r4.get(new arrh(obj.getClass()));
                    if (obj2 instanceof afjh) {
                        afjhVar = (afjh) obj2;
                    } else {
                        afjhVar = null;
                    }
                    if (afjhVar != null && afjhVar.a(ooVar, i, obj)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Set, java.lang.Object] */
    public final void g(Object obj) {
        if (!this.a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Inserted: ".concat(String.valueOf(String.valueOf(obj))));
            }
            for (ahjj ahjjVar : this.a) {
                long c = ((ahdj) ahjjVar.a).g.c();
                if (c != -1) {
                    apaa apaaVar = ((ahcq) obj).f;
                    long j = c * 1000;
                    if (!apaaVar.b.isMutable()) {
                        apaaVar.u();
                    }
                    ahcw ahcwVar = (ahcw) apaaVar.b;
                    ahcw ahcwVar2 = ahcw.a;
                    ahcwVar.b |= 4;
                    ahcwVar.f = j;
                }
                ahcq ahcqVar = (ahcq) obj;
                ahcz ahczVar = ahcqVar.e;
                int i = 1;
                if (ahczVar instanceof ahcz) {
                    if (ahcqVar.f.cs(ahfd.a)) {
                        if (!ahczVar.g()) {
                            ahczVar.i(true);
                        }
                    } else {
                        ahczVar.i(false);
                    }
                }
                ahdm ahdmVar = ((ahdj) ahjjVar.a).c;
                apaa apaaVar2 = ahcqVar.f;
                ahcz ahczVar2 = ahcqVar.e;
                anas anasVar = ((ahcw) apaaVar2.b).d;
                if (anasVar == null) {
                    anasVar = anas.a;
                }
                if ((anasVar.b & 2048) != 0) {
                    int j2 = ahczVar2.j();
                    int U = a.U(((ahcw) apaaVar2.b).e);
                    if (U != 0) {
                        i = U;
                    }
                    if (i != j2 && ahdmVar.c(ahcqVar, j2)) {
                    }
                } else {
                    ahdmVar.a.add(obj);
                }
                ((ahdj) ahjjVar.a).b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Set, java.lang.Object] */
    public final void h(Object obj) {
        if (!this.a.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Removed: ".concat(String.valueOf(String.valueOf(obj))));
            }
            for (ahjj ahjjVar : this.a) {
                ahcq ahcqVar = (ahcq) obj;
                adwq adwqVar = ahcqVar.g;
                if (!adwqVar.a.isEmpty()) {
                    if (Log.isLoggable("GIL", 2)) {
                        Log.v("GIL", "ImpressionCleared: ".concat(obj.toString()));
                    }
                    for (ahjj ahjjVar2 : adwqVar.a) {
                        long c = ((ahdj) ahjjVar2.a).g.c();
                        if (c != -1) {
                            apaa apaaVar = ahcqVar.f;
                            long j = c * 1000;
                            if (!apaaVar.b.isMutable()) {
                                apaaVar.u();
                            }
                            ahcw ahcwVar = (ahcw) apaaVar.b;
                            ahcw ahcwVar2 = ahcw.a;
                            ahcwVar.b |= 4;
                            ahcwVar.f = j;
                        }
                        ahdm ahdmVar = ((ahdj) ahjjVar2.a).c;
                        boolean z = ahdmVar.h;
                        Collection collection = (Collection) ahdmVar.f.remove(obj);
                        if (collection != null) {
                            collection.clear();
                            ahdmVar.g = collection;
                        }
                        if (ahcqVar.c()) {
                            ahcz ahczVar = ahcqVar.e;
                            ahcq d = ahczVar.d();
                            if (ahczVar.g() || (d != null && d.c())) {
                                Collection collection2 = (Collection) ahdmVar.f.get(d);
                                if (collection2 != null) {
                                    collection2.add(ahcqVar.a());
                                } else {
                                    Collection collection3 = ahdmVar.g;
                                    if (collection3 != null) {
                                        ahdmVar.g = null;
                                    } else {
                                        if (Log.isLoggable("GIL", 2)) {
                                            Log.v("GIL", "Array Alloc for Removal");
                                        }
                                        collection3 = new ArrayList();
                                    }
                                    collection3.add(ahcqVar.a());
                                    ahdmVar.f.put(d, collection3);
                                }
                            }
                        }
                        ahdmVar.a.remove(obj);
                        ahdmVar.b.remove(obj);
                        if (!ahdmVar.f.isEmpty()) {
                            ((ahdj) ahjjVar2.a).b();
                        }
                    }
                }
                apaa apaaVar2 = ahcqVar.f;
                anas anasVar = ((ahcw) apaaVar2.b).d;
                if (anasVar == null) {
                    anasVar = anas.a;
                }
                aozy builder = anasVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                apag apagVar = builder.b;
                anas anasVar2 = (anas) apagVar;
                anasVar2.e = null;
                anasVar2.b &= -2049;
                if (!apagVar.isMutable()) {
                    builder.u();
                }
                anas anasVar3 = (anas) builder.b;
                anasVar3.b &= -2;
                anasVar3.c = -1;
                anas anasVar4 = (anas) builder.s();
                if (!apaaVar2.b.isMutable()) {
                    apaaVar2.u();
                }
                ahcw ahcwVar3 = (ahcw) apaaVar2.b;
                anasVar4.getClass();
                ahcwVar3.d = anasVar4;
                ahcwVar3.b |= 1;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    public final boolean i() {
        if (!this.a.isEmpty()) {
            return true;
        }
        return false;
    }

    public final ahcs k() {
        return new ahcs((ahcu) ((aozy) this.a).s());
    }

    public adwq(Object obj) {
        this.a = obj;
    }

    public adwq(Object obj, byte[] bArr) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public adwq(int i) {
        apaa apaaVar = (apaa) ahcu.a.createBuilder();
        this.a = apaaVar;
        apaa apaaVar2 = apaaVar;
        if (!apaaVar2.b.isMutable()) {
            apaaVar2.u();
        }
        ahcu ahcuVar = (ahcu) apaaVar.b;
        ahcuVar.c = i - 1;
        ahcuVar.b |= 1;
    }

    private adwq(Context context) {
        this.a = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
    }
}
