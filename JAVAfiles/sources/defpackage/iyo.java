package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyo extends no {
    public String c;
    final /* synthetic */ iyn d;
    private final boolean e;

    public iyo(iyn iynVar, boolean z) {
        this.d = iynVar;
        this.e = z;
    }

    @Override // defpackage.no
    public final int b() {
        if (m()) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.no
    public final int c(int i) {
        return R.layout.group_name;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        return new agwe(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false), (byte[]) null);
    }

    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        agwe agweVar = (agwe) ooVar;
        ((TextView) agweVar.t).setText(this.c);
        iyn iynVar = this.d;
        if (iynVar.A && !this.e) {
            ((ImageView) agweVar.s).setVisibility(8);
            return;
        }
        iynVar.w.fe();
        ((View) agweVar.u).setOnClickListener(new akwb((aksr) this.d.t.b(), "GroupNameViewHolder root onClickListener", new ili(3), 1));
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return 2131624275L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        if (this.c != null) {
            return true;
        }
        return false;
    }
}
