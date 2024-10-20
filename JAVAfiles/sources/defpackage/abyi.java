package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.internal.IFeedbackService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyi extends abyk {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyi(abrg abrgVar, Bundle bundle, long j) {
        super(abrgVar);
        this.a = bundle;
        this.e = j;
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        abyr abyrVar = (abyr) abquVar;
        try {
            Bundle bundle = this.a;
            long j = this.e;
            abmr.q(bundle);
            ((IFeedbackService) abyrVar.w()).saveAsyncFeedbackPsd(bundle, j);
            j(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            h(abyl.a);
        }
    }
}
