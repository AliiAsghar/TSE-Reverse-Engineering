package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aquz {
    public final Status a;
    public final Object b;

    public aquz(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aquz aquzVar = (aquz) obj;
            if (d.B(this.a, aquzVar.a) && d.B(this.b, aquzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            algv aj = albo.aj(this);
            aj.b("config", this.b);
            return aj.toString();
        }
        algv aj2 = albo.aj(this);
        aj2.b("error", this.a);
        return aj2.toString();
    }

    public aquz(Status status) {
        this.b = null;
        this.a = status;
        albo.N(!status.f(), "cannot use OK status: %s", status);
    }
}
