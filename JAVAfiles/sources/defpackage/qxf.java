package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxf extends ContentProvider {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        rrk dg();
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Context context = getContext();
        context.getClass();
        rrk dg = ((a) akec.w(context, a.class)).dg();
        akrc b = dg.c.b("BugleContentProvider#call");
        try {
            Bundle bundle2 = null;
            if (!Arrays.asList(dg.d.getPackageName(), "com.google.android.ims").contains(dg.d.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
                xyo e = rrk.a.e();
                e.H("Ignored");
                e.H(str);
                e.H("call from external package.");
                e.q();
            } else if ("is_blocked".equals(str)) {
                boolean z = false;
                if (str2 != null && ((xxh) dg.b.b()).f(str2)) {
                    z = true;
                }
                bundle2 = new Bundle();
                bundle2.putBoolean("blocked", z);
            } else {
                xyo a2 = rrk.a.a();
                a2.H("Ignored unsupported");
                a2.H(str);
                a2.H("call.");
                a2.q();
            }
            b.close();
            return bundle2;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("unimplemented");
    }
}
