package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akto {
    public static long a = Math.abs(new Random().nextInt()) << 30;
    public static final HashMap b = new HashMap();
    public static final Object c = new Object();
    public static aksa d;

    public static final algk a(algk algkVar) {
        algkVar.getClass();
        return new aktm(akqj.e(), algkVar);
    }

    public static final alhr b(alhr alhrVar) {
        return new akll(akqj.e(), alhrVar, 2, null);
    }

    public static final ancr c(ancr ancrVar) {
        return new aktk(akqj.e(), ancrVar, 0);
    }

    public static final ancs d(ancs ancsVar) {
        return new anct(akqj.e(), ancsVar, 1);
    }

    public static final ancv e(ancv ancvVar) {
        return new ygl(akqj.e(), ancvVar, 3);
    }

    public static final ancx f(ancx ancxVar) {
        return new mke(akqj.e(), ancxVar, 3);
    }

    public static final ancy g(ancy ancyVar) {
        return new mkf(akqj.e(), ancyVar, 5);
    }

    public static final andy h(andy andyVar) {
        andyVar.getClass();
        return new aktn(akqj.e(), andyVar, 0);
    }

    public static final Runnable i(Runnable runnable) {
        return new ajnt(s(), runnable, 16);
    }

    public static final Runnable j(Runnable runnable) {
        runnable.getClass();
        akry e = akqj.e();
        arsb arsbVar = new arsb();
        if (akpz.a == 1) {
            int i = akug.a;
        }
        return new aqwc(arsbVar, e, runnable, 1);
    }

    public static final Callable k(Callable callable) {
        return new aktl(akqj.e(), callable, 1);
    }

    public static final Callable l(Callable callable) {
        return new aktl(s(), callable, 0);
    }

    public static final void m(Intent intent) {
        intent.getClass();
        if (akrn.a != 1 && !intent.hasExtra("tracing_intent_id")) {
            throw new IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
        }
    }

    public static final void n(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        akti r = r(intent2);
        try {
            context.startActivity(intent2);
            armd.i(r, null);
        } finally {
        }
    }

    public static final void o(Context context, Intent intent, Bundle bundle) {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        akti r = r(intent2);
        try {
            context.startActivity(intent2, bundle);
            armd.i(r, null);
        } finally {
        }
    }

    public static final akry p(Intent intent, boolean z) {
        Object obj;
        akry akryVar;
        try {
            if (intent.hasExtra("tracing_intent_id")) {
                long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
                HashMap hashMap = b;
                synchronized (hashMap) {
                    if (z) {
                        obj = hashMap.remove(Long.valueOf(longExtra));
                    } else {
                        obj = hashMap.get(Long.valueOf(longExtra));
                    }
                    akryVar = (akry) obj;
                }
                return akryVar;
            }
            return null;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    public static final boolean q() {
        akru b2 = akqj.b();
        if (b2.c != null || b2.d != null) {
            return true;
        }
        return false;
    }

    public static final akti r(Intent intent) {
        long j;
        akry e = akqj.e();
        akry c2 = akqj.c();
        if (c2 != null) {
            akrl akrlVar = akpw.a;
            if (!c2.j(akpw.c).b()) {
                synchronized (c2) {
                    if (!c2.j(akpw.c).b()) {
                        c2.s(akpw.c, true);
                    }
                }
            }
        }
        HashMap hashMap = b;
        synchronized (hashMap) {
            j = a;
            a = 1 + j;
        }
        intent.putExtra("tracing_intent_id", j);
        return new akti(j);
    }

    private static final akry s() {
        akru b2 = akqj.b();
        akry akryVar = b2.c;
        if (akryVar != null || (akryVar = b2.d) != null) {
            return akryVar;
        }
        throw new IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
    }
}
