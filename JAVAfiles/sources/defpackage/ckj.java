package defpackage;

import android.graphics.Shader;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckj {
    public static final Shader.TileMode a() {
        Shader.TileMode tileMode;
        if (!a.bA(0, 0)) {
            if (a.bA(0, 1)) {
                return Shader.TileMode.REPEAT;
            }
            if (a.bA(0, 2)) {
                return Shader.TileMode.MIRROR;
            }
            if (a.bA(0, 3) && Build.VERSION.SDK_INT >= 31) {
                tileMode = Shader.TileMode.DECAL;
                return tileMode;
            }
        }
        return Shader.TileMode.CLAMP;
    }
}
