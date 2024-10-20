package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmw {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper");

    public static final loq a(ru ruVar) {
        ruVar.getClass();
        if (ruVar.a != -1) {
            ((alvg) a.d().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 21, "MediaViewerHelper.kt")).r("Skipping MediaViewer activity result because of resultCode %s", ruVar.a);
            return null;
        }
        Intent intent = ruVar.b;
        if (intent == null) {
            ((alvg) a.g().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 28, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null intent");
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (uri == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 34, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null uri");
            return null;
        }
        String type = intent.getType();
        if (type == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/navigation/targets/MediaViewerHelper", "convertActivityResultToTypedUri", 39, "MediaViewerHelper.kt")).q("Skipping MediaViewer activity result because of null type");
            return null;
        }
        return new loq(type, uri);
    }
}
