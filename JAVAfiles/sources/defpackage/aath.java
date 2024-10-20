package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aath extends aker {
    final /* synthetic */ ahiy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aath(aksr aksrVar, Executor executor, ahiy ahiyVar) {
        super(aksrVar, "GalleryAsyncContentObserver", executor);
        this.a = ahiyVar;
    }

    @Override // defpackage.aker
    public final void a(boolean z, Uri uri) {
        this.a.q(albo.bI(null), "gallery_content_key");
    }
}
