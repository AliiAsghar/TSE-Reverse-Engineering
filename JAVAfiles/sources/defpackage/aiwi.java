package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwi {
    public static final aptp a;

    static {
        aozy createBuilder = aptp.a.createBuilder();
        aptj aptjVar = aptj.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aptp aptpVar = (aptp) createBuilder.b;
        aptjVar.getClass();
        aptpVar.c = aptjVar;
        aptpVar.b = 1;
        aozy createBuilder2 = aptp.a.createBuilder();
        aptn aptnVar = aptn.a;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aptp aptpVar2 = (aptp) createBuilder2.b;
        aptnVar.getClass();
        aptpVar2.c = aptnVar;
        aptpVar2.b = 2;
        a = (aptp) createBuilder2.s();
        aozy createBuilder3 = aptp.a.createBuilder();
        apto aptoVar = apto.a;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        aptp aptpVar3 = (aptp) createBuilder3.b;
        aptoVar.getClass();
        aptpVar3.c = aptoVar;
        aptpVar3.b = 3;
    }

    public static final String a(String str) {
        try {
            return URLEncoder.encode(str, aivq.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
