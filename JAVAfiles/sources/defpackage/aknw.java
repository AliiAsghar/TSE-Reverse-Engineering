package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknw {
    public long a;
    public Object b;

    public aknw() {
        this.a = -1L;
    }

    public final aknx a() {
        return new aknx((akny) this.b, this.a);
    }

    public final void b(long j, TimeUnit timeUnit) {
        d.s(true);
        this.a = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }

    public aknw(byte[] bArr) {
    }
}
