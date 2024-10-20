package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnj implements jnb {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/converter/LocalVideoConverter");

    @Override // defpackage.jnb
    public final Object a(jgz jgzVar, jnd jndVar, String str, arpe arpeVar) {
        Uri uri;
        Uri uri2;
        afcq afcqVar = jgzVar.a;
        if (afcqVar instanceof aftq) {
            aftq aftqVar = (aftq) afcqVar;
            String str2 = aftqVar.b;
            Uri uri3 = jgzVar.b.a;
            Uri parse = Uri.parse(str2);
            if (uri3 == null) {
                uri = parse;
            } else {
                uri = uri3;
            }
            String a2 = afwv.L(aftqVar.a).a();
            uri.getClass();
            if (true != (aftqVar.f instanceof afgh)) {
                uri2 = null;
            } else {
                uri2 = parse;
            }
            jny jnyVar = new jny(a2, uri, uri2, new Size(aftqVar.c, aftqVar.d), aftqVar.g, aftqVar.e, hlc.G(jgzVar), aftqVar.f instanceof afgh);
            alvw d = a.d();
            d.X(alwp.a, "BugleComposeRow2");
            ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/converter/LocalVideoConverter", "convert", 45, "LocalVideoConverter.kt")).I("MapiVideoContent isResizable %s, saveToExternalStorage %b", jnyVar.a, jnyVar.b);
            return new jnp(jnyVar, parse);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
