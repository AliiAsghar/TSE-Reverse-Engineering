package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uyi implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ uyi(int i) {
        this.a = i;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Optional) obj).isPresent());
            case 1:
                uwt uwtVar = (uwt) obj;
                boolean z = uwtVar.e;
                apct apctVar = uwtVar.f;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                return new atkn(z, apctVar);
            case 2:
                return Optional.of((ajwt) obj);
            case 3:
                return upm.e();
            case 4:
                uys uysVar = (uys) obj;
                uyu uyuVar = uysVar.d;
                if (uyuVar == null) {
                    uyuVar = uyu.a;
                }
                aozy builder = uyuVar.toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((uyu) builder.b).c = false;
                uyu uyuVar2 = (uyu) builder.s();
                aozy builder2 = uysVar.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                uys uysVar2 = (uys) builder2.b;
                uyuVar2.getClass();
                uysVar2.d = uyuVar2;
                uysVar2.b |= 2;
                return (uys) builder2.s();
            case 5:
                uys uysVar3 = (uys) obj;
                uyt uytVar = uysVar3.c;
                if (uytVar == null) {
                    uytVar = uyt.a;
                }
                aozy builder3 = uytVar.toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                ((uyt) builder3.b).b = false;
                uyt uytVar2 = (uyt) builder3.s();
                aozy builder4 = uysVar3.toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                uys uysVar4 = (uys) builder4.b;
                uytVar2.getClass();
                uysVar4.c = uytVar2;
                uysVar4.b |= 1;
                return (uys) builder4.s();
            case 6:
                return null;
            case 7:
                uyt uytVar3 = ((uys) obj).c;
                if (uytVar3 == null) {
                    uytVar3 = uyt.a;
                }
                return Boolean.valueOf(uytVar3.b);
            case 8:
                return null;
            case 9:
                uys uysVar5 = (uys) obj;
                uyt uytVar4 = uysVar5.c;
                if (uytVar4 == null) {
                    uytVar4 = uyt.a;
                }
                aozy builder5 = uytVar4.toBuilder();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                ((uyt) builder5.b).c = false;
                uyt uytVar5 = (uyt) builder5.s();
                aozy builder6 = uysVar5.toBuilder();
                if (!builder6.b.isMutable()) {
                    builder6.u();
                }
                uys uysVar6 = (uys) builder6.b;
                uytVar5.getClass();
                uysVar6.c = uytVar5;
                uysVar6.b |= 1;
                return (uys) builder6.s();
            case 10:
                return null;
            case 11:
                uys uysVar7 = (uys) obj;
                uyu uyuVar3 = uysVar7.d;
                if (uyuVar3 == null) {
                    uyuVar3 = uyu.a;
                }
                aozy builder7 = uyuVar3.toBuilder();
                if (!builder7.b.isMutable()) {
                    builder7.u();
                }
                ((uyu) builder7.b).b = 0L;
                uyu uyuVar4 = (uyu) builder7.s();
                aozy builder8 = uysVar7.toBuilder();
                if (!builder8.b.isMutable()) {
                    builder8.u();
                }
                uys uysVar8 = (uys) builder8.b;
                uyuVar4.getClass();
                uysVar8.d = uyuVar4;
                uysVar8.b |= 2;
                return (uys) builder8.s();
            case 12:
                return null;
            case 13:
                uyt uytVar6 = ((uys) obj).c;
                if (uytVar6 == null) {
                    uytVar6 = uyt.a;
                }
                return Boolean.valueOf(uytVar6.c);
            case 14:
                return Boolean.valueOf(((upm) obj).a);
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                return uhy.b((aehp) obj);
            case 19:
                return uhy.b((aehn) obj);
            default:
                return DesugarCollections.unmodifiableMap(((aehp) obj).b);
        }
    }
}
