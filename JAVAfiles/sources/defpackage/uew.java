package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uew extends ufx {
    private final Uri a;
    private final zai b;

    public uew(zai zaiVar, Uri uri) {
        xyl.l(uri);
        this.b = zaiVar;
        this.a = uri;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [armf, java.lang.Object] */
    @Override // defpackage.ufx
    public final ufw f(Context context) {
        zai zaiVar = this.b;
        xvc xvcVar = (xvc) zaiVar.b.b();
        xvcVar.getClass();
        uac uacVar = (uac) zaiVar.a.b();
        uacVar.getClass();
        uli uliVar = (uli) zaiVar.d.b();
        uliVar.getClass();
        context.getClass();
        return new uev(zaiVar.c, xvcVar, uacVar, uliVar, zaiVar.e, context, this, this.a);
    }
}
