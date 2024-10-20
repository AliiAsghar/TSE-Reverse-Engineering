package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dyg;
import defpackage.dzg;
import defpackage.esy;
import defpackage.esz;
import defpackage.evp;
import defpackage.fxz;
import defpackage.fya;
import defpackage.fyz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public fya a;
    public float b;
    private List c;
    private float d;
    private boolean e;
    private boolean f;
    private View g;
    private fxz h;

    public SubtitleView(Context context) {
        this(context, null);
    }

    public final void a(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.c = list;
        b();
    }

    public final void b() {
        List arrayList;
        fxz fxzVar = this.h;
        if (this.e && this.f) {
            arrayList = this.c;
        } else {
            arrayList = new ArrayList(this.c.size());
            for (int i = 0; i < this.c.size(); i++) {
                esy esyVar = new esy((esz) this.c.get(i));
                if (!this.e) {
                    esyVar.b();
                    CharSequence charSequence = esyVar.a;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            esyVar.a = SpannableString.valueOf(charSequence);
                        }
                        CharSequence charSequence2 = esyVar.a;
                        dzg.g(charSequence2);
                        dyg.i((Spannable) charSequence2, new evp(2));
                    }
                    dyg.h(esyVar);
                } else if (!this.f) {
                    dyg.h(esyVar);
                }
                arrayList.add(esyVar.a());
            }
        }
        fya fyaVar = this.a;
        float f = this.b;
        float f2 = this.d;
        fxzVar.b = arrayList;
        fxzVar.d = fyaVar;
        fxzVar.c = f;
        fxzVar.e = f2;
        while (fxzVar.a.size() < arrayList.size()) {
            fxzVar.a.add(new fyz(fxzVar.getContext()));
        }
        fxzVar.invalidate();
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Collections.emptyList();
        this.a = fya.a;
        this.b = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        fxz fxzVar = new fxz(context);
        this.h = fxzVar;
        this.g = fxzVar;
        addView(fxzVar);
    }
}
