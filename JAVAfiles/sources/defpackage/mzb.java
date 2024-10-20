package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzb implements ncq {
    public final arwe a;
    public final ujg b;
    public final MessageId c;
    public yga d;
    public final yyt e;

    public mzb(arwe arweVar, ujg ujgVar, wfh wfhVar, MessageId messageId) {
        this.a = arweVar;
        this.b = ujgVar;
        this.c = messageId;
        this.e = wfhVar.Y(new mlr(this, 6));
    }

    @Override // defpackage.ncq
    public final yga a(ncp ncpVar) {
        return this.e.w(new kzq(ncpVar, 17), "RichCardFileTransferProgressSupplier:register", "RichCardFileTransferProgressSupplier:callback", "RichCardFileTransferProgressSupplier:unregister");
    }

    @Override // defpackage.ncq
    public final akul b() {
        akul c;
        c = qjh.c(this.a, arpj.a, arwf.a, new mwv(this, (arpe) null, 3));
        return c;
    }

    @Override // defpackage.ncq
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
