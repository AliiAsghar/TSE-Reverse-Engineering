package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaak {
    private static final anna a = anna.g(" ");

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        Iterator it = a.a(str).iterator();
        while (it.hasNext()) {
            sb.appendCodePoint(Integer.parseInt((String) it.next(), 16));
        }
        return sb.toString();
    }

    public final boolean b(String str) {
        Iterator it = a.a(str).iterator();
        while (it.hasNext()) {
            if (albo.cw((String) it.next(), 16) == null) {
                return false;
            }
        }
        return true;
    }
}
