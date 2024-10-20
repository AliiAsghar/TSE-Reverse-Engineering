package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class absg implements abrh {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ znp b;

    public absg(znp znpVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        this.b = znpVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.abrh
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
