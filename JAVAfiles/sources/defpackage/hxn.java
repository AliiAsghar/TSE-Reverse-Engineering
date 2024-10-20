package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxn extends hxi {
    private static final Handler b = new Handler(Looper.getMainLooper(), new hxm(0));
    public final hls a;

    public hxn(hls hlsVar) {
        super(null);
        this.a = hlsVar;
    }

    @Override // defpackage.hxq
    public final void b(Object obj, hxz hxzVar) {
        hwx hwxVar = this.c;
        if (hwxVar != null && hwxVar.l()) {
            b.obtainMessage(1, this).sendToTarget();
        }
    }

    @Override // defpackage.hxq
    public final void e(Drawable drawable) {
    }
}
