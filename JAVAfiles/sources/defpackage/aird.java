package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aird extends gnd {
    public WindowInsets a;
    private final ViewPager b;
    private SparseArray c = new SparseArray();
    private aire d;
    private final StickerGalleryActivity e;

    public aird(ViewPager viewPager, StickerGalleryActivity stickerGalleryActivity) {
        this.b = viewPager;
        this.e = stickerGalleryActivity;
    }

    @Override // defpackage.gnd
    public final Parcelable a() {
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt.isSaveFromParentEnabled()) {
                childAt.saveHierarchyState(this.c);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray("viewStates", this.c);
        return bundle;
    }

    @Override // defpackage.gnd
    public final Object c(ViewGroup viewGroup, int i) {
        View aiqrVar;
        Context context = viewGroup.getContext();
        if (i != 0) {
            if (i == 1) {
                aiqrVar = new aiqz(context, this.e);
                aiqrVar.setId(i);
            } else {
                throw new IllegalStateException(a.bV(i, "Unknown page position: "));
            }
        } else {
            aiqrVar = new aiqr(context, this.e);
            aiqrVar.setId(i);
        }
        aiqrVar.restoreHierarchyState(this.c);
        viewGroup.addView(aiqrVar);
        WindowInsets windowInsets = this.a;
        if (windowInsets != null) {
            aiqrVar.dispatchApplyWindowInsets(windowInsets);
        }
        return aiqrVar;
    }

    @Override // defpackage.gnd
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        view.saveHierarchyState(this.c);
        viewGroup.removeView(view);
    }

    @Override // defpackage.gnd
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        this.c = bundle.getSparseParcelableArray("viewStates");
    }

    @Override // defpackage.gnd
    public final boolean g(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gnd
    public final void i(Object obj) {
        aire aireVar = this.d;
        if (obj == aireVar) {
            return;
        }
        if (aireVar != null) {
            aireVar.c();
        }
        aire aireVar2 = (aire) obj;
        this.d = aireVar2;
        aireVar2.b();
    }

    @Override // defpackage.gnd
    public final int j() {
        return 2;
    }

    @Override // defpackage.gnd
    public final CharSequence k(int i) {
        Context context = this.b.getContext();
        if (i != 0) {
            if (i == 1) {
                return context.getString(R.string.sticker_gallery_view_pager_favorite_label);
            }
            throw new IllegalStateException(a.bV(i, "Unknown page position: "));
        }
        return context.getString(R.string.sticker_gallery_view_pager_browse_label);
    }
}
