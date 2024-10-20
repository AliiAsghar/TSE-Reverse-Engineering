package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqq extends no {
    public static final aova c;
    public final boolean d;
    public final List e = new ArrayList();
    public final AccessibilityManager f;
    public final aiqj g;
    public final StickerGalleryActivity h;

    static {
        aozy createBuilder = aova.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aova) createBuilder.b).b = "sticker_play_store_link";
        c = (aova) createBuilder.s();
    }

    public aiqq(aiqj aiqjVar, AccessibilityManager accessibilityManager, boolean z, StickerGalleryActivity stickerGalleryActivity) {
        this.g = aiqjVar;
        this.f = accessibilityManager;
        this.d = z;
        this.h = stickerGalleryActivity;
        A(true);
    }

    @Override // defpackage.no
    public final int b() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            int aT = a.aT(((aova) it.next()).c);
            if (aT != 0 && aT == 3) {
                return this.e.size();
            }
        }
        return 0;
    }

    @Override // defpackage.no
    public final int c(int i) {
        if (((aova) this.e.get(i)).equals(c)) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i == 1) {
                return new aiqn(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_play_store_link_item_view, viewGroup, false));
            }
            throw new IllegalStateException(a.bV(i, "Unknown view type: "));
        }
        return new aiqp(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browse_sticker_packs_item_view, viewGroup, false));
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        int i2 = ooVar.f;
        byte[] bArr = null;
        int i3 = 11;
        if (i2 != 0) {
            if (i2 == 1) {
                aiqn aiqnVar = (aiqn) ooVar;
                aiqnVar.a.setOnClickListener(new agrb(aiqnVar, i3, bArr));
                aiqnVar.a.setContentDescription(aiqnVar.a.getContext().getString(R.string.cd_browse_play_store_item_view));
                return;
            }
            throw new IllegalStateException(a.bV(i2, "Unknown view type: "));
        }
        aova aovaVar = (aova) this.e.get(i);
        aiqp aiqpVar = (aiqp) ooVar;
        aiqpVar.s = aovaVar;
        Resources resources = aiqpVar.t.getContext().getResources();
        hls d = hkz.d(aiqpVar.t);
        aour aourVar = aovaVar.d;
        if (aourVar == null) {
            aourVar = aour.a;
        }
        d.g(aourVar.b).p(new hxc().E(ahmc.K(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), aiqpVar.t, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).t(aiqpVar.t);
        aiqpVar.t.setContentDescription(aovaVar.f);
        aiqpVar.v.setText(aovaVar.e);
        aiqpVar.w.setText(aovaVar.g);
        boolean k = aiqpVar.z.g.k(aovaVar.b);
        aiqpVar.y = k;
        if (k) {
            aiqpVar.u.setVisibility(0);
        } else {
            aiqpVar.u.setVisibility(8);
        }
        aiqpVar.a.setOnClickListener(new abbh(aiqpVar, aovaVar, i3, bArr));
        aiqpVar.a.setContentDescription(aiqpVar.a.getContext().getString(R.string.cd_browse_sticker_packs_item_view, aovaVar.e));
        aiqpVar.a.setPressed(false);
        if (!aiqpVar.z.f.isTouchExplorationEnabled()) {
            aiqpVar.a.setOnTouchListener(new iiy(aiqpVar, 7));
        }
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return ((aova) this.e.get(i)).b.hashCode();
    }
}
