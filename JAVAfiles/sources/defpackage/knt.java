package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knt implements knm {
    public final Context a;
    public final armf b;
    public final knz c;
    public final jxv d;

    public knt(Context context, jxv jxvVar, armf armfVar, knz knzVar) {
        this.a = context;
        this.d = jxvVar;
        this.b = armfVar;
        this.c = knzVar;
    }

    @Override // defpackage.knm
    public final boolean a() {
        throw null;
    }

    public final void b(Optional optional) {
        optional.ifPresent(new ixj(this, 16));
    }
}
