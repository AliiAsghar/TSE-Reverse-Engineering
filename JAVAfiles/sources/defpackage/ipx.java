package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipx implements afkt, ioq {
    private final cg c;
    private final Context d;
    private final mci e;
    private final Supplier f;
    private final lbf g;
    private final afvr h;
    private final kor i;
    private final kor j;
    private final ifb k;
    private static final List b = aqjn.B(ameb.GALLERY_CHOOSER, ameb.GALLERY_LIBRARY, ameb.DEVICE_CAMERA_APP, ameb.CAMERA, ameb.FULLSCREEN_CAMERA, ameb.VIDEO_TRIMMER);
    public static final arml a = armd.a(ipf.e);

    public ipx(cg cgVar, Context context, ifb ifbVar, kor korVar, kor korVar2, mci mciVar, kor korVar3, Supplier supplier) {
        this.c = cgVar;
        this.d = context;
        this.k = ifbVar;
        this.i = korVar;
        this.j = korVar2;
        this.e = mciVar;
        this.f = supplier;
        this.g = (lbf) korVar.c().orElse(null);
        this.h = (afvr) korVar3.c().orElse(null);
    }

    static /* synthetic */ MessagePartCoreData f(ipx ipxVar, aftq aftqVar, boolean z, Enum r7, int i) {
        boolean z2;
        tqj tqjVar;
        int i2 = i & 2;
        afcp afcpVar = aftqVar.f;
        if (i2 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z & z2) {
            if (afcpVar instanceof afgh) {
                ifb ifbVar = ipxVar.k;
                String str = aftqVar.b;
                ims n = imt.n();
                n.g(Uri.parse(str));
                n.d(afwv.L(aftqVar.a).a());
                n.a = new Size(aftqVar.c, aftqVar.d);
                n.c(imn.a(afcpVar));
                n.f(aftqVar.e.toEpochMilli());
                n.b(ipq.f((afgh) afcpVar, 3));
                n.e(aftqVar.g.toMillis());
                return ifbVar.d(n.a(), ipq.o());
            }
            throw new IllegalStateException("Check failed.");
        }
        if ((i & 16) != 0) {
            r7 = null;
        }
        ifb ifbVar2 = ipxVar.k;
        String str2 = aftqVar.b;
        imz n2 = GalleryContent.n();
        n2.g(Uri.parse(str2));
        n2.c(afwv.L(aftqVar.a).a());
        n2.a = new Size(aftqVar.c, aftqVar.d);
        n2.d(aftqVar.g.toMillis());
        n2.b(imn.a(afcpVar));
        n2.e(aftqVar.e.toEpochMilli());
        if (r7 == afvs.a) {
            tqjVar = tqj.GOOGLE_PHOTOS_LINK;
        } else {
            tqjVar = tqj.STANDARD;
        }
        n2.f(tqjVar);
        return ifbVar2.d(n2.a(), ipq.o());
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ Object a(afcq afcqVar, arpe arpeVar) {
        Object obj;
        aftq aftqVar = (aftq) afcqVar;
        afcp afcpVar = aftqVar.f;
        if (afcpVar instanceof afgh) {
            MessagePartCoreData f = f(this, aftqVar, true, null, 16);
            obj = this.f.get();
            int c = ((inq) obj).c(f);
            if (c < 0) {
                return new afkz(new ioo(aftqVar));
            }
            this.e.f(f.N(), c);
            return afky.a;
        }
        if (!(afcpVar instanceof afgi) && !(afcpVar instanceof afgg) && !(afcpVar instanceof VideoTrimmerSource) && !(afcpVar instanceof afct)) {
            Objects.toString(afcpVar);
            throw new IllegalStateException("Invalid AttachmentSource: ".concat(afcpVar.toString()));
        }
        return e(aftqVar, arpeVar);
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void c(afcq afcqVar) {
        ((aftq) afcqVar).getClass();
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ void d(afcq afcqVar) {
        Object obj;
        MessagePartCoreData f = f(this, (aftq) afcqVar, false, null, 30);
        obj = this.f.get();
        ((inq) obj).h(f);
        this.e.g(f.N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r11 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008b, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.aftq r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipx.e(aftq, arpe):java.lang.Object");
    }

    @Override // defpackage.ioq
    public final /* synthetic */ arqr h() {
        return ipw.a;
    }

    @Override // defpackage.ioq
    public final boolean i(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        if (messagePartCoreData.bz() && b.contains(messagePartCoreData.M())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void b() {
    }
}
