package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uni {
    private static final xze d = xze.g("BugleWorkQueue", "ExecutionState");
    public String a;
    public Future c;
    private final long e;
    public final SettableFuture b = SettableFuture.create();
    private unh f = unh.PENDING;

    public uni(long j) {
        this.e = j;
    }

    public final void a() {
        Future future = this.c;
        if (future != null) {
            future.cancel(true);
        }
    }

    public final void b() {
        this.b.set(upm.d());
    }

    public final void c(unh unhVar) {
        xyo d2 = d.d();
        d2.H("setting execution state");
        d2.y("rowId", this.e);
        d2.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        d2.z("fromState", this.f);
        d2.z("toState", unhVar);
        d2.q();
        if (this.f == unhVar) {
            return;
        }
        int ordinal = unhVar.ordinal();
        if (ordinal != 0 && (ordinal == 1 ? this.f == unh.UNKNOWN : !(ordinal == 2 ? this.f != unh.PENDING : ordinal == 3 ? this.f != unh.SUBMITTED : ordinal == 4 && this.f != unh.EXECUTING))) {
            this.f = unhVar;
            return;
        }
        throw new IllegalStateException("illegal state transition from " + String.valueOf(this.f) + " to " + String.valueOf(unhVar) + " for id " + this.e);
    }

    public final boolean d(unh unhVar) {
        if (this.f == unhVar) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "{" + this.a + "; " + String.valueOf(this.f) + "}";
    }
}
