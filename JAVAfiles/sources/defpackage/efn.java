package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.WindowInsets;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        int statusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i3 != 8) {
                    if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                } else {
                    statusBars = anf$$ExternalSyntheticApiModelOutline0.m();
                }
                i2 |= statusBars;
            }
        }
        return i2;
    }

    public static ActionMode.Callback b(ActionMode.Callback callback) {
        if (callback instanceof egt) {
            return ((egt) callback).a;
        }
        return callback;
    }

    public static ActionMode.Callback c(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT <= 27 && !(callback instanceof egt) && callback != null) {
            return new egt(callback, textView);
        }
        return callback;
    }

    public static void d(TextView textView, int i) {
        int i2;
        dye.g(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(TextView textView, int i) {
        int i2;
        dye.g(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void f(TextView textView, int i) {
        dye.g(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void g(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT < 34) {
            f(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        } else {
            textView.setLineHeight(i, f);
        }
    }
}
