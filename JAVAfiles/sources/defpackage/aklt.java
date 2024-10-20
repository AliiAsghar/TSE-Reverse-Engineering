package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aklt extends apxh {
    public aklt(cg cgVar) {
        super(cgVar);
    }

    public static final void a(cg cgVar, apbt apbtVar) {
        apxh.e(cgVar);
        Bundle bundle = cgVar.m;
        apbtVar.getClass();
        aowt.i(bundle, "TIKTOK_FRAGMENT_ARGUMENT", apbtVar);
    }

    public static final void b(cg cgVar, String str) {
        apxh.e(cgVar);
        Bundle bundle = cgVar.m;
        str.getClass();
        bundle.putString("TIKTOK_FRAGMENT_ARGUMENT", str);
    }

    @Override // defpackage.apxh
    protected final void c(cg cgVar) {
        Class<?> cls = cgVar.getClass();
        cj fe = cgVar.fe();
        cls.getSimpleName();
        fe.getClass();
        albo.Z(cgVar.fe() instanceof aklg, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", cgVar.getClass().getSimpleName(), cgVar.fe().getClass().getSimpleName());
    }
}
