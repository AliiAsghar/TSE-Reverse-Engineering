package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.google.apps.tiktok.media.TikTokAppGlideModule;
import defpackage.hkz;
import defpackage.hle;
import defpackage.hwf;
import defpackage.hwg;
import defpackage.mgu;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final TikTokAppGlideModule a = new TikTokAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.google.apps.tiktok.media.TikTokAppGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* synthetic */ hwg a() {
        return new hwf(1);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.emptySet();
    }

    @Override // defpackage.hwq
    public final void c(Context context, hle hleVar) {
        this.a.c(context, hleVar);
    }

    @Override // defpackage.hwr
    public final void d(Context context, hkz hkzVar, mgu mguVar) {
        this.a.d(context, hkzVar, mguVar);
    }
}
