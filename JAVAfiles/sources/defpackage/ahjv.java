package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjv {
    public static final String a = "ahjv";
    private static final alhf d = new ahjp(1);
    private static final alhf e = new ahjp(0);
    private static final alhf f = new ahjp(2);
    public final ahjr b;
    protected final List c;
    private final Context g;
    private final Executor h;
    private final ConnectivityManager i;
    private final Map j;
    private final Map k;
    private final Queue l;
    private boolean m;
    private final BroadcastReceiver n;
    private final adwv o;

    public ahjv(adwv adwvVar, Context context, Executor executor) {
        ahjr ahjrVar = new ahjr();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ConcurrentLinkedQueue();
        this.c = new ArrayList();
        this.m = false;
        this.n = new ahjq(this);
        this.g = context;
        this.o = adwvVar;
        this.h = executor;
        this.b = ahjrVar;
        this.i = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String a(File file, String str) {
        return file.getAbsolutePath() + "/" + str;
    }

    public static void h(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    private static boolean m(Context context, String str) {
        if (egl.e(context, str) == 0) {
            return true;
        }
        return false;
    }

    private static final void n(List list, alhf alhfVar) {
        alur it = ((alog) list).iterator();
        while (it.hasNext()) {
            alhfVar.a((ahiy) it.next());
        }
    }

    public final synchronized HttpURLConnection b(String str, String str2) {
        HttpURLConnection httpURLConnection;
        if (m(this.g, "android.permission.INTERNET")) {
            albo.T(!((ahjo) this.j.get(str)).e());
            URLConnection openConnection = ((CronetEngine) ((ahjj) this.o.a).a).openConnection(new URL(str2));
            if (openConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) openConnection;
                Object obj = this.b.b;
                this.k.put(str, httpURLConnection);
            } else {
                throw new IOException("Cronet connection is not an HttpURLConnection");
            }
        } else {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        return httpURLConnection;
    }

    protected final synchronized List c() {
        alob alobVar;
        alobVar = new alob();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ahiy ahiyVar = (ahiy) ((WeakReference) it.next()).get();
            if (ahiyVar == null) {
                it.remove();
            } else {
                alobVar.h(ahiyVar);
            }
        }
        return alobVar.g();
    }

    public final synchronized void d(File file, String str) {
        Map map = this.j;
        String a2 = a(file, str);
        ahjo ahjoVar = (ahjo) map.get(a2);
        if (ahjoVar != null) {
            ahjoVar.d();
        } else {
            Log.v(a, "Attempted to setCanceled unknown request: ".concat(a2));
        }
        h((HttpURLConnection) this.k.get(a2));
        if (ahjoVar != null) {
            f();
        }
    }

    public final void e(ahjo ahjoVar) {
        List list;
        ahjoVar.c();
        synchronized (this) {
            boolean isEmpty = this.l.isEmpty();
            this.l.add(ahjoVar);
            if (isEmpty) {
                this.g.registerReceiver(this.n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.m = true;
                f();
            }
            if (this.l.containsAll(this.j.values())) {
                list = c();
            } else {
                list = null;
            }
        }
        if (list != null) {
            n(list, d);
        }
    }

    public final synchronized void f() {
        Queue queue = this.l;
        Log.d(a, "Running " + queue.size() + " requests pending connectivity");
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ahjo ahjoVar = (ahjo) it.next();
            if (ahjoVar.e() || i(ahjoVar.a())) {
                it.remove();
                ahjoVar.b();
                g(ahjoVar);
            }
        }
        if (this.l.isEmpty() && this.m) {
            this.g.unregisterReceiver(this.n);
            this.m = false;
        }
    }

    public final void g(ahjo ahjoVar) {
        n(c(), e);
        this.h.execute(new ahjs(this, ahjoVar));
    }

    public final synchronized boolean i(ahjn ahjnVar) {
        if (ahjnVar == ahjn.NONE) {
            return true;
        }
        if (m(this.g, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = this.i.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    int ordinal = ahjnVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            Log.e(a, "Unknown connectivity type checked: ".concat(String.valueOf(ahjnVar.name())));
                            return true;
                        }
                        if (activeNetworkInfo.getType() == 0 || activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 6 || activeNetworkInfo.getType() == 7 || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 16 || activeNetworkInfo.getType() == 17) {
                            return true;
                        }
                        return false;
                    }
                    if (!this.i.isActiveNetworkMetered() || activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 9 || activeNetworkInfo.getType() == 17) {
                        return true;
                    }
                    return false;
                }
                Log.d(a, "Network disconnected, connectivity cannot be satisfied.");
                return false;
            }
            Log.d(a, "No current network, connectivity cannot be satisfied.");
            return false;
        }
        throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
    }

    public final synchronized boolean j(ahjo ahjoVar) {
        File file = ahjoVar.b;
        String str = ahjoVar.c;
        Map map = this.j;
        String a2 = a(file, str);
        if (map.containsKey(a2)) {
            Log.i(a, "Request is already being executed for key: ".concat(a2));
            return false;
        }
        this.j.put(a2, ahjoVar);
        g(ahjoVar);
        return true;
    }

    public final synchronized void k(ahiy ahiyVar) {
        this.c.add(new WeakReference(ahiyVar));
    }

    public final void l(File file, String str, adwv adwvVar, aksr aksrVar, File file2) {
        List list;
        List list2;
        String a2 = a(file, str);
        synchronized (this) {
            this.j.remove(a2);
            this.k.remove(a2);
            if (this.j.isEmpty()) {
                list = c();
                list2 = null;
            } else if (this.l.containsAll(this.j.values())) {
                list2 = c();
                list = null;
            } else {
                list = null;
                list2 = null;
            }
        }
        if (aksrVar == null) {
            ahiu.c("%s: Downloaded file %s", "DownloadCompleteHandler", file2.getName());
            ((dtq) adwvVar.a).b(null);
        } else {
            int i = 3;
            Object[] objArr = {"DownloadCompleteHandler", file2.getName(), aksrVar.d};
            Object obj = aksrVar.b;
            ahiu.d((Throwable) obj, "%s: Failed to download file %s due to %s", objArr);
            atkm atkmVar = new atkm();
            switch ((ahjm) aksrVar.d) {
                case UNKNOWN:
                    i = 101;
                    break;
                case CANCELED:
                    i = 102;
                    break;
                case INVALID_REQUEST:
                    i = 103;
                    break;
                case HTTP_ERROR:
                    i = 104;
                    break;
                case REQUEST_ERROR:
                    i = 105;
                    break;
                case RESPONSE_OPEN_ERROR:
                    i = 106;
                    break;
                case RESPONSE_CLOSE_ERROR:
                    i = 107;
                    break;
                case NETWORK_IO_ERROR:
                    i = 108;
                    break;
                case DISK_IO_ERROR:
                    i = 109;
                    break;
                case FILE_SYSTEM_ERROR:
                    i = 110;
                    break;
                case UNKNOWN_IO_ERROR:
                    i = 111;
                    break;
                case OAUTH_ERROR:
                    i = 112;
                    break;
            }
            atkmVar.a = i;
            String str2 = "ANDROID_DOWNLOADER_" + ((ahjm) aksrVar.d).name() + "; ";
            int i2 = aksrVar.a;
            if (i2 >= 0) {
                str2 = str2 + "HttpCode: " + i2 + "; ";
            }
            Object obj2 = aksrVar.c;
            if (obj2 != null) {
                str2 = str2 + "Message: " + ((String) obj2) + "; ";
            }
            atkmVar.c = str2;
            if (obj != null) {
                atkmVar.b = obj;
            }
            ((dtq) adwvVar.a).d(atkmVar.e());
        }
        if (list != null) {
            n(list, f);
        } else if (list2 != null) {
            n(list2, d);
        }
    }
}
