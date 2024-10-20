package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mva implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ mva(int i) {
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

    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, mxf] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                tbh tbhVar = (tbh) obj;
                return (tbi[]) aqjn.D(tbhVar.a, tbhVar.c, tbhVar.d, tbhVar.f, tbhVar.u, tbhVar.v, tbhVar.e, tbhVar.h, tbhVar.i, tbhVar.H, tbhVar.R, tbhVar.l, tbhVar.I, tbhVar.U, tbhVar.b, tbhVar.x, tbhVar.y, tbhVar.P, tbhVar.n, tbhVar.B, tbhVar.X, tbhVar.Y).toArray(new tbi[0]);
            case 1:
                tbh tbhVar2 = (tbh) obj;
                return new tbi[]{tbhVar2.a, tbhVar2.d, tbhVar2.R};
            case 2:
                sxo sxoVar = (sxo) obj;
                sxoVar.getClass();
                return new sxp[]{sxoVar.a, sxoVar.b, sxoVar.c, sxoVar.i, sxoVar.k, sxoVar.n, sxoVar.y, sxoVar.j, sxoVar.D, sxoVar.r, sxoVar.p, sxoVar.u, sxoVar.I, sxoVar.ah, sxoVar.C, sxoVar.R, sxoVar.w, sxoVar.J, sxoVar.K, sxoVar.x, sxoVar.g, sxoVar.P, sxoVar.ac, sxoVar.ae, sxoVar.V};
            case 3:
                tbh tbhVar3 = (tbh) obj;
                tbhVar3.getClass();
                return new tbi[]{tbhVar3.a, tbhVar3.d, tbhVar3.B, tbhVar3.K, tbhVar3.z, tbhVar3.J};
            case 4:
                return ((sxo) obj).k;
            case 5:
                return ((ResolvedRecipient) obj).r(false);
            case 6:
                return ((ResolvedRecipient) obj).r(false);
            case 7:
                usk uskVar = (usk) obj;
                aron aronVar = new aron((byte[]) null);
                aronVar.add(uskVar.c);
                aronVar.add(uskVar.b);
                ste[] steVarArr = (ste[]) aqjn.x(aronVar).toArray(new ste[0]);
                return (ste[]) Arrays.copyOf(steVarArr, steVarArr.length);
            case 8:
                stk stkVar = (stk) obj;
                Object e = ((utz) yig.Y.get()).e();
                e.getClass();
                if (((Boolean) e).booleanValue()) {
                    return stkVar;
                }
                stkVar.U(new agmf("messages_annotations.annotation_type", 4, stk.Y(new int[0]), true));
                return stkVar;
            case 9:
                return d.aq((sxo) obj);
            case 10:
                int i = mvx.c;
                return new ste[]{(ste) ((usk) obj).f};
            case 11:
                return d.aq((sxo) obj);
            case 12:
                usk uskVar2 = (usk) obj;
                int i2 = mvx.c;
                return new ste[]{(ste) uskVar2.f, (ste) uskVar2.c};
            case 13:
                return d.aq((sxo) obj);
            case 14:
                return d.aq((sxo) obj);
            case 15:
                return (Instant) ((Map.Entry) obj).getValue();
            case 16:
                int i3 = mzf.d;
                return ((kor) obj).b.j();
            case 17:
                return ((sxo) obj).i;
            case 18:
                int i4 = nao.b;
                return new tbi[]{((tbh) obj).b};
            case 19:
                return d.aq((sxo) obj);
            default:
                tbh tbhVar4 = (tbh) obj;
                aron aronVar2 = new aron((byte[]) null);
                aronVar2.add(tbhVar4.a);
                aronVar2.add(tbhVar4.b);
                aronVar2.add(tbhVar4.e);
                aronVar2.add(tbhVar4.d);
                aronVar2.add(tbhVar4.v);
                aronVar2.add(tbhVar4.u);
                aronVar2.add(tbhVar4.R);
                aronVar2.add(tbhVar4.U);
                aronVar2.add(tbhVar4.n);
                aronVar2.add(tbhVar4.X);
                if (ymd.b()) {
                    aronVar2.add(tbhVar4.Y);
                }
                tbi[] tbiVarArr = (tbi[]) aqjn.x(aronVar2).toArray(new tbi[0]);
                return (tbi[]) Arrays.copyOf(tbiVarArr, tbiVarArr.length);
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
