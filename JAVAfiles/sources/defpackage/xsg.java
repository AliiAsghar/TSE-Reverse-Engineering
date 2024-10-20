package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsg implements xsf {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final agnq c;
    public final Context d;
    public final armf e;
    private final anen f;
    private final anen g;

    public xsg(armf armfVar, agnq agnqVar, Context context, armf armfVar2, anen anenVar, anen anenVar2) {
        this.b = armfVar;
        this.c = agnqVar;
        this.d = context;
        this.e = armfVar2;
        this.f = anenVar;
        this.g = anenVar2;
    }

    @Override // defpackage.xsf
    public final akul a(String str) {
        return aktp.aj(new xpx(this, str, 4), this.g);
    }

    @Override // defpackage.xsf
    public final akul b(String str) {
        return aktp.ai(new xfb(this, str, 11, null), this.g);
    }

    @Override // defpackage.xsf
    public final akul c(xsq xsqVar) {
        int i = 12;
        byte[] bArr = null;
        return aktp.ai(new xfb(this, xsqVar, i, bArr), this.g).h(new xpm(this, xsqVar, 8, bArr), this.f).e(ajny.class, new xqp(i), andi.a);
    }

    public final boolean d(String str) {
        List h = ((xot) this.e.b()).h(str, xpg.UPLOAD);
        if (!h.isEmpty()) {
            if (((alsx) h).c <= 1) {
                return true;
            }
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "confirmSingleFileTransferTableEntry", 229, "LegacyRcsFileUploader.java")).q("Found more than one file upload entry in database.");
            return false;
        }
        ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/transfer/uploads/LegacyRcsFileUploader", "confirmSingleFileTransferTableEntry", 224, "LegacyRcsFileUploader.java")).q("Could not find the file upload entry in database.");
        return false;
    }
}
