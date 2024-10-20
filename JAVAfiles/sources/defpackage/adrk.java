package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrk {
    public boolean a = false;
    private long c = 0;
    public long b = 0;

    public final void a(String str) {
        try {
            this.c = advj.a(str) / 1000;
        } catch (ParseException unused) {
            this.c = System.currentTimeMillis() / 1000;
        }
    }

    public final String toString() {
        return "Active: " + this.a + ", refresh time " + this.b + ", last active " + this.c;
    }
}
