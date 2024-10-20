package defpackage;

import android.view.View;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xvm implements View.OnClickListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xvm(Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c != 0) {
            cg e = ((DataDonationActivity) ((kls) this.b).a.b()).a().e("dd_fragment_tag");
            if (e != null) {
                aktp.K(new klk(this.a), e);
                return;
            }
            return;
        }
        xvn xvnVar = (xvn) this.b;
        xvnVar.j.e("Bugle.Message.Tap.Action.Resend.Counts", xvnVar.a());
        if (this.a) {
            xvnVar.i.a(xvnVar.b, new MessageUsageStatisticsDataImpl());
        } else {
            tyk tykVar = (tyk) xvnVar.k.b();
            aktp.ah(new ryv(tykVar, xvnVar.b, 7, null), tykVar.b).k(qiu.b(), andi.a);
        }
        xvnVar.h.d();
    }
}
