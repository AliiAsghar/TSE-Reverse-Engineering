package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykv extends yku {
    private final int b;
    private final ykt c;
    private final yjy d;
    private final xbf e;
    private final zxy f;

    public ykv(Context context, ykt yktVar, yjy yjyVar, xbf xbfVar, int i, zxy zxyVar) {
        super(context);
        this.c = yktVar;
        this.d = yjyVar;
        this.e = xbfVar;
        this.b = i;
        this.f = zxyVar;
    }

    private final void t(ykw ykwVar, String str, int i, boolean z, ykw ykwVar2) {
        Resources resources = this.a.getResources();
        boolean q = ykwVar.q(str, z);
        if (q != z) {
            ykwVar2.h(resources.getString(i), q);
        }
    }

    private final void u(ykw ykwVar, String str, int i, String str2, ykw ykwVar2) {
        Resources resources = this.a.getResources();
        String f = ykwVar.f(str, str2);
        if (!TextUtils.equals(f, str2)) {
            ykwVar2.l(resources.getString(i), f);
        }
    }

    @Override // defpackage.ykw
    public final String a() {
        return "buglesub_" + this.b;
    }

    @Override // defpackage.yku
    protected final void b(String str) {
        xyl.k(str.startsWith("buglesub_"));
    }

    @Override // defpackage.ykw
    public final void c(int i) {
        if (i != -1) {
            if (i == 1) {
                Resources resources = this.a.getApplicationContext().getResources();
                t(this.f.x(this.b), "buglesub_enable_rcs", R.string.enable_rcs_pref_key, resources.getBoolean(R.bool.enable_rcs_pref_default), this.c);
                t(this.f.x(this.b), "buglesub_send_seen_report_rcs", R.string.send_seen_report_rcs_pref_key, resources.getBoolean(R.bool.send_seen_report_rcs_pref_default), this.c);
                t(this.f.x(this.b), "buglesub_share_typing_status_rcs", R.string.share_typing_status_rcs_pref_key, resources.getBoolean(R.bool.share_typing_status_rcs_pref_default), this.c);
                zxy zxyVar = this.f;
                int i2 = this.b;
                ykt yktVar = this.c;
                Context context = this.a;
                ykw x = zxyVar.x(i2);
                Resources resources2 = context.getResources();
                if (x.p("buglesub_rcs_fallback_type")) {
                    yktVar.j(resources2.getString(R.string.rcs_fallback_type_pref_key), x.d("buglesub_rcs_fallback_type", 0));
                }
                zxy zxyVar2 = this.f;
                int i3 = this.b;
                ykt yktVar2 = this.c;
                Context context2 = this.a;
                ykw x2 = zxyVar2.x(i3);
                Resources resources3 = context2.getResources();
                int d = x2.d("buglesub_rcs_default_sharing_method", -1);
                if (d != -1) {
                    yktVar2.j(resources3.getString(R.string.rcs_default_sharing_method_key), d);
                }
                u(this.f.x(this.b), "buglesub_rcs_mobile_data_auto_download_limit", R.string.rcs_mobile_data_auto_download_limit_pref_key, resources.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry), this.c);
                return;
            }
            return;
        }
        xbf xbfVar = this.e;
        int i4 = this.b;
        ykt yktVar3 = this.c;
        xbe a = xbfVar.a(i4);
        t(yktVar3, "delivery_reports", R.string.delivery_reports_pref_key, a.u(), this);
        t(this.c, "auto_retrieve_mms", R.string.auto_retrieve_mms_pref_key, a.p(), this);
        t(this.c, "auto_retrieve_mms_when_roaming", R.string.auto_retrieve_mms_when_roaming_pref_key, a.q(), this);
        t(this.c, "group_messaging", R.string.group_mms_pref_key, a.n(), this);
        if (this.d.a() == 1) {
            u(this.c, "mms_phone_number", R.string.mms_phone_number_pref_key, null, this);
        }
    }
}
