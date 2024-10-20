package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqxq extends aqxt {
    private final aqxg a;

    public aqxq(aqxg aqxgVar, aqrm aqrmVar, int i) {
        super(aqxgVar, aqrmVar, i);
        this.a = aqxgVar;
    }

    @Override // defpackage.aqxt
    protected final void a(Status status) {
        ((arhe) this.g).a(status);
    }

    @Override // defpackage.aqxt
    protected final void b() {
        ((arhe) this.g).b();
    }

    @Override // defpackage.aqxt
    public final void c(int i, Parcel parcel) {
        arhn arhnVar;
        arhd aqxzVar;
        aqrm aqrmVar = this.c;
        String readString = parcel.readString();
        aqut a = aqxx.a(parcel, aqrmVar);
        arhn arhnVar2 = arhn.a;
        List list = this.a.a;
        if (list.isEmpty()) {
            arhnVar = arhn.a;
        } else {
            int size = list.size();
            aqae[] aqaeVarArr = new aqae[size];
            for (int i2 = 0; i2 < size; i2++) {
                aqaeVarArr[i2] = ((aqvv) list.get(i2)).a();
            }
            arhnVar = new arhn(aqaeVarArr);
        }
        aqye aqyeVar = new aqye(this.a, this.d, arhnVar);
        if ((i & 16) != 0) {
            aqxzVar = new aqyq(this, aqyeVar, this.c);
        } else {
            aqxzVar = new aqxz(this, aqyeVar, this.c);
        }
        Status b = this.a.b(aqxzVar, readString, a);
        if (b.f()) {
            ((arhe) this.g).getClass();
            if (this.b.w()) {
                ((arhe) this.g).e();
                return;
            }
            return;
        }
        h(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (!p()) {
            m(aqxr.CLOSED);
            this.f.h();
            ((arhe) this.g).a(Status.b);
        }
    }

    @Override // defpackage.aqxt
    public final void d(int i, Parcel parcel) {
    }
}
