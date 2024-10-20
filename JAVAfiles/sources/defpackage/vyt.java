package defpackage;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyt {
    public static final alwo a = alwo.o("Bugle");
    public final armf b;
    private final aneo c;
    private final armf d;
    private final armf e;
    private final armf f;

    public vyt(aneo aneoVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.c = aneoVar;
        this.b = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
    }

    public final akul a(vys vysVar) {
        long longValue;
        int ordinal = vysVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                longValue = 0;
            } else {
                longValue = ((Long) this.f.b()).longValue();
            }
        } else {
            longValue = ((Long) this.e.b()).longValue();
        }
        if (longValue == 0) {
            return aktp.ag(null);
        }
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/rcs/messaging/LatencyInjector", "delayFuture", 58, "LatencyInjector.java")).C("Reverse sonic type: %s, duration: %d ms", vysVar, longValue);
        akul g = akul.g(this.c.schedule(new vcr(12), longValue, TimeUnit.MILLISECONDS));
        ((umz) this.d.b()).d(EnumSet.allOf(umy.class), g, new uea(this, 17));
        return g;
    }
}
