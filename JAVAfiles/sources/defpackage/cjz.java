package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjz implements clg {
    public final Bitmap a;

    public cjz(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.clg
    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.a.getConfig();
        config3.getClass();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 != Bitmap.Config.ARGB_4444) {
            config = Bitmap.Config.RGBA_F16;
            if (config3 != config) {
                config2 = Bitmap.Config.HARDWARE;
                if (config3 == config2) {
                    return 4;
                }
            } else {
                return 3;
            }
        }
        return 0;
    }

    @Override // defpackage.clg
    public final int b() {
        return this.a.getHeight();
    }

    @Override // defpackage.clg
    public final int c() {
        return this.a.getWidth();
    }

    @Override // defpackage.clg
    public final void d() {
        this.a.prepareToDraw();
    }
}
