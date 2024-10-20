package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class trj {
    public final armf a;
    public maq b;
    public abnr c;
    public abnr d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final Context f;
    public final armf g;

    public trj(Context context, armf armfVar, armf armfVar2) {
        this.f = context;
        this.g = armfVar;
        this.a = armfVar2;
    }

    public final boolean a() {
        return this.e.get();
    }
}
