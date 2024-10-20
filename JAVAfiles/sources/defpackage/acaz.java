package defpackage;

import android.util.Log;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acaz extends acbb {
    final /* synthetic */ WeakReference a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acaz(abrg abrgVar, WeakReference weakReference) {
        super(abrgVar);
        this.a = weakReference;
    }

    @Override // defpackage.acba
    protected final void l(IGoogleHelpService iGoogleHelpService) {
        try {
            iGoogleHelpService.processTogglingPip(null, new acay(this, this.a));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Toggling to help failed!", e);
            h(acbc.a);
        }
    }
}
