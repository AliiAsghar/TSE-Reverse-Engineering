package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agre {
    public final agrd a;
    public View b;
    public Context c;
    public agri d;
    public aorr e;
    public aocp f;
    public boolean h;
    public agrp i;
    public String j;
    public ahuq m;
    public akro n;
    public boolean g = false;
    public boolean k = false;
    public boolean l = false;

    public agre(agrd agrdVar) {
        this.a = agrdVar;
    }

    public static final void e(View view, String str) {
        ((TextView) view.findViewById(R.id.hats_lib_prompt_title_text)).setText(str);
    }

    public final void a() {
        int c;
        float dimension;
        RectF rectF;
        if (!this.l) {
            ahuq ahuqVar = this.m;
            Object obj = ahuqVar.d;
            if (ahuqVar.a) {
                c = -1;
            } else {
                c = akro.c((akro) ahuqVar.c);
            }
            Object obj2 = ahuqVar.b;
            if (ahuqVar.a) {
                dimension = ahuqVar.c().getDimension(R.dimen.hats_lib_prompt_banner_elevation_sheet);
            } else {
                dimension = ahuqVar.c().getDimension(R.dimen.hats_lib_prompt_banner_elevation_card);
            }
            ((CardView) obj2).ga(dimension);
            float gc = ((CardView) ahuqVar.b).gc() * 1.5f;
            float gc2 = ((CardView) ahuqVar.b).gc();
            if (ahuqVar.d != null) {
                rectF = ((akro) ahuqVar.c).b(ahuqVar.a);
            } else {
                rectF = new RectF(brg.a, brg.a, brg.a, brg.a);
            }
            if (obj != null) {
                Window window = ((Dialog) ahuqVar.d).getWindow();
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.addFlags(32);
                window.clearFlags(2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = 0;
                attributes.y = 0;
                attributes.width = c;
                attributes.gravity = 85;
                window.setAttributes(attributes);
            }
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((CardView) ahuqVar.b).getLayoutParams();
                marginLayoutParams.setMargins(Math.round(rectF.left - gc2), Math.round(rectF.top - gc), Math.round(rectF.right - gc2), Math.round(rectF.bottom - gc));
                ((CardView) ahuqVar.b).setLayoutParams(marginLayoutParams);
            } catch (ClassCastException e) {
                throw new RuntimeException("HatsShowRequest.insertIntoParent can only be called with a ViewGroup whose LayoutParams extend MarginLayoutParams", e);
            }
        }
        this.l = true;
    }

    public final void b() {
        this.d.c("o");
        new ahiy(this.e.h, agrk.a(this.c)).d(this.d);
    }

    public final void c(Button button) {
        agkx.n(this.b.findViewById(R.id.hats_lib_prompt_buttons), button, R.dimen.hats_lib_button_accessibility_padding, R.dimen.hats_lib_button_accessibility_padding);
    }
}
