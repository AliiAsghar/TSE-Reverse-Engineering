package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uho {
    public static String a(Context context) {
        return String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.ProxyProvider");
    }

    public static String b(Context context) {
        return String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.MediaScratchFileProvider");
    }

    public static String c(Context context) {
        return String.valueOf(context.getApplicationContext().getPackageName()).concat(".shared.datamodel.provider.InternalMediaScratchFileProvider");
    }

    public static boolean d(Uri uri) {
        if ("com.google.android.apps.messaging.shared.datamodel.provider.AudioProxyProviderUtil".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static final int e(long j, msh mshVar, uha uhaVar) {
        msh mshVar2 = uhaVar.a;
        if (mshVar2 != null) {
            boolean F = d.F(mshVar, mshVar2);
            int i = 1;
            if (true == F) {
                i = 2;
            }
            if (j == uhaVar.c) {
                return i + 2;
            }
            return i;
        }
        return 0;
    }

    public static agmh[] h() {
        return (agmh[]) rlk.e.s;
    }
}
