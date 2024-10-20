package defpackage;

import androidx.profileinstaller.ProfileInstallReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggh implements ggj {
    final /* synthetic */ ProfileInstallReceiver a;

    public ggh(ProfileInstallReceiver profileInstallReceiver) {
        this.a = profileInstallReceiver;
    }

    @Override // defpackage.ggj
    public final void a(int i, Object obj) {
        ggk.b.a(i, obj);
        this.a.setResultCode(i);
    }

    @Override // defpackage.ggj
    public final void b() {
        ggk.b.b();
    }
}
