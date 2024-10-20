package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifb {
    public final Object a;
    public final Object b;

    public ifb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object a(String str, Boolean bool, Boolean bool2, arqg arqgVar, arpe arpeVar) {
        kjl kjlVar;
        if (bool == null && bool2 == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (arqgVar == null) {
            kjlVar = new kjl(b(str, bool, bool2), null, false, null, null, 125);
        } else {
            kjlVar = new kjl(b(str, bool, bool2), ((Context) this.a).getString(R.string.snack_bar_undo), false, null, arqgVar, 57);
        }
        Object k = ((jxv) this.b).k(kjlVar, arpeVar);
        if (k == arpl.a) {
            return k;
        }
        return arnb.a;
    }

    public final String b(String str, Boolean bool, Boolean bool2) {
        int i;
        str.getClass();
        if (bool != null && bool2 != null) {
            if (bool.booleanValue()) {
                i = R.string.blocked_and_reported_toast_message;
            } else {
                i = R.string.unblock_and_report_not_spam_snackbar_message;
            }
        } else if (bool != null) {
            if (bool.booleanValue()) {
                i = R.string.blocked_toast_message;
            } else {
                i = R.string.unblock_snackbar_message;
            }
        } else {
            bool2.getClass();
            if (bool2.booleanValue()) {
                i = R.string.report_spam_snackbar_message;
            } else {
                i = R.string.report_not_spam_snackbar_message;
            }
        }
        String string = ((Context) this.a).getString(i, str);
        string.getClass();
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final wul c() {
        return (wul) this.a.a();
    }

    public final MessagePartCoreData d(mxf mxfVar, aauj aaujVar) {
        ameb amebVar;
        String scheme;
        rtc a = rtd.a();
        a.c = mxfVar.j();
        a.d = mxfVar.d();
        a.e = mxfVar.d();
        if (mxfVar instanceof imv) {
            amebVar = ((imv) mxfVar).g();
        } else {
            amebVar = ameb.UNKNOWN;
        }
        a.k(amebVar);
        if (mxfVar instanceof imo) {
            imo imoVar = (imo) mxfVar;
            a.c(imoVar.b);
            a.m = imoVar.c;
        } else if (mxfVar instanceof imy) {
            imy imyVar = (imy) mxfVar;
            a.k = imyVar.b;
            a.l(imyVar.c);
        } else if (mxfVar instanceof myt) {
            myt mytVar = (myt) mxfVar;
            a.m(mytVar.e().getWidth());
            a.e(mytVar.e().getHeight());
            if (mytVar instanceof myn) {
                myn mynVar = (myn) mytVar;
                a.f(mynVar.a());
                a.h(!mynVar.k());
                mynVar.h().ifPresent(new ibo(a, 15));
                if (mynVar instanceof GalleryContent) {
                    a.g(((GalleryContent) mynVar).f());
                }
            } else if (mytVar instanceof ind) {
                ind indVar = (ind) mytVar;
                LocationInformation locationInformation = new LocationInformation();
                locationInformation.d = indVar.c;
                locationInformation.c = indVar.b;
                a.i = locationInformation;
                a.b = indVar.a;
            } else if (mytVar instanceof imx) {
                a.j = ((imx) mytVar).e;
            } else if (mytVar instanceof inb) {
                Uri uri = ((inb) mytVar).b;
                if (uri == null || ((scheme = uri.getScheme()) != null && scheme.startsWith("http"))) {
                    uri = null;
                }
                a.e = uri;
            }
        }
        MessagePartData e = ((rtb) this.a).e(a.a());
        if (ydk.u(mxfVar.d()) || (mxfVar instanceof inb) || (mxfVar instanceof imy) || (mxfVar instanceof imx) || ((mxfVar instanceof GalleryContent) && ((GalleryContent) mxfVar).f() != tqj.GOOGLE_PHOTOS_LINK)) {
            e = ((rtg) this.b).a(e);
        }
        if (e.f == null) {
            e.f = aajv.e(mxfVar, aaujVar);
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData] */
    public final MessagePartCoreData e(MediaContentItem mediaContentItem, aauj aaujVar) {
        MessagePartData d;
        MessagePartData messagePartData;
        boolean z = mediaContentItem instanceof LocationContentItem;
        Uri h = mediaContentItem.h();
        String i = mediaContentItem.i();
        int f = mediaContentItem.f();
        int d2 = mediaContentItem.d();
        if (z) {
            messagePartData = ((LocationContentItem) mediaContentItem).a;
        } else {
            ameb amebVar = mediaContentItem.d;
            if (mediaContentItem instanceof AudioContentItem) {
                Object obj = this.a;
                rtc a = rtd.a();
                a.c = i;
                a.d = h;
                a.e = h;
                a.c(((AudioContentItem) mediaContentItem).a);
                a.k(amebVar);
                messagePartData = ((rtb) obj).e(a.a());
            } else if (mediaContentItem instanceof CameraContentItem) {
                CameraContentItem cameraContentItem = (CameraContentItem) mediaContentItem;
                Object obj2 = this.a;
                rtc a2 = rtd.a();
                a2.c = i;
                a2.d = h;
                a2.e = h;
                a2.m(f);
                a2.e(d2);
                a2.c(cameraContentItem.e);
                a2.k(amebVar);
                a2.f(cameraContentItem.f);
                messagePartData = ((rtb) obj2).e(a2.a());
            } else if (mediaContentItem instanceof GalleryContentItem) {
                GalleryContentItem galleryContentItem = (GalleryContentItem) mediaContentItem;
                Object obj3 = this.a;
                rtc a3 = rtd.a();
                a3.c = i;
                a3.d = h;
                a3.e = h;
                a3.m(f);
                a3.e(d2);
                a3.c(galleryContentItem.a);
                a3.k(amebVar);
                a3.f(galleryContentItem.e);
                a3.g(galleryContentItem.f);
                MessagePartData e = ((rtb) obj3).e(a3.a());
                messagePartData = e;
                if (galleryContentItem.f != tqj.GOOGLE_PHOTOS_LINK) {
                    messagePartData = ((rtg) this.b).a(e);
                }
            } else if (mediaContentItem instanceof GifContentItem) {
                PendingAttachmentData b = ((rtg) this.b).b("image/gif", mediaContentItem.h(), ameb.GIF_CHOOSER);
                b.k = ((GifContentItem) mediaContentItem).e;
                messagePartData = b;
            } else {
                if (mediaContentItem instanceof ExpressiveStickerContentItem) {
                    Object obj4 = this.b;
                    String str = ((ExpressiveStickerContentItem) mediaContentItem).a;
                    rtg rtgVar = (rtg) obj4;
                    wfh wfhVar = (wfh) rtgVar.a.b();
                    wfhVar.getClass();
                    Context context = (Context) rtgVar.b.b();
                    context.getClass();
                    ydf ydfVar = (ydf) rtgVar.c.b();
                    ydfVar.getClass();
                    xbf xbfVar = (xbf) rtgVar.d.b();
                    xbfVar.getClass();
                    ydk ydkVar = (ydk) rtgVar.e.b();
                    ydkVar.getClass();
                    rtb rtbVar = (rtb) rtgVar.f.b();
                    rtbVar.getClass();
                    uff uffVar = (uff) rtgVar.g.b();
                    uffVar.getClass();
                    armf armfVar = rtgVar.h;
                    xav xavVar = (xav) rtgVar.i.b();
                    xavVar.getClass();
                    rtg rtgVar2 = (rtg) rtgVar.r.b();
                    rtgVar2.getClass();
                    yfo yfoVar = (yfo) rtgVar.j.b();
                    yfoVar.getClass();
                    xnv xnvVar = (xnv) rtgVar.k.b();
                    xnvVar.getClass();
                    zxy zxyVar = (zxy) rtgVar.l.b();
                    zxyVar.getClass();
                    ydy ydyVar = (ydy) rtgVar.m.b();
                    ydyVar.getClass();
                    Optional optional = (Optional) ((apxx) rtgVar.n).a;
                    wfh wfhVar2 = (wfh) rtgVar.o.b();
                    wfhVar2.getClass();
                    anen anenVar = (anen) rtgVar.p.b();
                    anenVar.getClass();
                    amebVar.getClass();
                    str.getClass();
                    d = new PendingAttachmentData(wfhVar, context, ydfVar, xbfVar, ydkVar, rtbVar, uffVar, armfVar, xavVar, rtgVar2, yfoVar, xnvVar, zxyVar, ydyVar, optional, wfhVar2, anenVar, null, i, h, null, f, d2, null, null, -1L, amebVar, -1L, null, str, null);
                } else if (mediaContentItem instanceof FileContentItem) {
                    FileContentItem fileContentItem = (FileContentItem) mediaContentItem;
                    d = ((rtg) this.b).d(i, h, null, f, d2, fileContentItem.e, amebVar, null, null, -1L, null, fileContentItem.a);
                } else {
                    Object obj5 = this.a;
                    rtc a4 = rtd.a();
                    a4.c = i;
                    a4.d = h;
                    a4.e = h;
                    a4.m(f);
                    a4.e(d2);
                    a4.k(amebVar);
                    a4.f(mediaContentItem.g());
                    d = ((rtb) obj5).e(a4.a());
                }
                d.al(aajv.s(mediaContentItem, aaujVar));
                return d;
            }
        }
        d = messagePartData;
        d.al(aajv.s(mediaContentItem, aaujVar));
        return d;
    }

    public final amlk f(int i) {
        aozy createBuilder = amlk.a.createBuilder();
        amhb x = ((lfl) this.a).x(i);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amlk amlkVar = (amlk) createBuilder.b;
        amlkVar.c = x;
        amlkVar.b |= 1;
        int d = ((xbf) this.b).a(i).d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amlk amlkVar2 = (amlk) createBuilder.b;
        amlkVar2.b |= 2;
        amlkVar2.d = d;
        int intValue = ((Integer) ium.c.e()).intValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amlk amlkVar3 = (amlk) apagVar;
        amlkVar3.b |= 4;
        amlkVar3.e = intValue;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amlk amlkVar4 = (amlk) createBuilder.b;
        amlkVar4.f = 1;
        amlkVar4.b |= 8;
        return (amlk) createBuilder.s();
    }

    public ifb(rtg rtgVar, rtb rtbVar) {
        this.b = rtgVar;
        this.a = rtbVar;
    }

    public ifb(armf armfVar, armf armfVar2, char[] cArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public ifb(armf armfVar, arpi arpiVar) {
        armfVar.getClass();
        arpiVar.getClass();
        this.b = arpiVar;
        this.a = armd.a(new gqu(armfVar, 17));
    }

    public ifb(armf armfVar, armf armfVar2, byte[] bArr, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(ien ienVar, iep iepVar) {
        ienVar.getClass();
        this.a = ienVar;
        this.b = iepVar;
    }

    public ifb(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar2;
        cg cgVar = (cg) armfVar.b();
        arml b = armd.b(3, new ifa(new gqu(cgVar, 20), 1));
        int i = arsc.a;
        this.b = new eot(new arrh(ifd.class), new ifa(b, 0), new gqx(cgVar, b, 9, null), new ifa(b, 2));
    }

    public ifb(armf armfVar, armf armfVar2, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb() {
        this.b = new AtomicLong(68719476736L);
        this.a = new ConcurrentHashMap();
    }

    public ifb(Context context, jxv jxvVar) {
        context.getClass();
        jxvVar.getClass();
        this.a = context;
        this.b = jxvVar;
    }

    public ifb(arpi arpiVar, iew iewVar) {
        arpiVar.getClass();
        this.b = arpiVar;
        this.a = iewVar;
    }

    public ifb(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(armf armfVar, armf armfVar2, byte[] bArr, char[] cArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(armf armfVar, armf armfVar2, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public ifb(armf armfVar, armf armfVar2, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }
}
