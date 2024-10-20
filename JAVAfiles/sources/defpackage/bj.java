package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bj extends bm {
    private final boolean b;
    private boolean c;
    private fdx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(du duVar, boolean z) {
        super(duVar);
        duVar.getClass();
        this.b = z;
    }

    public final fdx a(Context context) {
        boolean z;
        if (this.c) {
            return this.d;
        }
        du duVar = this.a;
        if (duVar.h == 2) {
            z = true;
        } else {
            z = false;
        }
        fdx aP = d.aP(context, duVar.a, z, this.b);
        this.d = aP;
        this.c = true;
        return aP;
    }
}
