package defpackage;

import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsz {
    public static final xze a = xze.g("BugleRcs", "RcsEngineLifecycleManagerV2");
    public final ylr b;
    public final anen c;
    public final armf d;
    private final armf e;
    private final BiFunction f;

    public vsz(armf armfVar, BiFunction biFunction, armf armfVar2, ylr ylrVar, anen anenVar) {
        this.b = ylrVar;
        this.c = anenVar;
        this.e = armfVar;
        this.f = biFunction;
        this.d = armfVar2;
    }

    public final akul a(vsy vsyVar, boolean z) {
        return ((ylg) this.e.b()).a(this.f, RcsEngineLifecycleServiceV2.class).i(new prn(this, z, vsyVar, 6), this.c).e(ajny.class, new vgd(this, 14), this.c).e(TimeoutException.class, new vsw(2), this.c).e(IllegalArgumentException.class, new vip(19), this.c).e(IllegalStateException.class, new vip(20), this.c).e(SecurityException.class, new vsw(1), this.c).e(ylp.class, new vsw(0), this.c);
    }

    public final akul b(apli apliVar, int i) {
        aozy createBuilder = aplh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aplh aplhVar = (aplh) apagVar;
        aplhVar.b |= 1;
        aplhVar.c = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aplh aplhVar2 = (aplh) createBuilder.b;
        aplhVar2.d = apliVar.d;
        aplhVar2.b |= 2;
        return a(new vsx((aplh) createBuilder.s(), 1), true);
    }

    public final akul c(apli apliVar, List list) {
        aozy createBuilder = aplj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplj apljVar = (aplj) createBuilder.b;
        apao apaoVar = apljVar.c;
        if (!apaoVar.c()) {
            apljVar.c = apag.mutableCopy(apaoVar);
        }
        aoyj.addAll(list, apljVar.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aplj apljVar2 = (aplj) createBuilder.b;
        apljVar2.d = apliVar.d;
        apljVar2.b |= 1;
        return a(new vsx((aplj) createBuilder.s(), 0), false);
    }
}
