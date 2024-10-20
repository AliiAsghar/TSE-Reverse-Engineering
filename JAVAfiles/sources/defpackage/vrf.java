package defpackage;

import android.util.Base64;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vrf {
    public static final alhr a = uuh.w("mms_group_name_to_telephony");
    private static final alwo b = alwo.o("Bugle");

    public static vre a(String str) {
        return b(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f A[Catch: apba -> 0x0188, TryCatch #0 {apba -> 0x0188, blocks: (B:25:0x004a, B:28:0x0054, B:29:0x0097, B:31:0x00a3, B:32:0x00aa, B:35:0x00b1, B:37:0x00c2, B:39:0x00cc, B:40:0x00d5, B:42:0x00d1, B:45:0x00f8, B:47:0x010c, B:49:0x0110, B:50:0x0117, B:52:0x0115, B:53:0x013a, B:55:0x013e, B:56:0x0145, B:58:0x0143, B:61:0x0154, B:63:0x015e, B:64:0x0167, B:66:0x0163, B:68:0x0079, B:70:0x007f, B:71:0x0083, B:73:0x0059, B:75:0x0060, B:76:0x0064), top: B:24:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.vre b(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrf.b(java.lang.String, boolean):vre");
    }

    public static String c(String str, String str2) {
        aozy createBuilder = vqb.a.createBuilder();
        aozb w = aozb.w(str.getBytes(StandardCharsets.US_ASCII));
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((vqb) apagVar).c = w;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        vqb vqbVar = (vqb) createBuilder.b;
        str2.getClass();
        vqbVar.d = str2;
        return d((vqb) createBuilder.s());
    }

    public static String d(vqb vqbVar) {
        aozy createBuilder = vqa.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vqa vqaVar = (vqa) createBuilder.b;
        vqbVar.getClass();
        vqaVar.d = vqbVar;
        vqaVar.c = 3;
        return e((vqa) createBuilder.s());
    }

    public static String e(vqa vqaVar) {
        aozb byteString = vqaVar.toByteString();
        aozy createBuilder = vpz.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vpz vpzVar = (vpz) createBuilder.b;
        apbo apboVar = vpzVar.b;
        if (!apboVar.b) {
            vpzVar.b = apboVar.a();
        }
        vpzVar.b.put("com.google.android.apps.messaging.", byteString);
        return "proto:".concat(String.valueOf(Base64.encodeToString(((vpz) createBuilder.s()).toByteArray(), 2)));
    }

    public static void f(String str) {
        d.s(str.startsWith("sip:"));
    }

    public static aozy g(Optional optional, aozy aozyVar) {
        aozy createBuilder = vqa.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        vqa vqaVar = (vqa) createBuilder.b;
        vqe vqeVar = (vqe) aozyVar.s();
        vqeVar.getClass();
        vqaVar.d = vqeVar;
        vqaVar.c = 2;
        if (qlm.q()) {
            optional.map(new vmd(15)).ifPresent(new vra(createBuilder, 0));
        }
        return createBuilder;
    }

    public static aozy h(String str, String str2, String str3, String str4) {
        aozy createBuilder = vqd.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((vqd) apagVar).c = str2;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((vqd) createBuilder.b).f = str4;
        if (!ody.a()) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            vqd vqdVar = (vqd) createBuilder.b;
            vqdVar.b |= 1;
            vqdVar.e = str;
        }
        if (str3 != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((vqd) createBuilder.b).d = str3;
        }
        return createBuilder;
    }

    private static Optional i(vqa vqaVar) {
        aozb aozbVar = vqaVar.e;
        if (aozbVar.G()) {
            return Optional.empty();
        }
        return Optional.of(yyb.cD(aozbVar));
    }
}
