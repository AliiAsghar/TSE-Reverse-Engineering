package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vbg {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/net/MsisdnFromSimHelper");
    public final armf b;
    private final armf c;

    public vbg(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.c = armfVar;
        this.b = armfVar2;
    }

    public final msh a(int i) {
        msh mshVar = (msh) arsd.k(((yjy) this.c.b()).h(i).j(true));
        if (mshVar == null) {
            ((alvg) a.i().h("com/google/android/apps/messaging/shared/net/MsisdnFromSimHelper", "getMessagingIdentityForSubscription", 62, "MsisdnFromSimHelper.kt")).r("Message identity not found for subId %s", i);
            return null;
        }
        return mshVar;
    }
}
