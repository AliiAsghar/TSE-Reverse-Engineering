package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vnb extends vju {
    private final Context a;

    public vnb(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.vju
    public final /* synthetic */ akul b(Object obj) {
        vnc vncVar = (vnc) obj;
        vncVar.getClass();
        aiwl a = vjv.a();
        a.n(true);
        Context context = this.a;
        vlg a2 = vli.a();
        a2.d(context.getString(R.string.share_pdu_notification_title));
        a2.b = Optional.of(this.a.getString(R.string.share_pdu_share_prompt));
        a2.a = IconCompat.g(this.a, R.drawable.notification_icon);
        a2.c(this.a.getColor(R.color.primary_brand_icon_color));
        a.d = a2.a();
        fcp fcpVar = new fcp(this.a, (byte[]) null);
        fcpVar.g(this.a.getString(R.string.share_pdu_share_text));
        fcpVar.h("application/text");
        fcpVar.f(uti.d(this.a, vncVar.c));
        this.a.getString(R.string.share_pdu_share_prompt);
        Intent e = fcpVar.e();
        e.getClass();
        e.setFlags(268435457);
        a.f = vlb.a(e, false, Optional.empty(), Optional.empty());
        akul ag = aktp.ag(a.m());
        ag.getClass();
        return ag;
    }

    @Override // defpackage.vkh
    public final vlf c() {
        return new vna(0);
    }

    @Override // defpackage.vkh
    public final vlm d() {
        return vlm.NT_SHARE_PDU;
    }

    @Override // defpackage.vkh
    public final akul e() {
        akul ag = aktp.ag(true);
        ag.getClass();
        return ag;
    }

    @Override // defpackage.vkh
    public final String g() {
        return "err";
    }
}
