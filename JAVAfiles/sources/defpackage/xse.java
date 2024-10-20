package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xse {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final armf b;
    public final anen c;
    public final armf d;
    private final anen e;

    public xse(armf armfVar, anen anenVar, anen anenVar2, armf armfVar2) {
        this.b = armfVar;
        this.c = anenVar;
        this.e = anenVar2;
        this.d = armfVar2;
    }

    public static aozy c(rve rveVar, qei qeiVar, xrz xrzVar, String str) {
        algf m = new pwb().m();
        aozy createBuilder = xsb.a.createBuilder();
        String e = rve.e(rveVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        xsb xsbVar = (xsb) apagVar;
        xsbVar.b |= 1;
        xsbVar.c = e;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        xsb xsbVar2 = (xsb) createBuilder.b;
        qeiVar.getClass();
        xsbVar2.l = qeiVar;
        xsbVar2.b |= 512;
        String uri = xrzVar.d.toString();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        xsb xsbVar3 = (xsb) apagVar2;
        uri.getClass();
        xsbVar3.b |= 2;
        xsbVar3.d = uri;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        xsb xsbVar4 = (xsb) createBuilder.b;
        str.getClass();
        xsbVar4.b |= 16;
        xsbVar4.g = str;
        xrzVar.e.ifPresent(new xpw(createBuilder, 7));
        xrzVar.c.ifPresent(new vxb(createBuilder, m, 19));
        return createBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    public final akul a(String str, xsb xsbVar) {
        return ((uof) ((vyv) this.b.b()).a.b()).a(upk.b("messaging_file_upload", xsbVar, new uta(null, str, null, str, null, null))).b().h(new xqi(str, 10), this.e).e(CancellationException.class, new xqi(str, 11), this.e);
    }

    public final akul b(String str, MessageCoreData messageCoreData, xrz xrzVar) {
        return aktp.aj(new mtz(this, messageCoreData, xrzVar, str, 6), this.c);
    }
}
