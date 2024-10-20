package defpackage;

import android.graphics.Shader;
import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dys {
    public static dys a;

    public dys() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioAttributes.Builder a() {
        return new AudioAttributes.Builder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioAttributes.Builder b(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AudioAttributes e(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static Shader.TileMode f(int i) {
        if (i != 1) {
            if (i != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    public dys(byte[] bArr) {
    }
}
