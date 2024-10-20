package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzm implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ afzd b;
    final /* synthetic */ dje c;
    final /* synthetic */ dqv d;
    final /* synthetic */ dqy e;

    public afzm(View view, afzd afzdVar, dje djeVar, dqv dqvVar, dqy dqyVar) {
        this.a = view;
        this.b = afzdVar;
        this.c = djeVar;
        this.d = dqvVar;
        this.e = dqyVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() > 0 && this.a.getHeight() > 0) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.getWidth();
            View view = this.a;
            afzd afzdVar = this.b;
            int height = view.getHeight();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(ckw.b(this.c.f()));
            shapeDrawable.setIntrinsicHeight(height);
            shapeDrawable.setIntrinsicWidth(Integer.valueOf(this.d.eo(this.e.a)).intValue());
            shapeDrawable.setBounds(0, 0, shapeDrawable.getIntrinsicWidth(), shapeDrawable.getIntrinsicHeight());
            afzdVar.setTextCursorDrawable(shapeDrawable);
        }
    }
}
