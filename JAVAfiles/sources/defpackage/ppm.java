package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ppm {
    private ppm() {
    }

    public static boolean a() {
        return anfi.a("bugle.use_gm3_ripples", "bugle");
    }

    public static /* synthetic */ String b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "FINISH_WITH_FAILURE";
                }
                return "FINISH_WITH_HTTP_RESPONSE";
            }
            return "EXECUTE_HTTP_REQUEST";
        }
        return "START_SINGLE_HTTP_REQUEST";
    }

    public static /* synthetic */ String c(int i) {
        if (i != 1) {
            if (i != 2) {
                return "UNSUPPORTED_NETWORK";
            }
            return "DOWNLOAD_FAILURE";
        }
        return "DOWNLOAD_URI";
    }

    public static pyg d(Uri uri) {
        uri.getClass();
        return new pxz(uri);
    }
}
