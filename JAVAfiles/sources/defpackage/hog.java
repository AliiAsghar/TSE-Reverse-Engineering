package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hog extends hnp {
    public hog(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.hns
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.hnp
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.hnp
    protected final /* synthetic */ void e(Object obj) {
        ((InputStream) obj).close();
    }
}
