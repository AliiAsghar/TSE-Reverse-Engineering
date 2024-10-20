package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajjh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Drawable a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajjh(ajjj ajjjVar, ajiv ajivVar, int i) {
        this.c = i;
        this.a = ajjjVar;
        this.b = ajivVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.c != 0) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((ajkm) this.a).I(floatValue);
            AppBarLayout appBarLayout = (AppBarLayout) this.b;
            Drawable drawable = appBarLayout.g;
            if (drawable instanceof ajkm) {
                ((ajkm) drawable).I(floatValue);
            }
            Iterator it = appBarLayout.f.iterator();
            while (it.hasNext()) {
                ((ajdn) it.next()).a();
            }
            return;
        }
        ajiv ajivVar = (ajiv) this.b;
        if (ajivVar.b(true) && ajivVar.k != 0) {
            ajjj ajjjVar = (ajjj) this.a;
            if (ajjjVar.isVisible()) {
                ajjjVar.invalidateSelf();
            }
        }
    }

    public /* synthetic */ ajjh(AppBarLayout appBarLayout, ajkm ajkmVar, int i) {
        this.c = i;
        this.b = appBarLayout;
        this.a = ajkmVar;
    }
}
