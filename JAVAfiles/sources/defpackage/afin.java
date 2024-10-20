package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afin extends no {
    public final arqg c;
    private final aiim d;

    public afin(aiim aiimVar, arqg arqgVar) {
        this.d = aiimVar;
        this.c = arqgVar;
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
        return 6;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.select_media_permission_request_banner, viewGroup, false);
        inflate.getClass();
        return new afim(this, inflate);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        afim afimVar = (afim) ooVar;
        afimVar.getClass();
        ((TextView) afimVar.s).setOnClickListener(new acah(afimVar.t, 10));
    }

    public final boolean m() {
        return this.d.s(afkj.h);
    }
}
