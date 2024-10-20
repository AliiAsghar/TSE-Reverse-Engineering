package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gud implements gxn {
    public static final String a = gsy.b("Processor");
    public final Context c;
    public final WorkDatabase d;
    private final gsb k;
    private final gpx l;
    public final Map f = new HashMap();
    public final Map e = new HashMap();
    public final Set h = new HashSet();
    public final List i = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object j = new Object();
    public final Map g = new HashMap();

    public gud(Context context, gsb gsbVar, gpx gpxVar, WorkDatabase workDatabase) {
        this.c = context;
        this.k = gsbVar;
        this.l = gpxVar;
        this.d = workDatabase;
    }

    public static boolean f(String str, lhm lhmVar, int i) {
        if (lhmVar != null) {
            ((arxw) lhmVar.a).v(new gvh(i));
            gsy.a().c(a, "WorkerWrapper interrupted for ".concat(String.valueOf(str)));
            return true;
        }
        gsy.a().c(a, "WorkerWrapper could not be found for ".concat(String.valueOf(str)));
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    private final void h(gyg gygVar) {
        this.l.c.execute(new fhh(this, gygVar, 10));
    }

    public final void a(gts gtsVar) {
        synchronized (this.j) {
            this.i.add(gtsVar);
        }
    }

    public final void b(gts gtsVar) {
        synchronized (this.j) {
            this.i.remove(gtsVar);
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.j) {
            if (e(str) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final lhm d(String str) {
        boolean z;
        lhm lhmVar = (lhm) this.e.remove(str);
        if (lhmVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lhmVar = (lhm) this.f.remove(str);
        }
        this.g.remove(str);
        if (z) {
            synchronized (this.j) {
                if (this.e.isEmpty()) {
                    Intent intent = new Intent(this.c, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.c.startService(intent);
                    } catch (Throwable th) {
                        gsy.a();
                        Log.e(a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
        }
        return lhmVar;
    }

    public final lhm e(String str) {
        lhm lhmVar = (lhm) this.e.get(str);
        if (lhmVar == null) {
            return (lhm) this.f.get(str);
        }
        return lhmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final boolean g(hgi hgiVar, mka mkaVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = hgiVar.a;
        gyg gygVar = (gyg) obj;
        String str = gygVar.a;
        gys gysVar = (gys) this.d.e(new hbd(this, arrayList, str, 1, (byte[]) null));
        if (gysVar == null) {
            gsy.a();
            String str2 = a;
            Objects.toString(obj);
            Log.w(str2, "Didn't find WorkSpec for id ".concat(obj.toString()));
            h(gygVar);
            return false;
        }
        synchronized (this.j) {
            if (c(str)) {
                Set set = (Set) this.g.get(str);
                if (((gyg) ((hgi) set.iterator().next()).a).b == ((gyg) obj).b) {
                    set.add(hgiVar);
                    gsy.a().c(a, a.cc(obj, "Work ", " is already enqueued for processing"));
                } else {
                    h((gyg) obj);
                }
            } else if (gysVar.v != ((gyg) obj).b) {
                h((gyg) obj);
            } else {
                gvl gvlVar = new gvl(this.c, this.k, this.l, this, this.d, gysVar, arrayList);
                if (mkaVar != null) {
                    gvlVar.h = mkaVar;
                }
                lhm lhmVar = new lhm(gvlVar);
                ListenableFuture au = gvf.au(((arpa) ((gpx) lhmVar.b).d).plus(new arxo(null)), new eie(lhmVar, (arpe) null, 15, (byte[]) null));
                au.c(new faq(this, au, lhmVar, 12), this.l.c);
                this.f.put(str, lhmVar);
                HashSet hashSet = new HashSet();
                hashSet.add(hgiVar);
                this.g.put(str, hashSet);
                gsy.a().c(a, getClass().getSimpleName() + ": processing " + obj);
                return true;
            }
            return false;
        }
    }
}
