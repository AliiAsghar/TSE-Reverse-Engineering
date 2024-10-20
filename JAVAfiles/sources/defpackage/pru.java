package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class pru {
    public static final xze a = xze.g("Bugle", "RbmBusinessInfoUrlHelper");
    public final CronetEngine b;
    public final anen c;
    public final yjr d;
    public final Context e;
    public final armf f;
    private final aplg g;
    private final aplg h;

    public pru(CronetEngine cronetEngine, anen anenVar, yjr yjrVar, Context context, armf armfVar, aplg aplgVar, aplg aplgVar2) {
        this.b = cronetEngine;
        this.c = anenVar;
        this.d = yjrVar;
        this.e = context;
        this.f = armfVar;
        this.g = aplgVar;
        this.h = aplgVar2;
    }

    public static pra a(String str) {
        return new pra((String) new amcx(amdc.a()).b(str).orElse(str), new amcy(amdc.a()).b(str));
    }

    public final boolean b(String str) {
        if (!this.g.b.contains(str) && !this.h.b.contains(str)) {
            return false;
        }
        return true;
    }
}
