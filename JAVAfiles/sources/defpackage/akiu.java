package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akiu implements akin {
    private final Map a;
    private final String b;
    private final adef c;
    private final adef d;

    public akiu(adef adefVar, adef adefVar2, Map map, String str) {
        adefVar.getClass();
        this.c = adefVar;
        this.d = adefVar2;
        this.a = map;
        this.b = str;
    }

    private final ListenableFuture c(ahtt ahttVar) {
        return this.c.f(this.b, ahttVar);
    }

    private final void d(aozb aozbVar) {
        if (aozbVar != null) {
            adef adefVar = this.d;
            Set set = (Set) this.a.get(ahsy.b(this.b));
            if (set == null) {
                set = arnx.a;
            }
            adefVar.k(aozbVar, set, "", this.b, false, true);
        }
    }

    @Override // defpackage.akin
    public final ListenableFuture a(String str, aozb aozbVar, ahtt ahttVar) {
        if (d.F(str, "")) {
            d(aozbVar);
            return c(ahttVar);
        }
        throw new IllegalStateException("DEVICE tier packages may only commit with LOGGED_OUT_USER");
    }

    @Override // defpackage.akin
    public final ListenableFuture b(aozb aozbVar, ahtt ahttVar) {
        d(aozbVar);
        return c(ahttVar);
    }
}
