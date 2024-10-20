package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.EnumSet;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxl {
    public static final akxa a;
    public static final atii b;

    static {
        int i = 18;
        akyr f = akyr.a("actions.intent.EXECUTE_SOFTWARE_INSTRUCTION").e().d(new agmr(i)).f();
        ajqy ajqyVar = new ajqy(i);
        final akxy akxyVar = new akxy(1);
        final Class<akxk> cls = akxk.class;
        f.c("softwareInstruction.name", new agpp(ajqyVar, 6), new akys() { // from class: akyn
            @Override // defpackage.akys
            public final void a(Object obj, List list) {
                if (!list.isEmpty()) {
                    BiConsumer biConsumer = akxyVar;
                    albi albiVar = (albi) list.get(0);
                    if ((albiVar.b & 1) != 0) {
                        Optional findFirst = Collection.EL.stream(EnumSet.allOf(cls)).filter(new agol(albiVar, 14)).findFirst();
                        if (findFirst.isPresent()) {
                            biConsumer.accept(obj, new akzt((Enum) findFirst.get()));
                            return;
                        }
                    }
                    String str = (String) albo.m(list, new akyo(0));
                    str.getClass();
                    biConsumer.accept(obj, new akzu(str));
                }
            }
        });
        f.b(new ajqy(19), new ajqy(20));
        b = f.o();
        akwz a2 = akxa.a();
        akxc akxcVar = new akxc();
        akxcVar.a = Optional.of(new akxg(new alat(null).a()));
        a2.a = akxcVar.a();
        a = a2.a();
    }
}
