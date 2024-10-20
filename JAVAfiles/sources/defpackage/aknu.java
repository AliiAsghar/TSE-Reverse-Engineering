package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknu {
    private long a;
    private final long b = TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES);
    private final List c = new ArrayList();

    public final aknv a() {
        boolean z;
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "You must specify a minimum sync interval for all syncs.");
        alok alokVar = new alok();
        for (aknx aknxVar : this.c) {
            alokVar.h(aknxVar.a, aknxVar);
        }
        return new aknv(this.a, this.b, alokVar.b());
    }

    public final void b(aknx aknxVar) {
        this.c.add(aknxVar);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.a = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
