package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iev implements kzy {
    public final iql a;
    private final Context b;
    private final arwe c;
    private final String d;
    private TextView e;
    private xvy f;
    private final iew g;

    public iev(Context context, arwe arweVar, iql iqlVar, iew iewVar) {
        context.getClass();
        arweVar.getClass();
        iewVar.getClass();
        this.b = context;
        this.c = arweVar;
        this.a = iqlVar;
        this.g = iewVar;
        this.d = "BirthdayViewPart";
    }

    private final void f(kzw kzwVar, kzd kzdVar) {
        if (!hlc.s(kzdVar)) {
            kzwVar.b(false);
            return;
        }
        String a = this.g.a(kzdVar.s, kzdVar.t);
        kzwVar.b(true);
        kzwVar.J = a;
        qjh.l(this.c, null, new gbv(this, kzdVar, (arpe) null, 10), 3);
    }

    @Override // defpackage.kzy
    public final kzx a(kzx kzxVar) {
        kzw kzwVar = new kzw(kzxVar);
        kzd kzdVar = kzxVar.a;
        kzdVar.getClass();
        f(kzwVar, kzdVar);
        return kzwVar.a();
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        if (!kzxVar.w && TextUtils.isEmpty(kzxVar.J)) {
            xvy xvyVar = null;
            if (!kzxVar.S) {
                if (!yig.e() || !kzxVar.C) {
                    xvy xvyVar2 = this.f;
                    if (xvyVar2 == null) {
                        arro.b("birthdayTextViewStubber");
                    } else {
                        xvyVar = xvyVar2;
                    }
                    xvyVar.g(8);
                    return;
                }
                return;
            }
            xvy xvyVar3 = this.f;
            if (xvyVar3 == null) {
                arro.b("birthdayTextViewStubber");
                xvyVar3 = null;
            }
            xvyVar3.g(0);
            xvy xvyVar4 = this.f;
            if (xvyVar4 == null) {
                arro.b("birthdayTextViewStubber");
            } else {
                xvyVar = xvyVar4;
            }
            TextView textView = (TextView) xvyVar.b();
            this.e = textView;
            if (textView != null) {
                String str = kzxVar.T;
                str.getClass();
                textView.setText(str);
            }
            int f = ahnz.f(this.b, R.attr.colorPrimaryBrandNonIcon, this.d);
            TextView textView2 = this.e;
            if (textView2 != null) {
                textView2.setTextColor(f);
            }
        }
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.f = new xvy(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        kzxVar.getClass();
        kzxVar2.getClass();
        if (kzxVar.S == kzxVar2.S && TextUtils.equals(kzxVar.T, kzxVar2.T)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        f(kzwVar, kzdVar);
    }
}
