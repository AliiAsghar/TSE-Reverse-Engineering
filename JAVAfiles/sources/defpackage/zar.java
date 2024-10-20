package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zar {
    public static final amj a = new amk(24.0f, 24.0f, 24.0f, 24.0f);
    public static final amj b = amh.h(brg.a, brg.a, brg.a, 16.0f, 7);
    public static final float c = 280.0f;
    public static final float d = 560.0f;

    public static final void a(zaq zaqVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4 = i & 14;
        bwj c2 = bwjVar.c(-1659133299);
        if (i4 == 0) {
            if (true != c2.G(zaqVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c2.L()) {
            c2.v();
        } else {
            cas a2 = cak.a(zaqVar.a, c2);
            if (!a.x(a2).isEmpty()) {
                int i5 = ((Configuration) c2.g(AndroidCompositionLocals_androidKt.a)).orientation;
                dsq.a(zaqVar.b, null, cdk.e(612148123, new lfw(a2, 16), c2), c2, 384, 2);
            }
        }
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new zaf(zaqVar, i, 3);
        }
    }
}
