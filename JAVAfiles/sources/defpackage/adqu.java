package defpackage;

import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adqu {
    public adqt a;
    public String b;
    public String c;
    public String d;
    public String e;
    public byte[] f;
    public aifc g;
    public String h;
    public apwq i;
    public long j;
    public String k;
    public int l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final int t;

    public adqu(adqt adqtVar) {
        this(adqtVar, 1);
    }

    public final String a() {
        byte[] bArr = this.f;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public final String b() {
        Object valueOf;
        String str = this.n;
        if (str != null) {
            return str;
        }
        String str2 = this.h;
        String str3 = this.k;
        aifc aifcVar = this.g;
        if (aifcVar == null) {
            valueOf = "0";
        } else {
            valueOf = Long.valueOf(aifcVar.a());
        }
        return "Type: " + str2 + "\r\nRCS message ID: " + str3 + "\r\nContent length: " + valueOf.toString();
    }

    public final String c() {
        return toString() + ": '" + advq.MESSAGE_CONTENT.c(a()) + "'";
    }

    public final void d(String str, byte[] bArr) {
        this.f = bArr;
        e(str);
    }

    public final void e(String str) {
        this.h = str;
        if (str != null) {
            albo.ap(str).startsWith("message/cpim");
        }
        this.a = adqt.a(str);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof adqu)) {
            adqu adquVar = (adqu) obj;
            if (this.j == adquVar.j && this.a == adquVar.a && Objects.equals(null, null) && Objects.equals(this.h, adquVar.h) && Objects.equals(this.b, adquVar.b) && Objects.equals(this.e, adquVar.e) && Objects.equals(this.c, adquVar.c) && Arrays.equals(this.f, adquVar.f) && this.t == adquVar.t) {
                return Objects.equals(this.g, adquVar.g);
            }
            return false;
        }
        return false;
    }

    public final void f(String str, aifc aifcVar) {
        this.g = aifcVar;
        e(str);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.h, this.b, this.e, this.c, this.f, Integer.valueOf(this.t)});
    }

    public final String toString() {
        Object valueOf;
        String valueOf2 = String.valueOf(this.a);
        String c = advq.USER_ID.c(this.b);
        String str = this.e;
        String c2 = advq.USER_ID.c(this.c);
        String str2 = this.k;
        String str3 = this.h;
        aifc aifcVar = this.g;
        if (aifcVar == null) {
            valueOf = "0";
        } else {
            valueOf = Long.valueOf(aifcVar.a());
        }
        int i = this.t;
        return "{ type: " + valueOf2 + ", messaging method: " + adom.x(i) + ", receiver: " + c + ", remote instance: " + str + ", sender: " + c2 + ", id: " + str2 + ", contentType: " + str3 + ", length: " + valueOf.toString() + " }";
    }

    public adqu(adqt adqtVar, int i) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        if (i == 2) {
            d.t(adqtVar.equals(adqt.CPIM_MESSAGE), "SLM allows only CPIM");
        }
        this.a = adqtVar;
        this.t = i;
    }

    public adqu(String str, aifd aifdVar) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        this.b = str;
        this.f = aifdVar.s();
        this.h = "message/cpim";
        aifdVar.e();
        this.a = adqt.a("message/cpim");
        this.t = 1;
    }

    public adqu(String str, byte[] bArr, String str2) {
        this.j = System.currentTimeMillis();
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = true;
        this.s = false;
        this.b = str;
        this.f = bArr;
        this.h = str2;
        this.a = adqt.a(str2);
        this.t = 1;
    }
}
