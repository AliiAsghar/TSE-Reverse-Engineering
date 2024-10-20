package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acaq extends acbb {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long e;
    final /* synthetic */ GoogleHelp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acaq(abrg abrgVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(abrgVar);
        this.a = bundle;
        this.e = j;
        this.f = googleHelp;
    }

    @Override // defpackage.acba
    protected final void l(IGoogleHelpService iGoogleHelpService) {
        try {
            iGoogleHelpService.saveAsyncFeedbackPsd(this.a, this.e, this.f, new acap(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            h(acbc.a);
        }
    }
}
