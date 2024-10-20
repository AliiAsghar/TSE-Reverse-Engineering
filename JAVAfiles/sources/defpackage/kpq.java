package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpq extends xcf {
    public static final xze a = xze.g("BugleNetwork", "FirebaseRegistrationStartupTask");
    public static final AtomicBoolean b = new AtomicBoolean();
    public final Context c;
    final anen d;
    public final armf e;

    public kpq(Context context, armf armfVar, anen anenVar, armf armfVar2) {
        this.c = context;
        armfVar.getClass();
        this.d = anenVar;
        this.e = armfVar2;
    }

    @Override // defpackage.xny
    public final akrh a() {
        return aktp.e("FirebaseRegistrationStartupTask");
    }

    @Override // defpackage.xcf
    public final akul b() {
        return aktp.ah(new ivl(this, 20), this.d);
    }

    @Override // defpackage.xck
    public final boolean fI() {
        return true;
    }
}
