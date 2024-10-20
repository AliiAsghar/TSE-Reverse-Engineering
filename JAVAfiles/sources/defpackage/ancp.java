package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ancp extends ancn {
    @Override // defpackage.ancn
    public final int a(ancq ancqVar) {
        int i;
        synchronized (ancqVar) {
            i = ancqVar.remaining - 1;
            ancqVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.ancn
    public final void b(ancq ancqVar, Set set) {
        synchronized (ancqVar) {
            if (ancqVar.seenExceptions == null) {
                ancqVar.seenExceptions = set;
            }
        }
    }
}
