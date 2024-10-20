package defpackage;

import android.graphics.Paint;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkl {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final float a(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        if (!djz.c(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= brg.a) {
            return brg.a;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null && a.a[paragraphAlignment.ordinal()] == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return abs + width;
    }

    public static final float b(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        if (djz.c(layout, i) && layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
            float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
            Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
            if (paragraphAlignment != null && a.a[paragraphAlignment.ordinal()] == 1) {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = (layout.getWidth() - lineRight) / 2.0f;
            } else {
                width = layout.getWidth() - layout.getLineRight(i);
                width2 = layout.getWidth() - lineRight;
            }
            return width - width2;
        }
        return brg.a;
    }
}
