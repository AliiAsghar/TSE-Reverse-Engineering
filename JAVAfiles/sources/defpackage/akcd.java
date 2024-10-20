package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akcd implements akcm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ akcd(Uri uri, ContentValues contentValues, String str, int i) {
        this.d = i;
        this.b = uri;
        this.a = contentValues;
        this.c = str;
    }

    @Override // defpackage.akcm
    public final Object a(ContentProviderClient contentProviderClient) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                return contentProviderClient.call((String) this.b, (String) this.c, (Bundle) obj);
            }
            Object obj2 = this.c;
            return Integer.valueOf(contentProviderClient.update((Uri) this.b, (ContentValues) this.a, (String) obj2, null));
        }
        Object obj3 = this.c;
        return Integer.valueOf(contentProviderClient.delete((Uri) this.a, (String) this.b, (String[]) obj3));
    }

    public /* synthetic */ akcd(Uri uri, String str, String[] strArr, int i) {
        this.d = i;
        this.a = uri;
        this.b = str;
        this.c = strArr;
    }

    public /* synthetic */ akcd(Bundle bundle, int i) {
        this.d = i;
        this.b = "garbage_collect";
        this.c = "";
        this.a = bundle;
    }
}
