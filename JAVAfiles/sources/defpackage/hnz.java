package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnz extends hnp {
    public hnz(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.hns
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.hnp
    protected final /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // defpackage.hnp
    protected final /* synthetic */ void e(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
