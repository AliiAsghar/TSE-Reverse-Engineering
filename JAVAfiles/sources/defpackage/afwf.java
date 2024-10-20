package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwf implements ageb {
    static final /* synthetic */ artm[] a;
    public final Map b;
    public final ViewGroup c;
    public final cg d;
    public final arqr e;
    public agdq f;
    public final int g;
    public final ahcn h;
    public final aday i;
    private final EditText j;
    private final List k;
    private final View.OnLayoutChangeListener l;
    private final arsn m;
    private final arsn n;
    private agek o;
    private Bundle p;
    private ahjj q;

    static {
        arrr arrrVar = new arrr(afwf.class, "activeScreen", "getActiveScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar, new arrr(afwf.class, "draftController", "getDraftController()Lkotlin/jvm/functions/Function0;", 0)};
    }

    public afwf(Map map, ViewGroup viewGroup, EditText editText, aday adayVar, List list, cg cgVar, arqr arqrVar) {
        int i;
        this.b = map;
        this.c = viewGroup;
        this.j = editText;
        this.i = adayVar;
        this.d = cgVar;
        this.e = arqrVar;
        ArrayList<agek> arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.b.containsKey((agek) obj)) {
                arrayList.add(obj);
            }
        }
        this.k = arrayList;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                i = 3;
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        this.g = i;
        this.l = new fyc(this, 17);
        this.h = new ahcn(new afpw(this, 11), new afmo(this, 10));
        this.m = new afwc(this);
        this.n = new afwd(this);
        Object b = b();
        if (b != null) {
            e((agem) ((Void) b));
        }
        Object obj2 = this.i.a;
        ncd ncdVar = new ncd(this, 19, (byte[]) null, (byte[]) null);
        afwi afwiVar = (afwi) obj2;
        afwiVar.d = arrayList;
        if (arrayList.size() <= 1) {
            ((TabLayout) afwiVar.c.i).setVisibility(8);
            ((ConstraintLayout) afwiVar.c.c).setBackground(null);
        } else {
            afvz afvzVar = afwiVar.c;
            ((ConstraintLayout) afvzVar.c).setBackground(((View) afvzVar.a).getContext().getDrawable(R.drawable.compose_screen_top_bar_background));
            Object obj3 = afwiVar.c.i;
            afwiVar.e.d(afwi.a[0], new afwg(ncdVar, arrayList));
            for (agek agekVar : arrayList) {
                TabLayout tabLayout = (TabLayout) obj3;
                ajmk e = tabLayout.e();
                int i2 = agekVar.j;
                TabLayout tabLayout2 = e.g;
                if (tabLayout2 != null) {
                    e.f(tabLayout2.getResources().getText(i2));
                    arrn.J(afwiVar.b, null, null, new afju(e, afwiVar, (arpe) null, 6), 3);
                    tabLayout.g(e);
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
        }
        if (this.g == 2) {
            if (this.k.size() == 1) {
                f(c((agek) aqjn.X(this.k), a()));
                return;
            }
            throw new IllegalStateException("Cannot set up single layout with " + this.k.size() + " screen(s)");
        }
    }

    public static /* synthetic */ void g(afwf afwfVar, int i, agem agemVar, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i4;
        int i5 = 0;
        if ((i2 & 1) != 0) {
            ViewGroup viewGroup = afwfVar.c;
            int height = viewGroup.getHeight();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i3 = marginLayoutParams.topMargin;
            } else {
                i3 = 0;
            }
            int i6 = height + i3;
            ViewGroup.LayoutParams layoutParams2 = afwfVar.c.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams2 = null;
            }
            if (marginLayoutParams2 != null) {
                i4 = marginLayoutParams2.bottomMargin;
            } else {
                i4 = 0;
            }
            i = i4 + i6;
        }
        if ((i2 & 2) != 0) {
            i5 = (int) afwfVar.c.getTranslationY();
        }
        if ((i2 & 4) != 0) {
            agemVar = null;
        }
        if (agemVar == null) {
            agemVar = afwfVar.b();
        }
        if (agemVar != null) {
            int i7 = i + i5;
            agea gx = agemVar.gx();
            if (gx == null) {
                agemVar.aS = i7;
            } else {
                agem.bw(gx, i7);
            }
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Editable text = this.j.getText();
        text.getClass();
        if (text.length() > 0) {
            bundle.putString("search", text.toString());
        }
        return bundle;
    }

    public final agem b() {
        return (agem) this.m.c(a[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r1 != null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.agem c(defpackage.agek r8, android.os.Bundle r9) {
        /*
            r7 = this;
            agdq r0 = r7.f
            r1 = 0
            if (r0 == 0) goto L76
            java.util.Map r0 = r7.b
            java.lang.Object r0 = r0.get(r8)
            agae r0 = (defpackage.agae) r0
            if (r0 == 0) goto L63
            cg r2 = r7.d
            da r2 = r2.G()
            r2.getClass()
            agdq r3 = r7.f
            if (r3 != 0) goto L22
            java.lang.String r3 = "renderingStrategy"
            defpackage.arro.b(r3)
            r3 = r1
        L22:
            ahjj r4 = r7.q
            if (r4 != 0) goto L2c
            java.lang.String r4 = "renderingStateHandler"
            defpackage.arro.b(r4)
            r4 = r1
        L2c:
            r3.getClass()
            r4.getClass()
            agem r5 = r0.b(r2)
            if (r5 == 0) goto L3c
            r5.ak(r9)
            goto L3d
        L3c:
            r5 = r1
        L3d:
            if (r5 == 0) goto L4b
            afyq r9 = new afyq
            r0 = 20
            r9.<init>(r5, r0)
            defpackage.afzv.s(r3, r2, r9)
            r1 = r5
            goto L5a
        L4b:
            agai r9 = r0.a(r9)
            afho r5 = new afho
            r6 = 16
            r5.<init>(r9, r0, r6, r1)
            defpackage.afzv.s(r3, r2, r5)
            r1 = r9
        L5a:
            r9 = r1
            agem r9 = (defpackage.agem) r9
            r9.gA(r3, r4)
            if (r1 == 0) goto L63
            goto L7a
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.util.Objects.toString(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "Cannot find a factory for screen category "
            java.lang.String r8 = r0.concat(r8)
            r9.<init>(r8)
            throw r9
        L76:
            r7.o = r8
            r7.p = r9
        L7a:
            agem r1 = (defpackage.agem) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afwf.c(agek, android.os.Bundle):agem");
    }

    public final void d(arqg arqgVar) {
        arqgVar.getClass();
        this.n.d(a[1], arqgVar);
    }

    public final void e(agem agemVar) {
        Editable editable = null;
        agemVar.bp(null);
        g(this, 0, agemVar, 3);
        this.c.addOnLayoutChangeListener(this.l);
        arqg arqgVar = (arqg) this.n.c(a[1]);
        if (arqgVar != null) {
            agemVar.gB(arqgVar);
        }
        agdq agdqVar = this.f;
        if (agdqVar == null) {
            arro.b("renderingStrategy");
            agdqVar = null;
        }
        ahjj ahjjVar = this.q;
        if (ahjjVar == null) {
            arro.b("renderingStateHandler");
            ahjjVar = null;
        }
        agemVar.gA(agdqVar, ahjjVar);
        if (agemVar instanceof agep) {
            agep agepVar = (agep) agemVar;
            Editable text = this.j.getText();
            if (true == arsd.M(text)) {
                text = null;
            }
            if (text != null) {
                editable = text;
            }
            if (editable == null) {
                agepVar.gz();
            }
        }
        agemVar.aY();
    }

    public final void f(agem agemVar) {
        this.m.d(a[0], agemVar);
    }

    public final void h(agdq agdqVar, ahjj ahjjVar) {
        agdqVar.getClass();
        ahjjVar.getClass();
        this.f = agdqVar;
        this.q = ahjjVar;
        agek agekVar = this.o;
        ahjj ahjjVar2 = null;
        if (agekVar != null) {
            Bundle bundle = this.p;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            bundle.getClass();
            f(c(agekVar, bundle));
            this.o = null;
            this.p = null;
            return;
        }
        agem b = b();
        if (b != null) {
            agdq agdqVar2 = this.f;
            if (agdqVar2 == null) {
                arro.b("renderingStrategy");
                agdqVar2 = null;
            }
            ahjj ahjjVar3 = this.q;
            if (ahjjVar3 == null) {
                arro.b("renderingStateHandler");
            } else {
                ahjjVar2 = ahjjVar3;
            }
            b.gA(agdqVar2, ahjjVar2);
        }
    }

    @Override // defpackage.ageb
    public final agea r() {
        throw null;
    }
}
