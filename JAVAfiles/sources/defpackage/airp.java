package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.packdetails.PackDetailsActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airp extends no {
    public final boolean c;
    public final PackDetailsActivity d;
    private final aova e;

    public airp(aova aovaVar, boolean z, PackDetailsActivity packDetailsActivity) {
        this.e = aovaVar;
        this.c = z;
        this.d = packDetailsActivity;
        A(true);
    }

    @Override // defpackage.no
    public final int b() {
        return this.e.h.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new airo(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pack_details_item_view, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        airo airoVar = (airo) ooVar;
        aouy aouyVar = (aouy) this.e.h.get(i);
        Resources resources = ((ImageView) airoVar.t).getContext().getResources();
        hls d = hkz.d(airoVar.t);
        aour aourVar = aouyVar.e;
        if (aourVar == null) {
            aourVar = aour.a;
        }
        d.g(aourVar.b).p(new hxc().E(ahmc.K(resources.getDrawable(R.drawable.quantum_ic_sticker_black_48), airoVar.t, resources.getInteger(R.integer.sticker_loading_failure_placeholder_size), resources.getInteger(R.integer.sticker_loading_failure_placeholder_alpha)))).o(huz.b()).t((ImageView) airoVar.t);
        ((ImageView) airoVar.t).setContentDescription(aouyVar.f);
        if (((airp) airoVar.s).c) {
            airoVar.a.setOnClickListener(new abbh(airoVar, aouyVar, 15, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    public final long gI(int i) {
        return ((aouy) this.e.h.get(i)).b.hashCode();
    }
}
