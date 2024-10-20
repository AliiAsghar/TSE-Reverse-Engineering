package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acqg extends acqe {
    final /* synthetic */ acqi a;
    private long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqg(acqi acqiVar) {
        super(acqiVar);
        this.a = acqiVar;
    }

    @Override // defpackage.acqe
    protected final int a() {
        advr.o("Attempt to poll status for unknowns, IMS and non IMS contacts last tried over %ds ago.", Long.valueOf(this.c / 1000));
        return this.a.c.a(this.c);
    }

    @Override // defpackage.acqe
    protected final Cursor b() {
        return this.a.c.c(this.c);
    }

    @Override // defpackage.acqe
    protected final void c() {
        long j;
        super.c();
        acqi acqiVar = this.b;
        if (!acqiVar.i()) {
            j = 86400000;
        } else {
            j = acqiVar.f.a;
        }
        this.c = j;
    }
}
