package defpackage;

import j$.time.Instant;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class thi extends agps {
    public thi() {
        super("remote_registrations_table");
    }

    @Override // defpackage.agps
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agpr a() {
        ac();
        String str = this.c;
        agpt agptVar = this.e;
        return new agpr(str, this.a, this.b, this.d.g(), agptVar.a());
    }

    public final void c(Instant instant) {
        if (instant == null) {
            this.a.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            this.a.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(uzz.k(instant)));
        }
    }

    public final void d(boolean z) {
        this.a.put("etouffee", Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        Integer valueOf;
        Integer valueOf2;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 46000) {
            agnc.t("better_etouffee", intValue2);
        }
        if (intValue >= 46000) {
            this.a.put("better_etouffee", Boolean.valueOf(z));
        }
    }

    public final void f(Instant instant) {
        if (instant == null) {
            this.a.putNull("last_modified_timestamp");
        } else {
            this.a.put("last_modified_timestamp", Long.valueOf(uzz.k(instant)));
        }
    }

    public final void g(thj thjVar) {
        Z(new agpw(thjVar));
    }

    public final void h(Function function) {
        Object apply;
        apply = function.apply(new thj());
        Z(new agpw((thj) apply));
    }
}
