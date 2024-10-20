package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldz {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/linkify/RtlLinkify");
    private final wfh b;

    public ldz(wfh wfhVar) {
        this.b = wfhVar;
    }

    public final Spannable a(Spannable spannable, alor alorVar) {
        ClickableSpan[] clickableSpanArr;
        uyz[] uyzVarArr;
        uyz uyzVar;
        ClickableSpan[] clickableSpanArr2;
        char c;
        int length;
        if (!this.b.A()) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        ClickableSpan[] clickableSpanArr3 = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
        int length2 = clickableSpanArr3.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            ClickableSpan clickableSpan = clickableSpanArr3[i2];
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            String charSequence = spannable.subSequence(spanStart, spanEnd).toString();
            try {
                spannableStringBuilder.append((CharSequence) spannable.subSequence(i3, spanStart).toString());
                clickableSpanArr = clickableSpanArr3;
            } catch (StringIndexOutOfBoundsException unused) {
                char[] charArray = spannable.toString().toCharArray();
                StringBuilder sb = new StringBuilder();
                int length3 = charArray.length;
                while (i < length3) {
                    char c2 = charArray[i];
                    if (Character.isDigit(c2)) {
                        clickableSpanArr2 = clickableSpanArr3;
                        if (c2 >= '0') {
                            if (c2 <= '9') {
                                sb.append('1');
                            } else {
                                c = '0';
                            }
                        } else {
                            c = '0';
                        }
                        sb.append(c);
                    } else {
                        clickableSpanArr2 = clickableSpanArr3;
                        if (Character.isLetter(c2)) {
                            byte directionality = Character.getDirectionality(c2);
                            if (directionality != 1 && directionality != 2 && directionality != 16 && directionality != 17) {
                                sb.append('L');
                            } else {
                                sb.append('R');
                            }
                        } else {
                            sb.append(c2);
                        }
                    }
                    i++;
                    clickableSpanArr3 = clickableSpanArr2;
                }
                clickableSpanArr = clickableSpanArr3;
                String sb2 = sb.toString();
                if (alorVar != null) {
                    uyzVarArr = (uyz[]) alorVar.values().toArray(new uyz[0]);
                    uyzVar = (uyz) alorVar.get(clickableSpan);
                } else {
                    uyzVarArr = null;
                    uyzVar = null;
                }
                alvw h = a.h();
                h.X(alwp.a, "Bugle");
                ((alvg) ((alvg) h).h("com/google/android/apps/messaging/linkify/RtlLinkify", "formatSpannableForRtl", 66, "RtlLinkify.java")).M("Index out of bounds! linkedText is \"%s\", spanStart = %d, spanEnd = %d, prevSpanEnd = %d, currentLinkEntityType is %s, linkEntityTypes are %s", sb2, Integer.valueOf(spanStart), Integer.valueOf(spanEnd), Integer.valueOf(i3), uyzVar, Arrays.toString(uyzVarArr));
            }
            int length4 = spannableStringBuilder.length();
            if (alorVar != null && alorVar.containsKey(clickableSpan) && ((uyz) alorVar.get(clickableSpan)).equals(uyz.PHONE_NUMBER)) {
                spannableStringBuilder.append((CharSequence) wfh.y(spannable.subSequence(spanStart, spanEnd).toString()));
                length4 = spannableStringBuilder.toString().indexOf(charSequence, length4);
                length = charSequence.length() + length4;
            } else {
                spannableStringBuilder.append((CharSequence) spannable.subSequence(spanStart, spanEnd).toString());
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(clickableSpan, length4, length, spannable.getSpanFlags(clickableSpan));
            i2++;
            i3 = spanEnd;
            clickableSpanArr3 = clickableSpanArr;
            i = 0;
        }
        spannableStringBuilder.append((CharSequence) spannable.subSequence(i3, spannable.length()).toString());
        return spannableStringBuilder;
    }
}
