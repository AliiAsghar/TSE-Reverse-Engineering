package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfb extends nq {
    public List a;
    private final Paint b;

    public ajfb() {
        Paint paint = new Paint();
        this.b = paint;
        this.a = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.nq
    public final void l(Canvas canvas, RecyclerView recyclerView) {
        this.b.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (ajfh ajfhVar : this.a) {
            this.b.setColor(eap.e(-65281, -16776961, ajfhVar.c));
            if (((CarouselLayoutManager) recyclerView.m).g()) {
                canvas.drawLine(ajfhVar.b, ((CarouselLayoutManager) recyclerView.m).w(), ajfhVar.b, ((CarouselLayoutManager) recyclerView.m).l(), this.b);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.m).r(), ajfhVar.b, ((CarouselLayoutManager) recyclerView.m).s(), ajfhVar.b, this.b);
            }
        }
    }
}
