package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aizs extends ehi {
    private final TextView e;

    public aizs(TextView textView) {
        super(textView);
        this.e = textView;
    }

    private final CharSequence v(ClickableSpan clickableSpan) {
        CharSequence text = this.e.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        }
        return text;
    }

    @Override // defpackage.ehi, defpackage.ecl
    public final void c(View view, efx efxVar) {
        super.c(view, efxVar);
        efxVar.ac(efw.a);
        efxVar.r(false);
    }

    @Override // defpackage.ehi
    protected final void k(List list) {
        CharSequence text = this.e.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.ehi
    protected final void l(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan t = t(i);
        if (t != null) {
            accessibilityEvent.setContentDescription(v(t));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.bV(i, "LinkSpan is null for offset: "));
            accessibilityEvent.setContentDescription(this.e.getText());
        }
    }

    @Override // defpackage.ehi
    protected final void n(int i, efx efxVar) {
        ClickableSpan t = t(i);
        Rect rect = new Rect();
        if (t != null) {
            efxVar.u(v(t));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.bV(i, "LinkSpan is null for offset: "));
            efxVar.u(this.e.getText());
        }
        efxVar.y(true);
        efxVar.r(true);
        u(t, rect);
        if (!rect.isEmpty()) {
            u(t, rect);
            efxVar.m(rect);
        } else {
            Log.w("TvLinksAccessibilityHelper", a.bV(i, "LinkSpan bounds is empty for: "));
            rect.set(0, 0, 1, 1);
            efxVar.m(rect);
        }
        efxVar.g(16);
    }

    @Override // defpackage.ehi
    public final boolean r(int i, int i2) {
        if (i2 == 16) {
            ClickableSpan t = t(i);
            if (t != null) {
                t.onClick(this.e);
                return true;
            }
            Log.e("TvLinksAccessibilityHelper", a.bV(i, "LinkSpan is null for offset: "));
            return false;
        }
        return false;
    }

    final ClickableSpan t(int i) {
        CharSequence text = this.e.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return clickableSpanArr[0];
            }
            return null;
        }
        return null;
    }

    final void u(ClickableSpan clickableSpan, Rect rect) {
        Layout layout;
        CharSequence text = this.e.getText();
        if ((text instanceof Spanned) && (layout = this.e.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            rect.right = (int) primaryHorizontal2;
            if (lineForOffset == lineForOffset2) {
                rect.left = (int) primaryHorizontal;
            } else {
                rect.left = 0;
            }
            rect.top = layout.getLineTop(lineForOffset2);
            rect.bottom = layout.getLineBottom(lineForOffset2);
            TextView textView = this.e;
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
    }
}
