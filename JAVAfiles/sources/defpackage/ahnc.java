package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahnc implements ahmw {
    public final aneo a;
    public final apwt b;

    public ahnc(ahmv ahmvVar, Context context, aneo aneoVar, apwt apwtVar, armf armfVar, armf armfVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ahmvVar.a(aneoVar, apwtVar, armfVar);
        this.a = aneoVar;
        this.b = apwtVar;
        albo.D(new ylq(this, context, 13, null));
        albo.D(new agud(armfVar2, 13));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.ahmw
    public final void as() {
        albo.bL(new agqd(this, 17), this.a);
    }
}
