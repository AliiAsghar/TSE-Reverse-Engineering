package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqtt {
    public static final aqtt a = new aqtt(null, Status.b, false);
    public final aqtw b;
    public final Status c;
    public final boolean d;
    private final apsd e = null;

    public aqtt(aqtw aqtwVar, Status status, boolean z) {
        this.b = aqtwVar;
        status.getClass();
        this.c = status;
        this.d = z;
    }

    public static aqtt a(Status status) {
        d.t(!status.f(), "error status shouldn't be OK");
        return new aqtt(null, status, false);
    }

    public static aqtt b(aqtw aqtwVar) {
        return new aqtt(aqtwVar, Status.b, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqtt)) {
            return false;
        }
        aqtt aqttVar = (aqtt) obj;
        if (d.B(this.b, aqttVar.b) && d.B(this.c, aqttVar.c)) {
            apsd apsdVar = aqttVar.e;
            if (d.B(null, null) && this.d == aqttVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("subchannel", this.b);
        aj.b("streamTracerFactory", null);
        aj.b("status", this.c);
        aj.h("drop", this.d);
        return aj.toString();
    }
}
