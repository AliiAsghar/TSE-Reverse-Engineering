package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdg implements jcu {
    public final Context a;
    public final asai b;
    public final Set c = aqjn.e(khe.a);
    public final int d;
    public final ico e;
    private final asai f;
    private final asai g;

    public jdg(Context context, asai asaiVar, asai asaiVar2, ico icoVar, int i) {
        this.a = context;
        this.f = asaiVar;
        this.g = asaiVar2;
        this.e = icoVar;
        this.d = i;
        this.b = new jdn(asaiVar2, asaiVar, new igb(this, (arpe) null, 3), 17, null);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.b;
    }
}
