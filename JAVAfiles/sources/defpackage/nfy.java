package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfy implements Ctry, yfx {
    private static final alwo c = alwo.o("BugleSelfIdentity");
    public final msk a;
    public final yyt b;

    public nfy(wfh wfhVar, msk mskVar) {
        this.b = wfhVar.Y(this);
        this.a = mskVar;
    }

    @Override // defpackage.Ctry
    public final akul c(String str, boolean z) {
        String str2;
        alwl alwlVar = (alwl) c.d();
        alwlVar.X(ydl.D, str);
        alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateListener", "onStateChange", 42, "EtouffeeEncryptionStateListener.java");
        if (true != z) {
            str2 = "DISABLED";
        } else {
            str2 = "PROVISIONED";
        }
        alwlVar2.t("SelfIdentity encryption state changed to: %s.", str2);
        this.b.y(new mau(this, str, 9, null), "EtouffeeEncryptionStateListener::Notify");
        return aktp.ag(null);
    }

    @Override // defpackage.yfx
    public final /* synthetic */ void fs() {
    }

    @Override // defpackage.yfx
    public final /* synthetic */ void ft() {
    }
}
