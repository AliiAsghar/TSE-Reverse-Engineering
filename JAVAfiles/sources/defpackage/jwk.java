package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwk extends arpw implements arqw {
    /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwk(arpe arpeVar, int i) {
        super(3, arpeVar);
        this.b = i;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.b != 0) {
            jwk jwkVar = new jwk((arpe) obj3, 1, null);
            jwkVar.a = (Throwable) obj2;
            return jwkVar.b(arnb.a);
        }
        ((Boolean) obj2).booleanValue();
        jwk jwkVar2 = new jwk((arpe) obj3, 0);
        jwkVar2.a = (afal) obj;
        return jwkVar2.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.b != 0) {
            aqil.P(obj);
            ((alvg) ((alvg) jcy.a.h()).g((Throwable) this.a).h("com/google/android/apps/messaging/conversation2/actions/adapter/ActionsUiAdapterImpl$startEmittingNow$3", "invokeSuspend", 100, "ActionsUiAdapterImpl.kt")).q("Ignoring exception from Action flow to avoid breaking all actions.");
            return arnb.a;
        }
        aqil.P(obj);
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwk(arpe arpeVar, int i, byte[] bArr) {
        super(3, arpeVar);
        this.b = i;
    }
}
