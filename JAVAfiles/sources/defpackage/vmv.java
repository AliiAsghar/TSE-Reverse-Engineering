package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore");
    public final anen b;
    public final wul c;
    public final vln d;

    public vmv(anen anenVar, armf armfVar, vln vlnVar) {
        this.b = anenVar;
        znj znjVar = (znj) armfVar.b();
        aiwl a2 = wus.a();
        a2.i(wuk.INCOMING_MESSAGE_NOTIFICATION_SETTINGS);
        a2.k(vmx.a);
        this.c = znjVar.ab(a2.f());
        this.d = vlnVar;
    }

    public final akul a(vlm vlmVar) {
        return this.c.j(new vqv(this, vlmVar, 1)).e(apba.class, new vip(11), this.b).h(new vip(12), andi.a);
    }
}
