package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxg implements kzy {
    static final uuf a = uuh.j(uuh.b, "home_screen_avatar_size_multiplier", 1.0f);
    public xvy b;
    public IllustrationViewStub c;
    private final armf d;
    private final pgm e;
    private ImageView f;
    private xvy g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;
    private final Context o;

    public kxg(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, pgm pgmVar, armf armfVar8) {
        this.o = context;
        this.d = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = armfVar4;
        this.k = armfVar6;
        this.l = armfVar7;
        this.m = armfVar8;
        this.e = pgmVar;
        this.n = armfVar5;
    }

    private static boolean f(kzx kzxVar) {
        if (ofn.a() && kzxVar.a.ac == mmy.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        hlp hlpVar;
        hlp f;
        boolean z2 = true;
        if (z) {
            this.g.g(0);
            this.f.setVisibility(8);
            this.b.g(8);
        } else {
            this.g.g(8);
            this.f.setVisibility(0);
            if (this.b.h()) {
                if (kzxVar.S) {
                    IllustrationViewStub illustrationViewStub = this.c;
                    if (illustrationViewStub == null) {
                        this.b.f(R.layout.cake_badge);
                        illustrationViewStub = (IllustrationViewStub) ((FrameLayout) this.b.b()).findViewById(R.id.birthday_cake);
                        this.c = illustrationViewStub;
                        if (illustrationViewStub.d == null) {
                            illustrationViewStub.e = true;
                        } else {
                            throw new IllegalStateException("Can't change inflation mode after inflation");
                        }
                    }
                    int intValue = ((Integer) ((utz) ier.f.get()).e()).intValue();
                    View c = illustrationViewStub.c();
                    c.requestLayout();
                    if (c instanceof zha) {
                        zha zhaVar = (zha) c;
                        zhaVar.i(intValue);
                        zhaVar.c();
                    }
                    this.b.g(0);
                } else if (((Boolean) this.m.b()).booleanValue() && kzxVar.a.aa) {
                    ((Optional) ((apxx) this.n).a).ifPresent(new ktm(this, 16));
                } else if (kzxVar.a.C == 3) {
                    if (this.c == null) {
                        this.b.f(R.layout.rcs_badge);
                        this.c = (IllustrationViewStub) ((FrameLayout) this.b.b()).findViewById(R.id.rcs_badge);
                    }
                    this.c.c().requestLayout();
                    this.b.g(0);
                } else {
                    this.b.g(8);
                }
            }
        }
        String str = kzxVar.a.n;
        if (uyh.a() && str == null && kzxVar.a.R == 4) {
            str = ((xvc) this.h.b()).w(null, kzxVar.a.q, ((msk) this.j.b()).f(), null).toString();
        }
        if (((Boolean) this.k.b()).booleanValue()) {
            if (str == null) {
                ((aquq) this.d.b()).g(null).t(this.f);
                return;
            }
            vyv vyvVar = (vyv) this.l.b();
            if (kzxVar.a.w > 1) {
                z2 = false;
            }
            aevv q = vyvVar.q(Uri.parse(str), z2);
            if (f(kzxVar)) {
                f = ((aquq) this.d.b()).e(this.o.getDrawable(uxi.c(kzxVar.a.w)));
            } else if (yqt.a().booleanValue() && kzxVar.a.a == tqc.CROSS_COUNTRY_FOLDER) {
                f = ((aquq) this.d.b()).e(this.o.getDrawable(R.drawable.cross_country_avatar));
            } else {
                f = ((aquq) this.d.b()).f(q.a);
            }
            hlp f2 = ((aquq) this.d.b()).f(q.d);
            String str2 = q.c;
            if (str2 != null) {
                f = (hlp) f.P(new hyf(str2));
            }
            Boolean bool = q.b;
            if (bool != null && bool.booleanValue()) {
                f2 = (hlp) f2.z();
                f = (hlp) f.z();
            }
            f.d(f2).t(this.f);
            return;
        }
        if (f(kzxVar)) {
            hlpVar = ((aquq) this.d.b()).e(this.o.getDrawable(uxi.c(kzxVar.a.w)));
        } else if (yqt.a().booleanValue() && kzxVar.a.a == tqc.CROSS_COUNTRY_FOLDER) {
            hlpVar = ((aquq) this.d.b()).e(this.o.getDrawable(R.drawable.cross_country_avatar));
        } else {
            hlp g = ((aquq) this.d.b()).g(str);
            hlpVar = (hlp) g.P(new hyf(vyv.t()));
        }
        if (kzxVar.F) {
            hlpVar = (hlp) hlpVar.z();
        }
        hlpVar.t(this.f);
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.f = (ImageView) view.findViewById(R.id.conversation_icon);
        if (((ansy) ((pge) this.e).a.b()).e("bugle.enable_experimental_avatar_sizes")) {
            float floatValue = ((Float) a.e()).floatValue();
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) (layoutParams.width * floatValue);
                layoutParams.height = (int) (layoutParams.height * floatValue);
            }
        }
        this.g = new xvy(view, R.id.conversation_checkmark, R.id.conversation_checkmark, R.layout.conversation_checkmark_icon);
        this.b = new xvy(view, R.id.avatar_badge_icon, R.id.avatar_badge_icon);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        String str = kzxVar2.a.n;
        if (str == null || TextUtils.equals(str, kzxVar.a.n)) {
            if (!ier.a() || kzxVar.S == kzxVar2.S) {
                kzd kzdVar = kzxVar2.a;
                if (kzdVar.R == 4 && !TextUtils.equals(kzxVar.a.q, kzdVar.q)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        boolean z = true;
        if (kzdVar.w > 1) {
            z = false;
        }
        kzwVar.y = z;
        kzwVar.S |= 6144;
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
