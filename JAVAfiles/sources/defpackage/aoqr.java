package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqr extends aoon {
    public static final URI c(aoro aoroVar) {
        if (aoroVar.t() == 9) {
            aoroVar.p();
            return null;
        }
        try {
            String j = aoroVar.j();
            if (j.equals("null")) {
                return null;
            }
            return new URI(j);
        } catch (URISyntaxException e) {
            throw new aooe(e);
        }
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        return c(aoroVar);
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        String aSCIIString;
        URI uri = (URI) obj;
        if (uri == null) {
            aSCIIString = null;
        } else {
            aSCIIString = uri.toASCIIString();
        }
        aorpVar.m(aSCIIString);
    }
}
