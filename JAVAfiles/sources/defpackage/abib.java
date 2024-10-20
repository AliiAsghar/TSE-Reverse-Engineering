package defpackage;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abib extends IFiProductSpecificDataCallback.Stub {
    final /* synthetic */ Consumer a;
    final /* synthetic */ Consumer b;

    public abib(Consumer consumer, Consumer consumer2) {
        this.a = consumer;
        this.b = consumer2;
    }

    @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback
    public final void onError(String str) {
        this.b.accept(str);
    }

    @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback
    public final void onSuccess(Bundle bundle) {
        alob d = alog.d(bundle.size());
        for (String str : bundle.keySet()) {
            d.h(Pair.create(str, bundle.getString(str)));
        }
        this.a.accept(d.g());
    }
}
