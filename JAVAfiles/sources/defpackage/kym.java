package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kym implements kzy {
    private final Context a;
    private TextView b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final wfh f;

    public kym(Context context, wfh wfhVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = context;
        this.f = wfhVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    private final CharSequence f(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(charSequence) + " " + ((String) charSequence2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ahnz.f(this.a, R.attr.colorOnSurfaceVariant, "NameViewPart")), charSequence.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), charSequence.length(), spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    private final String g(kzd kzdVar) {
        if (ofn.a() && kzdVar.ac == mmy.c && tvu.c(kzdVar.c)) {
            return this.a.getString(R.string.unapproved_rcs_group);
        }
        if (((pgp) this.e.b()).a()) {
            String str = kzdVar.q;
            if (str == null) {
                return null;
            }
            return wfh.x(str);
        }
        return kzdVar.q;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        CharSequence charSequence;
        if (((Boolean) this.c.b()).booleanValue()) {
            charSequence = kzxVar.Q;
        } else {
            charSequence = kzxVar.P;
        }
        this.b.setText(charSequence);
        this.b.setTypeface(kzxVar.r);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.b = (TextView) view.findViewById(R.id.conversation_name);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        if (((Boolean) this.c.b()).booleanValue()) {
            if (TextUtils.equals(kzxVar2.a.q, kzxVar.a.q) && Objects.equals(kzxVar2.r, kzxVar.r) && TextUtils.equals(kzxVar2.a.u, kzxVar.a.u) && TextUtils.equals(kzxVar2.a.s, kzxVar.a.s) && TextUtils.equals(kzxVar2.a.t, kzxVar.a.t)) {
                return false;
            }
            return true;
        }
        if (TextUtils.equals(kzxVar2.a.q, kzxVar.a.q) && Objects.equals(kzxVar2.r, kzxVar.r)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        Typeface d;
        boolean K = lga.K(kzdVar);
        if (ofn.a() && kzdVar.ac == mmy.c) {
            d = xvw.d(this.a);
        } else if (K) {
            d = xvw.e(this.a);
        } else {
            d = xvw.d(this.a);
        }
        kzwVar.n = d;
        if (((Boolean) this.c.b()).booleanValue()) {
            if (kzdVar.f()) {
                if (((pgp) this.e.b()).a()) {
                    String g = g(kzdVar);
                    String str = kzdVar.u;
                    str.getClass();
                    kzwVar.I = f(g, vom.b(str));
                    return;
                }
                String z = this.f.z(g(kzdVar));
                String str2 = kzdVar.u;
                str2.getClass();
                kzwVar.I = f(z, vom.b(str2));
                return;
            }
            if (((pgp) this.e.b()).a()) {
                kzwVar.I = g(kzdVar);
                return;
            } else {
                kzwVar.I = this.f.z(g(kzdVar));
                return;
            }
        }
        if (((pgp) this.e.b()).a()) {
            kzwVar.H = g(kzdVar);
        } else {
            kzwVar.H = this.f.z(g(kzdVar));
        }
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
