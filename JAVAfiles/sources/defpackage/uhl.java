package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class uhl extends uhk {
    public static final vl a = new vl();

    public static Uri d(String str, Context context) {
        return c(context).b(str);
    }

    public static Uri e(Context context, Uri uri) {
        if (!TextUtils.equals(uri.getAuthority(), uho.b(context))) {
            return uri;
        }
        return uri.buildUpon().authority(uho.c(context)).build();
    }

    public static Uri f(Uri uri, Context context) {
        return h(uri, null, context);
    }

    public static Uri g(InputStream inputStream, Context context) {
        return ydk.e(context, inputStream, c(context).b(null));
    }

    public static Uri h(Uri uri, String str, Context context) {
        return c(context).d(uri, str);
    }

    public static File i(Uri uri, Context context) {
        return c(context).f(uri);
    }

    public static void j(Context context, Uri uri) {
        c(context).i(context, uri);
    }

    public static boolean k(Uri uri, Context context) {
        return c(context).k(uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.uhk
    public File a(String str, String str2) {
        return b().g(str, str2);
    }

    @Override // defpackage.uhk, android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        if (strArr != null && strArr.length > 0 && TextUtils.equals(strArr[0], "_display_name") && b().k(uri)) {
            vl vlVar = a;
            synchronized (vlVar) {
                str3 = (String) vlVar.get(uri);
            }
            if (!TextUtils.isEmpty(str3)) {
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_display_name"});
                matrixCursor.newRow().add(str3);
                return matrixCursor;
            }
            return null;
        }
        return null;
    }
}
