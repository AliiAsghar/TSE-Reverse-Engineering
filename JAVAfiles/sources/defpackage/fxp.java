package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxp implements fxr {
    private final esi a;
    private final /* synthetic */ int b;

    public fxp(esi esiVar, int i) {
        this.b = i;
        this.a = esiVar;
    }

    @Override // defpackage.fxr
    public final /* synthetic */ fxs a(Context context, eqd eqdVar, eqg eqgVar, esl eslVar, Executor executor, eyy eyyVar, List list) {
        if (this.b != 0) {
            return new eyk(context, this.a, eqdVar, eqgVar, eslVar, executor, list);
        }
        return new fxq(context, this.a, eqdVar, eslVar, eqgVar, executor, eyyVar, list);
    }
}
