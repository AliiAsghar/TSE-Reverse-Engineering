package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knr extends knj {
    private final Context g;
    private final yjy h;

    public knr(kni kniVar, Context context, yjy yjyVar) {
        super(kniVar, "SIM Card Present");
        this.g = context;
        this.h = yjyVar;
    }

    @Override // defpackage.knj
    public final knk a() {
        if (this.h.q()) {
            return knk.a;
        }
        return new knk(5, Collections.singletonList(this.g.getString(R.string.insert_sim_suggestion)));
    }
}
