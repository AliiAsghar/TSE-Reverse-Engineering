package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmk {
    public final AtomicBoolean a = new AtomicBoolean();
    private HashMap j = null;
    public final HashMap b = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    public final HashMap d = new HashMap(16, 1.0f);
    public final HashMap e = new HashMap(16, 1.0f);
    public Object f = null;
    public boolean g = false;
    public String[] h = new String[0];
    public final actx i = new actx();

    public static final void e(ContentResolver contentResolver) {
        if (contentResolver != null) {
        } else {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public static final Object f(Map map, String str, Object obj) {
        if (map.containsKey(str)) {
            Object obj2 = map.get(str);
            if (obj2 != null) {
                return obj2;
            }
            return obj;
        }
        return null;
    }

    public final String a(ContentResolver contentResolver, String str, String str2) {
        String str3;
        e(contentResolver);
        synchronized (this) {
            c(contentResolver);
            Object obj = this.f;
            if (this.j.containsKey(str)) {
                String str4 = (String) this.j.get(str);
                if (str4 != null) {
                    str2 = str4;
                }
                return str2;
            }
            for (String str5 : this.h) {
                if (str.startsWith(str5)) {
                    if (!this.g) {
                        b(contentResolver, this.h);
                        if (this.j.containsKey(str)) {
                            String str6 = (String) this.j.get(str);
                            if (str6 != null) {
                                str2 = str6;
                            }
                            return str2;
                        }
                    }
                    return str2;
                }
            }
            try {
                ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(acme.a);
                try {
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(acme.a, null, null, new String[]{str}, null);
                            try {
                                if (query != null) {
                                    if (query.moveToFirst()) {
                                        str3 = query.getString(1);
                                        query.close();
                                    } else {
                                        query.close();
                                        str3 = null;
                                    }
                                    if (str3 != null && str3.equals(str2)) {
                                        str3 = str2;
                                    }
                                    synchronized (this) {
                                        if (obj == this.f) {
                                            this.j.put(str, str3);
                                        }
                                    }
                                    if (str3 != null) {
                                        return str3;
                                    }
                                    return str2;
                                }
                                throw new acmj("ContentProvider query returned null cursor");
                            } catch (Throwable th) {
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (RemoteException e) {
                            throw new acmj(e);
                        }
                    }
                    throw new acmj("Unable to acquire ContentProviderClient");
                } finally {
                    acquireUnstableContentProviderClient.release();
                }
            } catch (acmj unused) {
                return str2;
            }
        }
    }

    public final void b(ContentResolver contentResolver, String[] strArr) {
        try {
            HashMap hashMap = (HashMap) actx.l(contentResolver, strArr, new acmg(1));
            if (!hashMap.isEmpty()) {
                Set keySet = hashMap.keySet();
                keySet.removeAll(this.b.keySet());
                keySet.removeAll(this.c.keySet());
                keySet.removeAll(this.d.keySet());
                keySet.removeAll(this.e.keySet());
            }
            if (!hashMap.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = hashMap;
                } else {
                    this.j.putAll(hashMap);
                }
            }
            this.g = true;
        } catch (acmj unused) {
        }
    }

    public final void c(ContentResolver contentResolver) {
        if (this.j == null) {
            this.a.set(false);
            this.j = new HashMap(16, 1.0f);
            this.f = new Object();
            contentResolver.registerContentObserver(acme.a, true, new acmh(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.j.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f = new Object();
            this.g = false;
        }
    }

    public final void d(Object obj, Map map, String str, Object obj2) {
        if (obj == this.f) {
            map.put(str, obj2);
            this.j.remove(str);
        }
    }
}
