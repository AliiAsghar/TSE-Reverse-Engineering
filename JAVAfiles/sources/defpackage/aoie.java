package defpackage;

import android.content.Intent;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aoie implements acik {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aoie(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.acik
    public final void a(acir acirVar) {
        if (this.c != 0) {
            HandlerThread handlerThread = (HandlerThread) ((adze) this.a).a.remove(this.b);
            if (handlerThread == null) {
                return;
            }
            handlerThread.quit();
            return;
        }
        ((aoif) this.a).e((Intent) this.b);
    }
}
