package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsa implements hns {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public hsa(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.hns
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.hns
    public final void f(hlh hlhVar, hnr hnrVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            hnrVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            hnrVar.b(new File(str));
        }
    }

    @Override // defpackage.hns
    public final int g() {
        return 1;
    }

    @Override // defpackage.hns
    public final void d() {
    }

    @Override // defpackage.hns
    public final void eX() {
    }
}
