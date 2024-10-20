package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fiy {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public Spatializer$OnSpatializerStateChangedListener d;

    public fiy(Spatializer spatializer) {
        int immersiveAudioLevel;
        boolean z;
        this.a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        if (immersiveAudioLevel != 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
    }
}
