package defpackage;

import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ytu implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ytu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        long j;
        int i = 8;
        int i2 = 1;
        int i3 = 19;
        int i4 = 0;
        switch (this.b) {
            case 0:
                return aktp.af((Throwable) this.a);
            case 1:
                return ((ytw) this.a).b.e();
            case 2:
                Object obj2 = this.a;
                final ytw ytwVar = (ytw) obj2;
                yuf yufVar = (yuf) obj;
                long epochMilli = ytwVar.l.f().toEpochMilli();
                if (yufVar != null) {
                    j = yufVar.g;
                } else {
                    j = 0;
                }
                long longValue = ((Long) ytk.a.e()).longValue() + j;
                if (j != 0 && longValue > epochMilli) {
                    xyo c = ytw.a.c();
                    c.H("Too early for C11N check");
                    c.y("last check time", j);
                    c.y("earliest next check time", longValue);
                    c.y("current time", epochMilli);
                    c.q();
                    return aktp.ag(false);
                }
                if (!DesugarCollections.unmodifiableMap(yufVar.d).keySet().containsAll((alpt) Collection.EL.stream(ytwVar.f.l()).map(new yec(obj2, i3)).filter(new ytt(i2)).collect(alls.b))) {
                    return ytwVar.d.a().i(new ancs() { // from class: ytv
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x01e5  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x0219 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
                        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
                        @Override // defpackage.ancs
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r18) {
                            /*
                                Method dump skipped, instructions count: 676
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.ytv.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                        }
                    }, ytwVar.j);
                }
                ytw.a.o("The device doesn't have a new IMSI not registered with VSMS.");
                return aktp.ag(false);
            case 3:
                return aktp.af((Throwable) this.a);
            case 4:
                return aktp.af((Throwable) this.a);
            case 5:
                yul yulVar = (yul) this.a;
                Exception exc = (Exception) obj;
                return yulVar.e.b(exc).i(new ytu(exc, 4), yulVar.f);
            case 6:
                return ((yul) this.a).e();
            case 7:
                Exception exc2 = (Exception) obj;
                if (((Boolean) yup.b.e()).booleanValue() && !(exc2 instanceof CancellationException)) {
                    yup yupVar = (yup) this.a;
                    return yupVar.e.b(exc2).i(new ytu(exc2, i), yupVar.d);
                }
                return aktp.af(exc2);
            case 8:
                return aktp.af((Throwable) this.a);
            case 9:
                yuf yufVar2 = (yuf) obj;
                alog n = alog.n(DesugarCollections.unmodifiableMap(yufVar2.e).keySet());
                Stream stream = Collection.EL.stream(n);
                Object obj3 = this.a;
                return aktp.ad((Iterable) stream.map(new yuq(obj3, yufVar2, 3)).collect(alls.a)).h(new yez(n, i3), ((yuu) obj3).d);
            case 10:
                int i5 = ((GetApiAvailabilityResponse) obj).a;
                Object obj4 = this.a;
                if (i5 == 0) {
                    return aktp.ag(obj4);
                }
                if (i5 != 1 && i5 != 2) {
                    yvf.f((alog) obj4, 7);
                    return aktp.ag(new ArrayList());
                }
                yvf.f((alog) obj4, 8);
                return aktp.ag(new ArrayList());
            case 11:
                return ((yvf) ((yvs) this.a).e.b()).e(alog.n((List) obj));
            case 12:
                zeu zeuVar = (zeu) ((zer) this.a).d.b();
                if (yhx.d) {
                    return zeu.b.b().h(new zet(zeuVar, i4), zeuVar.f);
                }
                return aktp.ag(null);
            case 13:
                Object obj5 = this.a;
                zer zerVar = (zer) obj5;
                if (!((yjv) zerVar.f.b()).e()) {
                    return aktp.ag(null);
                }
                if (!xyp.j() && ((Long) utw.F.e()).longValue() != 0) {
                    return aktp.ah(new ybh(obj5, 10), zerVar.c);
                }
                return aktp.ag(null);
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    zew zewVar = (zew) this.a;
                    ((utt) zewVar.a.b()).e();
                    return akul.g(((aiwu) ((wfh) zewVar.b.b()).a).b(new woc(9), andi.a)).e(IOException.class, new yts(20), andi.a);
                }
                return albo.bI(null);
            case 15:
                return ((ttj) this.a).c((String) obj);
            case 16:
                return ((vbs) ((aalt) this.a).J.b()).b((String) obj);
            case 17:
                return ((ttj) this.a).b((String) obj);
            case 18:
                return aktp.ag(((String) this.a) + "\nEtouffee provisioned: " + ((Boolean) obj));
            case 19:
                return ((vbs) ((aalt) this.a).J.b()).b((String) obj);
            default:
                xze xzeVar = aalt.c;
                return ((vbq) obj).o((String) this.a);
        }
    }
}
