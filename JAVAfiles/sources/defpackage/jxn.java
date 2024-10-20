package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxn {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/image/LoggingGlideErrorListener");
    private final mbl b;

    public jxn(mbl mblVar) {
        mblVar.getClass();
        this.b = mblVar;
    }

    public final void a(hpp hppVar, Object obj, int i) {
        String str;
        if (obj instanceof Uri) {
            str = yyb.bl((Uri) obj);
        } else {
            str = "unknown";
        }
        alvw h = a.h();
        h.X(alwp.a, "BugleGlide");
        ((alvg) ((alvg) h).g(hppVar).h("com/google/android/apps/messaging/conversation2/image/LoggingGlideErrorListener", "onLoadFailed", 25, "LoggingGlideErrorListener.kt")).t("Glide load %s failed", str);
        this.b.e("Bugle.Glide.Error.Count", i);
    }
}
