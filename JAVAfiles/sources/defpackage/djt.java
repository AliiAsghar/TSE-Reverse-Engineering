package defpackage;

import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djt {
    public static final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        dju djuVar = new dju(charSequence, i2, textPaint, i, textDirectionHeuristic, alignment, i3, truncateAt, i4, i5, z, i6, i7, i8, i9);
        TextDirectionHeuristic textDirectionHeuristic2 = djuVar.e;
        int i10 = djuVar.d;
        TextPaint textPaint2 = djuVar.c;
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(djuVar.a, 0, djuVar.b, textPaint2, i10);
        obtain.setTextDirection(textDirectionHeuristic2);
        obtain.setAlignment(djuVar.f);
        obtain.setMaxLines(djuVar.g);
        obtain.setEllipsize(djuVar.h);
        obtain.setEllipsizedWidth(djuVar.i);
        obtain.setLineSpacing(brg.a, 1.0f);
        obtain.setIncludePad(djuVar.k);
        obtain.setBreakStrategy(djuVar.l);
        obtain.setHyphenationFrequency(djuVar.o);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(djuVar.j);
        if (Build.VERSION.SDK_INT >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            int i11 = djuVar.m;
            int i12 = djuVar.n;
            lineBreakStyle = new LineBreakConfig.Builder().setLineBreakStyle(i11);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i12);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        return obtain.build();
    }
}
