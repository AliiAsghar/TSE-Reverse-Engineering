package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfc extends ajfe {
    final /* synthetic */ CarouselLayoutManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajfc(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.a = carouselLayoutManager;
    }

    @Override // defpackage.ajfe
    public final int a() {
        return this.a.G;
    }

    @Override // defpackage.ajfe
    public final int b() {
        return this.a.aA();
    }

    @Override // defpackage.ajfe
    public final int c() {
        CarouselLayoutManager carouselLayoutManager = this.a;
        return carouselLayoutManager.F - carouselLayoutManager.aB();
    }

    @Override // defpackage.ajfe
    public final int d() {
        return 0;
    }

    @Override // defpackage.ajfe
    public final int e() {
        return 0;
    }

    @Override // defpackage.ajfe
    public final RectF f(float f, float f2, float f3, float f4) {
        return new RectF(brg.a, f3, f2, f - f3);
    }

    @Override // defpackage.ajfe
    public final void g(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.top < rectF3.top && rectF2.bottom > rectF3.top) {
            float f = rectF3.top - rectF2.top;
            rectF.top += f;
            rectF3.top += f;
        }
        if (rectF2.bottom > rectF3.bottom && rectF2.top < rectF3.bottom) {
            float f2 = rectF2.bottom - rectF3.bottom;
            rectF.bottom = Math.max(rectF.bottom - f2, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f2, rectF2.top);
        }
    }

    @Override // defpackage.ajfe
    public final void h(View view, int i, int i2) {
        int b = b();
        nx nxVar = (nx) view.getLayoutParams();
        CarouselLayoutManager.by(view, b, i, CarouselLayoutManager.br(view) + nxVar.leftMargin + nxVar.rightMargin + b, i2);
    }

    @Override // defpackage.ajfe
    public final void i(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.top = Math.min(rectF.top, rectF.bottom);
        }
        if (rectF2.top >= rectF3.bottom) {
            rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.bottom = Math.max(rectF.top, rectF.bottom);
        }
    }

    @Override // defpackage.ajfe
    public final void j(View view, Rect rect, float f, float f2) {
        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
    }
}
