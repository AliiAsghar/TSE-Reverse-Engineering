package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.AbstractMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akyh implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akyh(int i) {
        this.b = i;
        this.a = "message.messageMode";
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, akye] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply;
        Object apply2;
        Object apply3;
        Object apply4;
        Object apply5;
        Object apply6;
        Object apply7;
        Object apply8;
        Object apply9;
        Object apply10;
        Object apply11;
        Object apply12;
        Object apply13;
        Object apply14;
        int i = 0;
        int i2 = 1;
        int i3 = 16;
        short[] sArr = null;
        byte b = 0;
        byte b2 = 0;
        int i4 = 18;
        int i5 = 17;
        switch (this.b) {
            case 0:
                apply = this.a.apply(obj);
                return ((Optional) apply).map(new akya(15)).map(new akya(i3)).map(new akya(i5));
            case 1:
                apply2 = this.a.apply(obj);
                return aohs.f((String) apply2);
            case 2:
                apply3 = this.a.apply(obj);
                return ((Optional) apply3).map(new akyg(6)).map(new akya(i5));
            case 3:
                return this.a.a(obj);
            case 4:
                apply4 = this.a.apply(obj);
                return ((Optional) apply4).map(new akyg(2)).map(new akya(i5));
            case 5:
                return Optional.ofNullable(obj).map(new akyh(this.a, i2));
            case 6:
                apply5 = this.a.apply(obj);
                return ((Optional) apply5).map(new akyg(i)).map(new akya(i5));
            case 7:
                return Optional.of(this.a);
            case 8:
                apply6 = this.a.apply(obj);
                return ((Optional) apply6).map(new akyg(i2)).map(new akya(i5));
            case 9:
                akzi akziVar = (akzi) obj;
                aozy p = albo.p((String) this.a, akziVar);
                Collection.EL.stream(albo.o(akziVar, new akxx(i))).forEach(new ajpx(p, i4));
                return (alay) p.s();
            case 10:
                apply7 = this.a.apply(obj);
                return ((Optional) apply7).map(new akyh(14, (char[]) (b == true ? 1 : 0)));
            case 11:
                akzh akzhVar = (akzh) obj;
                aozy p2 = albo.p((String) this.a, akzhVar);
                Collection.EL.stream(albo.o(akzhVar, new akxx(3))).forEach(new ajpx(p2, i4));
                return (alay) p2.s();
            case 12:
                apply8 = this.a.apply(obj);
                return ((Optional) apply8).map(new akyh(11, (byte[]) (b2 == true ? 1 : 0)));
            case 13:
                apply9 = this.a.apply(obj);
                return ((Optional) apply9).map(new akyh(i3, sArr));
            case 14:
                akzq akzqVar = (akzq) obj;
                aozy p3 = albo.p((String) this.a, akzqVar);
                Collection.EL.stream(albo.o(akzqVar, new akxx(4))).forEach(new ajpx(p3, i4));
                return (alay) p3.s();
            case 15:
                apply10 = this.a.apply(obj);
                return ((Optional) apply10).map(new akyh(9));
            case 16:
                return (alay) albo.p((String) this.a, (akzj) obj).s();
            case 17:
                apply11 = ((akyt) obj).b.apply(this.a);
                return (Optional) apply11;
            case 18:
                apply12 = this.a.apply(obj);
                return apply12;
            case 19:
                amdg amdgVar = (amdg) this.a;
                Function function = amdgVar.c;
                apply13 = amdgVar.b.apply(obj);
                apply14 = function.apply(obj);
                return new AbstractMap.SimpleImmutableEntry(apply13, apply14);
            default:
                return Boolean.valueOf(((String) this.a).equals((String) obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ akyh(int i, byte[] bArr) {
        this.b = i;
        this.a = "message.recipient.name";
    }

    public /* synthetic */ akyh(int i, char[] cArr) {
        this.b = i;
        this.a = "message.text";
    }

    public /* synthetic */ akyh(int i, int[] iArr) {
        this.b = i;
        this.a = "true";
    }

    public /* synthetic */ akyh(int i, short[] sArr) {
        this.b = i;
        this.a = "message.position";
    }

    public /* synthetic */ akyh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
