package defpackage;

import android.view.ContentInfo;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeg {
    public static ecv a(View view, ecv ecvVar) {
        ContentInfo performReceiveContent;
        ContentInfo f = ecvVar.f();
        performReceiveContent = view.performReceiveContent(f);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == f) {
            return ecvVar;
        }
        return ecv.g(performReceiveContent);
    }

    public static void b(View view, String[] strArr, edi ediVar) {
        if (ediVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new eeh(ediVar));
        }
    }

    public static String[] c(View view) {
        String[] receiveContentMimeTypes;
        receiveContentMimeTypes = view.getReceiveContentMimeTypes();
        return receiveContentMimeTypes;
    }

    public static void d(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }
}
