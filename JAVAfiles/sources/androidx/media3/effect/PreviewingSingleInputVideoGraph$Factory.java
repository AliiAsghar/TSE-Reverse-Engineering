package androidx.media3.effect;

import android.content.Context;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import defpackage.eqd;
import defpackage.eqg;
import defpackage.eru;
import defpackage.esi;
import defpackage.esl;
import defpackage.eyt;
import defpackage.eyy;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreviewingSingleInputVideoGraph$Factory implements eru {
    private final esi a;

    public PreviewingSingleInputVideoGraph$Factory(esi esiVar) {
        this.a = esiVar;
    }

    @Override // defpackage.eru
    public final eyt a(Context context, eqd eqdVar, eqg eqgVar, esl eslVar, Executor executor, List list) {
        return new eyt(context, this.a, eqdVar, eslVar, eqgVar, executor, eyy.a, false);
    }

    public PreviewingSingleInputVideoGraph$Factory() {
        this(new DefaultVideoFrameProcessor$Factory.Builder().build());
    }
}
