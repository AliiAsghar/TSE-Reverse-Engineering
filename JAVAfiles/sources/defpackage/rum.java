package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rum implements Function {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ rum(long j, int i) {
        this.b = i;
        this.a = j;
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
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                sau sauVar = (sau) obj;
                sauVar.U(new agoi("conversations.sort_timestamp", 9, Long.valueOf(this.a)));
                return sauVar;
            case 1:
                sai saiVar = (sai) obj;
                saiVar.U(new agoi("conversations.sort_timestamp", 9, Long.valueOf(this.a)));
                return saiVar;
            case 2:
                slc slcVar = (slc) obj;
                alhr alhrVar = rxz.a;
                slcVar.d(this.a);
                return slcVar;
            case 3:
                smo smoVar = (smo) obj;
                alhr alhrVar2 = rxz.a;
                smoVar.d(this.a);
                return smoVar;
            case 4:
                tce tceVar = (tce) obj;
                tceVar.b(tqn.FAILED_TO_DECRYPT);
                tceVar.e(this.a);
                return tceVar;
            case 5:
                snh snhVar = (snh) obj;
                xze xzeVar = vqp.a;
                snhVar.w(this.a);
                return snhVar;
            case 6:
                snh snhVar2 = (snh) obj;
                snhVar2.y(xhv.b(this.a));
                return snhVar2;
            case 7:
                snh snhVar3 = (snh) obj;
                int i = vtv.a;
                snhVar3.w(this.a);
                return snhVar3;
            case 8:
                snh snhVar4 = (snh) obj;
                snhVar4.y(xhv.b(this.a));
                return snhVar4;
            case 9:
                yob yobVar = (yob) obj;
                utz utzVar = ynr.a;
                yobVar.U(new agoi("spam_logging_ids_table.generation_timestamp", 8, Long.valueOf(this.a)));
                return yobVar;
            case 10:
                alnr alnrVar = yul.a;
                aozy builder = ((yuf) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((yuf) builder.b).g = this.a;
                return builder;
            case 11:
                alnr alnrVar2 = yul.a;
                aozy builder2 = ((yuf) obj).toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ((yuf) builder2.b).f = this.a;
                return builder2;
            case 12:
                xze xzeVar2 = zri.a;
                return Long.valueOf(Duration.between((Instant) obj, Instant.ofEpochMilli(this.a)).toMillis());
            default:
                adkl adklVar = (adkl) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append("-Default");
                if (adklVar.c) {
                    sb.append("Call");
                }
                if (adklVar.d) {
                    sb.append("Sms");
                }
                if (adklVar.e) {
                    sb.append("Data");
                }
                if (!adklVar.c && !adklVar.d && !adklVar.e) {
                    sb.append("None");
                }
                sb.append("-");
                sb.append(adklVar.b);
                sb.append((String) adklVar.a.map(new adkk(0)).orElse(""));
                return new advp(String.format(Locale.US, "(PEv2-SM%s)", sb));
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
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
