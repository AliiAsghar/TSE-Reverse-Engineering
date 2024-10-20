package defpackage;

import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anyk extends anzn {
    public final anyi e;
    public final ECPoint f;
    public final aocj g;
    public final Integer h;

    public anyk(anyi anyiVar, ECPoint eCPoint, aocj aocjVar, Integer num) {
        this.e = anyiVar;
        this.f = eCPoint;
        this.g = aocjVar;
        this.h = num;
    }

    @Override // defpackage.anzn
    public final aocj F() {
        return this.g;
    }

    @Override // defpackage.anme
    public final Integer a() {
        return this.h;
    }
}
