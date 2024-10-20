package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrv {
    private static final Pattern a = Pattern.compile("(?<=(['\"]|\\s|^))(_(\\w|[.!?,'\"#$*])+_)(?=([.!?,'\"]|\\s|$))");
    private static final Pattern b = Pattern.compile("(?<=(['\"]|\\s|^))(\\*(\\w|[.!?,'\"#$*])+\\*)(?=([.!?,'\"]|\\s|$))");

    public static Spannable a(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        if (!str.contains(Character.toString('*')) && !str.contains(Character.toString('_'))) {
            return new SpannableString(str);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = a.matcher(str);
        Matcher matcher2 = b.matcher(str);
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.addAll(agru.a(matcher));
        priorityQueue.addAll(agru.a(matcher2));
        int i2 = 0;
        while (i2 < str.length()) {
            if (!priorityQueue.isEmpty() && i2 == ((agru) priorityQueue.peek()).a) {
                agru agruVar = (agru) priorityQueue.remove();
                char charAt = agruVar.c.charAt(0);
                if (charAt != '*' && charAt != '_') {
                    spannableStringBuilder.append((CharSequence) agruVar.c);
                } else {
                    spannableStringBuilder.append((CharSequence) agruVar.c.substring(1, r8.length() - 1));
                    int i3 = agruVar.b - agruVar.a;
                    if (charAt == '*') {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    spannableStringBuilder.setSpan(new StyleSpan(i), spannableStringBuilder.length() - (i3 - 2), spannableStringBuilder.length(), 33);
                }
                i2 = agruVar.b - 1;
            } else {
                spannableStringBuilder.append(str.charAt(i2));
            }
            i2++;
        }
        return spannableStringBuilder;
    }
}
