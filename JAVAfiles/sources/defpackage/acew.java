package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acew extends cg {
    public final acev a = new acev(this);

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        acev acevVar = this.a;
        acevVar.b(bundle, new abxo(acevVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (acevVar.a == null) {
            abqa abqaVar = abqa.a;
            Context context = frameLayout.getContext();
            int g = abqaVar.g(context);
            String c = abub.c(context, g);
            String b = abub.b(context, g);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(c);
            linearLayout.addView(textView);
            Intent i = abqaVar.i(context, g, null);
            if (i != null) {
                Button button = new Button(context);
                button.setId(R.id.button1);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(b);
                linearLayout.addView(button);
                button.setOnClickListener(new abbh(context, i, 4));
            }
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // defpackage.cg
    public final void W(Bundle bundle) {
        ClassLoader classLoader = acew.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.W(bundle);
    }

    @Override // defpackage.cg
    public final void Y(Activity activity) {
        super.Y(activity);
        this.a.e(activity);
    }

    @Override // defpackage.cg
    public final void aa() {
        acev acevVar = this.a;
        abxs abxsVar = acevVar.a;
        if (abxsVar != null) {
            abxsVar.c();
        } else {
            acevVar.a(1);
        }
        super.aa();
    }

    @Override // defpackage.cg
    public final void ab(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.ab(activity, attributeSet, bundle);
            this.a.e(activity);
            GoogleMapOptions a = GoogleMapOptions.a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", a);
            acev acevVar = this.a;
            acevVar.b(bundle, new abxm(acevVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.cg
    public final void ad() {
        acev acevVar = this.a;
        abxs abxsVar = acevVar.a;
        if (abxsVar != null) {
            abxsVar.g();
        } else {
            acevVar.a(5);
        }
        super.ad();
    }

    @Override // defpackage.cg
    public final void af() {
        super.af();
        acev acevVar = this.a;
        acevVar.b(null, new abxp(acevVar, 0));
    }

    @Override // defpackage.cg
    public final void g(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.g(bundle);
            acev acevVar = this.a;
            acevVar.b(bundle, new abxn(acevVar, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.cg
    public final void h() {
        acev acevVar = this.a;
        abxs abxsVar = acevVar.a;
        if (abxsVar != null) {
            abxsVar.d();
        } else {
            acevVar.a(2);
        }
        super.h();
    }

    @Override // defpackage.cg
    public final void j(Bundle bundle) {
        ClassLoader classLoader = acew.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        acev acevVar = this.a;
        abxs abxsVar = acevVar.a;
        if (abxsVar != null) {
            abxsVar.i(bundle);
            return;
        }
        Bundle bundle2 = acevVar.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // defpackage.cg
    public final void k() {
        super.k();
        acev acevVar = this.a;
        acevVar.b(null, new abxp(acevVar, 1));
    }

    @Override // defpackage.cg
    public final void l() {
        acev acevVar = this.a;
        abxs abxsVar = acevVar.a;
        if (abxsVar != null) {
            abxsVar.k();
        } else {
            acevVar.a(4);
        }
        super.l();
    }

    @Override // defpackage.cg, android.content.ComponentCallbacks
    public final void onLowMemory() {
        abxs abxsVar = this.a.a;
        if (abxsVar != null) {
            abxsVar.f();
        }
        super.onLowMemory();
    }
}
