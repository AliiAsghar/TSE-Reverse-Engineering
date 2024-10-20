package defpackage;

import j$.time.DayOfWeek;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akya implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ akya(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
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

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((akzz) obj).c;
            case 1:
                return ((akzz) obj).b;
            case 2:
                return ((alan) obj).a;
            case 3:
                return ((alan) obj).b;
            case 4:
                return ((alap) obj).a;
            case 5:
                return ((alap) obj).b;
            case 6:
                return ((alap) obj).c;
            case 7:
                return ((alap) obj).d;
            case 8:
                return ((alap) obj).e;
            case 9:
                return ((alap) obj).f;
            case 10:
                return ((alap) obj).g;
            case 11:
                akye akyeVar = akyd.a;
                switch (akyb.a[((DayOfWeek) obj).ordinal()]) {
                    case 1:
                        return "http://schema.org/Monday";
                    case 2:
                        return "http://schema.org/Tuesday";
                    case 3:
                        return "http://schema.org/Wednesday";
                    case 4:
                        return "http://schema.org/Thursday";
                    case 5:
                        return "http://schema.org/Friday";
                    case 6:
                        return "http://schema.org/Saturday";
                    case 7:
                        return "http://schema.org/Sunday";
                    default:
                        return "";
                }
            case 12:
                return ((akzs) obj).a;
            case 13:
                return ((alak) obj).a;
            case 14:
                return ((alak) obj).c;
            case 15:
                return ((ZonedDateTime) obj).toOffsetDateTime();
            case 16:
                return ((OffsetDateTime) obj).toString();
            case 17:
                return aohs.f((String) obj);
            case 18:
                return (apde) ((Optional) obj).get();
            case 19:
                return ((alar) obj).a();
            default:
                return ((alar) obj).b();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
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
}
