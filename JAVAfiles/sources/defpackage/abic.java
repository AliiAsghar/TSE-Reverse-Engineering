package defpackage;

import com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback;
import com.google.android.gms.feedback.FileTeleporter;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abic extends IFiProductSpecificBinaryDataCallback.Stub {
    final /* synthetic */ Consumer a;
    final /* synthetic */ Consumer b;

    public abic(Consumer consumer, Consumer consumer2) {
        this.a = consumer;
        this.b = consumer2;
    }

    @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback
    public final void onError(String str) {
        this.b.accept(str);
    }

    @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback
    public final void onSuccess(List<FileTeleporter> list) {
        this.a.accept(list);
    }
}
