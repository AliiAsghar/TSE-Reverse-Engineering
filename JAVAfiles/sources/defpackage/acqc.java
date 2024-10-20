package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acqc extends acqe {
    final /* synthetic */ acqi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqc(acqi acqiVar) {
        super(acqiVar);
        this.a = acqiVar;
    }

    @Override // defpackage.acqe
    protected final int a() {
        advr.o("Attempt to execute discovery for untried entries", new Object[0]);
        return this.a.c.b();
    }

    @Override // defpackage.acqe
    protected final Cursor b() {
        return this.a.c.d();
    }
}
