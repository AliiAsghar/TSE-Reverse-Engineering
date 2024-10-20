package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaat extends oo implements View.OnClickListener, View.OnLongClickListener {
    public final AsyncImageView s;
    public final View t;
    final /* synthetic */ aaau u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaat(aaau aaauVar, View view) {
        super(view);
        this.u = aaauVar;
        this.s = (AsyncImageView) view.findViewById(R.id.emoji_image);
        this.t = view.findViewById(R.id.variants_available_indicator);
    }

    private final aaas G() {
        int b = b();
        if (b > 0 && b < this.u.m.size()) {
            return (aaas) this.u.m.get(b);
        }
        alvw h = aaau.c.h();
        h.X(alwp.a, "Bugle");
        ((alvg) ((alvg) h).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiRecyclerViewAdapter$EmojiViewHolder", "getCurrentItem", 606, "EmojiRecyclerViewAdapter.java")).q("EmojiRecyclerViewAdapter#getAdapterPosition failed");
        return null;
    }

    public final String D() {
        aaas G = G();
        if (G != null) {
            return (String) G.c;
        }
        return null;
    }

    public final void E(String str) {
        aaau aaauVar = this.u;
        ahjj ahjjVar = aaauVar.w;
        if (ahjjVar != null) {
            String a = aaauVar.h.a(str);
            aabm aabmVar = (aabm) ahjjVar.a;
            aabmVar.q.h(a);
            aabmVar.b.e(aabm.a, -1);
            aabmVar.c++;
        }
        aaas G = G();
        if (G == null || G.a > 0) {
            aaau aaauVar2 = this.u;
            String a2 = aaauVar2.t.a(str);
            int G2 = aaauVar2.G();
            int indexOf = aaauVar2.n.indexOf(a2);
            if (indexOf != -1 && indexOf < G2) {
                if (indexOf > 0) {
                    aaauVar2.t(indexOf + 1, 1);
                }
            } else {
                if (aaauVar2.n.isEmpty()) {
                    aaauVar2.w(0, 2);
                } else {
                    aaauVar2.s(1);
                }
                if (aaauVar2.n.size() >= G2) {
                    aaauVar2.y(G2 + 1);
                }
            }
            aaauVar2.v.g(a2);
        }
        if (!this.u.t.b(str).equals(str)) {
            aabd aabdVar = this.u.t;
            String a3 = aabdVar.a(str);
            alvw d = aabd.a.d();
            d.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "setPreferredVariant", 79, "ResourceBasedEmojiVariantService.java")).D("Setting %1$s as preferred emoji variant for %2$s.", str, a3);
            aabdVar.f.put(a3, str);
            alvw d2 = aabd.a.d();
            d2.X(alwp.a, "Bugle");
            ((alvg) ((alvg) d2).h("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService", "setPreferredVariant", 84, "ResourceBasedEmojiVariantService.java")).D("Finished setting %1$s as preferred emoji variant for %2$s in cache.", str, a3);
            albo.bR(aabdVar.i.b(new xpm(a3, str, 17, null), aabdVar.c), qjc.a(new vbr(str, a3, 3)), aabdVar.c);
            this.u.q(b());
        }
        this.u.g.aY();
    }

    public final boolean F(String str) {
        if (this.u.t.c(str).size() > 1) {
            Stream stream = Collection.EL.stream(this.u.t.c(str));
            aaak aaakVar = this.u.h;
            aaakVar.getClass();
            int i = 4;
            Stream map = stream.map(new zvp(aaakVar, i));
            ydc ydcVar = this.u.i;
            ydcVar.getClass();
            if (map.allMatch(new zko(ydcVar, i))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.u.k.isShowing()) {
            this.u.k.dismiss();
            return;
        }
        String D = D();
        if (D == null) {
            return;
        }
        E(this.u.t.b(D));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.u.k.isShowing()) {
            this.u.k.dismiss();
            return true;
        }
        String D = D();
        if (D == null || !F(D)) {
            return false;
        }
        List c = this.u.t.c(D);
        aaau aaauVar = this.u;
        ahjj ahjjVar = new ahjj(this);
        aaaz aaazVar = (aaaz) aaauVar.k;
        aaazVar.d.clear();
        aaazVar.d.addAll(c);
        aaazVar.e.p();
        if (c.size() % 2 == 0) {
            aaazVar.f.r(6);
        } else {
            aaazVar.f.r(5);
        }
        aaazVar.showAsDropDown(view, 0, 0, 48);
        aaazVar.j = view;
        if (aaazVar.b()) {
            aaazVar.a();
        }
        aaazVar.n = ahjjVar;
        return true;
    }
}
