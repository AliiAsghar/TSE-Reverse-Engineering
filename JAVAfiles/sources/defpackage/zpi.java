package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpi implements hxb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zpi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aerg, java.lang.Object] */
    @Override // defpackage.hxb
    public final boolean eV(hpp hppVar, Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                this.a.b(hppVar, obj);
                return false;
            }
            if (hppVar != null) {
                xzb.s(hppVar, "Failed to load attachment image");
            }
            ((mbl) ((xus) this.a).i.b()).c("Bugle.Share.AttachmentViewImage.FailedToLoad");
            return false;
        }
        if (hppVar != null) {
            xzb.s(hppVar, "Failed to load video thumbnail");
        }
        ((mbl) ((zpj) this.a).e.b()).c("Bugle.Share.AttachmentViewVideoThumbnail.FailedToLoad");
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aerg, java.lang.Object] */
    @Override // defpackage.hxb
    public final /* synthetic */ boolean eW(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                this.a.d((Drawable) obj, obj2);
                return false;
            }
            return false;
        }
        return false;
    }
}
