package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyv implements kzy {
    private final Context a;
    private TextView b;
    private xvy c;
    private final apwt d;
    private final armf e;

    public kyv(Context context, apwt apwtVar, armf armfVar) {
        this.a = context;
        this.d = apwtVar;
        this.e = armfVar;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        int i;
        this.c.g(kzxVar.m);
        if (kzxVar.m == 0) {
            String str = kzxVar.j;
            TextView textView = (TextView) this.c.b();
            this.b = textView;
            textView.setText(str);
            TextView textView2 = this.b;
            if (true != kzxVar.o) {
                i = R.attr.colorOnSurface;
            } else {
                i = R.attr.colorOnSurfaceVariant;
            }
            textView2.setTextColor(ahnz.d(textView2, i));
            this.b.setTypeface(kzxVar.s);
        }
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.c = new xvy(view, R.id.conversation_subject, R.id.conversation_subject, R.layout.conversation_subject_view);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        if (TextUtils.equals(kzxVar2.j, kzxVar.j) && Objects.equals(kzxVar2.s, kzxVar.s)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        String d;
        boolean z;
        int i;
        Typeface d2;
        CharSequence string;
        boolean z2 = kzdVar.G;
        Resources resources = this.a.getResources();
        if (z2) {
            d = kzdVar.h;
        } else {
            d = ((xca) this.d.b()).d(resources, kzdVar.O);
        }
        if (kzdVar.J == 130) {
            z = true;
        } else {
            z = false;
        }
        if (!z && TextUtils.isEmpty(d)) {
            kzwVar.h(8);
            return;
        }
        boolean K = lga.K(kzdVar);
        kzwVar.h(0);
        if (true != z) {
            i = R.string.subject_with_label;
        } else {
            i = R.string.subject_with_urgent_label;
        }
        kzwVar.i = resources.getString(i, albo.ag(d));
        if (K) {
            d2 = xvw.e(this.a);
        } else {
            d2 = xvw.d(this.a);
        }
        kzwVar.o = d2;
        if (z) {
            string = TextUtils.concat(resources.getString(R.string.urgent_snippet), " ");
        } else {
            string = resources.getString(R.string.subject_label);
        }
        kzwVar.j = d;
        kzwVar.k = string.toString();
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
