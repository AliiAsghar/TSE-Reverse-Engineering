package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aijc {
    public final String d;
    public final HashMap c = new HashMap();
    public int e = -1;

    public aijc(String str) {
        this.d = str;
    }

    public boolean c() {
        if (!h("To-Path") || !h("From-Path")) {
            return false;
        }
        return true;
    }

    public final String d() {
        return (String) this.c.get("From-Path");
    }

    public final String e(String str) {
        return (String) this.c.get(str);
    }

    public final String f() {
        return (String) this.c.get("To-Path");
    }

    public final void g(String str, String str2) {
        this.c.put(str, str2);
    }

    public final boolean h(String str) {
        return this.c.containsKey(str);
    }
}
