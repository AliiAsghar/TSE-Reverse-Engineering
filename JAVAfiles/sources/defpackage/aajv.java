package defpackage;

import android.app.Activity;
import android.hardware.Camera;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerCloseButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerOpenInChatButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerShareButtonEvent;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajv {
    public aajv() {
    }

    public static void a(String str) {
        try {
            new ProcessBuilder(new String[0]).command(str).start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            xzb.c("Bugle", "Failed execute " + str + ", " + e.toString());
        }
    }

    public static final aajd b(long j) {
        aajd aajdVar;
        aajd[] values = aajd.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                aajdVar = values[i];
                if (aajdVar.e == j) {
                    break;
                }
                i++;
            } else {
                aajdVar = null;
                break;
            }
        }
        if (aajdVar == null) {
            return aajd.a;
        }
        return aajdVar;
    }

    public static final String c(skn sknVar) {
        String d = sknVar.d();
        if (d == null) {
            String agmhVar = sknVar.toString();
            agmhVar.getClass();
            return agmhVar;
        }
        return d;
    }

    public static final String d(tag tagVar) {
        String d = tagVar.d();
        if (d == null) {
            String agmhVar = tagVar.toString();
            agmhVar.getClass();
            return agmhVar;
        }
        return d;
    }

    public static amoq e(mxf mxfVar, aauj aaujVar) {
        aozy createBuilder = amoq.a.createBuilder();
        if (mxfVar instanceof imo) {
            aaui.d(createBuilder, ((imo) mxfVar).b);
        } else if (mxfVar instanceof imx) {
            imx imxVar = (imx) mxfVar;
            aaui.k(createBuilder, t(imxVar), ahmc.L(imxVar.e));
        } else if (mxfVar instanceof imt) {
            imt imtVar = (imt) mxfVar;
            aaui.e(createBuilder, t(imtVar), ((Long) imtVar.e.orElse(-1L)).longValue(), imtVar.g);
        } else if (mxfVar instanceof GalleryContent) {
            GalleryContent galleryContent = (GalleryContent) mxfVar;
            aaui.i(createBuilder, t(galleryContent), ((Long) galleryContent.h().orElse(-1L)).longValue(), galleryContent.g());
        } else if (mxfVar instanceof inb) {
            inb inbVar = (inb) mxfVar;
            aaui.g(createBuilder, t(inbVar), inbVar.a);
        } else if (mxfVar instanceof ind) {
            aaui.j(createBuilder);
        } else if (mxfVar instanceof inf) {
            aaui.l(createBuilder, 1);
        } else if (mxfVar instanceof imy) {
            imy imyVar = (imy) mxfVar;
            aaui.f(createBuilder, imyVar.c, imyVar.a);
        } else {
            throw new IllegalArgumentException("Invalid attachment content: ".concat(String.valueOf(String.valueOf(mxfVar))));
        }
        aaujVar.b(createBuilder);
        return (amoq) createBuilder.s();
    }

    public static void f(aiuc aiucVar, aarm aarmVar) {
        aktp.H(aiucVar, abdf.class, new kwf(aarmVar, 19));
    }

    public static void g(aapu aapuVar, imv imvVar, aauj aaujVar) {
        aapuVar.c(imvVar, aaujVar, -1);
    }

    @Deprecated
    public static void h(aapu aapuVar, MediaContentItem mediaContentItem, aauj aaujVar) {
        aapuVar.d(mediaContentItem, aaujVar, -1);
    }

    public static void i(aapu aapuVar, imv imvVar, aauj aaujVar) {
        aapuVar.f(imvVar, aaujVar, -1);
    }

    @Deprecated
    public static void j(aapu aapuVar, MediaContentItem mediaContentItem, aauj aaujVar) {
        aapuVar.h(mediaContentItem, aaujVar, -1);
    }

    public static void k(aapu aapuVar, myr myrVar, aauj aaujVar) {
        aapuVar.j(myrVar, aaujVar, -1);
    }

    public static final zof l(Activity activity, Optional optional, Optional optional2) {
        optional.getClass();
        optional2.getClass();
        return new zof(activity, optional);
    }

    public static final long m(Collection collection, xnv xnvVar) {
        long j;
        long j2;
        collection.getClass();
        xnvVar.getClass();
        if (collection.isEmpty()) {
            return 0L;
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            tgj tgjVar = (tgj) it.next();
            if (tgjVar.h() < xnvVar.f().toEpochMilli()) {
                j = tgjVar.h();
            } else {
                j = 0;
            }
            while (it.hasNext()) {
                tgj tgjVar2 = (tgj) it.next();
                if (tgjVar2.h() < xnvVar.f().toEpochMilli()) {
                    j2 = tgjVar2.h();
                } else {
                    j2 = 0;
                }
                if (j < j2) {
                    j = j2;
                }
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    public static aaxo n(cg cgVar) {
        throw null;
    }

    public static void o(aiuc aiucVar, aaxd aaxdVar) {
        aktp.H(aiucVar, aaxp.class, new itc(10));
        aktp.H(aiucVar, aawn.class, new aawx(aaxdVar, 2));
        aktp.H(aiucVar, aaxr.class, new itc(11));
        aktp.H(aiucVar, aaxq.class, new aawx(aaxdVar, 3));
        aktp.H(aiucVar, aaxs.class, new aawx(aaxdVar, 4));
        aktp.H(aiucVar, MediaViewerSaveButtonEvent.class, new aawx(aaxdVar, 5));
        aktp.H(aiucVar, MediaViewerShareButtonEvent.class, new aawx(aaxdVar, 6));
        aktp.H(aiucVar, MediaViewerOpenInChatButtonEvent.class, new aawx(aaxdVar, 7));
        aktp.H(aiucVar, MediaViewerCloseButtonEvent.class, new aawx(aaxdVar, 8));
    }

    public static Camera.Size p(float f, List list) {
        if (!list.isEmpty()) {
            Camera.Size size = (Camera.Size) list.get(0);
            int i = size.width * size.height;
            float u = u(f, size.width, size.height);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Camera.Size size2 = (Camera.Size) it.next();
                int i2 = size2.width * size2.height;
                float u2 = u(f, size2.width, size2.height);
                if (Math.abs(u - u2) < 0.01d) {
                    if (i2 > i) {
                        size = size2;
                        i = i2;
                        u = u2;
                    }
                } else if (u2 < u) {
                    size = size2;
                    i = i2;
                    u = u2;
                }
            }
            return size;
        }
        throw new IllegalStateException("Tried to select resolution with no size options.");
    }

    public static amoq q(myr myrVar, aauj aaujVar) {
        aozy createBuilder = amoq.a.createBuilder();
        if (myrVar instanceof imu) {
            aaui.l(createBuilder, 2);
        } else if (myrVar instanceof imw) {
            amox amoxVar = amox.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            amoq amoqVar = (amoq) createBuilder.b;
            amoxVar.getClass();
            amoqVar.f = amoxVar;
            amoqVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
        } else if (myrVar instanceof ine) {
            aaui.j(createBuilder);
        } else {
            throw new IllegalArgumentException("Invalid text content: ".concat(myrVar.toString()));
        }
        aaujVar.b(createBuilder);
        return (amoq) createBuilder.s();
    }

    public static List r(ydc ydcVar, List list) {
        int i = 12;
        return (List) Collection.EL.stream(list).flatMap(new aaky(ydcVar, i)).collect(Collectors.toCollection(new zhh(i)));
    }

    public static amoq s(MediaContentItem mediaContentItem, aauj aaujVar) {
        aozy createBuilder = amoq.a.createBuilder();
        if (mediaContentItem instanceof AudioContentItem) {
            aaui.d(createBuilder, ((AudioContentItem) mediaContentItem).a);
        } else if (mediaContentItem instanceof ExpressiveStickerContentItem) {
            ExpressiveStickerContentItem expressiveStickerContentItem = (ExpressiveStickerContentItem) mediaContentItem;
            aaui.k(createBuilder, v(expressiveStickerContentItem), ahmc.L(expressiveStickerContentItem.a));
        } else if (mediaContentItem instanceof CameraContentItem) {
            CameraContentItem cameraContentItem = (CameraContentItem) mediaContentItem;
            aaui.e(createBuilder, v(cameraContentItem), cameraContentItem.e, cameraContentItem.a);
        } else if (mediaContentItem instanceof GalleryContentItem) {
            GalleryContentItem galleryContentItem = (GalleryContentItem) mediaContentItem;
            aaui.i(createBuilder, v(galleryContentItem), galleryContentItem.a, galleryContentItem.d);
        } else if (mediaContentItem instanceof GifContentItem) {
            GifContentItem gifContentItem = (GifContentItem) mediaContentItem;
            aaui.g(createBuilder, v(gifContentItem), gifContentItem.f);
        } else if (mediaContentItem instanceof LocationContentItem) {
            aaui.j(createBuilder);
        } else if (mediaContentItem instanceof VCardContentItem) {
            aaui.l(createBuilder, 1);
        } else if (mediaContentItem instanceof FileContentItem) {
            FileContentItem fileContentItem = (FileContentItem) mediaContentItem;
            aaui.f(createBuilder, fileContentItem.e, fileContentItem.c);
        } else {
            throw new IllegalArgumentException("Invalid content item ".concat(String.valueOf(String.valueOf(mediaContentItem))));
        }
        aaujVar.b(createBuilder);
        return (amoq) createBuilder.s();
    }

    private static aozy t(myt mytVar) {
        aozy createBuilder = ampm.a.createBuilder();
        int width = mytVar.e().getWidth();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar = (ampm) createBuilder.b;
        ampmVar.b |= 1;
        ampmVar.e = width;
        int height = mytVar.e().getHeight();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar2 = (ampm) createBuilder.b;
        ampmVar2.b |= 2;
        ampmVar2.f = height;
        String j = mytVar.j();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar3 = (ampm) createBuilder.b;
        j.getClass();
        ampmVar3.b |= 8;
        ampmVar3.g = j;
        aaui.c(mytVar.d(), createBuilder);
        return createBuilder;
    }

    private static float u(float f, int i, int i2) {
        if (i2 > 0) {
            return Math.abs(f - (i / i2));
        }
        return Float.MAX_VALUE;
    }

    @Deprecated
    private static aozy v(MediaContentItem mediaContentItem) {
        aozy createBuilder = ampm.a.createBuilder();
        int f = mediaContentItem.f();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar = (ampm) createBuilder.b;
        ampmVar.b |= 1;
        ampmVar.e = f;
        int d = mediaContentItem.d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar2 = (ampm) createBuilder.b;
        ampmVar2.b |= 2;
        ampmVar2.f = d;
        String i = mediaContentItem.i();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ampm ampmVar3 = (ampm) createBuilder.b;
        i.getClass();
        ampmVar3.b |= 8;
        ampmVar3.g = i;
        aaui.c(mediaContentItem.h(), createBuilder);
        return createBuilder;
    }

    public aajv(armf armfVar) {
        armfVar.getClass();
    }
}
