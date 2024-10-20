package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.util.Log;
import defpackage.abhg;
import defpackage.abrc;
import defpackage.abrg;
import defpackage.acak;
import defpackage.acaz;
import defpackage.acbd;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OnPipClickListener extends SimpleGoogleHelpCallbacks {
    private final WeakReference a;
    boolean isToggling;

    OnPipClickListener(Activity activity, boolean z) {
        this.a = new WeakReference(activity);
        this.isToggling = z;
    }

    public acak createGoogleHelpLauncher(Activity activity) {
        return new acak(activity);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [alhr, java.lang.Object] */
    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public void onPipClick() {
        if (this.isToggling) {
            Log.d("gH_OnPipClickListener", "Double click gets discarded.");
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            Log.d("gH_OnPipClickListener", "Calling activity is null. Pip click discarded.");
            return;
        }
        this.isToggling = true;
        Object obj = createGoogleHelpLauncher(activity).b.get();
        acbd acbdVar = (acbd) obj;
        abhg.m(acbdVar.a);
        abrg abrgVar = ((abrc) obj).i;
        acaz acazVar = new acaz(abrgVar, new WeakReference(acbdVar.a));
        abrgVar.b(acazVar);
        abhg.o(acazVar);
    }

    public OnPipClickListener(WeakReference<Activity> weakReference) {
        this.a = weakReference;
    }
}
