package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktx {
    public akry a;
    public final boolean b;
    public int c = 4;

    public aktx(aksb aksbVar, boolean z) {
        akry akryVar;
        if (z) {
            akryVar = aksbVar.a();
        } else {
            akryVar = null;
        }
        this.a = akryVar;
        this.b = z;
    }

    public static void a(akry akryVar) {
        Trace.beginSection(akqj.m(akryVar.c()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(akry akryVar) {
        if (d(akryVar)) {
            Trace.beginSection("<CR:propagated>");
            a(akryVar);
        } else {
            if (akryVar.a() != null) {
                b(akryVar.a());
            }
            a(akryVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(akry akryVar) {
        if (d(akryVar)) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            if (akryVar.a() != null) {
                c(akryVar.a());
            }
        }
    }

    public final boolean d(akry akryVar) {
        if (akryVar.b() != this) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.c != 4) {
            return true;
        }
        return false;
    }
}
