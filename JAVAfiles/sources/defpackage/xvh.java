package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvh extends xvd {
    private final String c;

    public xvh(Context context, xve xveVar, msh mshVar, String str) {
        super(context, xveVar, mshVar);
        this.c = str;
    }

    @Override // defpackage.xvd
    public final int a() {
        return R.string.business_info_website_default_sub_header;
    }

    @Override // defpackage.xvd
    public final int b() {
        return R.drawable.business_web;
    }

    @Override // defpackage.xvd
    public final int c() {
        return R.string.business_action_website_short_content_description;
    }

    @Override // defpackage.xvd
    public final int d() {
        return R.string.business_action_website_short_text_m2;
    }

    @Override // defpackage.xvd
    public final Intent e() {
        return this.b.b(this.c);
    }

    @Override // defpackage.xvd
    public final String g(String str) {
        return this.a.getResources().getString(R.string.business_action_website_full_content_description, this.c, str);
    }

    @Override // defpackage.xvd
    public final int j() {
        return 3;
    }
}
