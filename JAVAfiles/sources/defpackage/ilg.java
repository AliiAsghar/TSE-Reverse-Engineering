package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ilg implements Function {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilg(long j, int i) {
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
        switch (this.b) {
            case 0:
                alwo alwoVar = ilw.a;
                return Long.valueOf(Duration.between((Instant) obj, Instant.ofEpochMilli(this.a)).toMillis());
            case 1:
                tbu tbuVar = (tbu) obj;
                tbuVar.getClass();
                tbuVar.p();
                tbuVar.U(new agmf("parts.uri", 4, alzz.as(Arrays.asList(Uri.parse("")), new abes(15)), false));
                tbuVar.U(new agoi("parts._id", 8, Long.valueOf(this.a)));
                return tbuVar;
            case 2:
                lcy lcyVar = (lcy) obj;
                lcyVar.p(this.a);
                return lcyVar;
            case 3:
                lcy lcyVar2 = (lcy) obj;
                lcyVar2.p(this.a);
                return lcyVar2;
            case 4:
                syc sycVar = (syc) obj;
                sycVar.g(sni.c.a);
                sycVar.H(this.a);
                sycVar.Q(1, 22);
                return sycVar;
            case 5:
                tbd tbdVar = (tbd) obj;
                tbdVar.g(this.a);
                return tbdVar;
            case 6:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.g(this.a);
                return tbdVar2;
            case 7:
                tix tixVar = (tix) obj;
                lgc lgcVar = luz.g;
                tixVar.c(this.a);
                tixVar.b(tja.a);
                return tixVar;
            case 8:
                tix tixVar2 = (tix) obj;
                lgc lgcVar2 = luz.g;
                tixVar2.c(this.a);
                tixVar2.b(tja.b);
                return tixVar2;
            case 9:
                sqc sqcVar = (sqc) obj;
                long j = this.a;
                int i = mac.c;
                sqcVar.W(new agpk("$V <= $V", new Object[]{sqd.d.d, Long.valueOf(j)}));
                return sqcVar;
            case 10:
                sqc sqcVar2 = (sqc) obj;
                int i2 = mac.c;
                sqcVar2.U(new agoi("events.timestamp", 8, Long.valueOf(this.a)));
                return sqcVar2;
            case 11:
                sxk sxkVar = (sxk) obj;
                int i3 = man.b;
                sxkVar.U(new agoi("message_status._id", 10, Long.valueOf(this.a)));
                return sxkVar;
            case 12:
                syc sycVar2 = (syc) obj;
                sycVar2.B(this.a);
                return sycVar2;
            case 13:
                return mvg.a.f.a((syc) obj, Long.valueOf(this.a));
            case 14:
                return mvg.a.d.a((syc) obj, Long.valueOf(this.a));
            case 15:
                return mvg.a.f.a((syc) obj, Long.valueOf(this.a));
            case 16:
                syc sycVar3 = (syc) obj;
                String str = ClearCloudSyncMessagesAction.a;
                sycVar3.D(this.a);
                sycVar3.e();
                return sycVar3;
            case 17:
                sbh sbhVar = (sbh) obj;
                sbhVar.d(this.a);
                return sbhVar;
            case 18:
                snh snhVar = (snh) obj;
                snhVar.y(new xhv(this.a));
                return snhVar;
            case 19:
                snh snhVar2 = (snh) obj;
                long j2 = this.a;
                xze xzeVar = rul.a;
                snhVar2.e(1);
                snhVar2.y(xhv.b(j2));
                return snhVar2;
            default:
                snh snhVar3 = (snh) obj;
                xze xzeVar2 = rul.a;
                snhVar3.w(this.a);
                return snhVar3;
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
}
