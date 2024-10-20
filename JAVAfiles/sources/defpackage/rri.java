package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rri {
    public static final uuf a = uuh.q(183258758);
    private static final xze h = xze.g("Bugle", "CursorQueryData");
    protected final Uri b;
    protected final String[] c;
    protected final String d;
    protected final String[] e;
    protected final String f;
    protected final ContentResolver g;

    public rri(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.b = uri;
        this.c = strArr;
        this.d = str;
        this.e = strArr2;
        this.f = str2;
        this.g = context.getContentResolver();
    }

    private static void c(armf armfVar, Exception exc) {
        if (armfVar != null) {
            ((uvi) armfVar.b()).b(exc);
        }
    }

    public final Cursor a() {
        return b(null);
    }

    public final Cursor b(armf armfVar) {
        xyl.h();
        if (Uri.EMPTY.equals(this.b)) {
            return null;
        }
        try {
            return this.g.query(this.b, this.c, this.d, this.e, this.f, null);
        } catch (SQLiteException e) {
            h.r("ContentResolver query is failed", e);
            c(armfVar, e);
            return null;
        } catch (IllegalArgumentException e2) {
            h.r("ContentResolver query is failed", e2);
            c(armfVar, e2);
            return null;
        } catch (SecurityException e3) {
            h.r("ContentResolver query is failed", e3);
            if (((Boolean) a.e()).booleanValue() && (TextUtils.equals(Build.MODEL, "meizu note9") || TextUtils.equals(Build.DEVICE, "meizunote9") || TextUtils.equals(Build.PRODUCT, "meizu_note9"))) {
                c(armfVar, e3);
                return null;
            }
            throw e3;
        }
    }
}
