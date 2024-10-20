package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvf extends xvd {
    private final String c;

    public xvf(Context context, xve xveVar, msh mshVar, String str) {
        super(context, xveVar, mshVar);
        this.c = str;
    }

    @Override // defpackage.xvd
    public final int a() {
        return R.string.business_info_phone_default_sub_header;
    }

    @Override // defpackage.xvd
    public final int b() {
        return R.drawable.tinted_ic_phone_24;
    }

    @Override // defpackage.xvd
    public final int c() {
        return R.string.business_action_call_short_content_description;
    }

    @Override // defpackage.xvd
    public final int d() {
        return R.string.business_action_call_short_text_m2;
    }

    @Override // defpackage.xvd
    public final Intent e() {
        return this.b.a(this.c);
    }

    @Override // defpackage.xvd
    public final String g(String str) {
        return this.a.getResources().getString(R.string.business_action_call_full_content_description, this.c, str);
    }

    @Override // defpackage.xvd
    public final int j() {
        return 2;
    }
}
