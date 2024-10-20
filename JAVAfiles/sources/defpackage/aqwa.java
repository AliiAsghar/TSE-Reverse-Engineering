package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqwa {
    private final Status a;
    private final Object b;

    public aqwa(Status status, Object obj) {
        this.a = status;
        this.b = obj;
    }

    public static aqwa b(Status status) {
        status.getClass();
        aqwa aqwaVar = new aqwa(status, null);
        albo.N(!status.f(), "cannot use OK status: %s", status);
        return aqwaVar;
    }

    public final Status a() {
        Status status = this.a;
        if (status == null) {
            return Status.b;
        }
        return status;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqwa) {
            aqwa aqwaVar = (aqwa) obj;
            if (d() == aqwaVar.d()) {
                if (d()) {
                    return d.B(this.b, aqwaVar.b);
                }
                return d.B(this.a, aqwaVar.a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        Status status = this.a;
        if (status == null) {
            aj.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, this.b);
        } else {
            aj.b("error", status);
        }
        return aj.toString();
    }
}
