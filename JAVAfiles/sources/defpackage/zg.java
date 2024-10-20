package defpackage;

import android.view.ViewConfiguration;
import defpackage.bwj;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zg {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final aag a(bwj bwjVar) {
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        boolean D = bwjVar.D(dqvVar.ec());
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (D || T == bwj.a.a) {
            T = new aah(new zf(dqvVar));
            bwkVar.ad(T);
        }
        return (aag) T;
    }
}
