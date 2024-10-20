package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodi {
    public static final Object a = new Object();
    public static final Map b = new tm();
    public final aoet c;
    public final aofa e;
    public final aohf f;
    private final Context h;
    private final String i;
    private final aodn j;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean();
    public final List g = new CopyOnWriteArrayList();

    public aodi(Context context, String str, aodn aodnVar) {
        List arrayList;
        int i;
        new CopyOnWriteArrayList();
        abhg.m(context);
        this.h = context;
        abhg.k(str);
        this.i = str;
        this.j = aodnVar;
        aodo aodoVar = aojn.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class.toString() + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            } else {
                arrayList2.add(new aoes((String) it.next(), 1));
            }
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        aoft aoftVar = aoft.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        aode.g(new FirebaseCommonRegistrar(), arrayList3);
        aode.g(new ExecutorsRegistrar(), arrayList3);
        aode.f(aoen.e(context, Context.class, new Class[0]), arrayList4);
        aode.f(aoen.e(this, aodi.class, new Class[0]), arrayList4);
        aode.f(aoen.e(aodnVar, aodn.class, new Class[0]), arrayList4);
        aojp aojpVar = new aojp();
        if (dzh.b(context) && aojn.b.get()) {
            aode.f(aoen.e(aodoVar, aodo.class, new Class[0]), arrayList4);
        }
        aoet aoetVar = new aoet(aoftVar, arrayList3, arrayList4, aojpVar);
        this.c = aoetVar;
        Trace.endSection();
        this.e = new aofa(new aoer(this, context, i));
        this.f = aode.i(aoetVar, aogo.class);
        asqc asqcVar = new asqc(this);
        g();
        if (this.d.get() && abrx.a.c()) {
            asqcVar.e(true);
        }
        this.g.add(asqcVar);
        Trace.endSection();
    }

    public static aodi b() {
        aodi aodiVar;
        synchronized (a) {
            aodiVar = (aodi) b.get("[DEFAULT]");
            if (aodiVar != null) {
                ((aogo) aodiVar.f.a()).c();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + abvj.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return aodiVar;
    }

    public final Context a() {
        g();
        return this.h;
    }

    public final aodn c() {
        g();
        return this.j;
    }

    public final Object d(Class cls) {
        g();
        return aode.k(this.c, cls);
    }

    public final String e() {
        g();
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aodi)) {
            return false;
        }
        return this.i.equals(((aodi) obj).e());
    }

    public final String f() {
        return abhn.g(e().getBytes(Charset.defaultCharset())) + "+" + abhn.g(c().b.getBytes(Charset.defaultCharset()));
    }

    public final void g() {
        abhg.i(!this.k.get(), "FirebaseApp was deleted");
    }

    public final void h() {
        HashMap hashMap;
        if (!dzh.b(this.h)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(String.valueOf(e())));
            Context context = this.h;
            if (aodh.a.get() == null) {
                aodh aodhVar = new aodh(context);
                if (a.bE(aodh.a, aodhVar)) {
                    context.registerReceiver(aodhVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(String.valueOf(e())));
        aoet aoetVar = this.c;
        if (a.bE(aoetVar.b, Boolean.valueOf(i()))) {
            synchronized (aoetVar) {
                hashMap = new HashMap(aoetVar.a);
            }
            aoetVar.f(hashMap);
        }
        ((aogo) this.f.a()).c();
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final boolean i() {
        return "[DEFAULT]".equals(e());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("name", this.i, arrayList);
        abhg.q("options", this.j, arrayList);
        return abhg.p(arrayList, this);
    }
}
