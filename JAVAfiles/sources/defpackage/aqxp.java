package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqxp extends aqxt {
    public final boolean a;
    private Status h;
    private aqut i;

    public aqxp(aqxh aqxhVar, aqrm aqrmVar, int i, boolean z) {
        super(aqxhVar, aqrmVar, i);
        this.a = z;
    }

    @Override // defpackage.aqxt
    protected final void a(Status status) {
        ((aral) this.g).a(status, arak.PROCESSED, new aqut());
    }

    @Override // defpackage.aqxt
    protected final void b() {
        this.f.e();
        this.f.h();
        m(aqxr.CLOSED);
        ((aral) this.g).a(this.h, arak.PROCESSED, this.i);
        o();
    }

    @Override // defpackage.aqxt
    public final void c(int i, Parcel parcel) {
        aqut a = aqxx.a(parcel, this.c);
        this.f.d();
        ((aral) this.g).c(a);
    }

    @Override // defpackage.aqxt
    public final void d(int i, Parcel parcel) {
        this.h = aqas.j(i, parcel);
        this.i = aqxx.a(parcel, this.c);
    }

    @Override // defpackage.aqxt
    public final boolean e() {
        return this.a;
    }
}
