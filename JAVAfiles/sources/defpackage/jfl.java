package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfl implements jcu {
    public final jfj a;
    public final armf b;
    public final asai c;
    private final Set d;

    public jfl(Context context, jfj jfjVar, asai asaiVar, armf armfVar) {
        context.getClass();
        asaiVar.getClass();
        armfVar.getClass();
        this.a = jfjVar;
        this.b = armfVar;
        this.c = new jdn(asaiVar, context, this, 2);
        this.d = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.c;
    }
}
