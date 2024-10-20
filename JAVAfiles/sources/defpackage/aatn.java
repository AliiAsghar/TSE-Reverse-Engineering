package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aatn extends eor implements aatq {
    public static final xze a = xze.g("Bugle", "GalleryCategoryViewModelBase");
    protected final yjf b;
    public final ContentResolver c;
    public final rvt d;
    public final boolean e;
    public final eny f = new eny();
    public final List g = new ArrayList();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final abac i;
    private final anen j;
    private final ContentObserver k;
    private Runnable l;

    public aatn(Context context, yjf yjfVar, ContentResolver contentResolver, anen anenVar, rvt rvtVar, abac abacVar) {
        aatm aatmVar = new aatm(this);
        this.k = aatmVar;
        this.b = yjfVar;
        this.c = contentResolver;
        this.j = anenVar;
        this.d = rvtVar;
        this.i = abacVar;
        this.e = context.getPackageManager().hasSystemFeature("android.hardware.camera");
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, aatmVar);
        contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, aatmVar);
    }

    @Override // defpackage.aaqh
    public final int a() {
        return Math.min(i(), this.g.size());
    }

    public abstract int b(int i);

    public abstract int c();

    @Override // defpackage.aatq
    public final long d(int i, int i2) {
        Uri uri;
        if (i2 == 1 && (uri = ((aate) o(i - c())).d) != null) {
            return uri.hashCode();
        }
        return -1L;
    }

    @Override // defpackage.aatq
    public final void g(aaqi aaqiVar, int i, AttachmentQueueState attachmentQueueState, akms akmsVar) {
        GalleryContentItemView galleryContentItemView = (GalleryContentItemView) aaqiVar;
        aatc o = o(i);
        if (((Boolean) utw.o.e()).booleanValue()) {
            GalleryContent b = ((aate) o).b(ameb.GALLERY_CHOOSER);
            boolean j = attachmentQueueState.j(b);
            int b2 = attachmentQueueState.b(b);
            galleryContentItemView.h = b;
            galleryContentItemView.f(b2, j);
        } else {
            GalleryContentItem c = ((aate) o).c(ameb.GALLERY_CHOOSER);
            boolean k = attachmentQueueState.k(c);
            int c2 = attachmentQueueState.c(c);
            galleryContentItemView.g = c;
            galleryContentItemView.f(c2, k);
        }
        galleryContentItemView.a = o;
        galleryContentItemView.d(akmsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eor
    public final void gi() {
        this.c.unregisterContentObserver(this.k);
        xzw.a.removeCallbacks(p());
    }

    @Override // defpackage.aatq
    public final void h() {
        if (!this.b.n()) {
            return;
        }
        akrh e = aktp.e("GalleryCategoryViewModelBase.loadData");
        try {
            akul ah = aktp.ah(new aaqk(this, 4), this.j);
            e.b(ah);
            ah.k(qiu.b(), this.j);
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

    public int i() {
        throw null;
    }

    public int n() {
        return 1;
    }

    public final aatc o(int i) {
        return (aatc) this.g.get(i);
    }

    public final Runnable p() {
        if (this.l == null) {
            this.l = new aaqk(this, 5);
        }
        return this.l;
    }
}
