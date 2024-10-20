package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fyc implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fyc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int b;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z = true;
        z = true;
        byte[] bArr = null;
        int i12 = 0;
        switch (this.b) {
            case 0:
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    fyj fyjVar = (fyj) this.a;
                    if (fyjVar.g.isShowing()) {
                        fyjVar.k();
                        fyjVar.g.update(view, (fyjVar.getWidth() - fyjVar.g.getWidth()) - fyjVar.h, (-fyjVar.g.getHeight()) - fyjVar.h, -1, -1);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((SearchView) this.a).adjustDropDownSizeAndPosition();
                return;
            case 2:
                Object obj = this.a;
                fyu fyuVar = (fyu) obj;
                fyj fyjVar2 = fyuVar.a;
                int width = (fyjVar2.getWidth() - fyjVar2.getPaddingLeft()) - fyuVar.a.getPaddingRight();
                fyj fyjVar3 = fyuVar.a;
                int height = (fyjVar3.getHeight() - fyjVar3.getPaddingBottom()) - fyuVar.a.getPaddingTop();
                ViewGroup viewGroup = fyuVar.c;
                int b2 = fyu.b(viewGroup);
                if (viewGroup != null) {
                    i9 = viewGroup.getPaddingLeft() + fyuVar.c.getPaddingRight();
                } else {
                    i9 = 0;
                }
                int i13 = b2 - i9;
                ViewGroup viewGroup2 = fyuVar.c;
                int a = fyu.a(viewGroup2);
                if (viewGroup2 != null) {
                    i10 = viewGroup2.getPaddingTop() + fyuVar.c.getPaddingBottom();
                } else {
                    i10 = 0;
                }
                int i14 = a - i10;
                int max = Math.max(i13, fyu.b(fyuVar.i) + fyu.b(fyuVar.k));
                int a2 = fyu.a(fyuVar.d);
                int i15 = a2 + a2;
                if (width > max && height > i14 + i15) {
                    z = false;
                }
                if (fyuVar.t != z) {
                    fyuVar.t = z;
                    view.post(new fyk(obj, i12));
                }
                int i16 = i3 - i;
                int i17 = i7 - i5;
                if (!fyuVar.t && i16 != i17) {
                    view.post(new fyk(obj, 2));
                    return;
                }
                return;
            case 3:
                ((ixd) this.a).aK(i4 - i2);
                return;
            case 4:
                ((ixd) this.a).aK(i4 - i2);
                return;
            case 5:
                ((ixd) this.a).L();
                return;
            case 6:
                ixd ixdVar = (ixd) this.a;
                WindowInsets windowInsets = ixdVar.A;
                if (windowInsets != null) {
                    b = windowInsets.getSystemWindowInsetBottom();
                } else {
                    b = abbu.b(ixdVar.q());
                }
                if (i4 <= ixdVar.bR.getRootView().getHeight() - b) {
                    return;
                }
                view.setBottom(i4 - b);
                view.setTop(i2 - b);
                return;
            case 7:
                zop zopVar = (zop) this.a;
                if (zopVar.B.g()) {
                    abac abacVar = zopVar.B;
                    ImageView imageView = zopVar.g;
                    abbt abbtVar = (abbt) abacVar.a;
                    abbtVar.g = imageView;
                    abbtVar.d();
                    abbtVar.e();
                    return;
                }
                return;
            case 8:
                if (((zop) this.a).q.getVisibility() == 0) {
                    zop zopVar2 = (zop) this.a;
                    if (zopVar2.i && zopVar2.y != 4) {
                        zopVar2.k();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                Object obj2 = this.a;
                ((zop) obj2).q.post(new zom(obj2, i12));
                ((zop) this.a).b.removeOnLayoutChangeListener(this);
                return;
            case 10:
                if (i3 - i != 0) {
                    RippleDrawable rippleDrawable = (RippleDrawable) ((ImageView) this.a).getForeground();
                    if (rippleDrawable != null) {
                        ImageView imageView2 = (ImageView) this.a;
                        int paddingLeft = imageView2.getPaddingLeft();
                        int paddingTop = imageView2.getPaddingTop();
                        int width2 = imageView2.getWidth() - imageView2.getPaddingRight();
                        ImageView imageView3 = (ImageView) this.a;
                        rippleDrawable.setHotspotBounds(paddingLeft, paddingTop, width2, imageView3.getHeight() - imageView3.getPaddingBottom());
                    }
                    ((ImageView) this.a).removeOnLayoutChangeListener(this);
                    return;
                }
                return;
            case 11:
                Object obj3 = this.a;
                ((zri) obj3).ar.post(new eyr(obj3, i2, i6, 5));
                return;
            case 12:
                if (view.getHeight() == i8 - i6) {
                    return;
                }
                ztc ztcVar = (ztc) this.a;
                int width3 = ztcVar.j.getWidth();
                ViewGroup viewGroup3 = ztcVar.j;
                if (viewGroup3 != null) {
                    i12 = viewGroup3.getHeight() - ztcVar.k;
                }
                aktp.K(new zsj(width3, i12), ztcVar.e);
                return;
            case 13:
                aaaz aaazVar = (aaaz) this.a;
                if (aaazVar.b()) {
                    aaazVar.a();
                    return;
                }
                return;
            case 14:
                ((aasy) this.a).D();
                return;
            case 15:
                VCardDetailFragment vCardDetailFragment = (VCardDetailFragment) this.a;
                ExpandableListView expandableListView = vCardDetailFragment.b;
                expandableListView.setIndicatorBounds(expandableListView.getWidth() - vCardDetailFragment.z().getDimensionPixelSize(R.dimen.vcard_detail_group_indicator_width), vCardDetailFragment.b.getWidth());
                return;
            case 16:
                afpr afprVar = (afpr) this.a;
                if (afprVar.g()) {
                    afprVar.d();
                    afprVar.e();
                    return;
                }
                return;
            case 17:
                if (i4 == i8 && i2 == i6) {
                    return;
                }
                afwf afwfVar = (afwf) this.a;
                ViewGroup.LayoutParams layoutParams = afwfVar.c.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    i11 = marginLayoutParams.topMargin;
                } else {
                    i11 = 0;
                }
                int i18 = i4 - i2;
                ViewGroup.LayoutParams layoutParams2 = afwfVar.c.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams2 = null;
                }
                if (marginLayoutParams2 != null) {
                    i12 = marginLayoutParams2.bottomMargin;
                }
                afwf.g(afwfVar, i18 + i11 + i12, null, 6);
                return;
            case 18:
                aged agedVar = (aged) this.a;
                if (agedVar.c.g && agedVar.b() == 0) {
                    return;
                }
                agedVar.j(arrn.r(i4 - i2, ((Number) agedVar.g.c()).intValue()));
                return;
            case 19:
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new ajir(this.a, z ? 1 : 0, bArr));
                return;
            default:
                ((View) this.a).getVisibility();
                return;
        }
    }

    public fyc(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
