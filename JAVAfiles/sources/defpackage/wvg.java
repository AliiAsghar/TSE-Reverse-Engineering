package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wvg {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl");
    public final armf b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;

    public wvg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar7;
    }

    public final String a() {
        try {
            return ((adtn) this.c.b()).m().substring(0, 3);
        } catch (StringIndexOutOfBoundsException e) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "getMcc", ']', "SimChangeManagerImpl.java")).q("failed to obtain mcc");
            return "";
        }
    }

    public final String b() {
        try {
            return ((adtn) this.c.b()).m().substring(3);
        } catch (StringIndexOutOfBoundsException e) {
            alvw i = a.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) i).g(e)).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "getMnc", 'f', "SimChangeManagerImpl.java")).q("failed to obtain mnc");
            return "";
        }
    }
}
