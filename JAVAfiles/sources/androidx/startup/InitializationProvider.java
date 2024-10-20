package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.apps.messaging.R;
import defpackage.gkr;
import defpackage.gks;
import defpackage.gkt;
import defpackage.gvf;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                if (gkr.a == null) {
                    synchronized (gkr.b) {
                        if (gkr.a == null) {
                            gkr.a = new gkr(context);
                        }
                    }
                }
                Class<?> cls = getClass();
                gkr gkrVar = gkr.a;
                try {
                    try {
                        gvf.bd("Startup");
                        Bundle bundle = gkrVar.e.getPackageManager().getProviderInfo(new ComponentName(gkrVar.e, cls), 128).metaData;
                        String string = gkrVar.e.getString(R.string.androidx_startup);
                        if (bundle != null) {
                            try {
                                HashSet hashSet = new HashSet();
                                for (String str : bundle.keySet()) {
                                    if (string.equals(bundle.getString(str, null))) {
                                        Class<?> cls2 = Class.forName(str);
                                        if (gks.class.isAssignableFrom(cls2)) {
                                            gkrVar.d.add(cls2);
                                        }
                                    }
                                }
                                Iterator it = gkrVar.d.iterator();
                                while (it.hasNext()) {
                                    gkrVar.a((Class) it.next(), hashSet);
                                }
                            } catch (ClassNotFoundException e) {
                                throw new gkt(e);
                            }
                        }
                        return true;
                    } catch (PackageManager.NameNotFoundException e2) {
                        throw new gkt(e2);
                    }
                } finally {
                    Trace.endSection();
                }
            }
            return true;
        }
        throw new gkt();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
