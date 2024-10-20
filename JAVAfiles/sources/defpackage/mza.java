package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mza implements ncq {
    public final xpi a;
    public final ExecutorService b;
    public final MessageIdType c;
    public yga d = null;
    public final yyt e;

    public mza(xpi xpiVar, wfh wfhVar, ExecutorService executorService, MessageIdType messageIdType) {
        this.a = xpiVar;
        this.b = executorService;
        this.c = messageIdType;
        this.e = wfhVar.Y(new mlr(this, 5));
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.e.w(new kzq(ncpVar, 15), "DownloadingSupplier::Register", "DownloadingSupplier::Callback", "DownloadingSupplier::Unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        xpi xpiVar = this.a;
        return aktp.ai(new xfb(xpiVar, this.c, 6), xpiVar.c).h(new mme(8), this.b);
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
