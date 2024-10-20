package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iow implements afkt {
    private final /* synthetic */ ipp a;
    private final /* synthetic */ int b;

    public iow(mci mciVar, ifb ifbVar, Supplier supplier, int i) {
        this.b = i;
        this.a = new ipp(mciVar, supplier, new gsh(ifbVar, 14));
    }

    @Override // defpackage.afkt
    public final /* synthetic */ Object a(afcq afcqVar, arpe arpeVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return this.a.a((FileContentItem) afcqVar, arpeVar);
                }
                return this.a.a((imy) afcqVar, arpeVar);
            }
            return this.a.a((inf) afcqVar, arpeVar);
        }
        return this.a.a((VCardContentItem) afcqVar, arpeVar);
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void c(afcq afcqVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((FileContentItem) afcqVar).getClass();
                    return;
                } else {
                    ((imy) afcqVar).getClass();
                    return;
                }
            }
            ((inf) afcqVar).getClass();
            return;
        }
        ((VCardContentItem) afcqVar).getClass();
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void d(afcq afcqVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    this.a.d((FileContentItem) afcqVar);
                    return;
                } else {
                    this.a.d((imy) afcqVar);
                    return;
                }
            }
            this.a.d((inf) afcqVar);
            return;
        }
        this.a.d((VCardContentItem) afcqVar);
    }

    public iow(mci mciVar, ifb ifbVar, Supplier supplier, int i, byte[] bArr) {
        this.b = i;
        this.a = new ipp(mciVar, supplier, new gsh(ifbVar, 16));
    }

    public iow(mci mciVar, ifb ifbVar, Supplier supplier, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = new ipp(mciVar, supplier, new gsh(ifbVar, 17));
    }

    public iow(mci mciVar, ifb ifbVar, Supplier supplier, int i, char[] cArr) {
        this.b = i;
        this.a = new ipp(mciVar, supplier, new gsh(ifbVar, 15));
    }

    @Override // defpackage.afkt
    public final void b() {
    }
}
