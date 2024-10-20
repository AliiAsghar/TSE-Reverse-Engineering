package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class algs {
    public final String c;

    public algs(algs algsVar) {
        this.c = algsVar.c;
    }

    public static algs c(char c) {
        return new algs(String.valueOf(c));
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public void b(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.c);
                appendable.append(a(it.next()));
            }
        }
    }

    public final String d(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        g(sb, it);
        return sb.toString();
    }

    public final String e(Object[] objArr) {
        return d(Arrays.asList(objArr));
    }

    public final String f(Object obj, Object obj2, Object... objArr) {
        return d(new algr(objArr, obj, obj2));
    }

    public final void g(StringBuilder sb, Iterator it) {
        try {
            b(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void h(StringBuilder sb, Iterable iterable) {
        g(sb, iterable.iterator());
    }

    public algs(String str) {
        str.getClass();
        this.c = str;
    }
}
