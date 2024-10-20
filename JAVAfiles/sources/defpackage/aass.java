package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aass extends xzs {
    private final Uri a;
    private final aarm b;
    private final ahmv c;

    public aass(ahmv ahmvVar, Uri uri, aarm aarmVar) {
        super("Bugle.Async.ImageAndVideoPicker.prepareDocumentForAttachment.Duration", 60000L, false);
        this.c = ahmvVar;
        this.a = uri;
        this.b = aarmVar;
    }

    /* JADX WARN: Type inference failed for: r12v33, types: [mbl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [mbl, java.lang.Object] */
    @Override // defpackage.xzs
    public final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String path;
        String str = null;
        if (ydk.u(this.a) && (path = this.a.getPath()) != null) {
            if (((ydh) this.c.g).f(new File(path))) {
                this.c.e.c("Bugle.Share.InternalDataFile.AttachAborted");
                return null;
            }
        }
        if (ydk.y(this.a)) {
            this.c.e.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
            return null;
        }
        ahmv ahmvVar = this.c;
        Uri uri = this.a;
        Object obj = ahmvVar.i;
        String p = ydk.p((Context) obj, uri);
        if (p == null) {
            if (!xzb.q("Bugle", 6)) {
                return null;
            }
            xzb.g("Bugle", "Failed to resolve content type of attachment (" + String.valueOf(this.a) + ")");
            return null;
        }
        Uri c = ((uff) this.c.f).c(this.a);
        if (c == null) {
            xzb.n("Bugle", "Failed to persist attachment to scratch space (" + String.valueOf(this.a) + ")");
            return null;
        }
        aasr aasrVar = new aasr();
        aasrVar.a = p;
        aasrVar.b = c;
        Uri uri2 = this.a;
        long j = -1;
        try {
            if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                try {
                    String[] split = DocumentsContract.getDocumentId(uri2).split(":");
                    if (split.length == 2 && "image".equals(split[0])) {
                        str = split[1];
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            if (str != null) {
                j = ydk.d((Context) obj, "_id = ?", str);
            } else if (DocumentsContract.isDocumentUri((Context) obj, uri2)) {
                Long l = (Long) ydk.l((Context) obj, uri2, "last_modified", new ydi(1));
                if (l != null) {
                    j = l.longValue();
                }
            } else {
                String n = ydk.n((Context) obj, uri2);
                if (n != null) {
                    j = ydk.d((Context) obj, "_data = ?", n);
                }
            }
        } catch (Exception e) {
            alvw h = ydk.a.h();
            h.X(alwp.a, "Bugle");
            ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getLastModifiedTimestamp", 705, "UriUtil.java")).t("getLastModifiedTimestamp failed on: %s", yyb.bh(uri2.toString()));
        }
        aasrVar.c = j;
        if (!gh.m(p)) {
            return aasrVar;
        }
        Rect g = ((yfo) this.c.a).g(aasrVar.b, p);
        aasrVar.d = g.width();
        aasrVar.e = g.height();
        return aasrVar;
    }

    @Override // defpackage.xzs
    public final /* synthetic */ void d(Object obj) {
        aasr aasrVar = (aasr) obj;
        if (aasrVar != null) {
            aarm aarmVar = this.b;
            GalleryBrowserActivity galleryBrowserActivity = aarmVar.j;
            Uri uri = aasrVar.b;
            String str = aasrVar.a;
            long j = aasrVar.c;
            int i = aasrVar.d;
            int i2 = aasrVar.e;
            if (!galleryBrowserActivity.isDestroyed() && uri != null && str != null) {
                if (((Boolean) utw.o.e()).booleanValue()) {
                    imz n = GalleryContent.n();
                    n.g(uri);
                    n.c(str);
                    n.a = new Size(i, i2);
                    n.b(ameb.GALLERY_LIBRARY);
                    n.e(j);
                    if (((aapj) aarmVar.j).C.h(n.a())) {
                        aarmVar.j.E().e();
                        return;
                    }
                    return;
                }
                if (((aapj) aarmVar.j).C.n(new GalleryContentItem(uri, str, i, i2, ameb.GALLERY_LIBRARY, j))) {
                    aarmVar.j.E().e();
                }
            }
        }
    }
}
