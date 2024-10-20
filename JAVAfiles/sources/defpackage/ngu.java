package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngu {
    public final Object a;
    public Object b;

    public ngu(Activity activity) {
        this.a = activity;
    }

    public final void a() {
        Object obj = this.b;
        if (obj != null) {
            ((AudioManager) this.a).abandonAudioFocusRequest(ex$$ExternalSyntheticApiModelOutline1.m372m(obj));
            this.b = null;
        }
    }

    public final void b(LayoutInflater layoutInflater, View view) {
        layoutInflater.getClass();
        view.getClass();
        Toolbar toolbar = (Toolbar) xvy.c(Toolbar.class, layoutInflater, view, R.id.toolbar_stub, R.layout.toolbar_branded, R.id.toolbar);
        this.b = toolbar;
        if (toolbar != null) {
            toolbar.setOnApplyWindowInsetsListener(new iwv(this, 5));
        }
        Object obj = this.b;
        if (obj != null) {
            ((Toolbar) obj).setBackgroundDrawable(new ColorDrawable(view.getContext().getColor(R.color.color_primary_background_alpha96)));
        }
    }

    public final kqk c() {
        apzj.f(this.b, apxk.class);
        return new kqk((krv) this.a);
    }

    public ngu(krv krvVar) {
        this.a = krvVar;
    }

    public ngu() {
        this.a = alwo.o("BugleSemanticLogger");
        this.b = "";
    }

    public ngu(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
    }
}
