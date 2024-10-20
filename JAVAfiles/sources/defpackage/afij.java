package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.RoundedImageView;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afij extends gcq {
    private final arqg d;
    private final arqr e;
    private final afhv f;
    private final ahcn g;
    private final adec h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afij(adec adecVar, hd hdVar, arqg arqgVar, arqr arqrVar, afhv afhvVar) {
        super(hdVar, asfh.a, arws.a);
        arwb arwbVar = arws.a;
        this.h = adecVar;
        this.d = arqgVar;
        this.e = arqrVar;
        this.f = afhvVar;
        this.g = new ahcn(new zay(afhvVar.b(), 5, (boolean[]) null), aeys.n);
    }

    @Override // defpackage.no
    public final int c(int i) {
        if (i == 0) {
            return 4;
        }
        return 5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [armf, java.lang.Object] */
    @Override // defpackage.no
    public final /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.local_media_item, viewGroup, false);
        afvo afvoVar = (afvo) this.g.c();
        adec adecVar = this.h;
        Activity activity = (Activity) adecVar.a.b();
        activity.getClass();
        afvp afvpVar = (afvp) adecVar.c.b();
        Optional optional = (Optional) ((apxx) adecVar.b).a;
        afke afkeVar = (afke) adecVar.e.b();
        afkeVar.getClass();
        ((arwe) adecVar.d.b()).getClass();
        inflate.getClass();
        afvoVar.getClass();
        return new afur(activity, afvpVar, optional, afkeVar, inflate, afvoVar);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [ascv, java.lang.Object] */
    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        Object c;
        Object c2;
        Object c3;
        Object c4;
        String string;
        Object i2;
        hxc hxcVar;
        int i3;
        int i4;
        afur afurVar = (afur) ooVar;
        afurVar.getClass();
        fzi fziVar = this.c;
        try {
            ascd ascdVar = fziVar.d;
            do {
                c2 = ascdVar.c();
                ((Boolean) c2).booleanValue();
            } while (!ascdVar.g(c2, true));
            fziVar.e = i;
            gdm gdmVar = (gdm) fziVar.f.get();
            if (gdmVar != null) {
                if (i >= 0 && i < gdmVar.f()) {
                    int e = i - gdmVar.e();
                    if (e >= 0 && e < gdmVar.a()) {
                        c3 = gdmVar.h(e);
                    }
                    c3 = null;
                } else {
                    throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + gdmVar.f());
                }
            } else {
                c3 = fziVar.g.c(i);
            }
            ascd ascdVar2 = fziVar.d;
            do {
                c4 = ascdVar2.c();
                ((Boolean) c4).booleanValue();
            } while (!ascdVar2.g(c4, false));
            if (c3 != null) {
                final aftr aftrVar = (aftr) c3;
                List list = (List) this.d.a().c();
                list.getClass();
                Iterator it = list.iterator();
                int i5 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (aeke.cj((afcs) it.next(), aftrVar)) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                Integer valueOf = Integer.valueOf(i5);
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                Resources resources = afurVar.a.getContext().getResources();
                String string2 = resources.getString(aftrVar.l().b().a());
                string2.getClass();
                if (valueOf == null) {
                    string = resources.getString(R.string.gallery_item_content_description_unselected_state, string2, aeke.bs(aftrVar.f()));
                    string.getClass();
                } else {
                    string = resources.getString(R.string.gallery_item_content_description_selected_state, string2, Integer.valueOf(valueOf.intValue() + 1));
                    string.getClass();
                }
                afvo afvoVar = (afvo) this.g.c();
                afvoVar.getClass();
                afurVar.C = afvoVar;
                arqr arqrVar = this.e;
                afob afobVar = afob.h;
                arqrVar.getClass();
                ((alvg) afvn.u.e().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder", "bind", 93, "MediaViewHolder.kt")).J("Rendering %s with configuration %s", afurVar.z, aftrVar, afurVar.C);
                afri afriVar = afurVar.C.a;
                if (afriVar != null) {
                    afurVar.y.b(afriVar);
                }
                ImageView.ScaleType scaleType = afurVar.C.b;
                if (scaleType != null) {
                    afurVar.y.setScaleType(scaleType);
                }
                hls c5 = hkz.c(afurVar.D);
                c5.getClass();
                if (aftrVar.o() != null) {
                    i2 = new hrv(aftrVar.i(), new hrw() { // from class: afvk
                        @Override // defpackage.hrw
                        public final Map a() {
                            return afsm.this.o();
                        }
                    });
                } else {
                    i2 = aftrVar.i();
                }
                hlp a = c5.c().j(i2).a(new afvm(afurVar, aftrVar, aftrVar));
                a.getClass();
                afurVar.y.a();
                if (aftrVar instanceof aftq) {
                    afurVar.t.setVisibility(0);
                    if (((Boolean) arsd.j(afurVar.s, true)).booleanValue()) {
                        afurVar.t.setText(DateUtils.formatElapsedTime(((aftq) aftrVar).g.getSeconds()));
                    }
                    afurVar.t.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, afurVar.y.getContext().getDrawable(R.drawable.gs_play_arrow_fill1_vd_24), (Drawable) null);
                } else {
                    afurVar.t.setVisibility(8);
                }
                if (afurVar.C.b != ImageView.ScaleType.CENTER_CROP) {
                    hxcVar = hxc.a();
                } else {
                    if (hxc.w == null) {
                        hxc.w = (hxc) ((hxc) new hxc().C()).w();
                    }
                    hxcVar = hxc.w;
                }
                hwu P = a.p(hxcVar).P(new hye(aftrVar.d().a(), aftrVar.f().toEpochMilli()));
                P.getClass();
                ((hlp) P).t(afurVar.y);
                afurVar.a.setOnClickListener(afurVar.x.a(afurVar.A, new ivq(afurVar, aftrVar, arqrVar, 15)));
                afurVar.a.setOnLongClickListener(afurVar.x.b(afurVar.B, new afvl((afvn) afurVar, (afso) aftrVar, (arqr) afobVar, 0)));
                afvp afvpVar = afurVar.w;
                View view = afurVar.a;
                RoundedImageView roundedImageView = afurVar.y;
                ViewGroup viewGroup = (ViewGroup) view;
                boolean z = afvpVar.a;
                afvpVar.a = true;
                if (valueOf != null || afvpVar.b.b()) {
                    Object a2 = ((afkh) afvpVar.b.a()).a(viewGroup, roundedImageView);
                    if (!z) {
                        viewGroup.animate().cancel();
                        TextView textView = (TextView) a2;
                        textView.animate().cancel();
                        if (valueOf == null) {
                            ((View) a2).setVisibility(8);
                            afvp.c(viewGroup, textView, 1.0f, brg.a);
                        } else {
                            afvp.b(textView, valueOf.intValue());
                            afvp.c(viewGroup, textView, 0.88f, 1.0f);
                            ((View) a2).setVisibility(0);
                        }
                    } else if (valueOf == null) {
                        afvp.a(viewGroup, (TextView) a2, 1.0f, brg.a, new afpw(a2, 8));
                    } else {
                        TextView textView2 = (TextView) a2;
                        afvp.b(textView2, valueOf.intValue());
                        afvp.a(viewGroup, textView2, 0.88f, 1.0f, null);
                    }
                }
                if (string != null) {
                    afurVar.a.setContentDescription(string);
                }
                Size a3 = this.f.a(c(i));
                if (a3 != null) {
                    i3 = a3.getWidth();
                } else {
                    i3 = -1;
                }
                if (a3 != null) {
                    i4 = a3.getHeight();
                } else {
                    i4 = -2;
                }
                View view2 = afurVar.a;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i3;
                    layoutParams.height = i4;
                    view2.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new IllegalStateException(a.bV(i, "No item for bind position "));
        } catch (Throwable th) {
            ascd ascdVar3 = fziVar.d;
            do {
                c = ascdVar3.c();
                ((Boolean) c).booleanValue();
            } while (!ascdVar3.g(c, false));
            throw th;
        }
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void k(oo ooVar) {
        afur afurVar = (afur) ooVar;
        afurVar.getClass();
        afurVar.a.setContentDescription(null);
        afurVar.w.a = false;
        if (!afurVar.v.isDestroyed()) {
            Context context = afurVar.D;
            hkz.c(context).i(afurVar.y);
        }
    }
}
