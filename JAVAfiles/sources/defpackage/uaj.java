package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@armg
/* loaded from: classes3.dex */
public final class uaj implements ujs {
    public final Context a;
    public final armf b;
    private final arml c;
    private final arml d;

    public uaj(Context context, armf armfVar, ofy ofyVar) {
        context.getClass();
        armfVar.getClass();
        ofyVar.getClass();
        this.a = context;
        this.b = armfVar;
        this.c = armd.a(new qtq(this, 7));
        this.d = armd.a(new qtq(this, 8));
    }

    private final SpannableStringBuilder e(rry rryVar, TextView textView, int i) {
        int f = rryVar.f();
        if (f != 213) {
            if (f != 226 && f != 229) {
                switch (f) {
                    case 233:
                        break;
                    case 234:
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (tte.h()) {
                            spannableStringBuilder.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_no_longer_encrypted_with_details_link, f()));
                            i(spannableStringBuilder, textView);
                            return spannableStringBuilder;
                        }
                        spannableStringBuilder.append((CharSequence) ujx.a(this.a));
                        return spannableStringBuilder;
                    case 235:
                    case 237:
                        break;
                    case 236:
                    case 238:
                        if (ttd.c()) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            spannableStringBuilder2.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_no_longer_encrypted_with_details_link, f()));
                            i(spannableStringBuilder2, textView);
                            return spannableStringBuilder2;
                        }
                        return new SpannableStringBuilder(ujx.a(this.a));
                    default:
                        throw new IllegalStateException("Unsupported status: " + rryVar.f());
                }
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("  ");
            h(spannableStringBuilder3, arsd.T(spannableStringBuilder3, " ", 0, 6), i);
            spannableStringBuilder3.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_encrypted_with_learn_more_link, g()));
            j(spannableStringBuilder3, textView);
            return spannableStringBuilder3;
        }
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("  ");
        h(spannableStringBuilder4, arsd.T(spannableStringBuilder4, " ", 0, 6), i);
        String str = (String) ttd.t.e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        if (str != null) {
            spannableStringBuilder4.append((CharSequence) this.a.getString(R.string.this_rcs_chat_is_encrypted_with_learn_more_link, g()));
            j(spannableStringBuilder4, textView);
            return spannableStringBuilder4;
        }
        spannableStringBuilder4.append((CharSequence) ujx.b(this.a));
        return spannableStringBuilder4;
    }

    private final String f() {
        Object a = this.c.a();
        a.getClass();
        return (String) a;
    }

    private final String g() {
        Object a = this.d.a();
        a.getClass();
        return (String) a;
    }

    private final void h(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        Drawable drawable = this.a.getDrawable(R.drawable.ic_lock_outline_black_12dp);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.setTint(i2);
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), i, i + 1, 34);
        }
    }

    private final void i(SpannableStringBuilder spannableStringBuilder, TextView textView) {
        yyb.bv(textView.getContext(), spannableStringBuilder, f(), new uai(textView, 0));
    }

    private final void j(SpannableStringBuilder spannableStringBuilder, TextView textView) {
        yyb.bv(textView.getContext(), spannableStringBuilder, g(), new iix(textView, this, 15));
    }

    @Override // defpackage.ujs
    public final String a(rry rryVar) {
        rryVar.getClass();
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ujs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r2, android.widget.TextView r3, defpackage.rry r4, int r5) {
        /*
            r1 = this;
            r3.getClass()
            r4.getClass()
            boolean r2 = r1.c(r4)
            if (r2 != 0) goto Ld
            goto L4f
        Ld:
            int r2 = r4.f()
            r0 = 213(0xd5, float:2.98E-43)
            if (r2 == r0) goto L2c
            r0 = 226(0xe2, float:3.17E-43)
            if (r2 == r0) goto L2c
            r0 = 229(0xe5, float:3.21E-43)
            if (r2 == r0) goto L2c
            switch(r2) {
                case 233: goto L22;
                case 234: goto L22;
                case 235: goto L2c;
                case 236: goto L2c;
                case 237: goto L22;
                case 238: goto L22;
                default: goto L20;
            }
        L20:
            r2 = 0
            goto L44
        L22:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            android.text.SpannableStringBuilder r4 = r1.e(r4, r3, r5)
            r2.<init>(r4)
            goto L44
        L2c:
            android.content.Context r2 = r1.a
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.String r2 = r4.Q(r2)
            r0.<init>(r2)
            java.lang.String r2 = "\n"
            r0.append(r2)
            android.text.SpannableStringBuilder r2 = r1.e(r4, r3, r5)
            r0.append(r2)
            r2 = r0
        L44:
            if (r2 == 0) goto L4f
            r3.setText(r2)
            defpackage.eek.j(r3)
            defpackage.ahnz.s(r3)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaj.b(android.view.View, android.widget.TextView, rry, int):void");
    }

    @Override // defpackage.ujs
    public final boolean c(rry rryVar) {
        rryVar.getClass();
        int f = rryVar.f();
        if (f != 213) {
            if (f == 226 || f == 229) {
                return true;
            }
            switch (f) {
                case 233:
                case 234:
                case 235:
                case 236:
                case 237:
                case 238:
                    return true;
                default:
                    return false;
            }
        }
        return ttd.b();
    }

    @Override // defpackage.ujs
    public final boolean d(boolean z) {
        return false;
    }
}
