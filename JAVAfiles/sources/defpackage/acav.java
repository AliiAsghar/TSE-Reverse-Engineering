package defpackage;

import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acav extends acbb {
    final /* synthetic */ InProductHelp a;
    final /* synthetic */ WeakReference e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acav(abrg abrgVar, InProductHelp inProductHelp, WeakReference weakReference) {
        super(abrgVar);
        this.a = inProductHelp;
        this.e = weakReference;
    }

    @Override // defpackage.acba
    protected final void l(IGoogleHelpService iGoogleHelpService) {
        GoogleHelp googleHelp = this.a.a;
        acbc.a(googleHelp);
        abmr abmrVar = googleHelp.P;
        abmr.m(new acau(this, this.a, iGoogleHelpService, this, this.e, abmrVar, 0), googleHelp);
    }
}
