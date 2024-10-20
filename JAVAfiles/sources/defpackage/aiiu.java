package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiiu {
    public static final advp a = new advp("MsrpMessage");
    public aozb b;
    public final aifc c;
    public final List d;
    public long e;
    public long f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public aiix l;
    public String m;
    public int n;
    public long o;
    public int p;
    public int q;
    public ahlp r;
    public atkt s;

    public aiiu() {
        this.b = aozb.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.j = false;
        this.k = false;
        this.l = null;
        this.p = 2;
        this.q = 1;
        this.s = new atkt();
        this.r = new ahlp((byte[]) null, (byte[]) null);
        this.c = new aiez(aozb.b, 0);
    }

    private static void h(String str) {
        if ("yes".equals(str) || "no".equals(str)) {
        } else {
            throw new IllegalArgumentException("Undefined report required value: ".concat(str));
        }
    }

    public final String a() {
        return this.r.d("From-Path");
    }

    public final String b() {
        return this.r.d("Message-ID");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return (String) alzz.aO(this.d);
    }

    public final String d() {
        return this.r.d("To-Path");
    }

    public final void e(String str) {
        h(str);
        this.i = str;
    }

    public final void f(String str) {
        this.r.e("Message-ID", str);
    }

    public final void g() {
        h("no");
        this.h = "no";
    }

    public final String toString() {
        String str;
        String obj;
        boolean booleanValue = ((Boolean) acpy.g.a()).booleanValue();
        String b = b();
        String str2 = this.g;
        long j = this.e;
        String str3 = "(redacted)";
        if (!booleanValue) {
            str = "(redacted)";
        } else {
            str = d();
        }
        if (booleanValue) {
            str3 = a();
        }
        boolean z = this.j;
        boolean z2 = this.k;
        String str4 = this.h;
        String str5 = this.i;
        if (((Boolean) acpy.g.a()).booleanValue() || (obj = this.m) == null) {
            obj = this.c.toString();
            advr.p(a, "Message content is not displayed as the inputStream can only be read once.", new Object[0]);
        }
        return "Message ID: " + b + "\r\nContent array type: " + str2 + "\r\nContent array length: " + j + "\r\nTo: " + str + "\r\nFrom: " + str3 + "\r\nSilent: " + z + "\r\nCanceled: " + z2 + "\r\nSuccess report required: " + str4 + "\r\nFailure report required: " + str5 + "\r\nContent array value: \r\n" + obj;
    }

    public aiiu(aifc aifcVar, String str) {
        this.b = aozb.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.j = false;
        this.k = false;
        this.l = null;
        this.p = 2;
        this.q = 1;
        this.c = aifcVar;
        this.g = str;
        this.e = aifcVar.a();
        this.r = new ahlp((byte[]) null, (byte[]) null);
    }

    public aiiu(Map map) {
        this.b = aozb.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.j = false;
        this.k = false;
        this.l = null;
        this.p = 2;
        this.s = new atkt();
        this.q = 2;
        this.r = new ahlp((byte[]) null, (byte[]) null);
        String str = (String) map.get("Message-ID");
        if (str != null) {
            this.r.e("Message-ID", str);
        }
        String str2 = (String) map.get("From-Path");
        if (str2 != null) {
            this.r.e("From-Path", str2);
        }
        String str3 = (String) map.get("To-Path");
        if (str3 != null) {
            this.r.e("To-Path", str3);
        }
        this.h = (String) map.get("Success-Report");
        this.i = (String) map.get("Failure-Report");
        this.g = (String) map.get(assi.a);
        String str4 = (String) map.get("Byte-Range");
        if (str4 != null) {
            List c = anna.e('/').c(str4);
            if (((String) c.get(1)).equals("*")) {
                this.e = Long.MIN_VALUE;
            } else {
                this.e = Long.parseLong((String) c.get(1));
            }
        }
        this.c = new aiez(aozb.b, 0);
    }

    public aiiu(byte[] bArr) {
        this.b = aozb.b;
        this.d = new ArrayList();
        this.e = 0L;
        this.j = false;
        this.k = false;
        this.l = null;
        this.p = 2;
        this.q = 1;
        this.b = aozb.w(bArr);
        this.c = new aiez(aozb.b, 0);
        this.g = "message/cpim";
        this.e = bArr.length;
        this.r = new ahlp((byte[]) null, (byte[]) null);
    }
}
