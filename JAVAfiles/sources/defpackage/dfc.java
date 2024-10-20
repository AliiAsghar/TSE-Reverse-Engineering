package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfc extends ContentObserver {
    final /* synthetic */ arzj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfc(arzj arzjVar, Handler handler) {
        super(handler);
        this.a = arzjVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.c(arnb.a);
    }
}
