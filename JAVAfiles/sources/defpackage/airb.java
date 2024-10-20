package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airb extends no {
    public final StickerGalleryActivity c;
    private List d = new ArrayList();

    public airb(StickerGalleryActivity stickerGalleryActivity) {
        this.c = stickerGalleryActivity;
        A(true);
    }

    @Override // defpackage.no
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new airo(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_result_item_view, viewGroup, false));
    }

    @Override // defpackage.no
    public final /* synthetic */ void g(oo ooVar, int i) {
        airo airoVar = (airo) ooVar;
        aouy aouyVar = ((aovc) this.d.get(i)).b;
        if (aouyVar == null) {
            aouyVar = aouy.a;
        }
        Resources resources = ((ImageView) airoVar.t).getContext().getResources();
        int aT = a.aT(aouyVar.c);
        if (aT == 0) {
            aT = 1;
        }
        if (aT - 2 == 1) {
            hls d = hkz.d(airoVar.t);
            aour aourVar = aouyVar.e;
            if (aourVar == null) {
                aourVar = aour.a;
            }
            d.g(aourVar.b).p(new hxc().E(ahmc.K(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), airoVar.t, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).o(huz.b()).t((ImageView) airoVar.t);
            ((ImageView) airoVar.t).setContentDescription(aouyVar.f);
            airoVar.a.setOnClickListener(new abbh(airoVar, aouyVar, 14, null));
            return;
        }
        throw new IllegalStateException("Loaded sticker type should be Regular.");
    }

    @Override // defpackage.no
    public final long gI(int i) {
        aouy aouyVar = ((aovc) this.d.get(i)).b;
        if (aouyVar == null) {
            aouyVar = aouy.a;
        }
        return aouyVar.b.hashCode();
    }

    public final void m(List list) {
        this.d = list;
        p();
    }
}
