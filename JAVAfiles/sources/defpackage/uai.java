package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.appsettings.verifiedsms.VerifiedSmsSettingsActivity;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uai implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ uai(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [ksm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [armf, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                aktp.L(new ubb(), (View) this.a);
                return;
            case 1:
                ((lzf) this.a).c().d();
                return;
            case 2:
                aktp.L(new ubb(), (View) this.a);
                return;
            case 3:
                ContactIconView contactIconView = (ContactIconView) this.a;
                String str = contactIconView.m;
                if (str == null) {
                    contactIconView.k();
                    return;
                }
                zxy zxyVar = contactIconView.t;
                amho amhoVar = contactIconView.p;
                mho mhoVar = (mho) zxyVar.a.b();
                mhoVar.getClass();
                ?? r2 = zxyVar.d;
                ?? r3 = zxyVar.b;
                ?? r4 = zxyVar.c;
                Optional optional = (Optional) zxyVar.e.b();
                optional.getClass();
                amhoVar.getClass();
                contactIconView.o = new xuc(mhoVar, r2, r3, r4, optional, str, contactIconView, amhoVar);
                contactIconView.o.e(new Void[0]);
                return;
            case 4:
                xvn xvnVar = (xvn) this.a;
                xvnVar.h.d();
                xvnVar.j.e("Bugle.Message.Tap.Action.Fallback.Counts", xvnVar.a());
                qiu.h(((ncv) xvnVar.n.b()).b(xvnVar.b, amfd.MANUAL_RETRY_FORCES_FALLBACK));
                return;
            case 5:
                xvn xvnVar2 = (xvn) this.a;
                xvnVar2.j.e("Bugle.Message.Tap.Action.Delete.Counts", xvnVar2.a());
                if (xvnVar2.m.a()) {
                    xvnVar2.q.Z(xvnVar2.b, 5);
                } else {
                    xvnVar2.q.W(xvnVar2.b);
                }
                xvnVar2.h.d();
                return;
            case 6:
                xvn xvnVar3 = (xvn) this.a;
                xvnVar3.j.e("Bugle.Message.Tap.Action.DataSetting.Counts", xvnVar3.a());
                xvnVar3.h.fe().startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                xvnVar3.h.d();
                return;
            case 7:
                MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl();
                xvn xvnVar4 = (xvn) this.a;
                xvnVar4.i.a(xvnVar4.b, messageUsageStatisticsDataImpl);
                xvnVar4.h.d();
                return;
            case 8:
                this.a.run();
                return;
            case 9:
                ((zgn) this.a).c();
                return;
            case 10:
                yhx.c(((zgn) this.a).e);
                return;
            case 11:
                zkv zkvVar = (zkv) this.a;
                ((wyp) zkvVar.Q.b()).m(amlw.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_LEARN_MORE_CLICKED);
                ksm ksmVar = (ksm) zkvVar.t.b();
                cj fe = zkvVar.q.fe();
                fe.getClass();
                ksmVar.i(fe);
                return;
            case 12:
                zky zkyVar = (zky) this.a;
                ((ksm) zkyVar.r.b()).i((Activity) zkyVar.q.b());
                return;
            case 13:
                zky zkyVar2 = (zky) this.a;
                ((ksm) zkyVar2.r.b()).f((Context) zkyVar2.q.b(), (String) aczv.s().a.ay.a());
                ((wpp) zkyVar2.u.b()).z(adom.n(zkyVar2.b).a, 3);
                return;
            case 14:
                zky zkyVar3 = (zky) this.a;
                if (!zkyVar3.w.g()) {
                    zkyVar3.w.f();
                    return;
                } else {
                    zkyVar3.w.d();
                    return;
                }
            case 15:
                String str2 = (String) utw.y.e();
                zlc zlcVar = (zlc) this.a;
                ((lzv) zlcVar.b).y((Context) zlcVar.c, str2);
                return;
            case 16:
                String str3 = (String) zml.b.e();
                String str4 = (String) zml.a.e();
                if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                    return;
                }
                Object obj = this.a;
                if (ymd.a()) {
                    ((zml) obj).f.ay(2, 3);
                }
                if (!TextUtils.isEmpty(str3)) {
                    zml zmlVar = (zml) obj;
                    zmlVar.e.e(zmlVar.c, str3);
                    return;
                } else {
                    zml zmlVar2 = (zml) obj;
                    zmlVar2.d.y(zmlVar2.c, str4);
                    return;
                }
            case 17:
                ((VerifiedSmsSettingsActivity) ((zof) this.a).a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) ytk.f.e())));
                return;
            case 18:
                String str5 = (String) utw.T.e();
                zof zofVar = (zof) this.a;
                zofVar.b.e((Context) zofVar.a, str5);
                return;
            case 19:
                zop zopVar = (zop) this.a;
                if (!zopVar.B.g()) {
                    zopVar.B.f();
                    return;
                }
                return;
            default:
                VCardAttachmentView vCardAttachmentView = (VCardAttachmentView) this.a;
                if (vCardAttachmentView.i != null && vCardAttachmentView.e.g()) {
                    vCardAttachmentView.i.c((rtu) vCardAttachmentView.e.a());
                    return;
                }
                return;
        }
    }
}
