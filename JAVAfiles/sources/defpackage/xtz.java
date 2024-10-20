package defpackage;

import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtz implements ufz {
    private WeakReference a;

    public xtz(AsyncImageView asyncImageView) {
        this.a = new WeakReference(asyncImageView);
    }

    private final AsyncImageView d() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return (AsyncImageView) weakReference.get();
    }

    public final void c() {
        this.a = null;
    }

    @Override // defpackage.ufz
    public final void fC(ufw ufwVar) {
        AsyncImageView d = d();
        if (d == null) {
            return;
        }
        d.e();
        d.f();
    }

    @Override // defpackage.ufz
    public final /* bridge */ /* synthetic */ void fD(ufw ufwVar, ugg uggVar, boolean z) {
        ufu ufuVar = (ufu) uggVar;
        AsyncImageView d = d();
        if (d != null && d.b != ufuVar) {
            d.c(ufuVar, z);
        }
    }
}
