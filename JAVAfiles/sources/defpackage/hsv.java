package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsv implements hse {
    private final Context a;
    private final hse b;
    private final hse c;
    private final Class d;

    public hsv(Context context, hse hseVar, hse hseVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = hseVar;
        this.c = hseVar2;
        this.d = cls;
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && hlc.g(uri)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hse
    public final /* bridge */ /* synthetic */ kkc b(Object obj, int i, int i2, hnj hnjVar) {
        Uri uri = (Uri) obj;
        return new kkc(new hyf(uri), new hsu(this.a, this.b, this.c, uri, i, i2, hnjVar, this.d));
    }
}
