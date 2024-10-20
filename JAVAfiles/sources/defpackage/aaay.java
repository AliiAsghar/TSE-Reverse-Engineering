package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaay extends no {
    final /* synthetic */ aaaz c;

    public aaay(aaaz aaazVar) {
        this.c = aaazVar;
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.d.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate = this.c.c.inflate(R.layout.emoji_variant_selector_recycler_view_item, viewGroup, false);
        AsyncImageView asyncImageView = (AsyncImageView) inflate.findViewById(R.id.emoji_image);
        asyncImageView.g();
        asyncImageView.setLayoutParams(this.c.m);
        afim afimVar = new afim(this.c, inflate, asyncImageView);
        asyncImageView.setOnClickListener(new zqq(afimVar, 13));
        return afimVar;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        afim afimVar = (afim) ooVar;
        String a = ((aaaz) afimVar.t).b.a((String) this.c.d.get(i));
        Uri f = ydk.f(((aaaz) afimVar.t).a, a);
        int i2 = ((aaaz) afimVar.t).k;
        ((AsyncImageView) afimVar.s).d(new ufk(f, i2, i2));
        ((AsyncImageView) afimVar.s).setContentDescription(a);
    }
}
