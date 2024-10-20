package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxq extends eyt implements fxs {
    private final List f;
    private fxu g;

    public fxq(Context context, esi esiVar, eqd eqdVar, esl eslVar, eqg eqgVar, Executor executor, eyy eyyVar, List list) {
        super(context, esiVar, eqdVar, eslVar, eqgVar, executor, eyyVar, true);
        this.f = list;
    }

    @Override // defpackage.fxs
    public final fwt c(int i) {
        boolean z;
        if (this.g == null) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        b(i);
        fxu fxuVar = new fxu(a(i), this.f);
        this.g = fxuVar;
        return fxuVar;
    }
}
