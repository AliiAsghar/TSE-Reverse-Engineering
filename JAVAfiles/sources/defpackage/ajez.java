package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajez extends mz {
    final /* synthetic */ CarouselLayoutManager f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajez(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f = carouselLayoutManager;
    }

    @Override // defpackage.mz
    public final int b(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f;
        if (carouselLayoutManager.d != null && carouselLayoutManager.g()) {
            return this.f.i(CarouselLayoutManager.bt(view));
        }
        return 0;
    }

    @Override // defpackage.mz
    public final int c(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f;
        if (carouselLayoutManager.d != null && !carouselLayoutManager.g()) {
            return this.f.i(CarouselLayoutManager.bt(view));
        }
        return 0;
    }

    @Override // defpackage.ok
    public final PointF m(int i) {
        return this.f.Q(i);
    }
}
