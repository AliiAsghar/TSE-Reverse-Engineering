package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import java.text.BreakIterator;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyh {
    private static Pattern d;
    private final Context h;
    private static final xze b = xze.g("BugleDataModel", "SearchUtils");
    public static final ThreadLocal a = new ThreadLocal();
    private static String[] c = new String[0];
    private static final HashSet e = new HashSet();
    private static final BreakIterator f = BreakIterator.getWordInstance();
    private static float[] g = new float[100];

    public qyh(Context context) {
        this.h = context;
    }

    public final Matcher a(String[] strArr, CharSequence charSequence, StringBuilder sb, HashSet hashSet) {
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("(\\b\\Q");
            sb.append(str);
            sb.append("\\E");
            hashSet.add(str);
            sb.append(")");
        }
        Matcher matcher = Pattern.compile(sb.toString()).matcher(charSequence.toString().toLowerCase(yhx.b(this.h)));
        for (int i = 0; matcher.find(i) && !hashSet.isEmpty(); i = matcher.end()) {
            hashSet.remove(matcher.group());
        }
        return matcher;
    }

    public final String[] b(String str) {
        String[] split = str.toLowerCase(yhx.b(this.h)).split("\\W+");
        int i = 0;
        for (String str2 : split) {
            if (TextUtils.isEmpty(str2)) {
                i++;
            }
        }
        if (i == 0) {
            return split;
        }
        String[] strArr = new String[split.length - i];
        int i2 = 0;
        for (String str3 : split) {
            if (!TextUtils.isEmpty(str3)) {
                strArr[i2] = str3;
                i2++;
            }
        }
        return strArr;
    }

    public final CharSequence c(CharSequence charSequence, TextView textView) {
        return d(charSequence, null, textView, -14273992, -1579458);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bf A[LOOP:3: B:56:0x0114->B:86:0x01bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f A[EDGE_INSN: B:87:0x017f->B:88:0x017f BREAK  A[LOOP:3: B:56:0x0114->B:86:0x01bf], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0177 -> B:61:0x0179). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence d(java.lang.CharSequence r21, java.lang.String r22, android.widget.TextView r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyh.d(java.lang.CharSequence, java.lang.String, android.widget.TextView, int, int):java.lang.CharSequence");
    }
}
