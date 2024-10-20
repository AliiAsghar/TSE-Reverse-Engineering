package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dge extends arrp implements arqr<Throwable, arnb> {
    final /* synthetic */ CancellationSignal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dge(CancellationSignal cancellationSignal) {
        super(1);
        this.a = cancellationSignal;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (((Throwable) obj) != null) {
            this.a.cancel();
        }
        return arnb.a;
    }
}
