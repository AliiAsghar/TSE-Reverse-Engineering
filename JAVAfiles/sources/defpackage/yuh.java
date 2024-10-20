package defpackage;

import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yuh implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ yuh(yul yulVar, String str, String str2, aozb aozbVar, int i) {
        this.e = i;
        this.a = yulVar;
        this.b = str;
        this.c = str2;
        this.d = aozbVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Object obj2 = this.a;
                    Object obj3 = this.b;
                    return ((yul) this.d).k((yuf) obj, (String) this.c, (yum) obj3, (yua) obj2);
                }
                Object obj4 = this.a;
                Object obj5 = this.b;
                return ((yul) this.d).k((yuf) obj, (String) this.c, (yum) obj5, (yua) obj4);
            }
            final String str = (String) obj;
            xsn xsnVar = new xsn(0);
            Object obj6 = this.a;
            Object obj7 = this.d;
            final zap zapVar = (zap) obj7;
            final xrz xrzVar = (xrz) obj6;
            akuk b = ((xtf) zapVar.c).b(xrzVar, xsnVar);
            Object obj8 = this.b;
            Object obj9 = this.c;
            final aqhu aqhuVar = (aqhu) obj9;
            final aozb aozbVar = (aozb) obj8;
            return b.e(new ancv() { // from class: xso
                /* JADX WARN: Type inference failed for: r11v4, types: [armf, java.lang.Object] */
                @Override // defpackage.ancv
                public final andc a(ahmn ahmnVar, Object obj10) {
                    boolean z;
                    apus apusVar = (apus) obj10;
                    apusVar.getClass();
                    if (apusVar.e() != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d.t(z, "Data stream size is unknown.");
                    zap zapVar2 = zap.this;
                    Object b2 = ((znj) zapVar2.e).b.b();
                    b2.getClass();
                    long longValue = ((Number) b2).longValue();
                    aqhu aqhuVar2 = aqhuVar;
                    aozb aozbVar2 = aozbVar;
                    String str2 = str;
                    xrz xrzVar2 = xrzVar;
                    return new andc(((xtf) zapVar2.c).c(aqhuVar2, apusVar, xrzVar2.g, xrzVar2.e, aozbVar2, str2, longValue));
                }
            }, zapVar.a).e(new xsp(0), zapVar.a).f().h(new way(obj7, obj6, obj9, 17, (short[]) null), zapVar.a).e(IllegalArgumentException.class, new xqi(obj9, 12), zapVar.a);
        }
        yuf yufVar = (yuf) obj;
        aozy builder = yufVar.toBuilder();
        ?? r5 = this.c;
        String str2 = (String) r5;
        yub aj = builder.aj(str2, yub.a);
        xyo c = yul.b.c();
        c.H("Adding new RCS token for msisdn");
        c.w("msisdn", r5, 2);
        ?? r52 = this.b;
        c.L("imsi", r52);
        c.A("new entry", yub.a.equals(aj));
        c.q();
        aozy builder2 = aj.toBuilder();
        if (!builder2.b.isMutable()) {
            builder2.u();
        }
        ((yub) builder2.b).d = (aozb) this.d;
        yub yubVar = (yub) builder2.s();
        yul.b.o("Associating msisdn with updated registration data");
        builder.am(str2, yubVar);
        String str3 = (String) r52;
        boolean ak = builder.ak(str3);
        xyo c2 = yul.b.c();
        c2.H("Associating IMSI with msisdn");
        c2.A("new association", true ^ ak);
        c2.q();
        builder.al(str3, str2);
        if (yufVar.h) {
            yty ytyVar = ((yuf) builder.b).j;
            if (ytyVar == null) {
                ytyVar = yty.a;
            }
            aozy builder3 = ytyVar.toBuilder();
            if (!builder3.b.isMutable()) {
                builder3.u();
            }
            ((yty) builder3.b).d = yty.emptyProtobufList();
            yty ytyVar2 = yufVar.j;
            if (ytyVar2 == null) {
                ytyVar2 = yty.a;
            }
            Collection j = yul.j(ytyVar2.d, apds.b(((yul) this.a).d.f().toEpochMilli()));
            if (!builder3.b.isMutable()) {
                builder3.u();
            }
            yty ytyVar3 = (yty) builder3.b;
            apax apaxVar = ytyVar3.d;
            if (!apaxVar.c()) {
                ytyVar3.d = apag.mutableCopy(apaxVar);
            }
            aoyj.addAll(j, ytyVar3.d);
            if (!builder.b.isMutable()) {
                builder.u();
            }
            yuf yufVar2 = (yuf) builder.b;
            yty ytyVar4 = (yty) builder3.s();
            ytyVar4.getClass();
            yufVar2.j = ytyVar4;
            yufVar2.b |= 2;
        }
        return builder;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ yuh(yul yulVar, String str, yum yumVar, yua yuaVar, int i) {
        this.e = i;
        this.d = yulVar;
        this.c = str;
        this.b = yumVar;
        this.a = yuaVar;
    }

    public /* synthetic */ yuh(zap zapVar, aqhu aqhuVar, xrz xrzVar, aozb aozbVar, int i) {
        this.e = i;
        this.d = zapVar;
        this.c = aqhuVar;
        this.a = xrzVar;
        this.b = aozbVar;
    }
}
