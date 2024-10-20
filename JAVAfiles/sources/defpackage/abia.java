package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abia implements abif {
    public final /* synthetic */ znp a;
    private final /* synthetic */ int b;

    public /* synthetic */ abia(znp znpVar, int i) {
        this.b = i;
        this.a = znpVar;
    }

    @Override // defpackage.abif
    public final void a(IBinder iBinder, Consumer consumer, Consumer consumer2) {
        if (this.b != 0) {
            IFiProductSpecificDataService.Stub.asInterface(iBinder).getFiProductSpecificBinaryData(((Context) this.a.a).getPackageName(), new abic(consumer, consumer2));
        } else {
            IFiProductSpecificDataService.Stub.asInterface(iBinder).getFiProductSpecificData(((Context) this.a.a).getPackageName(), new abib(consumer, consumer2));
        }
    }
}
