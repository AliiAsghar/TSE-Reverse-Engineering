package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeft {
    public abjp a;
    public Context b;
    public aefo c;
    public alog d;
    public alog e;
    public final Map f;
    public aefs g;
    public boolean h;
    public boolean i;

    public aeft() {
        this.a = abjp.UNKNOWN;
        int i = alog.d;
        this.e = alsx.a;
        this.f = new HashMap();
        this.d = null;
    }

    public final aefu a() {
        boolean z;
        if (this.a != abjp.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Entry Point must be set.");
        if (this.c == null) {
            Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.c = new aefv(0);
        }
        return new aefu(this);
    }

    public final void b(aefq aefqVar) {
        this.f.put(aefqVar.a, aefqVar);
    }

    public final void c() {
        this.i = true;
    }

    public final void d(aefp aefpVar, int i) {
        int i2;
        if (this.f.containsKey(aefpVar.a)) {
            abjr abjrVar = aefpVar.a;
            int i3 = i - 2;
            if (i3 != 2) {
                if (i3 != 4) {
                    i2 = 3;
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 5;
            }
            b(new aefq(abjrVar, i2));
            return;
        }
        throw new IllegalArgumentException("Status of '" + aefpVar.b() + "' cannot be updated since no original status was set.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aeft(aefu aefuVar) {
        this.a = abjp.UNKNOWN;
        int i = alog.d;
        this.e = alsx.a;
        this.f = new HashMap();
        this.a = aefuVar.a;
        this.b = aefuVar.b;
        this.c = aefuVar.c;
        this.d = aefuVar.d;
        this.e = aefuVar.e;
        alog g = aefuVar.f.values().g();
        for (int i2 = 0; i2 < g.size(); i2++) {
            aefq aefqVar = (aefq) g.get(i2);
            this.f.put(aefqVar.a, aefqVar);
        }
        this.g = aefuVar.g;
        this.h = aefuVar.h;
        this.i = aefuVar.i;
    }
}
