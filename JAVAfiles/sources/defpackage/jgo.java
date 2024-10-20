package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgo {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator");
    private final ydc b;
    private final armf c;
    private final ovv d;

    public jgo(ydc ydcVar, armf armfVar, ovv ovvVar) {
        ydcVar.getClass();
        armfVar.getClass();
        this.b = ydcVar;
        this.c = armfVar;
        this.d = ovvVar;
    }

    private final List b(int i, Integer num, boolean z) {
        amoq A;
        aron aronVar = new aron((byte[]) null);
        ahlp aV = akec.aV(amoq.a.createBuilder());
        aozy createBuilder = ampq.a.createBuilder();
        createBuilder.getClass();
        aktp.aC(hlc.H(i), createBuilder);
        if (((Boolean) this.c.b()).booleanValue() && z) {
            aktp.aD(createBuilder);
        }
        aV.G(aktp.aB(createBuilder));
        aronVar.add(aV.A());
        if (num != null) {
            if (this.d.a()) {
                A = hlc.J(1, null);
            } else {
                ahlp aV2 = akec.aV(amoq.a.createBuilder());
                aozy createBuilder2 = amox.a.createBuilder();
                createBuilder2.getClass();
                aV2.C(akec.O(createBuilder2));
                A = aV2.A();
            }
            int intValue = num.intValue();
            ArrayList arrayList = new ArrayList(intValue);
            for (int i2 = 0; i2 < intValue; i2++) {
                arrayList.add(A);
            }
            aqjn.S(aronVar, arrayList);
        }
        return aqjn.x(aronVar);
    }

    public final List a(String str, jgi jgiVar, boolean z) {
        if (str.length() > 0) {
            ece a2 = this.b.a(str);
            if (((Number) a2.a).intValue() < 0 && ((Number) a2.b).intValue() < 0) {
                alvw i = a.i();
                i.X(alwp.a, "BugleComposeRow2");
                ((alvg) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator", "infoFromText", 62, "TextAttachmentInfoCreator.kt")).q("EmojiUtils returned negative pair, treating all text as not emoji");
            }
            Object obj = a2.a;
            if (((Integer) obj).intValue() <= 0) {
                obj = null;
            }
            armo armoVar = new armo(obj, Integer.valueOf(str.length()));
            Integer num = (Integer) armoVar.a;
            int intValue = ((Number) armoVar.b).intValue();
            if (jgiVar == null) {
                return b(intValue, num, z);
            }
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry : jgiVar.a.entrySet()) {
                jgj jgjVar = (jgj) entry.getKey();
                int intValue2 = ((Number) entry.getValue()).intValue();
                if (intValue2 > 0) {
                    i2 += intValue2;
                    amoq J = hlc.J(jgjVar.b, Boolean.valueOf(jgjVar.a));
                    ArrayList arrayList2 = new ArrayList(intValue2);
                    for (int i3 = 0; i3 < intValue2; i3++) {
                        arrayList2.add(J);
                    }
                    aqjn.S(arrayList, arrayList2);
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            List ax = aqjn.ax(arrayList);
            if (num != null && num.intValue() != i2) {
                alvw i4 = a.i();
                i4.X(alwp.a, "BugleComposeRow2");
                ((alvg) i4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/TextAttachmentInfoCreator", "createAttachmentInfoComparingEmojiAnnotations", 110, "TextAttachmentInfoCreator.kt")).w("Manual count of emojis does not match count of EmojiAnnotations: %d, %s", num.intValue(), jgiVar);
                return b(length, num, z);
            }
            aron aronVar = new aron((byte[]) null);
            ahlp aV = akec.aV(amoq.a.createBuilder());
            aozy createBuilder = ampq.a.createBuilder();
            createBuilder.getClass();
            aktp.aC(hlc.H(length), createBuilder);
            if (((Boolean) this.c.b()).booleanValue() && z) {
                aktp.aD(createBuilder);
            }
            aV.G(aktp.aB(createBuilder));
            aronVar.add(aV.A());
            aqjn.S(aronVar, ax);
            return aqjn.x(aronVar);
        }
        throw new IllegalArgumentException("Cannot get AttachmentInfo for empty text");
    }
}
