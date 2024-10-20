package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hwk implements hyp {
    final /* synthetic */ Context a;

    public hwk(Context context) {
        this.a = context;
    }

    @Override // defpackage.hyp
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
