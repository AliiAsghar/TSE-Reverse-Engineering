package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xnb implements xne {
    private final /* synthetic */ int a;

    @Override // defpackage.xne
    public final Object a(Object obj, Uri uri, String str) {
        if (this.a != 0) {
            aozy builder = ((xmz) obj).toBuilder();
            String uri2 = uri.toString();
            if (!builder.b.isMutable()) {
                builder.u();
            }
            apag apagVar = builder.b;
            uri2.getClass();
            ((xmz) apagVar).b = uri2;
            if (!apagVar.isMutable()) {
                builder.u();
            }
            xmz xmzVar = (xmz) builder.b;
            str.getClass();
            xmzVar.c = str;
            return (xmz) builder.s();
        }
        int i = xnc.b;
        aozy builder2 = ((xnd) obj).toBuilder();
        String uri3 = uri.toString();
        if (!builder2.b.isMutable()) {
            builder2.u();
        }
        apag apagVar2 = builder2.b;
        uri3.getClass();
        ((xnd) apagVar2).b = uri3;
        if (!apagVar2.isMutable()) {
            builder2.u();
        }
        xnd xndVar = (xnd) builder2.b;
        str.getClass();
        xndVar.c = str;
        return (xnd) builder2.s();
    }
}
