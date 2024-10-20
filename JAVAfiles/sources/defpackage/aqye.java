package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqye extends aqyf {
    public aqut a;
    public Status b;
    public aqut c;

    public aqye(aqxh aqxhVar, int i, arhn arhnVar) {
        super(aqxhVar, i, arhnVar);
    }

    @Override // defpackage.aqyf
    protected final int a(Parcel parcel) {
        aqxx.b(parcel, this.a);
        return 0;
    }

    @Override // defpackage.aqyf
    protected final int b(Parcel parcel) {
        int i = aqas.i(parcel, this.b);
        aqxx.b(parcel, this.c);
        this.d.v(this.e);
        return i;
    }
}
