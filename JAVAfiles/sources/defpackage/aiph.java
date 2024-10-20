package defpackage;

import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiph {
    private long f;
    private Optional d = Optional.empty();
    private Optional e = Optional.empty();
    private final UUID b = UUID.randomUUID();
    private final ArrayDeque c = new ArrayDeque();
    public final Set a = new HashSet();

    private final int d() {
        return this.c.size() - 1;
    }

    private final aipg e() {
        albo.U(!b(), "history is empty, have you called enterInitialState?");
        aipg aipgVar = (aipg) this.c.peekFirst();
        aipgVar.getClass();
        return aipgVar;
    }

    private final boolean f() {
        return this.d.isEmpty();
    }

    public final aipj a() {
        return e().a;
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final aipc c(aipg aipgVar) {
        boolean z = false;
        if (!b() && a().equals(aipgVar.a)) {
            z = true;
        }
        boolean z2 = z;
        if (b()) {
            this.f = aipgVar.b;
        }
        this.c.addFirst(aipgVar);
        this.a.add(aipgVar.a);
        if (f() && !aipgVar.c()) {
            this.d = Optional.of(aipgVar);
            this.e = Optional.of(Integer.valueOf(d()));
        }
        return new aipc(aipgVar, f(), this.d, this.e, d(), this.b, z2, (int) TimeUnit.NANOSECONDS.toMillis(e().b - this.f));
    }
}
