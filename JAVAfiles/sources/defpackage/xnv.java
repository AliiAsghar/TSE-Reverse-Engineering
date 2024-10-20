package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnv implements aegu {
    private final aegu a;

    public xnv(aegu aeguVar) {
        this.a = aeguVar;
    }

    @Override // defpackage.aegu
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.aegu
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.aegu
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.aegu
    public final Duration d() {
        return this.a.d();
    }

    @Override // defpackage.aegu
    public final Duration e() {
        return this.a.e();
    }

    @Override // defpackage.aegu
    public final Instant f() {
        return this.a.f();
    }

    public final LocalDateTime g() {
        return f().atZone(ZoneId.systemDefault()).L();
    }
}
