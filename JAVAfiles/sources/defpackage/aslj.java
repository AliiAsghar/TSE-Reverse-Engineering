package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aslj {
    private final boolean a;
    private String[] b;
    private String[] c;
    private boolean d;

    public aslj(aslk aslkVar) {
        this.a = aslkVar.c;
        this.b = aslkVar.e;
        this.c = aslkVar.f;
        this.d = aslkVar.d;
    }

    public final aslk a() {
        return new aslk(this.a, this.d, this.b, this.c);
    }

    public final void b(String... strArr) {
        strArr.getClass();
        if (this.a) {
            if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    @armg
    public final void c() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections");
    }

    public final void d(String... strArr) {
        strArr.getClass();
        if (this.a) {
            if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    public final void e(asli... asliVarArr) {
        asliVarArr.getClass();
        if (this.a) {
            ArrayList arrayList = new ArrayList(asliVarArr.length);
            for (asli asliVar : asliVarArr) {
                arrayList.add(asliVar.s);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    public final void f(asmr... asmrVarArr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(asmrVarArr.length);
            for (asmr asmrVar : asmrVarArr) {
                arrayList.add(asmrVar.f);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    public aslj(boolean z) {
        this.a = z;
    }
}
