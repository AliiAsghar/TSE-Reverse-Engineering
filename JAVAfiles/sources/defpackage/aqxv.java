package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxv extends Binder {
    private static final Logger b = Logger.getLogger(aqxv.class.getName());
    public aqxu a;

    public aqxv(aqxu aqxuVar) {
        this.a = aqxuVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        aqxu aqxuVar = this.a;
        if (aqxuVar != null) {
            try {
                if ((i2 & 1) == 0) {
                    b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.bV(i2, "ignoring non-oneway transaction. flags="));
                    return false;
                }
                return aqxuVar.a(i, parcel);
            } catch (RuntimeException e) {
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.bV(i, "failure sending transaction "), (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        if (this.a != null) {
            return true;
        }
        return false;
    }
}
