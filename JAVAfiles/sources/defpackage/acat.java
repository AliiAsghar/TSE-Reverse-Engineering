package defpackage;

import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acat extends acbb {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acat(abrg abrgVar, Intent intent, WeakReference weakReference) {
        super(abrgVar);
        this.a = intent;
        this.e = weakReference;
    }

    @Override // defpackage.acba
    protected final void l(IGoogleHelpService iGoogleHelpService) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        acbc.a(googleHelp);
        abmr.m(new acau(this, iGoogleHelpService, this, this.e, this.a, googleHelp.P, 1), googleHelp);
    }
}
