package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aasn extends aaqm {
    public static final /* synthetic */ int k = 0;
    private static final xze l = xze.g("Bugle", "GalleryContentCategory");
    private static final uuf m = uuh.r(151334644, "init_gallery_in_constructor");
    public final aapk c;
    protected final AttachmentQueueState d;
    final aatn e;
    public final aasm f;
    aase g;
    private final yjf n;
    private final cg o;
    private final aaqa p;

    public aasn(yti ytiVar, yyz yyzVar, yjf yjfVar, aatn aatnVar, cg cgVar, aapk aapkVar, AttachmentQueueState attachmentQueueState, aaqa aaqaVar, ContentGridView contentGridView, aabz aabzVar, int i, long j) {
        super(ytiVar, i, aatnVar.n());
        this.c = aapkVar;
        this.n = yjfVar;
        this.e = aatnVar;
        this.d = attachmentQueueState;
        this.o = cgVar;
        this.p = aaqaVar;
        this.f = yyzVar.n(cgVar, aatnVar, attachmentQueueState, aaqaVar, aapkVar, aabzVar, contentGridView, i, j, new ynw(aabzVar, 6));
        if (((Boolean) m.e()).booleanValue()) {
            aatnVar.h();
            aatnVar.f.d(cgVar, new aaos(this, 3));
        }
    }

    private final void B(aaas aaasVar) {
        AttachmentQueueState attachmentQueueState = (AttachmentQueueState) ((Intent) aaasVar.c).getParcelableExtra("attachment_queue_state_extra_key");
        aauj a = aauj.a(amqh.GALLERY, amqi.EXPANDED);
        if (attachmentQueueState != null) {
            if (((Boolean) utw.o.e()).booleanValue()) {
                for (GalleryContent galleryContent : this.d.e(attachmentQueueState)) {
                    this.d.l(galleryContent);
                    this.h.a(galleryContent, a);
                }
                for (GalleryContent galleryContent2 : attachmentQueueState.e(this.d)) {
                    this.d.h(galleryContent2);
                    this.h.e(galleryContent2, a);
                }
                return;
            }
            for (MediaContentItem mediaContentItem : this.d.d(attachmentQueueState)) {
                this.d.m(mediaContentItem);
                this.h.b(mediaContentItem, a);
            }
            for (MediaContentItem mediaContentItem2 : attachmentQueueState.d(this.d)) {
                this.d.n(mediaContentItem2);
                this.h.g(mediaContentItem2, a);
            }
        }
    }

    @Override // defpackage.aaqm
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final aase r() {
        if (this.g == null) {
            this.g = z(this.f);
        }
        return this.g;
    }

    @Override // defpackage.aaqd
    public int a() {
        return R.dimen.gallery_content_item_size;
    }

    @Override // defpackage.aaqd
    public final int b() {
        return R.string.c2o_category_gallery_content_description;
    }

    @Override // defpackage.aaqd
    protected int c() {
        return R.drawable.ic_insert_photo_white;
    }

    @Override // defpackage.aaqd
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.add(124);
        hashSet.add(126);
        hashSet.add(130);
        return hashSet;
    }

    @Override // defpackage.aaqd
    public void f(Bundle bundle) {
        this.f.m(bundle);
        if (!((Boolean) m.e()).booleanValue()) {
            this.e.h();
            aatn aatnVar = this.e;
            aatnVar.f.d(this.o, new aaos(this, 2));
        }
    }

    @Override // defpackage.aaqd
    public void h(Bundle bundle) {
        this.f.n(bundle);
    }

    @Override // defpackage.aaqo
    public final void i() {
        if (this.n.n()) {
            this.p.a(amqe.CATEGORY_HEADER);
        } else {
            this.f.r();
        }
    }

    @Override // defpackage.aaqm
    protected final int j() {
        return R.string.c2o_category_name_gallery;
    }

    @Override // defpackage.aaqd
    public void l(aaas aaasVar) {
        if (aaasVar == null) {
            l.q("GalleryContentCategory: Full screen activity returned a null intent");
            return;
        }
        int i = aaasVar.a;
        if (i == 130) {
            if (aaasVar.b == -1) {
                this.f.l();
                return;
            } else {
                this.f.k();
                return;
            }
        }
        if (aaasVar.c == null) {
            l.q("GalleryContentCategory: Full screen activity returned an empty intent");
            return;
        }
        if (i == 124) {
            B(aaasVar);
            return;
        }
        if (i == 126) {
            if (!((Boolean) aarw.b.e()).booleanValue()) {
                B(aaasVar);
            }
            CameraContentItem cameraContentItem = (CameraContentItem) ((Intent) aaasVar.c).getParcelableExtra("camera_gallery_item");
            if (cameraContentItem != null) {
                if (((Boolean) utw.o.e()).booleanValue()) {
                    String str = cameraContentItem.c;
                    ims n = imt.n();
                    n.d(str);
                    n.g(cameraContentItem.b);
                    n.c(cameraContentItem.d);
                    n.a = new Size(cameraContentItem.f(), cameraContentItem.d());
                    n.b(cameraContentItem.a);
                    n.f(cameraContentItem.f);
                    long j = cameraContentItem.e;
                    if (j != -1) {
                        n.e(j);
                    }
                    imt a = n.a();
                    this.d.h(a);
                    this.h.e(a, aauj.a(amqh.CAMERA, amqi.EXPANDED));
                    return;
                }
                this.d.n(cameraContentItem);
                this.h.g(cameraContentItem, aauj.a(amqh.CAMERA, amqi.EXPANDED));
            }
        }
    }

    @Override // defpackage.aaqd
    public final void q(aapu aapuVar) {
        this.h = aapuVar;
        this.f.a = aapuVar;
    }

    @Override // defpackage.aaqm
    protected final aapz s() {
        return this.f;
    }

    public int y() {
        return R.layout.compose2o_permissions_item_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aase z(aasm aasmVar) {
        return aase.I(aasmVar, a(), n(), y(), null);
    }
}
