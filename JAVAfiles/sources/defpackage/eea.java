package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eea {
    public static efo a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        efo o = efo.o(rootWindowInsets);
        o.s(o);
        o.q(view.getRootView());
        return o;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }

    public static void c(Window window, boolean z) {
        int i;
        int i2;
        boolean z2;
        if (Build.VERSION.SDK_INT < 35) {
            if (Build.VERSION.SDK_INT >= 30) {
                View decorView = window.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                if (z) {
                    i2 = systemUiVisibility & (-257);
                    z2 = true;
                } else {
                    i2 = systemUiVisibility | 256;
                    z2 = false;
                }
                decorView.setSystemUiVisibility(i2);
                window.setDecorFitsSystemWindows(z2);
                return;
            }
            View decorView2 = window.getDecorView();
            int systemUiVisibility2 = decorView2.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility2 & (-1793);
            } else {
                i = systemUiVisibility2 | 1792;
            }
            decorView2.setSystemUiVisibility(i);
            return;
        }
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = ((defpackage.ffe) r5.get(r1)).d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(boolean r5) {
        /*
            r0 = 0
            eqm r1 = new eqm     // Catch: defpackage.ffn -> L63
            r1.<init>()     // Catch: defpackage.ffn -> L63
            java.lang.String r2 = "video/avc"
            r1.b(r2)     // Catch: defpackage.ffn -> L63
            eqn r2 = new eqn     // Catch: defpackage.ffn -> L63
            r2.<init>(r1)     // Catch: defpackage.ffn -> L63
            java.lang.String r1 = r2.o     // Catch: defpackage.ffn -> L63
            if (r1 == 0) goto L63
            java.util.List r5 = defpackage.ffp.f(r2, r5, r0)     // Catch: defpackage.ffn -> L63
            r1 = r0
        L19:
            r2 = r5
            alsx r2 = (defpackage.alsx) r2     // Catch: defpackage.ffn -> L63
            int r2 = r2.c     // Catch: defpackage.ffn -> L63
            if (r1 >= r2) goto L63
            java.lang.Object r2 = r5.get(r1)     // Catch: defpackage.ffn -> L63
            ffe r2 = (defpackage.ffe) r2     // Catch: defpackage.ffn -> L63
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: defpackage.ffn -> L63
            if (r2 == 0) goto L60
            java.lang.Object r2 = r5.get(r1)     // Catch: defpackage.ffn -> L63
            ffe r2 = (defpackage.ffe) r2     // Catch: defpackage.ffn -> L63
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: defpackage.ffn -> L63
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: defpackage.ffn -> L63
            if (r2 == 0) goto L60
            java.lang.Object r2 = r5.get(r1)     // Catch: defpackage.ffn -> L63
            ffe r2 = (defpackage.ffe) r2     // Catch: defpackage.ffn -> L63
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.d     // Catch: defpackage.ffn -> L63
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: defpackage.ffn -> L63
            java.util.List r2 = defpackage.ex$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: defpackage.ffn -> L63
            if (r2 == 0) goto L60
            boolean r3 = r2.isEmpty()     // Catch: defpackage.ffn -> L63
            if (r3 != 0) goto L60
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = new android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint     // Catch: defpackage.ffn -> L63
            r1 = 720(0x2d0, float:1.009E-42)
            r3 = 60
            r4 = 1280(0x500, float:1.794E-42)
            r5.<init>(r4, r1, r3)     // Catch: defpackage.ffn -> L63
            int r5 = e(r2, r5)     // Catch: defpackage.ffn -> L63
            return r5
        L60:
            int r1 = r1 + 1
            goto L19
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eea.d(boolean):int");
    }

    public static int e(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i = 0; i < list.size(); i++) {
            covers = ex$$ExternalSyntheticApiModelOutline0.m363m(list.get(i)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }

    public static long f(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }
}
