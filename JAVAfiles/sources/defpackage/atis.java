package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atis implements atjg, atje {
    public static final atis a;
    static final int b;
    static final int c;
    private static final List d;
    private static final Map e;
    private static final List f;
    private static final /* synthetic */ atis[] g;

    static {
        atis atisVar = new atis();
        a = atisVar;
        g = new atis[]{atisVar};
        f = new ArrayList();
        ArrayList<String> arrayList = new ArrayList(atgc.b);
        d = arrayList;
        Collections.sort(arrayList);
        e = new HashMap();
        int i = 0;
        int i2 = 0;
        for (String str : arrayList) {
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                indexOf = indexOf < str.length() ? indexOf + 1 : indexOf;
                i2 = Math.max(i2, indexOf);
                String substring = str.substring(0, indexOf + 1);
                String substring2 = str.substring(indexOf);
                Map map = e;
                if (!map.containsKey(substring)) {
                    map.put(substring, new ArrayList());
                }
                ((List) map.get(substring)).add(substring2);
            } else {
                f.add(str);
            }
            i = Math.max(i, str.length());
        }
        b = i;
        c = i2;
    }

    private atis() {
    }

    public static atis[] values() {
        return (atis[]) g.clone();
    }

    @Override // defpackage.atje
    public final int a() {
        return b;
    }

    @Override // defpackage.atjg
    public final int b() {
        return b;
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        String str;
        int i2;
        String str2;
        List list = f;
        int length = charSequence.length();
        int min = Math.min(length, c + i);
        int i3 = i;
        while (true) {
            if (i3 < min) {
                int i4 = i3 + 1;
                if (charSequence.charAt(i3) == '/') {
                    String charSequence2 = charSequence.subSequence(i, i4).toString();
                    i2 = charSequence2.length() + i;
                    if (i3 < length - 1) {
                        str2 = charSequence2 + charSequence.charAt(i4);
                    } else {
                        str2 = charSequence2;
                    }
                    List list2 = (List) e.get(str2);
                    if (list2 != null) {
                        str = charSequence2;
                        list = list2;
                    }
                } else {
                    i3 = i4;
                }
            } else {
                str = "";
                i2 = i;
                break;
            }
        }
        String str3 = null;
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str4 = (String) list.get(i5);
            if (atix.c(charSequence, i2, str4) && (str3 == null || str4.length() > str3.length())) {
                str3 = str4;
            }
        }
        if (str3 != null) {
            atjaVar.f(atgc.i(String.valueOf(str).concat(str3)));
            return i2 + str3.length();
        }
        return ~i;
    }

    @Override // defpackage.atjg
    public final void d(Appendable appendable, long j, atfu atfuVar, int i, atgc atgcVar, Locale locale) {
        String str;
        if (atgcVar != null) {
            str = atgcVar.c;
        } else {
            str = "";
        }
        appendable.append(str);
    }
}
