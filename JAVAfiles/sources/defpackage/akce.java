package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akce implements akcm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ akce(Uri uri, ContentValues contentValues, int i) {
        this.c = i;
        this.b = uri;
        this.a = contentValues;
    }

    @Override // defpackage.akcm
    public final Object a(ContentProviderClient contentProviderClient) {
        if (this.c != 0) {
            return contentProviderClient.insert((Uri) this.b, (ContentValues) this.a);
        }
        return Integer.valueOf(contentProviderClient.bulkInsert((Uri) this.a, (ContentValues[]) this.b));
    }

    public /* synthetic */ akce(Uri uri, ContentValues[] contentValuesArr, int i) {
        this.c = i;
        this.a = uri;
        this.b = contentValuesArr;
    }
}
