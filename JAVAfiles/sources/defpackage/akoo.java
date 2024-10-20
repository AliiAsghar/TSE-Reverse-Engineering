package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akoo implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public akoo(alzc alzcVar, Callable callable, int i) {
        this.c = i;
        this.b = callable;
        this.a = alzcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Set, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        aoki d;
        int i2 = this.c;
        ComponentName componentName = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        Object obj = this.a;
                        Object obj2 = this.b;
                        synchronized (((aokl) obj2).c) {
                            ((aokl) obj2).e(((aokl) obj2).c((aokk) obj));
                            d = ((aokl) obj2).d((aokk) obj);
                        }
                        return d;
                    }
                    aois a = aois.a();
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Starting service");
                    }
                    Object obj3 = this.b;
                    Object obj4 = this.a;
                    a.c.offer(obj3);
                    Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                    Context context = (Context) obj4;
                    intent.setPackage(context.getPackageName());
                    String b = a.b(context, intent);
                    if (b != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(b));
                        }
                        intent.setClassName(context.getPackageName(), b);
                    }
                    try {
                        if (!a.c((Context) obj4)) {
                            componentName = ((Context) obj4).startService(intent);
                            Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                        } else {
                            synchronized (aoja.b) {
                                aoja.a((Context) obj4);
                                boolean d2 = aoja.d(intent);
                                aoja.c(intent, true);
                                ComponentName startService = ((Context) obj4).startService(intent);
                                if (startService != null) {
                                    if (!d2) {
                                        aoja.c.a(aoja.a);
                                    }
                                    componentName = startService;
                                }
                            }
                        }
                        if (componentName == null) {
                            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                            i = 404;
                        } else {
                            i = -1;
                        }
                    } catch (IllegalStateException e) {
                        Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e.toString()));
                        i = 402;
                    } catch (SecurityException e2) {
                        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                        i = 401;
                    }
                    return Integer.valueOf(i);
                }
                alze a2 = ((alzc) this.a).a();
                try {
                    Object call = this.b.call();
                    alzf.b(a2, false);
                    return call;
                } catch (Throwable th) {
                    alzf.b(a2, true);
                    throw th;
                }
            }
            Object obj5 = this.a;
            akom akomVar = (akom) obj5;
            akomVar.b.writeLock().lock();
            ?? r3 = this.b;
            try {
                akpk akpkVar = akpk.a;
                try {
                    akpkVar = ((akom) obj5).a();
                } catch (IOException e3) {
                    if (!((akom) obj5).f(e3)) {
                        ((alvg) ((alvg) ((alvg) akom.a.h()).g(e3)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", (char) 476, "SyncManagerDataStore.java")).q("Unable to read or clear store. Cannot remove account.");
                    }
                }
                aozy createBuilder = akpk.a.createBuilder();
                createBuilder.w(akpkVar);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ((akpk) createBuilder.b).d = akpk.emptyProtobufList();
                for (akpj akpjVar : akpkVar.d) {
                    akpm akpmVar = akpjVar.c;
                    if (akpmVar == null) {
                        akpmVar = akpm.a;
                    }
                    if (!r3.contains(new akot(akpmVar))) {
                        createBuilder.aA(akpjVar);
                    }
                }
                try {
                    ((akom) obj5).e((akpk) createBuilder.s());
                } catch (IOException e4) {
                    ((alvg) ((alvg) ((alvg) akom.a.h()).g(e4)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", (char) 496, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot remove account.");
                }
                return null;
            } finally {
                akomVar.b.writeLock().unlock();
            }
        }
        ?? r0 = this.b;
        Object obj6 = this.a;
        synchronized (((akos) obj6).j) {
            Iterator it = r0.keySet().iterator();
            while (it.hasNext()) {
            }
        }
        return null;
    }

    public /* synthetic */ akoo(aokl aoklVar, aokk aokkVar, int i) {
        this.c = i;
        this.b = aoklVar;
        this.a = aokkVar;
    }

    public /* synthetic */ akoo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
