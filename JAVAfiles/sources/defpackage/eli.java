package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eli implements Spannable {
    public Spannable a;
    private boolean b = false;

    public eli(Spannable spannable) {
        this.a = spannable;
    }

    private final void a() {
        dyq elhVar;
        Spannable spannable = this.a;
        if (!this.b) {
            if (Build.VERSION.SDK_INT < 28) {
                elhVar = new dyq();
            } else {
                elhVar = new elh();
            }
            if (elhVar.e(spannable)) {
                this.a = new SpannableString(spannable);
            }
        }
        this.b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ IntStream chars() {
        IntStream chars;
        chars = this.a.chars();
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(chars));
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream codePoints() {
        java.util.stream.IntStream codePoints;
        codePoints = this.a.codePoints();
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(codePoints));
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.a.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.a.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.a.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.a.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }

    public eli(CharSequence charSequence) {
        this.a = new SpannableString(charSequence);
    }
}
