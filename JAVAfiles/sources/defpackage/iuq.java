package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuq {
    public static final /* synthetic */ int a = 0;
    private static final anna b = anna.h("_");

    public static aozy a(String str) {
        List c = b.c(str);
        if (c.size() > 3) {
            aozy createBuilder = amlk.a.createBuilder();
            try {
                aozy createBuilder2 = amhb.a.createBuilder();
                int parseInt = Integer.parseInt((String) c.get(1));
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amhb amhbVar = (amhb) createBuilder2.b;
                amhbVar.b |= 1;
                amhbVar.c = parseInt;
                int parseInt2 = Integer.parseInt((String) c.get(2));
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                amhb amhbVar2 = (amhb) createBuilder2.b;
                amhbVar2.b |= 2;
                amhbVar2.d = parseInt2;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amlk amlkVar = (amlk) createBuilder.b;
                amhb amhbVar3 = (amhb) createBuilder2.s();
                amhbVar3.getClass();
                amlkVar.c = amhbVar3;
                amlkVar.b |= 1;
                int parseInt3 = Integer.parseInt((String) c.get(3));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amlk amlkVar2 = (amlk) createBuilder.b;
                amlkVar2.b |= 2;
                amlkVar2.d = parseInt3;
                if (c.size() > 4) {
                    if (((String) c.get(4)).equals(albo.G("X", ((String) c.get(4)).length()))) {
                        int length = ((String) c.get(4)).length();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amlk amlkVar3 = (amlk) createBuilder.b;
                        amlkVar3.b = 4 | amlkVar3.b;
                        amlkVar3.e = length;
                    } else {
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        amlk amlkVar4 = (amlk) createBuilder.b;
                        amlkVar4.b |= 4;
                        amlkVar4.e = -1;
                    }
                } else {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amlk amlkVar5 = (amlk) createBuilder.b;
                    amlkVar5.b |= 4;
                    amlkVar5.e = 0;
                }
                return createBuilder;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static aozy b(byte[] bArr) {
        if (bArr != null) {
            String str = new String(bArr);
            if (str.endsWith(".xml")) {
                return a(str.substring(0, str.length() - 4));
            }
            return null;
        }
        return null;
    }
}
