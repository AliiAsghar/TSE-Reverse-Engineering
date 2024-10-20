package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class absk implements abrw {
    final /* synthetic */ abso a;

    public absk(abso absoVar) {
        this.a = absoVar;
    }

    @Override // defpackage.abrw
    public final void a(boolean z) {
        Handler handler = this.a.o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
