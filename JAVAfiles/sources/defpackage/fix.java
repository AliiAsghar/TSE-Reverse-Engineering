package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fix implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ fjd a;

    public fix(fjd fjdVar) {
        this.a = fjdVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.g();
    }
}
