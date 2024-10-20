package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvt {
    public static final String[] c;
    public static final String[] d;
    private static final String[] f;
    private static final String[] g;
    private final wfh i;
    public static final Uri a = MediaStore.Files.getContentUri("external");
    public static final Uri b = MediaStore.Files.getContentUri("external");
    public static final String e = e(rvr.a, new Integer[]{1});
    private static final String h = e(rvr.c, new Integer[]{1, 3});

    static {
        String[] strArr = {"_id", "_data", "width", "height", "orientation", "mime_type", "date_modified"};
        c = strArr;
        String[] strArr2 = {"_id", "width", "height", "orientation", "mime_type", "date_modified"};
        d = strArr2;
        f = (String[]) alzz.V(strArr, new String[]{"duration"}, String.class);
        g = (String[]) alzz.V(strArr2, new String[]{"duration"}, String.class);
    }

    public rvt(wfh wfhVar) {
        this.i = wfhVar;
    }

    public static Uri a() {
        if (((Boolean) rvs.a.e()).booleanValue()) {
            return b;
        }
        return a;
    }

    public static Uri b(Cursor cursor) {
        if (((Boolean) rvs.a.e()).booleanValue()) {
            return ContentUris.withAppendedId(b, cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        }
        return ydk.h(cursor.getString(cursor.getColumnIndexOrThrow("_data")));
    }

    private static String e(String[] strArr, Integer[] numArr) {
        return "mime_type IN ('" + new algs("','").e(strArr) + "') AND media_type IN (" + algs.c(',').e(numArr) + ")";
    }

    public final String c() {
        if (this.i.L()) {
            return h;
        }
        return e;
    }

    public final String[] d() {
        if (((Boolean) rvs.a.e()).booleanValue()) {
            if (this.i.L()) {
                return g;
            }
            return d;
        }
        if (this.i.L()) {
            return f;
        }
        return c;
    }
}
