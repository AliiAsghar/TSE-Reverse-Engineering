package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmn {
    public final Object a;
    public final Object b;
    public final Object c;

    public zmn(zmm zmmVar, yyt yytVar, mho mhoVar) {
        this.a = zmmVar;
        this.b = yytVar;
        this.c = mhoVar;
    }

    private final boolean d() {
        return ((GalleryBrowserActivity) this.a).R().isPresent();
    }

    public final Uri a(aavi aaviVar) {
        Uri d = uhl.d("jpg", (Context) this.b);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(uhl.i(d, (Context) this.b));
            try {
                aaviVar.a(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return d;
            } finally {
            }
        } catch (IOException e) {
            uhl.j((Context) this.b, d);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, android.view.ActionMode$Callback] */
    public final void b() {
        String string;
        int i;
        Object obj = this.a;
        en j = ((GalleryBrowserActivity) obj).j();
        int a = ((aapj) obj).C.a(GalleryContentItem.class);
        if (a > 0) {
            if (((Boolean) aarw.a.e()).booleanValue()) {
                string = ((GalleryBrowserActivity) this.a).getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection_alternate, a, Integer.valueOf(a));
            } else {
                string = ((GalleryBrowserActivity) this.a).getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection, a, Integer.valueOf(a));
            }
        } else {
            string = ((GalleryBrowserActivity) this.a).getResources().getString(R.string.mediapicker_gallery_title);
        }
        Object obj2 = this.a;
        if (a > 0) {
            i = R.attr.colorPrimaryBrandIcon;
        } else {
            i = android.R.attr.colorControlNormal;
        }
        int f = ahnz.f((Context) obj2, i, "FullscreenGalleryActionBarController");
        if (a > 0) {
            if (!d()) {
                Object obj3 = this.a;
                ?? r2 = this.c;
                View view = ((cg) this.b).Q;
                view.getClass();
                ((GalleryBrowserActivity) obj3).W(r2, view, null);
                Drawable drawable = ((GalleryBrowserActivity) this.a).getDrawable(R.drawable.quantum_ic_close_black_24);
                if (j != null) {
                    j.setHomeAsUpIndicator(drawable);
                }
            }
            zgu zguVar = (zgu) this.a;
            zgt zgtVar = zguVar.o;
            if (zgtVar == null) {
                return;
            }
            zgtVar.a = string;
            zguVar.U();
            return;
        }
        if (d()) {
            ((GalleryBrowserActivity) this.a).S();
            Drawable drawable2 = ((GalleryBrowserActivity) this.a).getDrawable(R.drawable.quantum_ic_arrow_back_black_24);
            if (j != null) {
                j.setHomeAsUpIndicator(drawable2);
            }
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(f), 0, spannableString.length(), 18);
        ((GalleryBrowserActivity) this.a).setTitle(new SpannableString(string));
    }

    public final boolean c() {
        if (d()) {
            ((GalleryBrowserActivity) this.a).S();
            return true;
        }
        return false;
    }

    public zmn(@org armf armfVar, asai asaiVar, asai asaiVar2) {
        armfVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        this.c = armfVar;
        this.b = asaiVar;
        this.a = asaiVar2;
    }

    public zmn(cg cgVar) {
        this.c = new zlx(this, 2);
        this.b = cgVar;
        this.a = (GalleryBrowserActivity) cgVar.fe();
    }

    public zmn(Context context, anen anenVar) {
        this.b = context;
        this.a = anenVar;
        this.c = hkz.c(context);
    }
}
