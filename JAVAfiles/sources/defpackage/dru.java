package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dru {
    public static final Void a(String str) {
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, arqr arqrVar, int i) {
        CharSequence charSequence2;
        char c;
        String str;
        arqr arqrVar2;
        CharSequence charSequence3;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if ((i & 2) != 0) {
            charSequence2 = "";
        } else {
            charSequence2 = null;
        }
        sb.append(charSequence2);
        int size = list.size();
        char c2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if ((i & 8) != 0) {
                c = 65535;
            } else {
                c = 0;
            }
            if (i2 < size) {
                Object obj = list.get(i2);
                i3++;
                if (i3 > 1) {
                    if (1 != (i & 1)) {
                        charSequence3 = charSequence;
                    } else {
                        charSequence3 = ", ";
                    }
                    sb.append(charSequence3);
                }
                if (c >= 0 && i3 > 0) {
                    break;
                }
                if ((i & 32) != 0) {
                    arqrVar2 = null;
                } else {
                    arqrVar2 = arqrVar;
                }
                d.n(sb, obj, arqrVar2);
                i2++;
            } else {
                c2 = c;
                break;
            }
        }
        if (c2 >= 0 && i3 > 0) {
            if ((i & 16) != 0) {
                str = "...";
            } else {
                str = null;
            }
            sb.append((CharSequence) str);
        }
        if ((i & 4) == 0) {
            str2 = null;
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }
}
