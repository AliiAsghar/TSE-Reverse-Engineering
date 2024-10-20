package defpackage;

import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hre implements hsf, hrd {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public hre(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.hrd
    public final hns a(AssetManager assetManager, String str) {
        if (this.b != 0) {
            return new hnz(assetManager, str);
        }
        return new hog(assetManager, str);
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        if (this.b != 0) {
            return new hrp(this.a, this, 1);
        }
        return new hrp(this.a, this, 1);
    }
}
