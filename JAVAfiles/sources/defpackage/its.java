package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class its implements algk {
    private final /* synthetic */ int a;

    public /* synthetic */ its(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Object apply;
        boolean z;
        Object apply2;
        int i = 2;
        int i2 = 4;
        boolean z2 = false;
        boolean z3 = false;
        r4 = false;
        boolean z4 = false;
        z2 = false;
        switch (this.a) {
            case 0:
                Optional optional = (Optional) obj;
                alwo alwoVar = itu.a;
                if (optional.isPresent() && tvu.c(((san) optional.get()).f())) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 1:
                Optional optional2 = (Optional) obj;
                alwo alwoVar2 = itu.a;
                if (optional2.isPresent() && tvu.c(((sac) optional2.get()).f())) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 2:
                akfc akfcVar = iui.a;
                aozy builder = ((iug) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                iug iugVar = (iug) builder.b;
                iugVar.b |= 4;
                iugVar.e = true;
                return (iug) builder.s();
            case 3:
                iug iugVar2 = (iug) obj;
                akfc akfcVar2 = iui.a;
                int i3 = iugVar2.d + 1;
                if (iugVar2.e || i3 >= 20) {
                    z3 = true;
                }
                aozy builder2 = iugVar2.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                apag apagVar = builder2.b;
                iug iugVar3 = (iug) apagVar;
                iugVar3.b = 2 | iugVar3.b;
                iugVar3.d = i3;
                if (!apagVar.isMutable()) {
                    builder2.u();
                }
                iug iugVar4 = (iug) builder2.b;
                iugVar4.b |= 4;
                iugVar4.e = z3;
                return (iug) builder2.s();
            case 4:
                akfc akfcVar3 = iui.a;
                if (((Boolean) ((utz) iuf.a.get()).e()).booleanValue()) {
                    sxy d = MessagesTable.d();
                    d.w("outgoingReactionsPresentNew");
                    d.e(new isa(3));
                    d.t(MessagesTable.c.a);
                    d.g(new isa(i2));
                    svo a = svq.a();
                    apply2 = new isa(5).apply(svq.d);
                    a.c((svk) apply2);
                    a.d(new isa(6));
                    d.D(agoh.b(a.b(), (agmh) svq.d.c, MessagesTable.c.a).a());
                    z = d.b().K();
                } else {
                    iuc iucVar = new iuc(iue.a);
                    iucVar.w("outgoingReactionsPresentOld");
                    iucVar.u(1);
                    apply = new isa(i).apply(new iud());
                    iucVar.k(new agpw((iud) apply));
                    if (iucVar.b().i() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                aozy createBuilder = iug.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                iug iugVar5 = (iug) apagVar2;
                iugVar5.b |= 1;
                iugVar5.c = true;
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar3 = createBuilder.b;
                iug iugVar6 = (iug) apagVar3;
                iugVar6.b = 2 | iugVar6.b;
                iugVar6.d = 0;
                if (!apagVar3.isMutable()) {
                    createBuilder.u();
                }
                iug iugVar7 = (iug) createBuilder.b;
                iugVar7.b |= 4;
                iugVar7.e = z;
                return (iug) createBuilder.s();
            case 5:
                return Boolean.valueOf(!((iug) obj).e);
            case 6:
                return Boolean.valueOf(((Optional) obj).isPresent());
            case 7:
                return Optional.ofNullable((uaw) obj);
            case 8:
                return null;
            case 9:
                return Boolean.valueOf(((upm) obj).a);
            case 10:
                alog alogVar = (alog) obj;
                alob alobVar = new alob();
                int size = alogVar.size();
                for (int i4 = 0; i4 < size; i4++) {
                    alobVar.h(new kmk((kks) alogVar.get(i4)));
                }
                return alog.D(alobVar.g());
            case 11:
                kpv.a.r("Failed to update sign in status", (Exception) obj);
                return null;
            case 12:
                return kkg.a((List) obj);
            case 13:
                return kkg.a((List) obj);
            case 14:
                alog alogVar2 = (alog) obj;
                utz utzVar = kua.a;
                return alogVar2;
            case 15:
                int i5 = kws.m;
                return ((tav) obj).M();
            case 16:
                adpo adpoVar = (adpo) obj;
                utz utzVar2 = lse.a;
                if (adpoVar.c) {
                    return psy.ONLINE;
                }
                int i6 = adpoVar.g;
                if (i6 != 404) {
                    if (i6 != 604) {
                        return psy.OFFLINE;
                    }
                    return psy.UNKNOWN;
                }
                return psy.NOT_RCS;
            case 17:
                lse.b.r("Capabilities fetch from UceProvider failed", (psx) obj);
                return Optional.empty();
            case 18:
                int i7 = mdt.d;
                apct apctVar = ((mdn) obj).l;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                return aotl.l(apctVar);
            case 19:
                return Long.valueOf(((mdn) obj).c);
            default:
                return Long.valueOf(((mdn) obj).n);
        }
    }
}
