package defpackage;

import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjo {
    public final String a;
    public final File b;
    public final String c;
    public final ahjv d;
    final boolean f;
    final boolean g;
    public final adwv j;
    public final agrk k;
    private ahjn m;
    public final alqu e = new alln();
    int h = 0;
    private boolean l = false;
    public ahji i = null;

    public ahjo(ahjv ahjvVar, String str, File file, String str2, adwv adwvVar, agrk agrkVar) {
        this.m = ahjn.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.j = adwvVar;
        this.d = ahjvVar;
        this.k = agrkVar;
        boolean b = ahjl.b(str);
        this.f = b;
        boolean f = f(str);
        this.g = f;
        if (!f && !b) {
            return;
        }
        this.m = ahjn.NONE;
    }

    public static boolean f(String str) {
        return str.startsWith("file:");
    }

    public final synchronized ahjn a() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.l = true;
    }

    public final synchronized boolean e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahjo)) {
            return false;
        }
        ahjo ahjoVar = (ahjo) obj;
        if (!d.B(this.a, ahjoVar.a) || !d.B(this.b, ahjoVar.b) || !d.B(this.c, ahjoVar.c) || !d.B(this.m, ahjoVar.m) || this.l != ahjoVar.l) {
            return false;
        }
        return true;
    }

    public final void g(ahjn ahjnVar) {
        if (!this.g && !this.f) {
            this.m = ahjnVar;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.m, Boolean.valueOf(this.l)});
    }

    public final String toString() {
        algv ai = albo.ai(ahjo.class);
        ai.b("", this.a);
        ai.b("targetDirectory", this.b);
        ai.b("fileName", this.c);
        ai.b("requiredConnectivity", this.m);
        ai.h("canceled", this.l);
        return ai.toString();
    }
}
