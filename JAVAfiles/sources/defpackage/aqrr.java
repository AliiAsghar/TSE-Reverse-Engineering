package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqrr {
    public static final aqrr a;
    public final aqsn b;
    public final Executor c;
    public final String d;
    public final List e;
    public final Integer f;
    public final Integer g;
    public final appn h;
    private final Object[][] i;
    private final Boolean j;

    static {
        aqrp aqrpVar = new aqrp();
        aqrpVar.d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        aqrpVar.e = Collections.emptyList();
        a = new aqrr(aqrpVar);
    }

    public aqrr(aqrp aqrpVar) {
        this.b = aqrpVar.a;
        this.c = aqrpVar.b;
        this.h = aqrpVar.i;
        this.d = aqrpVar.c;
        this.i = aqrpVar.d;
        this.e = aqrpVar.e;
        this.j = aqrpVar.f;
        this.f = aqrpVar.g;
        this.g = aqrpVar.h;
    }

    public static aqrp a(aqrr aqrrVar) {
        aqrp aqrpVar = new aqrp();
        aqrpVar.a = aqrrVar.b;
        aqrpVar.b = aqrrVar.c;
        aqrpVar.i = aqrrVar.h;
        aqrpVar.c = aqrrVar.d;
        aqrpVar.d = aqrrVar.i;
        aqrpVar.e = aqrrVar.e;
        aqrpVar.f = aqrrVar.j;
        aqrpVar.g = aqrrVar.f;
        aqrpVar.h = aqrrVar.g;
        return aqrpVar;
    }

    public final aqrr b(aqsn aqsnVar) {
        aqrp a2 = a(this);
        a2.a = aqsnVar;
        return new aqrr(a2);
    }

    public final aqrr c(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "invalid maxsize %s", i);
        aqrp a2 = a(this);
        a2.g = Integer.valueOf(i);
        return new aqrr(a2);
    }

    public final aqrr d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "invalid maxsize %s", i);
        aqrp a2 = a(this);
        a2.h = Integer.valueOf(i);
        return new aqrr(a2);
    }

    public final aqrr e(aqrq aqrqVar, Object obj) {
        int i;
        aqrqVar.getClass();
        obj.getClass();
        aqrp a2 = a(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.i;
            if (i2 < objArr.length) {
                if (aqrqVar.equals(objArr[i2][0])) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Object[][] objArr2 = this.i;
        if (i2 == -1) {
            i = 1;
        } else {
            i = 0;
        }
        a2.d = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr2.length + i, 2);
        Object[][] objArr3 = this.i;
        System.arraycopy(objArr3, 0, a2.d, 0, objArr3.length);
        if (i2 == -1) {
            Object[][] objArr4 = a2.d;
            int length = this.i.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = aqrqVar;
            objArr5[1] = obj;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = a2.d;
            Object[] objArr7 = new Object[2];
            objArr7[0] = aqrqVar;
            objArr7[1] = obj;
            objArr6[i2] = objArr7;
        }
        return new aqrr(a2);
    }

    public final Object f(aqrq aqrqVar) {
        aqrqVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.i;
            if (i < objArr.length) {
                if (aqrqVar.equals(objArr[i][0])) {
                    return this.i[i][1];
                }
                i++;
            } else {
                return aqrqVar.a;
            }
        }
    }

    public final boolean g() {
        return Boolean.TRUE.equals(this.j);
    }

    public final aqrr h(apsd apsdVar) {
        ArrayList arrayList = new ArrayList(this.e.size() + 1);
        arrayList.addAll(this.e);
        arrayList.add(apsdVar);
        aqrp a2 = a(this);
        a2.e = DesugarCollections.unmodifiableList(arrayList);
        return new aqrr(a2);
    }

    public final String toString() {
        Class<?> cls;
        algv aj = albo.aj(this);
        aj.b("deadline", this.b);
        aj.b("authority", null);
        aj.b("callCredentials", this.h);
        Executor executor = this.c;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        aj.b("executor", cls);
        aj.b("compressorName", this.d);
        aj.b("customOptions", Arrays.deepToString(this.i));
        aj.h("waitForReady", g());
        aj.b("maxInboundMessageSize", this.f);
        aj.b("maxOutboundMessageSize", this.g);
        aj.b("onReadyThreshold", null);
        aj.b("streamTracerFactories", this.e);
        return aj.toString();
    }
}
