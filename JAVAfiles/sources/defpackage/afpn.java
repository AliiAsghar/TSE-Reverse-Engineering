package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afpn extends FrameLayout {
    static final /* synthetic */ artm[] a;
    public final int b;
    public final arqr c;
    public final arsn d;
    public final LayoutInflater e;
    public final arsn f;
    private final arml g;
    private final arsn h;

    static {
        arrr arrrVar = new arrr(afpn.class, "configuration", "getConfiguration()Lcom/google/android/libraries/compose/emoji/ui/screen/EmojiConfiguration;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar, new arrr(afpn.class, "emojiSet", "getEmojiSet()Lcom/google/android/libraries/compose/emoji/data/EmojiSet;", 0), new arrr(afpn.class, "anchorTop", "getAnchorTop()I", 0)};
    }

    public afpn(Context context, int i, arqr arqrVar) {
        super(context);
        this.b = i;
        this.c = arqrVar;
        this.d = new afpk(this);
        this.e = LayoutInflater.from(context);
        this.g = armd.a(new afoo(context, 10));
        this.h = new afpl(this);
        this.f = new afpm(0, this);
    }

    public final int a() {
        return ((Number) this.g.a()).intValue();
    }

    public final afnb b() {
        return (afnb) this.h.c(a[1]);
    }

    public abstract afpj c();

    public final void d(afnb afnbVar) {
        this.h.d(a[1], afnbVar);
    }

    public final void e() {
    }
}
