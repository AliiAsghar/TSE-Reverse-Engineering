package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjq implements atjp {
    private static final Set a = Collections.singleton("UTC");

    @Override // defpackage.atjp
    public final Set a() {
        return a;
    }

    @Override // defpackage.atjp
    public final atgc b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return atgc.a;
        }
        return null;
    }
}
