package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaro extends akhz {
    final /* synthetic */ aarm a;

    public aaro(aarm aarmVar) {
        this.a = aarmVar;
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (GalleryContentItemView) LayoutInflater.from(this.a.d).inflate(R.layout.full_screen_gallery_compose2o_gallery_item_view, viewGroup, false);
    }

    @Override // defpackage.akhz
    public final /* synthetic */ void b(View view, Object obj) {
        boolean k;
        int c;
        GalleryContentItemView galleryContentItemView = (GalleryContentItemView) view;
        aate aateVar = (aate) obj;
        AttachmentQueueState attachmentQueueState = ((aapj) this.a.j).C;
        if (((Boolean) utw.o.e()).booleanValue()) {
            GalleryContent b = aateVar.b(ameb.GALLERY_CHOOSER);
            k = attachmentQueueState.j(b);
            c = attachmentQueueState.b(b);
            galleryContentItemView.h = b;
        } else {
            GalleryContentItem c2 = aateVar.c(ameb.GALLERY_CHOOSER);
            k = attachmentQueueState.k(c2);
            c = attachmentQueueState.c(c2);
            galleryContentItemView.g = c2;
        }
        galleryContentItemView.f(c, k);
        galleryContentItemView.a = aateVar;
        galleryContentItemView.d(aktp.x(this.a.d).c().b(hxc.a()).o(huz.b()));
        galleryContentItemView.setOnClickListener(new aarn(this, galleryContentItemView, c, 0));
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((GalleryContentItemView) view).setOnClickListener(null);
    }
}
