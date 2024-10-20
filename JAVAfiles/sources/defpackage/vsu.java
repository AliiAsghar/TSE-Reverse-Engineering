package defpackage;

import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsu {
    public static final xze a = xze.g("BugleRcs", "RcsEngineLifecycleManager");
    public final anen b;
    public final armf c;
    public final ylr d;
    private final armf e;
    private final BiFunction f;

    public vsu(armf armfVar, BiFunction biFunction, armf armfVar2, ylr ylrVar, anen anenVar) {
        this.b = anenVar;
        this.e = armfVar;
        this.f = biFunction;
        this.c = armfVar2;
        this.d = ylrVar;
    }

    public final akul a(boolean z, String str) {
        return ((ylg) this.e.b()).a(this.f, RcsEngineLifecycleService.class).i(new prn(this, z, str, 5), this.b).e(ajny.class, new vgd(this, 13), this.b).e(TimeoutException.class, new vip(15), this.b).e(IllegalArgumentException.class, new vip(16), this.b).e(SecurityException.class, new vip(17), this.b).e(ylp.class, new vip(18), this.b);
    }
}
