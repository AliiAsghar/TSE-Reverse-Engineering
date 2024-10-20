package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpp extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private hne c;
    private Class d;
    private String e;
    private int f;

    public hpp(String str) {
        this(str, Collections.emptyList());
    }

    private final void c(Throwable th, List list) {
        if (th instanceof hpp) {
            Iterator it = ((hpp) th).b.iterator();
            while (it.hasNext()) {
                c((Throwable) it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        hpo hpoVar = new hpo(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                hpoVar.append("Cause (");
                int i2 = i + 1;
                hpoVar.append(String.valueOf(i2));
                hpoVar.append(" of ");
                hpoVar.append(String.valueOf(size));
                hpoVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof hpp) {
                    ((hpp) th).e(hpoVar);
                } else {
                    d(th, hpoVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(hne hneVar, int i, Class cls) {
        this.c = hneVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        String str3 = "";
        if (cls == null) {
            str = "";
        } else {
            str = ", ".concat(cls.toString());
        }
        sb.append(str);
        int i = this.f;
        if (i == 0) {
            str2 = "";
        } else {
            str2 = ", ".concat(hlc.o(i));
        }
        sb.append(str2);
        hne hneVar = this.c;
        if (hneVar != null) {
            str3 = ", ".concat(hneVar.toString());
        }
        sb.append(str3);
        List<Throwable> a2 = a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public hpp(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
