package defpackage;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.android.vcard.VCardConfig;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajue extends TemplateLayout {
    public static final /* synthetic */ int c = 0;
    private static final agxw i = new agxw("PartnerCustomizationLayout");
    public Activity a;
    final ViewTreeObserver.OnWindowFocusChangeListener b;
    private boolean f;
    private boolean g;
    private boolean h;

    public ajue(Context context) {
        this(context, 0, 0);
    }

    private void l(AttributeSet attributeSet, int i2) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ajuf.d, i2, 0);
        boolean z = true;
        boolean z2 = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        if (z2) {
            setSystemUiVisibility(1024);
        }
        k(ajvg.class, new ajvg(this, this.a.getWindow(), attributeSet, i2));
        k(ajvh.class, new ajvh(this, this.a.getWindow()));
        k(ajva.class, new ajva(this, attributeSet, i2));
        ajvh ajvhVar = (ajvh) i(ajvh.class);
        if (Build.VERSION.SDK_INT >= 27) {
            TypedArray obtainStyledAttributes2 = ajvhVar.a.getContext().obtainStyledAttributes(attributeSet, ajuf.f, i2, 0);
            int color = obtainStyledAttributes2.getColor(1, 0);
            ajvhVar.e = color;
            if (ajvhVar.b != null) {
                if (ajvhVar.c && !ajvhVar.d) {
                    Context context = ajvhVar.a.getContext();
                    color = ajuu.h(context).c(context, ajus.CONFIG_NAVIGATION_BAR_BG_COLOR);
                }
                ajvhVar.b.setNavigationBarColor(color);
            }
            Window window = ajvhVar.b;
            if (window != null && (window.getDecorView().getSystemUiVisibility() & 16) != 16) {
                z = false;
            }
            boolean z3 = obtainStyledAttributes2.getBoolean(0, z);
            if (ajvhVar.b != null) {
                if (ajvhVar.c) {
                    Context context2 = ajvhVar.a.getContext();
                    z3 = ajuu.h(context2).l(context2, ajus.CONFIG_LIGHT_NAVIGATION_BAR, false);
                }
                if (z3) {
                    ajvhVar.b.getDecorView().setSystemUiVisibility(ajvhVar.b.getDecorView().getSystemUiVisibility() | 16);
                } else {
                    ajvhVar.b.getDecorView().setSystemUiVisibility(ajvhVar.b.getDecorView().getSystemUiVisibility() & (-17));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                TypedArray obtainStyledAttributes3 = ajvhVar.a.getContext().obtainStyledAttributes(new int[]{R.attr.navigationBarDividerColor});
                int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
                if (Build.VERSION.SDK_INT >= 28 && ajvhVar.b != null) {
                    if (ajvhVar.c) {
                        Context context3 = ajvhVar.a.getContext();
                        if (ajuu.h(context3).r(ajus.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR)) {
                            color2 = ajuu.h(context3).c(context3, ajus.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR);
                        }
                    }
                    ajvhVar.b.setNavigationBarDividerColor(color2);
                }
                obtainStyledAttributes3.recycle();
            }
            obtainStyledAttributes2.recycle();
        }
        this.a.getWindow().addFlags(Integer.MIN_VALUE);
        this.a.getWindow().clearFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        this.a.getWindow().clearFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected View a(LayoutInflater layoutInflater, int i2) {
        if (i2 == 0) {
            i2 = com.google.android.apps.messaging.R.layout.partner_customization_layout;
        }
        return h(layoutInflater, 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupcompat.internal.TemplateLayout
    public ViewGroup b(int i2) {
        if (i2 == 0) {
            i2 = com.google.android.apps.messaging.R.id.suc_layout_content;
        }
        return super.b(i2);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected final void c(AttributeSet attributeSet, int i2) {
        boolean z = true;
        this.f = true;
        Activity e = ajuu.e(getContext());
        this.a = e;
        boolean v = ajgl.v(e.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ajuf.d, i2, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            i.s("Attribute sucUsePartnerResource not found in ".concat(String.valueOf(String.valueOf(this.a.getComponentName()))));
        }
        if (!v && !obtainStyledAttributes.getBoolean(2, true)) {
            z = false;
        }
        this.f = z;
        this.h = obtainStyledAttributes.hasValue(0);
        this.g = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        i.q("activity=" + this.a.getClass().getSimpleName() + " isSetupFlow=" + v + " enablePartnerResourceLoading=true usePartnerResourceAttr=" + this.f + " useDynamicColor=" + this.h + " useFullDynamicColorAttr=" + this.g);
    }

    public final boolean d() {
        Context context = getContext();
        if (ajuu.e == null) {
            try {
                ajuu.e = context.getContentResolver().call(ajuu.g(), "isDynamicColorEnabled", (String) null, (Bundle) null);
            } catch (IllegalArgumentException | SecurityException unused) {
                Log.w(ajuu.a, "SetupWizard dynamic color supporting status unknown; return as false.");
                ajuu.e = null;
                return false;
            }
        }
        Bundle bundle = ajuu.e;
        if (bundle == null || !bundle.getBoolean("isDynamicColorEnabled", false) || !this.h || !d.r() || !ajuu.h(getContext()).m()) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (!this.f || Build.VERSION.SDK_INT < 29 || !ajuu.h(getContext()).m()) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (!d()) {
            return false;
        }
        if (!this.g && !ajuu.t(getContext())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        FragmentManager fragmentManager;
        super.onAttachedToWindow();
        Activity activity = this.a;
        String str = ajuj.a;
        if (ajgl.v(activity.getIntent()) && (fragmentManager = activity.getFragmentManager()) != null && !fragmentManager.isDestroyed()) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
            if (findFragmentByTag == null) {
                ajuj ajujVar = new ajuj();
                try {
                    fragmentManager.beginTransaction().add(ajujVar, "lifecycle_monitor").commitNow();
                    findFragmentByTag = ajujVar;
                } catch (IllegalStateException e) {
                    Log.e(ajuj.a, "Error occurred when attach to Activity:".concat(String.valueOf(String.valueOf(activity.getComponentName()))), e);
                }
            } else if (!(findFragmentByTag instanceof ajuj)) {
                Log.wtf(ajuj.a, String.valueOf(activity.getClass().getSimpleName()).concat(" Incorrect instance on lifecycle fragment."));
            }
        }
        if (ajgl.v(this.a.getIntent())) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.b);
        }
        ajva ajvaVar = (ajva) i(ajva.class);
        ajvaVar.m.b(ajvaVar.f(), false);
        ajvaVar.m.c(ajvaVar.g(), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        PersistableBundle persistableBundle;
        PersistableBundle persistableBundle2;
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 29 && ajgl.v(this.a.getIntent())) {
            ajva ajvaVar = (ajva) i(ajva.class);
            ajur ajurVar = ajvaVar.m;
            boolean f = ajvaVar.f();
            boolean g = ajvaVar.g();
            ajurVar.a = ajur.a((String) ajurVar.a, f);
            ajurVar.b = ajur.a((String) ajurVar.b, g);
            ajvb ajvbVar = ajvaVar.g;
            ajvb ajvbVar2 = ajvaVar.h;
            if (ajvbVar != null) {
                persistableBundle = ajvbVar.a("PrimaryFooterButton");
            } else {
                persistableBundle = PersistableBundle.EMPTY;
            }
            if (ajvbVar2 != null) {
                persistableBundle2 = ajvbVar2.a("SecondaryFooterButton");
            } else {
                persistableBundle2 = PersistableBundle.EMPTY;
            }
            ajur ajurVar2 = ajvaVar.m;
            PersistableBundle persistableBundle3 = new PersistableBundle();
            persistableBundle3.putString("PrimaryButtonVisibility", (String) ajurVar2.a);
            persistableBundle3.putString("SecondaryButtonVisibility", (String) ajurVar2.b);
            PersistableBundle[] persistableBundleArr = {persistableBundle2, PersistableBundle.EMPTY};
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(persistableBundle3, persistableBundle));
            Collections.addAll(arrayList, persistableBundleArr);
            PersistableBundle persistableBundle4 = new PersistableBundle();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PersistableBundle persistableBundle5 = (PersistableBundle) arrayList.get(i2);
                Iterator<String> it = persistableBundle5.keySet().iterator();
                while (it.hasNext()) {
                    ajgk.r(!persistableBundle4.containsKey(r8), String.format("Found duplicate key [%s] while attempting to merge bundles.", it.next()));
                }
                persistableBundle4.putAll(persistableBundle5);
            }
            ajuq.a(getContext(), CustomEvent.a(MetricKey.b("SetupCompatMetrics", this.a), persistableBundle4));
        }
        getViewTreeObserver().removeOnWindowFocusChangeListener(this.b);
    }

    public ajue(Context context, int i2) {
        this(context, i2, 0);
    }

    public ajue(Context context, int i2, int i3) {
        super(context, i2, i3);
        this.b = new ajud(this, 0);
        l(null, com.google.android.apps.messaging.R.attr.sucLayoutTheme);
    }

    public ajue(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ajud(this, 0);
        l(attributeSet, com.google.android.apps.messaging.R.attr.sucLayoutTheme);
    }

    public ajue(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = new ajud(this, 0);
        l(attributeSet, i2);
    }
}
