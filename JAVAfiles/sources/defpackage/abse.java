package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abse {
    final /* synthetic */ BasePendingResult a;

    public abse(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.i(this.a.c);
        super.finalize();
    }
}
