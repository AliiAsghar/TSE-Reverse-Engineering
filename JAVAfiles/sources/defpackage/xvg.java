package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvg extends xvd {
    private String c;

    public xvg(Context context, xve xveVar, msh mshVar, String str) {
        super(context, xveVar, mshVar);
        if (!TextUtils.isEmpty(str)) {
            this.c = str.replaceFirst("mailto:", "");
        }
    }

    @Override // defpackage.xvd
    public final int a() {
        return R.string.business_info_email_default_sub_header;
    }

    @Override // defpackage.xvd
    public final int b() {
        return R.drawable.quantum_gm_ic_email_black_24;
    }

    @Override // defpackage.xvd
    public final int c() {
        return R.string.business_action_email_short_content_description;
    }

    @Override // defpackage.xvd
    public final int d() {
        return R.string.business_action_email_short_text_m2;
    }

    @Override // defpackage.xvd
    public final Intent e() {
        String[] strArr = {this.c};
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        return intent;
    }

    @Override // defpackage.xvd
    public final String g(String str) {
        return this.a.getResources().getString(R.string.business_action_email_full_content_description, this.c, str);
    }

    @Override // defpackage.xvd
    public final int j() {
        return 4;
    }
}
