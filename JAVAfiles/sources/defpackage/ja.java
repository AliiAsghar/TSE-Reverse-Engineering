package defpackage;

import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.ActivityChooserView;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ja implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ja(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        kvw kvwVar;
        boolean z = true;
        switch (this.b) {
            case 0:
                if (((jb) this.a).u()) {
                    jb jbVar = (jb) this.a;
                    if (!jbVar.a.p) {
                        View view2 = jbVar.c;
                        if (view2 != null && view2.isShown()) {
                            ((jb) this.a).a.s();
                            return;
                        } else {
                            ((jb) this.a).k();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                if (((id) this.a).u() && ((id) this.a).b.size() > 0 && !((nd) ((apuv) ((id) this.a).b.get(0)).c).p) {
                    View view3 = ((id) this.a).d;
                    if (view3 != null && view3.isShown()) {
                        Iterator it = ((id) this.a).b.iterator();
                        while (it.hasNext()) {
                            ((nd) ((apuv) it.next()).c).s();
                        }
                        return;
                    }
                    ((id) this.a).k();
                    return;
                }
                return;
            case 2:
                if (((ActivityChooserView) this.a).c()) {
                    if (!((ActivityChooserView) this.a).isShown()) {
                        ((ActivityChooserView) this.a).a().k();
                        return;
                    }
                    ((ActivityChooserView) this.a).a().s();
                    eco ecoVar = ((ActivityChooserView) this.a).h;
                    if (ecoVar != null) {
                        ecoVar.subUiVisibilityChanged(true);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (!((ld) this.a).b.u()) {
                    ((ld) this.a).b();
                }
                ViewTreeObserver viewTreeObserver = ((ld) this.a).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 4:
                ld ldVar = ((la) this.a).d;
                if (ldVar.isAttachedToWindow() && ldVar.getGlobalVisibleRect(((la) this.a).c)) {
                    ((la) this.a).n();
                    la.m((la) this.a);
                    return;
                } else {
                    ((nd) this.a).k();
                    return;
                }
            case 5:
                ixd ixdVar = (ixd) this.a;
                aabp aabpVar = ixdVar.bT;
                if (aabpVar != null) {
                    boolean z2 = aabpVar.m;
                    if (ixdVar.w != z2 || aabpVar.x()) {
                        WindowInsets windowInsets = ixdVar.A;
                        if (windowInsets != null && (view = ixdVar.bR) != null) {
                            view.dispatchApplyWindowInsets(windowInsets);
                        }
                        ixdVar.w = z2;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                int i = 0;
                while (true) {
                    kvwVar = (kvw) this.a;
                    if (i < kvwVar.f(kvwVar.b).getChildCount()) {
                        View childAt = kvwVar.f(kvwVar.b).getChildAt(i);
                        if ((childAt instanceof ViewStub) || childAt.getVisibility() != 0) {
                            i++;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z != kvwVar.aN) {
                    kvwVar.f(kvwVar.b).requestApplyInsets();
                    return;
                }
                return;
            case 7:
                ImageView imageView = ((ztq) this.a).i.l;
                if (imageView != null && imageView.getParent() != null) {
                    View view4 = (View) imageView.getParent();
                    Rect rect = new Rect();
                    imageView.getHitRect(rect);
                    int dimensionPixelSize = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.min_touch_target_size) / 2;
                    rect.top -= dimensionPixelSize;
                    rect.left -= dimensionPixelSize;
                    rect.bottom += dimensionPixelSize;
                    rect.right += dimensionPixelSize;
                    view4.setTouchDelegate(new TouchDelegate(rect, imageView));
                    return;
                }
                return;
            case 8:
                alvw d = aaar.ah.d();
                d.X(alwp.a, "emojiGallery");
                ((alvg) ((alvg) d).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment$2", "onGlobalLayout", 119, "EmojiGalleryFragment.java")).q("onGlobalLayout()");
                ((aaar) this.a).p(this);
                Object obj = this.a;
                aaau aaauVar = ((aaar) obj).aj;
                if (aaauVar != null) {
                    aaauVar.H(abbv.b(((cg) obj).x()).x);
                    aaauVar.I(aaauVar.m, aaauVar.o);
                    aaar aaarVar = (aaar) this.a;
                    aaarVar.al.r(aaarVar.aj.s);
                    ((aaar) this.a).aj.p();
                    int F = ((aaar) this.a).aj.F();
                    ((aaar) this.a).q(F);
                    ((aaar) this.a).r(F);
                    return;
                }
                return;
            case 9:
                ((aaar) this.a).p(this);
                alvw g = aaar.ah.g();
                g.X(alwp.a, "emojiGallery");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ui/conversation/emoji/EmojiGalleryFragment", "onFinishLayout", 318, "EmojiGalleryFragment.java")).q("onFinishLayout()");
                Object obj2 = this.a;
                aaar aaarVar2 = (aaar) obj2;
                aaau aaauVar2 = aaarVar2.aj;
                int i2 = abbv.b(((cg) obj2).x()).x;
                SparseArray sparseArray = new SparseArray();
                int i3 = 0;
                while (true) {
                    int length = aaau.d.length;
                    if (i3 < 9) {
                        int i4 = i3 + 1;
                        TypedArray obtainTypedArray = aaauVar2.f.getResources().obtainTypedArray(aaau.d[i3].intValue());
                        ArrayList arrayList = new ArrayList();
                        for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                            String string = obtainTypedArray.getString(i5);
                            if (string != null) {
                                if (aaauVar2.i.g(aaauVar2.h.a(string))) {
                                    arrayList.add(new aaas(string, i4, false));
                                }
                            }
                        }
                        obtainTypedArray.recycle();
                        sparseArray.put(i4, arrayList);
                        i3 = i4;
                    } else {
                        aaauVar2.p = sparseArray;
                        aaauVar2.H(i2);
                        aaauVar2.m = new ArrayList();
                        aaauVar2.o = new SparseIntArray();
                        aaauVar2.I(aaauVar2.m, aaauVar2.o);
                        for (int i6 = 0; i6 < aaauVar2.p.size(); i6++) {
                            int keyAt = aaauVar2.p.keyAt(i6);
                            aaauVar2.m.add(new aaas(aaauVar2.f.getResources().getString(aaau.e[keyAt].intValue()), keyAt, true));
                            aaauVar2.o.put(keyAt, aaauVar2.m.size() - 1);
                            aaauVar2.m.addAll((Collection) aaauVar2.p.get(keyAt));
                        }
                        aaauVar2.v.f(aaauVar2);
                        aaarVar2.am = aaarVar2.aj.F();
                        aaarVar2.al = new aaao(aaarVar2, ((aaal) obj2).fe(), aaarVar2.aj.s);
                        aaarVar2.ai.aj(aaarVar2.al);
                        aaarVar2.al.g = new aaap(aaarVar2);
                        ahjj ahjjVar = aaarVar2.ao;
                        if (ahjjVar != null) {
                            aaarVar2.aj.w = ahjjVar;
                        } else {
                            aaarVar2.aj.J();
                        }
                        aaarVar2.aj.u = aaarVar2;
                        aaarVar2.ai.aL(aaarVar2.an);
                        aaarVar2.am = aaarVar2.aj.F();
                        aaarVar2.r(aaarVar2.aj.F());
                        return;
                    }
                }
            case 10:
                ljn ljnVar = (ljn) ((aain) this.a).b.b();
                amwf amwfVar = ((aain) this.a).m;
                amwfVar.getClass();
                ljnVar.c(4, amwfVar);
                ((aain) this.a).i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            default:
                airr airrVar = (airr) this.a;
                airrVar.c();
                if (airrVar.p == null) {
                    airrVar.p = new airq(airrVar);
                    airrVar.i.aL(airrVar.p);
                }
                ((airr) this.a).i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
        }
    }

    public /* synthetic */ ja(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
