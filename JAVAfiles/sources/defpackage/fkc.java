package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkc implements eru {
    private final esi a;

    public fkc(esi esiVar) {
        this.a = esiVar;
    }

    @Override // defpackage.eru
    public final eyt a(Context context, eqd eqdVar, eqg eqgVar, esl eslVar, Executor executor, List list) {
        try {
            return ((eru) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(esi.class).newInstance(this.a)).a(context, eqdVar, eqgVar, eslVar, executor, list);
        } catch (Exception e) {
            throw esh.a(e);
        }
    }
}
