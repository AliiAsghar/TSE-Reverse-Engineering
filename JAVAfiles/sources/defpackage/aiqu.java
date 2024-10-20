package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqu extends no {
    public final qx c = new qx(new aiqs(this));
    public final Set d = new HashSet();
    public final List e = new ArrayList();
    public final Map f = new HashMap();
    public final Map g = new HashMap();
    public final aiqj h;
    public final StickerGalleryActivity i;

    public aiqu(aiqj aiqjVar, StickerGalleryActivity stickerGalleryActivity) {
        this.h = aiqjVar;
        this.i = stickerGalleryActivity;
        A(true);
    }

    @Override // defpackage.no
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new aiqt(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.favorite_sticker_packs_item_view, viewGroup, false));
    }

    @Override // defpackage.no
    public final /* synthetic */ void g(oo ooVar, int i) {
        aiqt aiqtVar = (aiqt) ooVar;
        aova aovaVar = (aova) this.e.get(i);
        aiqtVar.x = aiqtVar.y.h.k(aovaVar.b);
        aiqtVar.D();
        Resources resources = aiqtVar.s.getContext().getResources();
        int aT = a.aT(aovaVar.c);
        if (aT == 0) {
            aT = 1;
        }
        if (aT - 2 == 1) {
            hls d = hkz.d(aiqtVar.s);
            aour aourVar = aovaVar.d;
            if (aourVar == null) {
                aourVar = aour.a;
            }
            d.g(aourVar.b).p(new hxc().E(ahmc.K(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), aiqtVar.s, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).o(huz.b()).t(aiqtVar.s);
            aiqtVar.t.setText(aovaVar.e);
            aiqtVar.u.setText(aovaVar.g);
            byte[] bArr = null;
            aiqtVar.a.setOnClickListener(new abbh(aiqtVar, aovaVar, 12, bArr));
            aiqtVar.a.setContentDescription(aiqtVar.a.getContext().getResources().getString(R.string.cd_browse_sticker_packs_item_view, aovaVar.e));
            aiqtVar.w.setOnTouchListener(new iiy(aiqtVar, 8));
            aiqtVar.v.setOnClickListener(new abbh(aiqtVar, aovaVar, 13, bArr));
            return;
        }
        throw new IllegalStateException("Loaded pack type should be Regular.");
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return ((aova) this.e.get(i)).b.hashCode();
    }

    @Override // defpackage.no
    public final void gJ(RecyclerView recyclerView) {
        this.c.W(recyclerView);
    }

    public final void m(String str) {
        for (int i = 0; i < this.e.size(); i++) {
            if (((aova) this.e.get(i)).b.equals(str)) {
                this.e.remove(i);
                y(i);
                return;
            }
        }
    }
}
