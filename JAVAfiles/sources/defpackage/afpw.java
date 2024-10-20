package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpw extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpw(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[], arqr] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Object obj;
        Object obj2;
        Object obj3;
        int i = 0;
        int i2 = 1;
        Optional optional = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        switch (this.b) {
            case 0:
                return Integer.valueOf(((afpx) this.a).getContext().getResources().getDimensionPixelSize(R.dimen.emoji_icon_variant_indicator_size));
            case 1:
                Paint paint = new Paint();
                Context context = ((afpx) this.a).getContext();
                context.getClass();
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorOnSurfaceVariant, typedValue, true);
                paint.setColor(typedValue.data);
                paint.setAlpha(168);
                return paint;
            case 2:
                return Boolean.valueOf(((afre) this.a).e().d());
            case 3:
                Object obj4 = this.a;
                return arrn.J(((agai) obj4).bo(), null, null, new afmg((afre) obj4, (arpe) null, 11), 3);
            case 4:
                StringBuilder sb = new StringBuilder();
                afsx afsxVar = (afsx) this.a;
                sb.append(afsxVar.b.b() + "/" + afsxVar.c);
                afsq afsqVar = afsxVar.d;
                if (afsqVar != null) {
                    Objects.toString(afsqVar);
                    sb.append(";".concat(afsqVar.toString()));
                }
                return sb.toString();
            case 5:
                Object b = this.a.b();
                b.getClass();
                Optional optional2 = (Optional) b;
                if (optional2.isPresent()) {
                    obj = optional2.get();
                } else {
                    obj = new afdm(optional);
                }
                return (afdm) obj;
            case 6:
                Object b2 = this.a.b();
                b2.getClass();
                Optional optional3 = (Optional) b2;
                if (optional3.isPresent()) {
                    obj2 = optional3.get();
                } else {
                    obj2 = new afdm(optional);
                }
                return (afdm) obj2;
            case 7:
                Object b3 = this.a.b();
                b3.getClass();
                Optional optional4 = (Optional) b3;
                if (optional4.isPresent()) {
                    obj3 = optional4.get();
                } else {
                    obj3 = new afdm(optional);
                }
                return (afdm) obj3;
            case 8:
                ((View) this.a).setVisibility(8);
                return arnb.a;
            case 9:
                Optional optional5 = ((afvx) this.a).ag;
                if (optional5 == null) {
                    arro.b("emotifyButtonControllerOptional");
                } else {
                    optional = optional5;
                }
                Optional filter = optional.filter(new agol(afob.i, i2));
                filter.getClass();
                return (afyh) arsd.k(filter);
            case 10:
                afwf afwfVar = ((afvx) this.a).d;
                if (afwfVar != null) {
                    afwf.g(afwfVar, 0, null, 7);
                }
                return arnb.a;
            case 11:
                agem b4 = ((afwf) this.a).b();
                if (b4 == null) {
                    return null;
                }
                return b4.gx();
            case 12:
                return Integer.valueOf(((View) ((afwk) this.a).b.a).getContext().getResources().getInteger(R.integer.short_animation_ms));
            case 13:
                Object obj5 = ((afwk) this.a).b.i;
                int height = ((TabLayout) obj5).getHeight();
                ViewGroup.LayoutParams layoutParams = ((View) obj5).getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                }
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.topMargin;
                }
                return Integer.valueOf(height + i);
            case 14:
                Animation loadAnimation = AnimationUtils.loadAnimation(((afwt) this.a).b, R.anim.panel_appearance);
                loadAnimation.getClass();
                loadAnimation.setAnimationListener(new afyg(new afmo(this.a, 11), optional, 6));
                return loadAnimation;
            case 15:
                return ((afwt) this.a).b.getString(R.string.search_back_icon_content_description);
            case 16:
                Drawable drawable = ((afwt) this.a).b.getDrawable(R.drawable.quantum_ic_arrow_back_vd_theme_24);
                drawable.getClass();
                return drawable;
            case 17:
                Drawable drawable2 = ((afwt) this.a).b.getDrawable(R.drawable.quantum_ic_close_vd_theme_24);
                drawable2.getClass();
                return drawable2;
            case 18:
                Animation loadAnimation2 = AnimationUtils.loadAnimation(((afwt) this.a).b, R.anim.panel_disappearance);
                loadAnimation2.getClass();
                loadAnimation2.setAnimationListener(new afyg(optional, new afmo(this.a, 12), 5));
                return loadAnimation2;
            case 19:
                Drawable drawable3 = ((afwt) this.a).b.getDrawable(R.drawable.quantum_ic_arrow_forward_vd_theme_24);
                drawable3.getClass();
                return drawable3;
            default:
                return ((afwt) this.a).b.getString(R.string.search_icon_content_description);
        }
    }
}
