package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class puc {
    public static final alwo a = alwo.o("BugleRcsCapabilities");
    public final lpg b;
    public final hgj c;

    public puc(hgj hgjVar, lpg lpgVar) {
        this.c = hgjVar;
        this.b = lpgVar;
    }

    public static ptz a(Iterable iterable) {
        String str;
        aozy createBuilder = ptz.a.createBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            aozy createBuilder2 = pua.a.createBuilder();
            String[] split = str2.split("=", -1);
            if (agkx.ae(split[0])) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/converter/RcsCapabilitiesConverter", "convertToRcsCapabilities", 111, "RcsCapabilitiesConverter.java")).t("Unable to convert empty or malformed capability {%s}", str2);
            } else {
                String str3 = split[0];
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                pua puaVar = (pua) apagVar;
                str3.getClass();
                puaVar.b |= 1;
                puaVar.c = str3;
                if (split.length > 1) {
                    str = split[1];
                } else {
                    str = "";
                }
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                pua puaVar2 = (pua) createBuilder2.b;
                str.getClass();
                puaVar2.b |= 2;
                puaVar2.d = str;
                createBuilder.z((pua) createBuilder2.s());
            }
        }
        return (ptz) createBuilder.s();
    }
}
