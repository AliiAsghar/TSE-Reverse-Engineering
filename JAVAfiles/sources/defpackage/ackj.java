package defpackage;

import android.os.Looper;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackj implements abqy {
    public static final ackj a = new ackj(new adjw());
    private final Looper b;

    public ackj(adjw adjwVar) {
        this.b = (Looper) adjwVar.a;
    }

    public final abrb a() {
        Looper looper = this.b;
        if (looper != null) {
            adxq adxqVar = new adxq();
            adxqVar.a = looper;
            return adxqVar.j();
        }
        return abrb.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof ackj;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass()});
    }
}
