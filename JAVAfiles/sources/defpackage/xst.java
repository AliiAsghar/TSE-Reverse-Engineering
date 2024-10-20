package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xst implements xsf {
    public final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final armf c;
    public final armf d;
    private final anen e;
    private final anen f;
    private final armf g;

    public xst(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.e = anenVar;
        this.f = anenVar2;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.g = armfVar4;
    }

    @Override // defpackage.xsf
    public final akul a(String str) {
        alwl alwlVar = (alwl) this.a.g();
        alwlVar.X(xod.a, str);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "pauseUpload", 115, "TachygramFileUploader.java")).q("Pausing the file upload.");
        return ((xoe) this.g.b()).b(str).i(new xfv(this, str, 10), this.e).i(new xfv(this, str, 11), this.e);
    }

    @Override // defpackage.xsf
    public final akul b(String str) {
        alwl alwlVar = (alwl) this.a.g();
        alwlVar.X(xod.a, str);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "resumeUpload", 130, "TachygramFileUploader.java")).q("Resuming the file upload.");
        xse xseVar = (xse) this.b.b();
        return aktp.aj(new xpx(xseVar, str, 3), xseVar.c);
    }

    @Override // defpackage.xsf
    public final akul c(xsq xsqVar) {
        MessageIdType B = xsqVar.a.B();
        return aktp.ah(new vri(this, xsqVar, B, 16, (boolean[]) null), this.f).i(new xrd(this, B, xsqVar, 5, (char[]) null), this.e);
    }

    public final akul d(String str) {
        alwl alwlVar = (alwl) this.a.g();
        alwlVar.X(xod.a, str);
        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "cancelUpload", 104, "TachygramFileUploader.java")).q("Canceling the file upload.");
        try {
            xse xseVar = (xse) this.b.b();
            return aktp.ah(new wnc(xseVar, str, 11, null), xseVar.c);
        } catch (IndexOutOfBoundsException unused) {
            ((alwl) ((alwl) this.a.i()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploader", "cancelUpload", 108, "TachygramFileUploader.java")).q("Attempted to cancel work, but no work was found.");
            return aktp.ag(null);
        }
    }
}
