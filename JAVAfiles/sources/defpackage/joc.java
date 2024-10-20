package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class joc implements eci {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ joc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.eci
    public final boolean a(Object obj) {
        String type;
        if (this.b != 0) {
            alog alogVar = iky.a;
            Uri uri = ((ClipData.Item) obj).getUri();
            if (uri != null && (type = ((ContentResolver) this.a).getType(uri)) != null && iky.a.contains(type)) {
                return true;
            }
            return false;
        }
        alvi alviVar = joe.a;
        if (!this.a.contains(obj)) {
            return true;
        }
        return false;
    }
}
