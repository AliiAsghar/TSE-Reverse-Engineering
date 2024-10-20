package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxm {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/conversation/conversationscale/ConversationScaleDataServiceImpl");
    public final armf b;
    public final armf c;
    public final aneo d;
    private final armf e;
    private wul f;
    private final ansy g;

    public zxm(armf armfVar, armf armfVar2, ansy ansyVar, armf armfVar3, aneo aneoVar) {
        this.e = armfVar;
        this.b = armfVar2;
        this.g = ansyVar;
        this.c = armfVar3;
        this.d = aneoVar;
    }

    public final wul a() {
        if (this.f == null) {
            znj znjVar = (znj) this.e.b();
            aiwl a2 = wus.a();
            a2.i(wuk.CONVERSATION_SCALE);
            a2.k(zxk.a);
            this.f = znjVar.ab(a2.f());
        }
        return this.f;
    }

    public final akfb b() {
        if (((Boolean) ((utz) zxn.a.get()).e()).booleanValue()) {
            return new akfk(this.g, new ikn(this, 20), "CONVERSATION_SCALE_CONTENT_KEY", 2);
        }
        return new akfk(this.g, new aaiq(this, 1), "CONVERSATION_SCALE_CONTENT_KEY", 2);
    }
}
