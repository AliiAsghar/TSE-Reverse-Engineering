package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afoq extends no implements afme {
    private static final alvi n = alvi.m("com/google/android/libraries/compose/emoji/ui/screen/adapter/EmojiAdapter");
    public final afke c;
    public final arwe d;
    public afnx e;
    public int f;
    public int h;
    public int i;
    public final afmq l;
    public ahjj m;
    private final afpp o;
    private int q;
    private final arml p = armd.a(new afoo(this, 0));
    public List g = arnv.a;
    public final arqv j = new aeyl(this, 9);
    public final arqv k = new aeyl(this, 10);

    public afoq(afmq afmqVar, afke afkeVar, arwe arweVar, afpp afppVar) {
        this.l = afmqVar;
        this.c = afkeVar;
        this.d = arweVar;
        this.o = afppVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final afom F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.standard_emoji_view_holder, viewGroup, false);
        inflate.getClass();
        return new afoj(this, inflate);
    }

    @Override // defpackage.no
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public afom e(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return F(viewGroup);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.standard_emoji_header_holder, viewGroup, false);
        inflate.getClass();
        return new afok(inflate);
    }

    public afot H(int i) {
        return (afot) this.g.get(i);
    }

    public final void I(afoj afojVar) {
        afpt afptVar = (afpt) afojVar.t.c();
        if (afptVar != null) {
            ahjj ahjjVar = this.m;
            if (ahjjVar != null) {
                ahjjVar.e().a(new afnr(afptVar.b, afptVar.a, Integer.valueOf(afojVar.b()), M(afojVar.b()), false, 16));
                return;
            }
            return;
        }
        ((alvg) n.i().h("com/google/android/libraries/compose/emoji/ui/screen/adapter/EmojiAdapter", "handleDirectEmojiSelection", 182, "EmojiAdapter.kt")).t("Unable to find emoji for %s. Cannot invoke listener.", null);
    }

    public final void J(afnx afnxVar) {
        afnxVar.getClass();
        this.e = afnxVar;
    }

    public void K(Context context, int i) {
        Resources resources = context.getResources();
        this.q = resources.getDimensionPixelSize(R.dimen.emoji_gallery_padding);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.emoji_item_default_width);
        int i2 = this.q;
        int i3 = i - (i2 + i2);
        int max = Math.max(1, i3 / dimensionPixelSize);
        this.f = max;
        this.h = Math.max(1, i3 / max);
        if (this.i == 0) {
            this.i = context.getResources().getDimensionPixelSize(R.dimen.emoji_item_icon_padding);
        }
        p();
    }

    public final void L(afoj afojVar, afnb afnbVar, View view) {
        this.o.b(afnbVar, view, m(), new aaoa((Object) afojVar, (Object) this, (Object) afnbVar, 9, (short[]) null));
    }

    public abstract afwv M(int i);

    @Override // defpackage.afme
    public final void a() {
        arrn.J(this.d, null, null, new afbh(this, (arpe) null, 7), 3);
    }

    @Override // defpackage.no
    public int b() {
        return this.g.size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        return H(i).b() - 1;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        afom afomVar = (afom) ooVar;
        afomVar.getClass();
        afomVar.D(H(i));
    }

    public final afnx m() {
        afnx afnxVar = this.e;
        if (afnxVar != null) {
            return afnxVar;
        }
        arro.b("configuration");
        return null;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void z(oo ooVar, int i, List list) {
        afom afomVar = (afom) ooVar;
        afomVar.getClass();
        list.getClass();
        if (!((adwq) this.p.a()).f(afomVar, i, list)) {
            g(afomVar, i);
        }
    }
}
