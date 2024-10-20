package defpackage;

import android.os.DeadObjectException;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlm {
    public static final qod a(qll qllVar) {
        qllVar.getClass();
        aozy createBuilder = qod.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((qod) createBuilder.b).b = qllVar.a;
        long epochMilli = qllVar.b.toEpochMilli();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((qod) createBuilder.b).c = epochMilli;
        apag s = createBuilder.s();
        s.getClass();
        return (qod) s;
    }

    public static final Instant b(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Instant instant = ((qll) it.next()).b;
                while (it.hasNext()) {
                    Instant instant2 = ((qll) it.next()).b;
                    if (instant.compareTo(instant2) > 0) {
                        instant = instant2;
                    }
                }
                return instant;
            }
            throw new NoSuchElementException();
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final boolean c(Exception exc) {
        if (!r(exc)) {
            Throwable cause = exc.getCause();
            if (cause == null || !r(cause)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final void d(mbl mblVar, int i) {
        mblVar.e("Bugle.Contacts.Sync.Import.Status.Count", i);
    }

    public static final void e(mbl mblVar, int i) {
        mblVar.e("Bugle.Contacts.Sync.Incremental.Status.Count", i);
    }

    public static final void f(mbl mblVar, int i) {
        mblVar.e("Bugle.Recipient.Sync.Status.Count", i);
    }

    public static /* synthetic */ String g(int i) {
        if (i != 1) {
            if (i != 2) {
                return "null";
            }
            return "TELEPHONY";
        }
        return "UNKNOWN";
    }

    public static final /* synthetic */ qgj h(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (qgj) s;
    }

    public static final void i(String str, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qgj qgjVar = (qgj) aozyVar.b;
        qgj qgjVar2 = qgj.a;
        qgjVar.b |= 1;
        qgjVar.e = str;
    }

    public static final void j(qgn qgnVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qgj qgjVar = (qgj) aozyVar.b;
        qgj qgjVar2 = qgj.a;
        qgjVar.d = qgnVar;
        qgjVar.c = 13;
    }

    public static final void k(qgr qgrVar, aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qgj qgjVar = (qgj) aozyVar.b;
        qgj qgjVar2 = qgj.a;
        qgjVar.g = qgrVar;
        qgjVar.b |= 4;
    }

    public static final /* synthetic */ qft l(aozy aozyVar) {
        apag s = aozyVar.s();
        s.getClass();
        return (qft) s;
    }

    public static final void m(qfr qfrVar, aozy aozyVar) {
        qfrVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qft qftVar = (qft) aozyVar.b;
        qft qftVar2 = qft.a;
        qftVar.d = qfrVar.e;
        qftVar.b |= 2;
    }

    public static final void n(qfs qfsVar, aozy aozyVar) {
        qfsVar.getClass();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qft qftVar = (qft) aozyVar.b;
        qft qftVar2 = qft.a;
        qftVar.c = qfsVar.d;
        qftVar.b |= 1;
    }

    public static final void o(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        qft qftVar = (qft) aozyVar.b;
        qft qftVar2 = qft.a;
        qftVar.b |= 4;
        qftVar.e = false;
    }

    public static upm p(pwh pwhVar) {
        int ordinal = pwhVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return upm.d();
            }
            return upm.e();
        }
        return upm.b();
    }

    public static boolean q() {
        return anfi.a("bugle.store_message_persistence_id_in_telephony_for_rcs", "bugle");
    }

    private static final boolean r(Throwable th) {
        if (!(th instanceof DeadObjectException) && !(th instanceof akcj) && !(th instanceof akch)) {
            return false;
        }
        return true;
    }
}
