package defpackage;

import defpackage.dli;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayq {
    public final dhv a;
    public final dje b;
    public final boolean c;
    public final int d = 1;
    public final dqv e;
    public final dli.a f;
    public final List g;
    private dic h;
    private drk i;

    public /* synthetic */ ayq(dhv dhvVar, dje djeVar, boolean z, dqv dqvVar, dli.a aVar, List list) {
        this.a = dhvVar;
        this.b = djeVar;
        this.c = z;
        this.e = dqvVar;
        this.f = aVar;
        this.g = list;
    }

    public final int a() {
        return ayr.a(b().a());
    }

    public final dic b() {
        dic dicVar = this.h;
        if (dicVar != null) {
            return dicVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final void c(drk drkVar) {
        dic dicVar = this.h;
        if (dicVar == null || drkVar != this.i || dicVar.c()) {
            this.i = drkVar;
            dicVar = new dic(this.a, djf.a(this.b, drkVar), this.g, this.e, this.f);
        }
        this.h = dicVar;
    }
}
