package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsu implements hns {
    private static final String[] a = {"_data"};
    private final Context b;
    private final hse c;
    private final hse d;
    private final Uri e;
    private final int f;
    private final int g;
    private final hnj h;
    private final Class i;
    private volatile boolean j;
    private volatile hns k;

    public hsu(Context context, hse hseVar, hse hseVar2, Uri uri, int i, int i2, hnj hnjVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = hseVar;
        this.d = hseVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = hnjVar;
        this.i = cls;
    }

    @Override // defpackage.hns
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.hns
    public final void d() {
        hns hnsVar = this.k;
        if (hnsVar != null) {
            hnsVar.d();
        }
    }

    @Override // defpackage.hns
    public final void eX() {
        this.j = true;
        hns hnsVar = this.k;
        if (hnsVar != null) {
            hnsVar.eX();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [hns] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // defpackage.hns
    public final void f(hlh hlhVar, hnr hnrVar) {
        boolean isExternalStorageLegacy;
        Uri uri;
        kkc b;
        try {
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            ?? r2 = 0;
            Cursor cursor = null;
            if (isExternalStorageLegacy) {
                hse hseVar = this.c;
                Uri uri2 = this.e;
                try {
                    Cursor query = this.b.getContentResolver().query(uri2, a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    b = hseVar.b(file, this.f, this.g, this.h);
                                } else {
                                    throw new FileNotFoundException(a.cr(uri2, "File path was empty in media store for: "));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException(a.cr(uri2, "Failed to media store entry for: "));
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                Uri uri3 = this.e;
                if (hlc.g(uri3) && uri3.getPathSegments().contains("picker")) {
                    b = this.d.b(this.e, this.f, this.g, this.h);
                } else {
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri = MediaStore.setRequireOriginal(this.e);
                    } else {
                        uri = this.e;
                    }
                    b = this.d.b(uri, this.f, this.g, this.h);
                }
            }
            if (b != null) {
                r2 = b.b;
            }
            if (r2 == 0) {
                hnrVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = r2;
            if (this.j) {
                eX();
            } else {
                r2.f(hlhVar, hnrVar);
            }
        } catch (FileNotFoundException e) {
            hnrVar.e(e);
        }
    }

    @Override // defpackage.hns
    public final int g() {
        return 1;
    }
}
