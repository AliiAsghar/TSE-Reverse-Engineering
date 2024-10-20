package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ryd implements ancs {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ryd(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return aktp.ag(Optional.empty());
                }
                List list = ((aiba) optional.get()).C;
                if (list != null && !list.isEmpty()) {
                    Stream filter = Collection.EL.stream(list).filter(new wjl(19));
                    int i2 = alog.d;
                    alog alogVar = (alog) filter.collect(alls.a);
                    if (alogVar.isEmpty()) {
                        return aktp.ag(Optional.empty());
                    }
                    final int i3 = this.b;
                    final int i4 = this.a;
                    Object obj2 = this.c;
                    aibn b = aibj.b((aiau) alogVar.get(0));
                    b.b = Integer.valueOf(i4);
                    b.c = Integer.valueOf(i3);
                    yks yksVar = (yks) obj2;
                    return akul.g(agkx.f(((aibx) yksVar.d.b()).a(b.a()))).i(new ancs() { // from class: ykr
                        @Override // defpackage.ancs
                        public final ListenableFuture a(Object obj3) {
                            return aktp.ag(Optional.ofNullable(yfo.f(((aibk) obj3).a, i4, i3)));
                        }
                    }, yksVar.c).e(Throwable.class, new yeb(18), yksVar.c);
                }
                return aktp.ag(Optional.empty());
            }
            return ((mui) ((mzs) this.c).a).g.e((nae) obj, this.a, this.b);
        }
        if (((Boolean) obj).booleanValue()) {
            int i5 = this.b;
            int i6 = this.a;
            Object obj3 = this.c;
            return aktp.ah(new eyr(obj3, i6, i5, 4), ((rye) obj3).c);
        }
        return aktp.ag(null);
    }
}
