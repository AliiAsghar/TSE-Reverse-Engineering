package com.google.apps.tiktok.media;

import android.content.Context;
import defpackage.akec;
import defpackage.algw;
import defpackage.alha;
import defpackage.altg;
import defpackage.aluq;
import defpackage.hkz;
import defpackage.hle;
import defpackage.hwq;
import defpackage.hwr;
import defpackage.mgu;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TikTokAppGlideModule extends hwq {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        Set Lu();

        algw hL();
    }

    @Override // defpackage.hwq
    public final void c(Context context, hle hleVar) {
        ((hwq) ((alha) ((a) akec.w(context, a.class)).hL()).a).c(context, hleVar);
    }

    @Override // defpackage.hwr
    public final void d(Context context, hkz hkzVar, mgu mguVar) {
        ((a) akec.w(context, a.class)).hL();
        aluq listIterator = ((altg) ((a) akec.w(context, a.class)).Lu()).listIterator();
        while (listIterator.hasNext()) {
            ((hwr) listIterator.next()).d(context, hkzVar, mguVar);
        }
    }
}
