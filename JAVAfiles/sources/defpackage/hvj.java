package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvj extends hxi {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public hvj(Handler handler, int i, long j) {
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.hxq
    public final /* bridge */ /* synthetic */ void b(Object obj, hxz hxzVar) {
        this.b = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }

    @Override // defpackage.hxq
    public final void e(Drawable drawable) {
        this.b = null;
    }
}
