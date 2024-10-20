package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class uhk extends ContentProvider {

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        uff dK();
    }

    public static uff c(Context context) {
        return ((a) akec.w(context, a.class)).dK();
    }

    protected abstract File a(String str, String str2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final uff b() {
        return c(getContext());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        String path = uri.getPath();
        if (!b().l(path) || !a(path, b().h(uri)).delete()) {
            return 0;
        }
        return 1;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        String path = uri.getPath();
        if (b().l(path)) {
            return ParcelFileDescriptor.open(a(path, b().h(uri)), ydh.a(str));
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
