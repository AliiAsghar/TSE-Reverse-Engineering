package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.EnumSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akzd {
    public static final atii a;

    static {
        akyr f = akyr.a("actions.intent.CREATE_MESSAGE").e().d(new akxz(11)).f();
        int i = 15;
        akyg akygVar = new akyg(i);
        final akxy akxyVar = new akxy(6);
        final int i2 = 1;
        f.c("message.recipient.name", new akyh(akygVar, 12), new akys() { // from class: akyp
            /* JADX WARN: Type inference failed for: r0v12, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.util.function.BiConsumer, java.lang.Object] */
            @Override // defpackage.akys
            public final void a(Object obj, List list) {
                int i3 = i2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (list.isEmpty()) {
                                return;
                            }
                            akxyVar.accept(obj, (Integer) albo.m(list, new akyo(2)));
                            return;
                        } else {
                            if (!list.isEmpty()) {
                                Optional findFirst = Collection.EL.stream(EnumSet.allOf((Class) akxyVar)).filter(new agol(list, 13)).findFirst();
                                if (findFirst.isPresent()) {
                                    ((akyw) obj).c((akza) ((Enum) findFirst.get()));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (!list.isEmpty()) {
                        akxyVar.accept(obj, (alaa) albo.m(list, new akyo(1)));
                        return;
                    }
                    return;
                }
                if (!list.isEmpty()) {
                    akxyVar.accept(obj, (String) albo.m(list, new akyo(0)));
                }
            }
        });
        akyg akygVar2 = new akyg(16);
        final akxy akxyVar2 = new akxy(7);
        final int i3 = 0;
        f.c("message.text", new akyh(akygVar2, 10), new akys() { // from class: akyp
            /* JADX WARN: Type inference failed for: r0v12, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.util.function.BiConsumer, java.lang.Object] */
            @Override // defpackage.akys
            public final void a(Object obj, List list) {
                int i32 = i3;
                if (i32 != 0) {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            if (list.isEmpty()) {
                                return;
                            }
                            akxyVar2.accept(obj, (Integer) albo.m(list, new akyo(2)));
                            return;
                        } else {
                            if (!list.isEmpty()) {
                                Optional findFirst = Collection.EL.stream(EnumSet.allOf((Class) akxyVar2)).filter(new agol(list, 13)).findFirst();
                                if (findFirst.isPresent()) {
                                    ((akyw) obj).c((akza) ((Enum) findFirst.get()));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (!list.isEmpty()) {
                        akxyVar2.accept(obj, (alaa) albo.m(list, new akyo(1)));
                        return;
                    }
                    return;
                }
                if (!list.isEmpty()) {
                    akxyVar2.accept(obj, (String) albo.m(list, new akyo(0)));
                }
            }
        });
        akyg akygVar3 = new akyg(17);
        final akxy akxyVar3 = new akxy(8);
        int i4 = 13;
        final int i5 = 3;
        f.c("message.position", new akyh(akygVar3, i4), new akys() { // from class: akyp
            /* JADX WARN: Type inference failed for: r0v12, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.util.function.BiConsumer, java.lang.Object] */
            @Override // defpackage.akys
            public final void a(Object obj, List list) {
                int i32 = i5;
                if (i32 != 0) {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            if (list.isEmpty()) {
                                return;
                            }
                            akxyVar3.accept(obj, (Integer) albo.m(list, new akyo(2)));
                            return;
                        } else {
                            if (!list.isEmpty()) {
                                Optional findFirst = Collection.EL.stream(EnumSet.allOf((Class) akxyVar3)).filter(new agol(list, 13)).findFirst();
                                if (findFirst.isPresent()) {
                                    ((akyw) obj).c((akza) ((Enum) findFirst.get()));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (!list.isEmpty()) {
                        akxyVar3.accept(obj, (alaa) albo.m(list, new akyo(1)));
                        return;
                    }
                    return;
                }
                if (!list.isEmpty()) {
                    akxyVar3.accept(obj, (String) albo.m(list, new akyo(0)));
                }
            }
        });
        akyh akyhVar = new akyh(new akyg(18), i);
        final Class<akza> cls = akza.class;
        final int i6 = 2;
        f.c("message.messageMode", akyhVar, new akys() { // from class: akyp
            /* JADX WARN: Type inference failed for: r0v12, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.util.function.BiConsumer, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.util.function.BiConsumer, java.lang.Object] */
            @Override // defpackage.akys
            public final void a(Object obj, List list) {
                int i32 = i6;
                if (i32 != 0) {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            if (list.isEmpty()) {
                                return;
                            }
                            cls.accept(obj, (Integer) albo.m(list, new akyo(2)));
                            return;
                        } else {
                            if (!list.isEmpty()) {
                                Optional findFirst = Collection.EL.stream(EnumSet.allOf((Class) cls)).filter(new agol(list, 13)).findFirst();
                                if (findFirst.isPresent()) {
                                    ((akyw) obj).c((akza) ((Enum) findFirst.get()));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (!list.isEmpty()) {
                        cls.accept(obj, (alaa) albo.m(list, new akyo(1)));
                        return;
                    }
                    return;
                }
                if (!list.isEmpty()) {
                    cls.accept(obj, (String) albo.m(list, new akyo(0)));
                }
            }
        });
        f.b(new akyg(i4), new akyg(14));
        a = f.o();
    }
}
