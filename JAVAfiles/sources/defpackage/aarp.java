package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserExternalItemView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarp extends akhz {
    public final /* synthetic */ aarm a;

    public aarp(aarm aarmVar) {
        this.a = aarmVar;
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (GalleryBrowserExternalItemView) LayoutInflater.from(this.a.d).inflate(R.layout.compose2o_gallery_browser_external_item_view_m2, viewGroup, false);
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        GalleryBrowserExternalItemView galleryBrowserExternalItemView = (GalleryBrowserExternalItemView) view;
        aatb aatbVar = (aatb) obj;
        int i = aatbVar.c;
        if (i != 3) {
            if (i != 7) {
                if (i != 11) {
                    return;
                }
                aarm.b(galleryBrowserExternalItemView, aatbVar, new aafl(this, 19));
                return;
            }
            aarm.b(galleryBrowserExternalItemView, aatbVar, new aafl(this, 20));
            return;
        }
        aarm.b(galleryBrowserExternalItemView, aatbVar, new aafl(this, 18));
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((GalleryBrowserExternalItemView) view).setOnClickListener(null);
    }
}
