package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algv {
    private final String a;
    private final algu b;
    private algu c;
    private boolean d;

    public algv(String str) {
        algu alguVar = new algu();
        this.b = alguVar;
        this.c = alguVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final algu i() {
        algu alguVar = new algu();
        this.c.c = alguVar;
        this.c = alguVar;
        return alguVar;
    }

    private final void j(String str, Object obj) {
        algt algtVar = new algt();
        this.c.c = algtVar;
        this.c = algtVar;
        algtVar.b = obj;
        algtVar.a = str;
    }

    public final void a(Object obj) {
        i().b = obj;
    }

    public final void b(String str, Object obj) {
        algu i = i();
        i.b = obj;
        str.getClass();
        i.a = str;
    }

    public final void c() {
        this.d = true;
    }

    public final void d(String str, double d) {
        j(str, String.valueOf(d));
    }

    public final void e(String str, float f) {
        j(str, String.valueOf(f));
    }

    public final void f(String str, int i) {
        j(str, String.valueOf(i));
    }

    public final void g(String str, long j) {
        j(str, String.valueOf(j));
    }

    public final void h(String str, boolean z) {
        j(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (algu alguVar = this.b.c; alguVar != null; alguVar = alguVar.c) {
            boolean z2 = alguVar instanceof algt;
            Object obj = alguVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = alguVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
