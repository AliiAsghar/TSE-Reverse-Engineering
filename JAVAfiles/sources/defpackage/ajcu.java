package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajcu {
    final View a;
    final GradientDrawable b;
    final GradientDrawable c;
    private final algy e;
    private Drawable g;
    private BlendMode i;
    private ColorStateList j;
    private PorterDuff.Mode k;
    private boolean d = false;
    private final Set f = new HashSet();
    private int h = 119;

    public ajcu(View view, algy algyVar) {
        view.getClass();
        this.a = view;
        this.e = algyVar;
        float applyDimension = TypedValue.applyDimension(1, brg.a, view.getResources().getDisplayMetrics());
        this.b = b(R.color.color_blue600_35, applyDimension);
        this.c = b(R.color.color_blue600_65, applyDimension);
    }

    private final GradientDrawable b(int i, float f) {
        Context context = this.a.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getColor(i));
        gradientDrawable.setCornerRadius(f);
        return gradientDrawable;
    }

    public final boolean a(View view, DragEvent dragEvent) {
        BlendMode foregroundTintBlendMode;
        dragEvent.getClass();
        view.getClass();
        int action = dragEvent.getAction();
        if (action != 4 && !this.e.a(dragEvent)) {
            return false;
        }
        if (action != 1) {
            if (action != 4) {
                if (action != 5) {
                    if (action == 6) {
                        this.f.remove(view);
                    }
                } else {
                    this.f.add(view);
                }
            } else if (this.d) {
                this.d = false;
                this.a.setForeground(this.g);
                this.a.setForegroundGravity(this.h);
                this.a.setForegroundTintList(this.j);
                this.a.setForegroundTintMode(this.k);
                this.g = null;
                this.h = 119;
                this.i = null;
                this.j = null;
                if (Build.VERSION.SDK_INT >= 29) {
                    this.a.setForegroundTintBlendMode(this.i);
                    this.k = null;
                }
                this.f.clear();
            }
        } else if (!this.d) {
            this.d = true;
            this.g = this.a.getForeground();
            this.h = this.a.getForegroundGravity();
            this.j = this.a.getForegroundTintList();
            this.k = this.a.getForegroundTintMode();
            this.a.setForegroundGravity(119);
            this.a.setForegroundTintList(null);
            this.a.setForegroundTintMode(null);
            if (Build.VERSION.SDK_INT >= 29) {
                foregroundTintBlendMode = this.a.getForegroundTintBlendMode();
                this.i = foregroundTintBlendMode;
                this.a.setForegroundTintBlendMode(null);
            }
        }
        if (this.d) {
            if (!this.f.isEmpty()) {
                this.a.setForeground(this.c);
            } else {
                this.a.setForeground(this.b);
            }
        }
        if (action != 1) {
            return false;
        }
        return true;
    }
}
