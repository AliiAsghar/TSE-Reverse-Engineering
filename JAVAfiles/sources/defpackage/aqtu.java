package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqtu {
    public final aqrr a;
    public final aqut b;
    public final aqux c;
    private final aqts d;

    public aqtu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aqtu aqtuVar = (aqtu) obj;
            if (d.B(this.a, aqtuVar.a) && d.B(this.b, aqtuVar.b) && d.B(this.c, aqtuVar.c) && d.B(this.d, aqtuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        aqrr aqrrVar = this.a;
        aqut aqutVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + aqutVar.toString() + " callOptions=" + aqrrVar.toString() + "]";
    }

    public aqtu(aqux aquxVar, aqut aqutVar, aqrr aqrrVar, aqts aqtsVar) {
        aquxVar.getClass();
        this.c = aquxVar;
        aqutVar.getClass();
        this.b = aqutVar;
        aqrrVar.getClass();
        this.a = aqrrVar;
        aqtsVar.getClass();
        this.d = aqtsVar;
    }
}
