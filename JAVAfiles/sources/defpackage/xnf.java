package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xnf {
    public static final xze a = xze.g("Bugle", "TableBasedWipeoutDetectionHeuristicCommon");
    public final Context b;
    public final wul c;

    public xnf(Context context, wul wulVar) {
        this.b = context;
        this.c = wulVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Uri uri, xne xneVar) {
        Uri insert = this.b.getContentResolver().insert(uri, new ContentValues());
        albo.C(insert);
        Cursor query = this.b.getContentResolver().query(insert, new String[]{"_data"}, null, null, null, null);
        try {
            albo.C(query);
            if (query.moveToNext()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    this.c.m(new way(xneVar, insert, string, 13, (short[]) null));
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                throw new alia(a.cr(insert, "Newly created Uri has an empty filename. uri="));
            }
            throw new alia(a.cr(insert, "Unable to query newly created uri="));
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
    }
}
