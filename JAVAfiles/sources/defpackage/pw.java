package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pw implements OnBackInvokedCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ajim, java.lang.Object] */
    public final void onBackInvoked() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    this.a.R();
                    return;
                } else {
                    this.a.a();
                    return;
                }
            }
            ((fo) this.a).J();
            return;
        }
        this.a.run();
    }
}
