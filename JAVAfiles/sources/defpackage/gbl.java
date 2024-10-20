package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import android.view.View;
import android.view.WindowId;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbl {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public gbl() {
        this.b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.e = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.c = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.a = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.d = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static final boolean d(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList e(Context context, int i) {
        int b = pr.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{pr.a, pr.c, pr.b, pr.e}, new int[]{pr.a(context, R.attr.colorButtonNormal), eap.g(b, i), eap.g(b, i), i});
    }

    public static final LayerDrawable f(or orVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = orVar.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = orVar.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static final void g(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = km.a;
        }
        mutate.setColorFilter(km.b(i, mode));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, arqr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.gdk r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gbk
            if (r0 == 0) goto L13
            r0 = r7
            gbk r0 = (defpackage.gbk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gbk r0 = new gbk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.a
            gbl r0 = r0.e
            defpackage.aqil.P(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r7)
            java.lang.Object r7 = r5.b
            r0.e = r5
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 == r1) goto L97
            r0 = r5
        L45:
            gdk r7 = (defpackage.gdk) r7
            boolean r1 = r7 instanceof defpackage.gat
            if (r1 == 0) goto L57
            r1 = r7
            gat r1 = (defpackage.gat) r1
            java.lang.Object r2 = r0.c
            gcn r2 = (defpackage.gcn) r2
            int r2 = r2.a
            r1.c(r2)
        L57:
            if (r7 == r6) goto L8f
            rl r1 = new rl
            r2 = 3
            r3 = 0
            r1.<init>(r0, r2, r3)
            r7.f(r1)
            if (r6 == 0) goto L71
            rl r1 = new rl
            r4 = 4
            r1.<init>(r0, r4, r3)
            r0 = r6
            gdk r0 = (defpackage.gdk) r0
            r0.g(r1)
        L71:
            if (r6 == 0) goto L78
            gdk r6 = (defpackage.gdk) r6
            r6.e()
        L78:
            boolean r6 = defpackage.dyi.e(r2)
            if (r6 == 0) goto L8e
            java.util.Objects.toString(r7)
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Generated new PagingSource "
            java.lang.String r6 = r0.concat(r6)
            defpackage.dyi.f(r2, r6)
        L8e:
            return r7
        L8f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r6.<init>(r7)
            throw r6
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbl.a(gdk, arpe):java.lang.Object");
    }

    public final void b() {
        ((ico) this.d).F(false);
    }

    public final void c() {
        ((ico) this.d).F(true);
    }

    public gbl(View view, String str, glm glmVar, WindowId windowId, glw glwVar, Animator animator) {
        this.f = view;
        this.a = str;
        this.e = glwVar;
        this.b = windowId;
        this.d = glmVar;
        this.c = animator;
    }

    public gbl(ffe ffeVar, MediaFormat mediaFormat, eqn eqnVar, Surface surface, MediaCrypto mediaCrypto, fez fezVar) {
        this.f = ffeVar;
        this.e = mediaFormat;
        this.a = eqnVar;
        this.c = surface;
        this.d = mediaCrypto;
        this.b = fezVar;
    }

    public gbl(arqr arqrVar, Object obj, gcn gcnVar) {
        this.b = arqrVar;
        this.a = obj;
        this.c = gcnVar;
        byte[] bArr = null;
        this.d = new ico(bArr, bArr, bArr, bArr);
        this.e = new ico(bArr, bArr, bArr, bArr);
        this.f = nq.S(new eig(this, (arpe) null, 4));
    }
}
