package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaed {
    public final aaeb a;
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final String g;
    public rtj h;

    public aaed(aaeb aaebVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, String str) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.a = aaebVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = str;
    }

    public final CharSequence a(Context context, int i, int i2) {
        String string = context.getResources().getString(R.string.rbm_settings);
        string.getClass();
        String string2 = context.getResources().getString(R.string.rbm_unavailable_body, Integer.valueOf(i), Integer.valueOf(i2), string);
        string2.getClass();
        if (i == 0) {
            string2 = context.getResources().getString(R.string.rbm_no_rcs_body, string);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int ai = arsd.ai(string2, string);
        spannableStringBuilder.setSpan(new aaec(this, context), ai, string.length() + ai, 17);
        return spannableStringBuilder;
    }
}
