package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.ahnz;
import defpackage.gfx;
import defpackage.zmp;
import defpackage.zmu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SwipeActionPreference extends Preference {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private zmp g;

    public SwipeActionPreference(Context context) {
        super(context);
        this.g = zmp.ARCHIVE;
    }

    @Override // androidx.preference.Preference
    public final void a(gfx gfxVar) {
        int i;
        VectorDrawable vectorDrawable;
        int d;
        ImageView imageView;
        View findViewById;
        View findViewById2;
        int d2;
        int i2;
        super.a(gfxVar);
        gfxVar.a.setClickable(true);
        TextView textView = (TextView) gfxVar.a.findViewById(R.id.swipe_action_title);
        if (textView != null) {
            textView.setText(t());
        }
        TextView textView2 = (TextView) gfxVar.a.findViewById(R.id.swipe_action_summary);
        if (textView2 != null) {
            textView2.setText(m());
        }
        ViewStub viewStub = (ViewStub) gfxVar.a.findViewById(R.id.swipe_action_view_stub);
        if (viewStub != null && (i2 = this.b) > 0) {
            viewStub.setLayoutResource(i2);
            viewStub.inflate();
        }
        View view = gfxVar.a;
        zmp zmpVar = this.g;
        int i3 = 0;
        if (zmpVar == zmp.DELETE) {
            i = R.drawable.quantum_gm_ic_delete_vd_theme_24;
        } else if (zmpVar == zmp.ARCHIVE) {
            i = R.drawable.quantum_gm_ic_archive_vd_theme_24;
        } else if (zmpVar == zmp.MARK_AS_READ_OR_UNREAD) {
            i = R.drawable.messages_unread_chat_icon;
        } else {
            i = 0;
        }
        GradientDrawable gradientDrawable = null;
        if (i == 0) {
            vectorDrawable = null;
        } else {
            vectorDrawable = (VectorDrawable) view.getContext().getDrawable(i);
            if (zmpVar == zmp.DELETE) {
                d = ahnz.d(view, R.attr.colorOnError);
            } else if (zmpVar != zmp.ARCHIVE && zmpVar != zmp.MARK_AS_READ_OR_UNREAD) {
                d = 0;
            } else {
                d = ahnz.d(view, R.attr.colorOnPrimary);
            }
            if (vectorDrawable != null && d != 0) {
                vectorDrawable = (VectorDrawable) vectorDrawable.mutate();
                vectorDrawable.setTint(d);
                vectorDrawable.setTintMode(PorterDuff.Mode.SRC_IN);
            }
        }
        View view2 = gfxVar.a;
        zmp zmpVar2 = this.g;
        if (this.c != 0) {
            gradientDrawable = (GradientDrawable) view2.getContext().getDrawable(this.c);
            if (zmpVar2 == zmp.DELETE) {
                d2 = ahnz.d(view2, R.attr.colorError);
            } else if (zmpVar2 != zmp.ARCHIVE && zmpVar2 != zmp.MARK_AS_READ_OR_UNREAD) {
                d2 = 0;
            } else {
                d2 = ahnz.d(view2, R.attr.colorPrimary);
            }
            if (gradientDrawable != null && d2 != 0) {
                gradientDrawable.setColor(d2);
            }
        }
        int i4 = this.f;
        if (i4 > 0 && (findViewById2 = gfxVar.a.findViewById(i4)) != null) {
            if (vectorDrawable == null) {
                i3 = 8;
            }
            findViewById2.setVisibility(i3);
        }
        int i5 = this.d;
        if (i5 > 0 && (findViewById = gfxVar.a.findViewById(i5)) != null && gradientDrawable != null) {
            findViewById.setBackground(gradientDrawable);
        }
        int i6 = this.e;
        if (i6 > 0 && (imageView = (ImageView) gfxVar.a.findViewById(i6)) != null && vectorDrawable != null) {
            imageView.setImageDrawable(vectorDrawable);
        }
    }

    public final void k(zmp zmpVar) {
        this.g = zmpVar;
        d();
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        return zmu.e(this.j, this.g);
    }

    @Override // androidx.preference.Preference
    public final CharSequence t() {
        int i = this.a;
        if (i != 0) {
            return this.j.getString(i);
        }
        return null;
    }

    public SwipeActionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = zmp.ARCHIVE;
    }

    public SwipeActionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = zmp.ARCHIVE;
    }
}
