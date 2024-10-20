package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.internal.IFeedbackService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyj extends abyk {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyj(abrg abrgVar, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        super(abrgVar);
        this.a = feedbackOptions;
        this.e = bundle;
        this.f = j;
    }

    @Override // defpackage.abry
    protected final /* bridge */ /* synthetic */ void b(abqu abquVar) {
        abyr abyrVar = (abyr) abquVar;
        try {
            FeedbackOptions feedbackOptions = this.a;
            Bundle bundle = this.e;
            long j = this.f;
            abmr.q(bundle);
            abmr.r(feedbackOptions);
            ((IFeedbackService) abyrVar.w()).saveAsyncFeedbackPsbd(feedbackOptions, bundle, j);
            j(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            h(abyl.a);
        }
    }
}
