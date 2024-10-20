package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyc {
    public static final alvi a = alvi.m("com/google/apps/tiktok/account/api/controller/AccountRequirementManagerImpl");
    public final anen c;
    public final agxw e;
    public final List d = new ArrayList();
    public final armf b = null;

    public ajyc(agxw agxwVar, anen anenVar) {
        this.e = agxwVar;
        this.c = anenVar;
    }

    public final void a(ajyb ajybVar) {
        aiut.c();
        synchronized (this.d) {
            this.d.add(ajybVar);
        }
    }

    public final void b(ajyb ajybVar) {
        aiut.c();
        synchronized (this.d) {
            this.d.remove(ajybVar);
        }
    }
}
