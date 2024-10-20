package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acau implements acao {
    final /* synthetic */ IGoogleHelpService a;
    final /* synthetic */ acbb b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ acbb f;
    private final /* synthetic */ int g;

    public acau(acat acatVar, IGoogleHelpService iGoogleHelpService, acbb acbbVar, WeakReference weakReference, Intent intent, abmr abmrVar, int i) {
        this.g = i;
        this.a = iGoogleHelpService;
        this.b = acbbVar;
        this.c = weakReference;
        this.e = intent;
        this.d = abmrVar;
        this.f = acatVar;
    }

    @Override // defpackage.acao
    public final void a(GoogleHelp googleHelp) {
        if (this.g != 0) {
            try {
                IGoogleHelpService iGoogleHelpService = this.a;
                acbb acbbVar = this.b;
                WeakReference weakReference = this.c;
                iGoogleHelpService.processGoogleHelpAndPip(googleHelp, null, new acaw((Intent) this.e, weakReference, acbbVar, (abmr) this.d));
                return;
            } catch (RemoteException e) {
                Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
                ((acat) this.f).h(acbc.a);
                return;
            }
        }
        Object obj = this.d;
        ((InProductHelp) obj).a = googleHelp;
        try {
            InProductHelp inProductHelp = (InProductHelp) obj;
            this.a.processInProductHelpAndPip(inProductHelp, null, new acax(this.c, this.b, (abmr) this.e));
        } catch (RemoteException e2) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e2);
            ((acav) this.f).h(acbc.a);
        }
    }

    public acau(acav acavVar, InProductHelp inProductHelp, IGoogleHelpService iGoogleHelpService, acbb acbbVar, WeakReference weakReference, abmr abmrVar, int i) {
        this.g = i;
        this.d = inProductHelp;
        this.a = iGoogleHelpService;
        this.b = acbbVar;
        this.c = weakReference;
        this.e = abmrVar;
        this.f = acavVar;
    }
}
