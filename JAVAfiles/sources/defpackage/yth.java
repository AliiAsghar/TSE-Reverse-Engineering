package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yth extends BitmapDrawable {
    private final int a;
    private final Rect b;
    private int c;
    private int d;
    private boolean e;

    public yth(int i, Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.a = i;
        this.e = true;
        this.b = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            int r0 = r9.a
            r1 = 3
            r2 = 0
            r3 = 5
            r4 = 7
            if (r0 == r1) goto L1b
            if (r0 == r3) goto L18
            r1 = 6
            if (r0 == r1) goto L18
            if (r0 == r4) goto L15
            r1 = 8
            if (r0 == r1) goto L15
            r1 = r2
            goto L1d
        L15:
            r1 = 270(0x10e, float:3.78E-43)
            goto L1d
        L18:
            r1 = 90
            goto L1d
        L1b:
            r1 = 180(0xb4, float:2.52E-43)
        L1d:
            r5 = 2
            r6 = 1
            r7 = -1
            if (r0 == r5) goto L2a
            if (r0 == r3) goto L2a
            if (r0 != r4) goto L28
            r0 = r4
            goto L2a
        L28:
            r3 = r6
            goto L2b
        L2a:
            r3 = r7
        L2b:
            float r1 = (float) r1
            r4 = 4
            if (r0 != r4) goto L30
            r6 = r7
        L30:
            boolean r0 = r9.e
            if (r0 == 0) goto L8c
            int r0 = r9.getGravity()
            int r4 = r9.getIntrinsicWidth()
            int r5 = r9.getIntrinsicHeight()
            android.graphics.Rect r7 = r9.getBounds()
            android.graphics.Rect r8 = r9.b
            android.view.Gravity.apply(r0, r4, r5, r7, r8)
            android.graphics.Rect r0 = r9.b
            int r0 = r0.centerX()
            r9.c = r0
            android.graphics.Rect r0 = r9.b
            int r0 = r0.centerY()
            r9.d = r0
            int r0 = r9.a
            boolean r0 = defpackage.yyb.aT(r0)
            if (r0 == 0) goto L8a
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r4 = r9.c
            float r4 = (float) r4
            int r5 = r9.d
            float r5 = (float) r5
            r0.setRotate(r1, r4, r5)
            android.graphics.Rect r4 = r9.b
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r4)
            r0.mapRect(r5)
            android.graphics.Rect r0 = r9.b
            float r4 = r5.left
            int r4 = (int) r4
            float r7 = r5.top
            int r7 = (int) r7
            float r8 = r5.right
            int r8 = (int) r8
            float r5 = r5.bottom
            int r5 = (int) r5
            r0.set(r4, r7, r8, r5)
        L8a:
            r9.e = r2
        L8c:
            r10.save()
            float r0 = (float) r3
            float r2 = (float) r6
            int r3 = r9.c
            float r3 = (float) r3
            int r4 = r9.d
            float r4 = (float) r4
            r10.scale(r0, r2, r3, r4)
            int r0 = r9.c
            float r0 = (float) r0
            int r2 = r9.d
            float r2 = (float) r2
            r10.rotate(r1, r0, r2)
            android.graphics.Bitmap r0 = r9.getBitmap()
            android.graphics.Rect r1 = r9.b
            android.graphics.Paint r2 = r9.getPaint()
            r3 = 0
            r10.drawBitmap(r0, r3, r1, r2)
            r10.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yth.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (yyb.aT(this.a)) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (yyb.aT(this.a)) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = true;
    }
}
