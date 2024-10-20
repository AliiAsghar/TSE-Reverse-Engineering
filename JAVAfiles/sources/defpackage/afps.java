package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afps extends afpn {
    public final GridLayoutManager g;
    private final afpj h;

    public afps(Context context, int i, arqr arqrVar, GridLayoutManager gridLayoutManager, arqv arqvVar, arqr arqrVar2) {
        super(context, i, arqrVar);
        this.g = gridLayoutManager;
        afpj afpjVar = new afpj(this, arqvVar, arqrVar2);
        this.h = afpjVar;
        RecyclerView recyclerView = (RecyclerView) FrameLayout.inflate(context, R.layout.rv_only_emoji_set_view, this).findViewById(R.id.rv_only_recycler_view);
        recyclerView.ag(afpjVar);
        recyclerView.aj(gridLayoutManager);
    }

    @Override // defpackage.afpn
    public final afpj c() {
        return this.h;
    }
}
