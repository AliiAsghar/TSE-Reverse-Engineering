package defpackage;

import defpackage.bwj;
import defpackage.dli;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djb {
    public static final dja a(bwj bwjVar) {
        dli.a aVar = (dli.a) bwjVar.g(dch.f);
        dqv dqvVar = (dqv) bwjVar.g(dch.d);
        drk drkVar = (drk) bwjVar.g(dch.i);
        boolean G = bwjVar.G(aVar) | bwjVar.G(dqvVar) | bwjVar.G(drkVar) | bwjVar.E(8);
        bwk bwkVar = (bwk) bwjVar;
        Object T = bwkVar.T();
        if (G || T == bwj.a.a) {
            T = new dja(aVar, dqvVar, drkVar);
            bwkVar.ad(T);
        }
        return (dja) T;
    }
}
