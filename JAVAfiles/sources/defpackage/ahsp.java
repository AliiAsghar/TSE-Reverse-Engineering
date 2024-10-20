package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahsp implements ahss {
    public static final Map a = new tm();
    public static final String[] b = {"key", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE};
    public final ContentResolver c;
    public final Uri d;
    public final Object e;
    public volatile Map f;
    public final List g;
    private final ContentObserver h;

    public ahsp(ContentResolver contentResolver, Uri uri) {
        ahso ahsoVar = new ahso(this);
        this.h = ahsoVar;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        contentResolver.registerContentObserver(uri, false, ahsoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        synchronized (ahsp.class) {
            for (ahsp ahspVar : a.values()) {
                ahspVar.c.unregisterContentObserver(ahspVar.h);
            }
            a.clear();
        }
    }

    @Override // defpackage.ahss
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map emptyMap;
        Map map = this.f;
        if (map == null) {
            synchronized (this.e) {
                map = this.f;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            emptyMap = (Map) ahof.d(new ahsr() { // from class: ahsn
                                @Override // defpackage.ahsr
                                public final Object a() {
                                    Map emptyMap2;
                                    Cursor query;
                                    Map hashMap;
                                    Map emptyMap3;
                                    ahsp ahspVar = ahsp.this;
                                    ContentProviderClient acquireUnstableContentProviderClient = ahspVar.c.acquireUnstableContentProviderClient(ahspVar.d);
                                    try {
                                        if (acquireUnstableContentProviderClient == null) {
                                            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                            return Collections.emptyMap();
                                        }
                                        try {
                                            query = acquireUnstableContentProviderClient.query(ahspVar.d, ahsp.b, null, null, null);
                                        } catch (RemoteException e) {
                                            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                                            emptyMap2 = Collections.emptyMap();
                                        }
                                        try {
                                            if (query == null) {
                                                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                emptyMap2 = Collections.emptyMap();
                                                return emptyMap2;
                                            }
                                            int count = query.getCount();
                                            if (count == 0) {
                                                emptyMap3 = Collections.emptyMap();
                                            } else {
                                                if (count <= 256) {
                                                    hashMap = new tm(count);
                                                } else {
                                                    hashMap = new HashMap(count, 1.0f);
                                                }
                                                while (query.moveToNext()) {
                                                    hashMap.put(query.getString(0), query.getString(1));
                                                }
                                                if (!query.isAfterLast()) {
                                                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                    emptyMap3 = Collections.emptyMap();
                                                } else {
                                                    query.close();
                                                    acquireUnstableContentProviderClient.release();
                                                    return hashMap;
                                                }
                                            }
                                            query.close();
                                            acquireUnstableContentProviderClient.release();
                                            return emptyMap3;
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
                                    } finally {
                                        acquireUnstableContentProviderClient.release();
                                    }
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException e) {
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            emptyMap = Collections.emptyMap();
                        }
                        this.f = emptyMap;
                        map = emptyMap;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
            }
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        return (String) map.get(str);
    }
}
