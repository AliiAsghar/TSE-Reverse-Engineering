package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aket implements akew {
    public final /* synthetic */ Uri a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aket(Uri uri, Object obj, int i) {
        this.c = i;
        this.a = uri;
        this.b = obj;
    }

    @Override // defpackage.akew
    public final Object a(ansy ansyVar) {
        if (this.c != 0) {
            return (Bundle) ansyVar.p(this.a, new akcd((Bundle) this.b, 2));
        }
        Object obj = this.b;
        Uri uri = this.a;
        Integer num = (Integer) ansyVar.p(uri, new akce(uri, (ContentValues[]) obj, 0));
        num.intValue();
        return num;
    }
}
