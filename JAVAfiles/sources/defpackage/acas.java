package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acas extends acbb {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle e;
    final /* synthetic */ long f;
    final /* synthetic */ GoogleHelp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acas(abrg abrgVar, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(abrgVar);
        this.a = feedbackOptions;
        this.e = bundle;
        this.f = j;
        this.g = googleHelp;
    }

    @Override // defpackage.acba
    protected final void l(IGoogleHelpService iGoogleHelpService) {
        try {
            iGoogleHelpService.saveAsyncFeedbackPsbd(this.a, this.e, this.f, this.g, new acar(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            h(acbc.a);
        }
    }
}
