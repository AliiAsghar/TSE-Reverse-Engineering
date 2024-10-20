package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylf implements ajoa {
    public dtq a;
    public ajnv b;

    @Override // defpackage.ajoa
    public final void c(String str) {
        akrh e = aktp.e("ConnectedRcsServiceFactory#handleServiceDisconnected");
        try {
            this.b = null;
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoa
    public final void fG(String str, ajnz ajnzVar) {
        akrh e = aktp.e("ConnectedRcsServiceFactory#handleServiceConnectFailed");
        try {
            this.a.d(new ylp(str, ajnzVar));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoa
    public final void fH(String str) {
        ((alwl) ylg.b.m().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 60, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() start for serviceClassName %s", str);
        akrh e = aktp.e("ConnectedRcsServiceFactory#handleServiceConnected");
        try {
            ajnv ajnvVar = this.b;
            if (ajnvVar != null) {
                this.a.b(ajnvVar);
                ((alwl) ylg.b.m().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 66, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() completer.set rcsService %s", this.b);
            } else {
                ((alwl) ylg.b.m().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory$ServiceListener", "handleServiceConnected", 68, "ConnectedRcsServiceFactory.java")).t("handleServiceConnected() rcsService is Null for serviceClassName %s", str);
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
