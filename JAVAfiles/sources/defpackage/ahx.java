package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahx {
    public static final ahl a(bwj bwjVar) {
        aag a = zg.a(bwjVar);
        boolean G = bwjVar.G(a);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            T = new agu(a);
            bwkVar.ad(T);
        }
        return (agu) T;
    }

    public static final afl b(bwj bwjVar) {
        afl aflVar;
        Context context = (Context) bwjVar.g(AndroidCompositionLocals_androidKt.b);
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        afj afjVar = (afj) bwjVar.g(afk.a);
        bwjVar.y(1852285245);
        if (afjVar != null) {
            boolean G = bwjVar.G(context) | bwjVar.G(dqvVar) | bwjVar.G(afjVar);
            Object h = bwjVar.h();
            if (G || h == bwj.a.a) {
                h = new ade(context, dqvVar, afjVar);
                bwjVar.B(h);
            }
            aflVar = (ade) h;
        } else {
            aflVar = afi.a;
        }
        bwjVar.q();
        return aflVar;
    }

    public static final boolean c(drk drkVar, ahp ahpVar, boolean z) {
        if (drkVar == drk.b && ahpVar != ahp.a) {
            return z;
        }
        return !z;
    }
}
